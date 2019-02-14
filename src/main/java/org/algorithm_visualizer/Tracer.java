package org.algorithm_visualizer;

public abstract class Tracer extends Commander {
    public static void delay(int lineNumber) {
        command(null, "delay", new Object[]{lineNumber});
    }

    public static void delay() {
        command(null, "delay", new Object[]{});
    }

    public Tracer(String title) {
        super(new Object[]{title});
    }

    public Tracer() {
        super(new Object[]{});
    }

    public void set() {
        command("set", new Object[]{});
    }

    public void reset() {
        command("reset", new Object[]{});
    }
}