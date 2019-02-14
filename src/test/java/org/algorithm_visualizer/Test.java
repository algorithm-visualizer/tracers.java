package org.algorithm_visualizer;

import org.algorithm_visualizer.*;

class Test {
    static GraphTracer tracer = new GraphTracer();
    tracer.log(new LogTracer());
    static int G[][] = { // G[i][j] indicates whether the path from the i-th node to the j-th node exists or not
            {0, 1, 1, 0, 0, 0, 0, 0, 0, 0, 0},
            {0, 0, 0, 1, 1, 0, 0, 0, 0, 0, 0},
            {0, 0, 0, 0, 0, 1, 1, 0, 0, 0, 0},
            {0, 0, 0, 0, 0, 0, 0, 1, 1, 0, 0},
            {0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 1},
            {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0},
            {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0},
            {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0},
            {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0},
            {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0},
            {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0},
    };

    static void DFS(int node, int parent) { // node = current node, parent = previous node
        tracer.visit(node, parent).delay();
        for (int i = 0; i < G[node].length; i++) {
            if (G[node][i] == 1) { // if current node has the i-th node as a child
                DFS(i, node); // recursively call DFS
            }
        }
    }

    public static void main(String[] args) {
        tracer.set(G).layoutTree(0).delay();
        DFS(0, -1);
    }
}