package org.algorithm_visualizer;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonPrimitive;
import com.google.gson.JsonSerializer;

import java.awt.*;
import java.io.BufferedReader;
import java.io.DataOutputStream;
import java.io.FileWriter;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLEncoder;
import java.util.ArrayList;

public abstract class Commander {
    private static final int MAX_COMMANDS = 1000000;
    private static final int MAX_OBJECTS = 100;

    private static class Command {
        private String key;
        private String method;
        private Object[] args;

        Command(String key, String method, Object[] args) {
            this.key = key;
            this.method = method;
            this.args = args;
        }
    }

    private static final Gson gson;

    private static Randomize.String keyRandomizer = new Randomize.String(8, "abcdefghijklmnopqrstuvwxyz0123456789");
    private static int objectCount = 0;
    private static ArrayList<Command> commands = new ArrayList<>();

    static void command(String key, String method, Object[] args) {
        commands.add(new Command(
                key,
                method,
                gson.fromJson(gson.toJson(args), Object[].class)
        ));
        if (commands.size() > MAX_COMMANDS)
            throw new Error("Too Many Commands");
        if (objectCount > MAX_OBJECTS)
            throw new Error("Too Many Objects");
    }

    private final String key;

    Commander(Object[] args) {
        objectCount++;
        String className = this.getClass().getSimpleName();
        key = keyRandomizer.create();
        command(className, args);
    }

    public void destroy() {
        objectCount--;
        command("destroy", new Object[]{});
    }

    void command(String method, Object[] args) {
        command(key, method, args);
    }

    static {
        GsonBuilder gsonBuilder = new GsonBuilder().serializeNulls();
        JsonSerializer<Commander> serializer = (src, typeOfSrc, context) -> new JsonPrimitive(src.key);
        gsonBuilder.registerTypeHierarchyAdapter(Commander.class, serializer);
        gson = gsonBuilder.create();

        Runtime.getRuntime().addShutdownHook(new Thread(() -> {
            try {
                String content = gson.toJson(commands);
                if (System.getenv("ALGORITHM_VISUALIZER") == null) {
                    URL postUrl = new URL("https://algorithm-visualizer.org/api/visualizations");
                    String params = "content=" + URLEncoder.encode(content, "UTF-8");

                    HttpURLConnection conn = (HttpURLConnection) postUrl.openConnection();
                    conn.setRequestMethod("POST");
                    conn.setRequestProperty("Content-Type", "application/x-www-form-urlencoded");
                    conn.setRequestProperty("Content-Length", Integer.toString(params.getBytes().length));
                    conn.setDoOutput(true);

                    DataOutputStream writer = new DataOutputStream(conn.getOutputStream());
                    writer.writeBytes(params);
                    writer.close();

                    BufferedReader reader = new BufferedReader(new InputStreamReader(conn.getInputStream()));
                    URL openUrl = new URL(reader.readLine());
                    reader.close();

                    Desktop.getDesktop().browse(openUrl.toURI());
                } else {
                    FileWriter fileWriter = new FileWriter("visualization.json");
                    PrintWriter printWriter = new PrintWriter(fileWriter);
                    printWriter.print(content);
                    printWriter.close();
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        }));
    }
}