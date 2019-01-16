package org.algorithm_visualizer;

public class Array2DTracer extends Tracer {
    public Array2DTracer(String title) {
        super(title);
    }

    public Array2DTracer() {
        this(null);
    }

    public Array2DTracer set(Object array2d) {
        addTrace(key, "set", new Object[]{array2d});
        return this;
    }

    public Array2DTracer set() {
        addTrace(key, "set", new Object[]{});
        return this;
    }

    public Array2DTracer reset() {
        addTrace(key, "reset", new Object[]{});
        return this;
    }

    public Array2DTracer delay() {
        addTrace(key, "delay", new Object[]{});
        return this;
    }

    public Array2DTracer patch(int x, int y, Object v) {
        addTrace(key, "patch", new Object[]{x, y, v});
        return this;
    }

    public Array2DTracer depatch(int x, int y) {
        addTrace(key, "depatch", new Object[]{x, y});
        return this;
    }

    public Array2DTracer select(int x, int y) {
        addTrace(key, "select", new Object[]{x, y});
        return this;
    }

    public Array2DTracer select(int sx, int sy, int ex, int ey) {
        addTrace(key, "select", new Object[]{sx, sy, ex, ey});
        return this;
    }

    public Array2DTracer selectRow(int x, int sy, int ey) {
        addTrace(key, "selectRow", new Object[]{x, sy, ey});
        return this;
    }

    public Array2DTracer selectCol(int y, int sx, int ex) {
        addTrace(key, "selectCol", new Object[]{y, sx, ex});
        return this;
    }

    public Array2DTracer deselect(int x, int y) {
        addTrace(key, "deselect", new Object[]{x, y});
        return this;
    }

    public Array2DTracer deselect(int sx, int sy, int ex, int ey) {
        addTrace(key, "deselect", new Object[]{sx, sy, ex, ey});
        return this;
    }

    public Array2DTracer deselectRow(int x, int sy, int ey) {
        addTrace(key, "deselectRow", new Object[]{x, sy, ey});
        return this;
    }

    public Array2DTracer deselectCol(int y, int sx, int ex) {
        addTrace(key, "deselectCol", new Object[]{y, sx, ex});
        return this;
    }
}