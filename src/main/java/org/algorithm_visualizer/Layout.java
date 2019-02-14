package org.algorithm_visualizer;

public abstract class Layout extends Commander {
    public static void setRoot(Commander child) {
        command(null, "setRoot", new Object[]{child});
    }

    public Layout(Commander[] children) {
        super(new Object[]{children});
    }

    public void add(Commander child, int index) {
        command("add", new Object[]{child, index});
    }

    public void add(Commander child) {
        command("add", new Object[]{child});
    }

    public void remove(Commander child) {
        command("remove", new Object[]{child});
    }

    public void removeAll() {
        command("removeAll", new Object[]{});
    }
}