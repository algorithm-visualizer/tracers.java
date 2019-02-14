package org.algorithm_visualizer;

public class Array2DTracer extends Tracer {
    public void set(Object array2d) {
        command("set", new Object[]{array2d});
    }

    public void patch(int x, int y, Object v) {
        command("patch", new Object[]{x, y, v});
    }

    public void patch(int x, int y) {
        command("patch", new Object[]{x, y});
    }

    public void depatch(int x, int y) {
        command("depatch", new Object[]{x, y});
    }

    public void select(int sx, int sy, int ex, int ey) {
        command("select", new Object[]{sx, sy, ex, ey});
    }

    public void select(int x, int y) {
        command("select", new Object[]{x, y});
    }

    public void selectRow(int x, int sy, int ey) {
        command("selectRow", new Object[]{x, sy, ey});
    }

    public void selectCol(int y, int sx, int ex) {
        command("selectCol", new Object[]{y, sx, ex});
    }

    public void deselect(int sx, int sy, int ex, int ey) {
        command("deselect", new Object[]{sx, sy, ex, ey});
    }

    public void deselect(int x, int y) {
        command("deselect", new Object[]{x, y});
    }

    public void deselectRow(int x, int sy, int ey) {
        command("deselectRow", new Object[]{x, sy, ey});
    }

    public void deselectCol(int y, int sx, int ex) {
        command("deselectCol", new Object[]{y, sx, ex});
    }
}