package org.algorithm_visualizer;

class Test {
    public static void main(String[] args) {
        ChartTracer chartTracer = new ChartTracer();
        chartTracer.set(new Object[]{});
        Layout.setRoot(new VerticalLayout(new Commander[]{chartTracer}));
    }
}
