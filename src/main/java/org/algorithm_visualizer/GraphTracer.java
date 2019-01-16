package org.algorithm_visualizer;

public class GraphTracer extends Tracer {
    public GraphTracer(String title) {
        super(title);
    }

    public GraphTracer() {
        this(null);
    }

    public GraphTracer set(Object array2d) {
        addTrace(key, "set", new Object[]{array2d});
        return this;
    }

    public GraphTracer set() {
        addTrace(key, "set", new Object[]{});
        return this;
    }

    public GraphTracer reset() {
        addTrace(key, "reset", new Object[]{});
        return this;
    }

    public GraphTracer delay() {
        addTrace(key, "delay", new Object[]{});
        return this;
    }

    public GraphTracer directed(boolean isDirected) {
        addTrace(key, "directed", new Object[]{isDirected});
        return this;
    }

    public GraphTracer directed() {
        addTrace(key, "directed", new Object[]{});
        return this;
    }

    public GraphTracer weighted(boolean isWeighted) {
        addTrace(key, "weighted", new Object[]{isWeighted});
        return this;
    }

    public GraphTracer weighted() {
        addTrace(key, "weighted", new Object[]{});
        return this;
    }

    public GraphTracer addNode(Object id, double weight, double x, double y, int visitedCount, int selectedCount) {
        addTrace(key, "addNode", new Object[]{id, weight, x, y, visitedCount, selectedCount});
        return this;
    }

    public GraphTracer addNode(Object id, double weight, double x, double y, int visitedCount) {
        addTrace(key, "addNode", new Object[]{id, weight, x, y, visitedCount});
        return this;
    }

    public GraphTracer addNode(Object id, double weight, double x, double y) {
        addTrace(key, "addNode", new Object[]{id, weight, x, y});
        return this;
    }

    public GraphTracer addNode(Object id, double weight, double x) {
        addTrace(key, "addNode", new Object[]{id, weight, x});
        return this;
    }

    public GraphTracer addNode(Object id, double weight) {
        addTrace(key, "addNode", new Object[]{id, weight});
        return this;
    }

    public GraphTracer addNode(Object id) {
        addTrace(key, "addNode", new Object[]{id});
        return this;
    }

    public GraphTracer updateNode(Object id, double weight, double x, double y, int visitedCount, int selectedCount) {
        addTrace(key, "updateNode", new Object[]{id, weight, x, y, visitedCount, selectedCount});
        return this;
    }

    public GraphTracer updateNode(Object id, double weight, double x, double y, int visitedCount) {
        addTrace(key, "updateNode", new Object[]{id, weight, x, y, visitedCount});
        return this;
    }

    public GraphTracer updateNode(Object id, double weight, double x, double y) {
        addTrace(key, "updateNode", new Object[]{id, weight, x, y});
        return this;
    }

    public GraphTracer updateNode(Object id, double weight, double x) {
        addTrace(key, "updateNode", new Object[]{id, weight, x});
        return this;
    }

    public GraphTracer updateNode(Object id, double weight) {
        addTrace(key, "updateNode", new Object[]{id, weight});
        return this;
    }

    public GraphTracer updateNode(Object id) {
        addTrace(key, "updateNode", new Object[]{id});
        return this;
    }

    public GraphTracer removeNode(Object id) {
        addTrace(key, "removeNode", new Object[]{id});
        return this;
    }

    public GraphTracer addEdge(Object source, Object target, double weight, int visitedCount, int selectedCount) {
        addTrace(key, "addEdge", new Object[]{source, target, weight, visitedCount, selectedCount});
        return this;
    }

    public GraphTracer addEdge(Object source, Object target, double weight, int visitedCount) {
        addTrace(key, "addEdge", new Object[]{source, target, weight, visitedCount});
        return this;
    }

    public GraphTracer addEdge(Object source, Object target, double weight) {
        addTrace(key, "addEdge", new Object[]{source, target, weight});
        return this;
    }

    public GraphTracer addEdge(Object source, Object target) {
        addTrace(key, "addEdge", new Object[]{source, target});
        return this;
    }

    public GraphTracer updateEdge(Object source, Object target, double weight, int visitedCount, int selectedCount) {
        addTrace(key, "updateEdge", new Object[]{source, target, weight, visitedCount, selectedCount});
        return this;
    }

    public GraphTracer updateEdge(Object source, Object target, double weight, int visitedCount) {
        addTrace(key, "updateEdge", new Object[]{source, target, weight, visitedCount});
        return this;
    }

    public GraphTracer updateEdge(Object source, Object target, double weight) {
        addTrace(key, "updateEdge", new Object[]{source, target, weight});
        return this;
    }

    public GraphTracer updateEdge(Object source, Object target) {
        addTrace(key, "updateEdge", new Object[]{source, target});
        return this;
    }

    public GraphTracer removeEdge(Object source, Object target) {
        addTrace(key, "removeEdge", new Object[]{source, target});
        return this;
    }

    public GraphTracer layoutCircle() {
        addTrace(key, "layoutCircle", new Object[]{});
        return this;
    }

    public GraphTracer layoutTree(Object root, boolean sorted) {
        addTrace(key, "layoutTree", new Object[]{root, sorted});
        return this;
    }

    public GraphTracer layoutTree(Object root) {
        addTrace(key, "layoutTree", new Object[]{root});
        return this;
    }

    public GraphTracer layoutTree() {
        addTrace(key, "layoutTree", new Object[]{});
        return this;
    }

    public GraphTracer layoutRandom() {
        addTrace(key, "layoutRandom", new Object[]{});
        return this;
    }

    public GraphTracer visit(Object target, Object source, double weight) {
        addTrace(key, "visit", new Object[]{target, source, weight});
        return this;
    }

    public GraphTracer visit(Object target, Object source) {
        addTrace(key, "visit", new Object[]{target, source});
        return this;
    }

    public GraphTracer visit(Object target) {
        addTrace(key, "visit", new Object[]{target});
        return this;
    }

    public GraphTracer leave(Object target, Object source, double weight) {
        addTrace(key, "leave", new Object[]{target, source, weight});
        return this;
    }

    public GraphTracer leave(Object target, Object source) {
        addTrace(key, "leave", new Object[]{target, source});
        return this;
    }

    public GraphTracer leave(Object target) {
        addTrace(key, "leave", new Object[]{target});
        return this;
    }

    public GraphTracer select(Object target, Object source) {
        addTrace(key, "select", new Object[]{target, source});
        return this;
    }

    public GraphTracer select(Object target) {
        addTrace(key, "select", new Object[]{target});
        return this;
    }

    public GraphTracer deselect(Object target, Object source) {
        addTrace(key, "deselect", new Object[]{target, source});
        return this;
    }

    public GraphTracer deselect(Object target) {
        addTrace(key, "deselect", new Object[]{target});
        return this;
    }

    public GraphTracer log(LogTracer logTracer) {
        addTrace(key, "log", new Object[]{logTracer.key});
        return this;
    }
}