package org.algorithm_visualizer;

public class GraphTracer extends Tracer {
    public void set(Object array2d) {
        command("set", new Object[]{array2d});
    }

    public GraphTracer directed(boolean isDirected) {
        command("directed", new Object[]{isDirected});
        return this;
    }

    public GraphTracer directed() {
        command("directed", new Object[]{});
        return this;
    }

    public GraphTracer weighted(boolean isWeighted) {
        command("weighted", new Object[]{isWeighted});
        return this;
    }

    public GraphTracer weighted() {
        command("weighted", new Object[]{});
        return this;
    }

    public void addNode(Object id, double weight, double x, double y, int visitedCount, int selectedCount) {
        command("addNode", new Object[]{id, weight, x, y, visitedCount, selectedCount});
    }

    public void addNode(Object id, double weight, double x, double y, int visitedCount) {
        command("addNode", new Object[]{id, weight, x, y, visitedCount});
    }

    public void addNode(Object id, double weight, double x, double y) {
        command("addNode", new Object[]{id, weight, x, y});
    }

    public void addNode(Object id, double weight, double x) {
        command("addNode", new Object[]{id, weight, x});
    }

    public void addNode(Object id, double weight) {
        command("addNode", new Object[]{id, weight});
    }

    public void addNode(Object id) {
        command("addNode", new Object[]{id});
    }

    public void updateNode(Object id, double weight, double x, double y, int visitedCount, int selectedCount) {
        command("updateNode", new Object[]{id, weight, x, y, visitedCount, selectedCount});
    }

    public void updateNode(Object id, double weight, double x, double y, int visitedCount) {
        command("updateNode", new Object[]{id, weight, x, y, visitedCount});
    }

    public void updateNode(Object id, double weight, double x, double y) {
        command("updateNode", new Object[]{id, weight, x, y});
    }

    public void updateNode(Object id, double weight, double x) {
        command("updateNode", new Object[]{id, weight, x});
    }

    public void updateNode(Object id, double weight) {
        command("updateNode", new Object[]{id, weight});
    }

    public void updateNode(Object id) {
        command("updateNode", new Object[]{id});
    }

    public void removeNode(Object id) {
        command("removeNode", new Object[]{id});
    }

    public void addEdge(Object source, Object target, double weight, int visitedCount, int selectedCount) {
        command("addEdge", new Object[]{source, target, weight, visitedCount, selectedCount});
    }

    public void addEdge(Object source, Object target, double weight, int visitedCount) {
        command("addEdge", new Object[]{source, target, weight, visitedCount});
    }

    public void addEdge(Object source, Object target, double weight) {
        command("addEdge", new Object[]{source, target, weight});
    }

    public void addEdge(Object source, Object target) {
        command("addEdge", new Object[]{source, target});
    }

    public void updateEdge(Object source, Object target, double weight, int visitedCount, int selectedCount) {
        command("updateEdge", new Object[]{source, target, weight, visitedCount, selectedCount});
    }

    public void updateEdge(Object source, Object target, double weight, int visitedCount) {
        command("updateEdge", new Object[]{source, target, weight, visitedCount});
    }

    public void updateEdge(Object source, Object target, double weight) {
        command("updateEdge", new Object[]{source, target, weight});
    }

    public void updateEdge(Object source, Object target) {
        command("updateEdge", new Object[]{source, target});
    }

    public void removeEdge(Object source, Object target) {
        command("removeEdge", new Object[]{source, target});
    }

    public void layoutCircle() {
        command("layoutCircle", new Object[]{});
    }

    public void layoutTree(Object root, boolean sorted) {
        command("layoutTree", new Object[]{root, sorted});
    }

    public void layoutTree(Object root) {
        command("layoutTree", new Object[]{root});
    }

    public void layoutTree() {
        command("layoutTree", new Object[]{});
    }

    public void layoutRandom() {
        command("layoutRandom", new Object[]{});
    }

    public void visit(Object target, Object source, double weight) {
        command("visit", new Object[]{target, source, weight});
    }

    public void visit(Object target, Object source) {
        command("visit", new Object[]{target, source});
    }

    public void visit(Object target) {
        command("visit", new Object[]{target});
    }

    public void leave(Object target, Object source, double weight) {
        command("leave", new Object[]{target, source, weight});
    }

    public void leave(Object target, Object source) {
        command("leave", new Object[]{target, source});
    }

    public void leave(Object target) {
        command("leave", new Object[]{target});
    }

    public void select(Object target, Object source) {
        command("select", new Object[]{target, source});
    }

    public void select(Object target) {
        command("select", new Object[]{target});
    }

    public void deselect(Object target, Object source) {
        command("deselect", new Object[]{target, source});
    }

    public void deselect(Object target) {
        command("deselect", new Object[]{target});
    }

    public void log(LogTracer logTracer) {
        command("log", new Object[]{logTracer});
    }
}