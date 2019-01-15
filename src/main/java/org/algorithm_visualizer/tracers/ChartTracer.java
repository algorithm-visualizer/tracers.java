package org.algorithm_visualizer.tracers;

public class ChartTracer extends Tracer {
    public ChartTracer(String title) {
        super(title);
    }

    public ChartTracer() {
        this(null);
    }

    public ChartTracer set(Object array1d) {
        addTrace(key, "set", new Object[]{array1d});
        return this;
    }

    public ChartTracer set() {
        addTrace(key, "set", new Object[]{});
        return this;
    }

    public ChartTracer reset() {
        addTrace(key, "reset", new Object[]{});
        return this;
    }

    public ChartTracer delay() {
        addTrace(key, "delay", new Object[]{});
        return this;
    }

    public ChartTracer patch(int x, Object v) {
        addTrace(key, "patch", new Object[]{x, v});
        return this;
    }

    public ChartTracer depatch(int x) {
        addTrace(key, "depatch", new Object[]{x});
        return this;
    }

    public ChartTracer select(int x) {
        addTrace(key, "select", new Object[]{x});
        return this;
    }

    public ChartTracer select(int sx, int ex) {
        addTrace(key, "select", new Object[]{sx, ex});
        return this;
    }

    public ChartTracer deselect(int x) {
        addTrace(key, "deselect", new Object[]{x});
        return this;
    }

    public ChartTracer deselect(int sx, int ex) {
        addTrace(key, "deselect", new Object[]{sx, ex});
        return this;
    }

    public ChartTracer chart(ChartTracer chartTracer) {
        addTrace(key, "chart", new Object[]{chartTracer.key});
        return this;
    }
}