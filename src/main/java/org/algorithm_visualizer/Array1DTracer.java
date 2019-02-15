package org.algorithm_visualizer;

public class Array1DTracer extends Array2DTracer {
    public Array1DTracer(String title) {
        super(title);
    }

    public Array1DTracer() {
        super();
    }

    public void set(Object array1d) {
        command("set", new Object[]{array1d});
    }

    public void patch(int x, Object v) {
        command("patch", new Object[]{x, v});
    }

    public void patch(int x) {
        command("patch", new Object[]{x});
    }

    public void depatch(int x) {
        command("depatch", new Object[]{x});
    }

    public void select(int sx, int ex) {
        command("select", new Object[]{sx, ex});
    }

    public void select(int x) {
        command("select", new Object[]{x});
    }

    public void deselect(int sx, int ex) {
        command("deselect", new Object[]{sx, ex});
    }

    public void deselect(int x) {
        command("deselect", new Object[]{x});
    }

    public void chart(ChartTracer chartTracer) {
        command("chart", new Object[]{chartTracer});
    }
}