package org.algorithm_visualizer.tracers;

public class Array1DTracer extends Tracer {
    public Array1DTracer(String title) {
        super(title);
    }

    public Array1DTracer() {
        this(null);
    }

    public Array1DTracer set(Object array1d) {
        addTrace(key, "set", new Object[]{array1d});
        return this;
    }

    public Array1DTracer set() {
        addTrace(key, "set", new Object[]{});
        return this;
    }

    public Array1DTracer reset() {
        addTrace(key, "reset", new Object[]{});
        return this;
    }

    public Array1DTracer delay() {
        addTrace(key, "delay", new Object[]{});
        return this;
    }

    public Array1DTracer patch(int x, Object v) {
        addTrace(key, "patch", new Object[]{x, v});
        return this;
    }

    public Array1DTracer depatch(int x) {
        addTrace(key, "depatch", new Object[]{x});
        return this;
    }

    public Array1DTracer select(int x) {
        addTrace(key, "select", new Object[]{x});
        return this;
    }

    public Array1DTracer select(int sx, int ex) {
        addTrace(key, "select", new Object[]{sx, ex});
        return this;
    }

    public Array1DTracer deselect(int x) {
        addTrace(key, "deselect", new Object[]{x});
        return this;
    }

    public Array1DTracer deselect(int sx, int ex) {
        addTrace(key, "deselect", new Object[]{sx, ex});
        return this;
    }

    public Array1DTracer chart(ChartTracer chartTracer) {
        addTrace(key, "chart", new Object[]{chartTracer.key});
        return this;
    }
}