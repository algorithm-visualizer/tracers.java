package org.algorithm_visualizer;

public abstract class Tracer extends Commander {
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