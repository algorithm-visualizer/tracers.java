package org.algorithm_visualizer;

public class LogTracer extends Tracer {
    public LogTracer(String title) {
        super(title);
    }

    public LogTracer() {
        this(null);
    }

    public LogTracer set(Object messages) {
        addTrace(key, "set", new Object[]{messages});
        return this;
    }

    public LogTracer set() {
        addTrace(key, "set", new Object[]{});
        return this;
    }

    public LogTracer reset() {
        addTrace(key, "reset", new Object[]{});
        return this;
    }

    public LogTracer delay() {
        addTrace(key, "delay", new Object[]{});
        return this;
    }

    public LogTracer print(Object message) {
        addTrace(key, "print", new Object[]{message});
        return this;
    }

    public LogTracer println(Object message) {
        addTrace(key, "println", new Object[]{message});
        return this;
    }

    public LogTracer printf(String format, Object... args) {
        Object[] traceArgs = new Object[args.length + 1];
        traceArgs[0] = format;
        System.arraycopy(args, 0, traceArgs, 1, args.length);
        addTrace(key, "printf", traceArgs);
        return this;
    }
}