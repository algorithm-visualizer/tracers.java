package org.algorithm_visualizer;

import com.google.gson.Gson;

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

public abstract class Tracer {
    private static Gson gson = new Gson();
    private static int tracerCount = 0;
    private static ArrayList<Trace> traces = new ArrayList<>();

    private static final int MAX_TRACES = 1000000;
    private static final int MAX_TRACERS = 100;

    private static class Trace {
        private String tracerKey;
        private String method;
        private Object[] args;

        Trace(String tracerKey, String method, Object[] args) {
            this.tracerKey = tracerKey;
            this.method = method;
            this.args = gson.fromJson(gson.toJson(args), Object[].class);
        }
    }

    private static String addTracer(String className, String title) {
        String key = String.format("%d-%s-%s", tracerCount++, className, title);
        String method = "construct";
        Object[] args = new Object[]{className, title};
        addTrace(key, method, args);
        return key;
    }

    protected static void addTrace(String tracerKey, String method, Object[] args) {
        Trace trace = new Trace(tracerKey, method, args);
        traces.add(trace);
        if (traces.size() > MAX_TRACES)
            throw new Error("Traces Limit Exceeded");
        if (tracerCount > MAX_TRACERS)
            throw new Error("Tracers Limit Exceeded");
    }

    protected String key;

    protected Tracer(String title) {
        String className = this.getClass().getSimpleName();
        if (title == null) title = className;
        key = Tracer.addTracer(className, title);
    }

    static {
        Runtime.getRuntime().addShutdownHook(new Thread(() -> {
            try {
                String content = gson.toJson(traces);
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
                    FileWriter fileWriter = new FileWriter("traces.json");
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