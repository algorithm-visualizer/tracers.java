# tracers.java [![JitPack](https://img.shields.io/jitpack/v/github/algorithm-visualizer/tracers.java.svg?style=flat-square)](https://jitpack.io/#org.algorithm-visualizer/tracers.java) [![API reference](https://img.shields.io/badge/documentation-java-red.svg?style=flat-square)](https://algorithm-visualizer.github.io/tracers.java/) [![Travis (.com)](https://img.shields.io/travis/com/algorithm-visualizer/tracers.java.svg?style=flat-square)](https://travis-ci.com/algorithm-visualizer/tracers.java)

> This repository is part of the project [Algorithm Visualizer](https://github.com/algorithm-visualizer).

`tracers.java` is a visualization library for Java.
You can use it on [algorithm-visualizer.org](https://algorithm-visualizer.org/) or locally on your machine.

## Installation
### Gradle
1. Add the JitPack repository to `build.gradle`.
    ```gradle
    allprojects {
      repositories {
        jcenter()
        maven { url "https://jitpack.io" }
      }
    }
    ```

2. Add the dependency.
    ```gradle
    dependencies {
      implementation 'org.algorithm-visualizer:tracers.java:+'
    }
    ```

### Maven
1. Add the JitPack repository to `pom.xml`.
    ```xml
    <repositories>
      <repository>
          <id>jitpack.io</id>
          <url>https://jitpack.io</url>
      </repository>
    </repositories>
    ```

2. Add the dependency.
    ```
    <dependency>
      <groupId>org.algorithm-visualizer</groupId>
      <artifactId>tracers.java</artifactId>
      <version>[1.0.0,)</version>
    </dependency>
    ```

## Usage

```java
// import visualization libraries {
import org.algorithm_visualizer.*;
// }

class Main {
    // define tracer variables {
    Array2DTracer array2dTracer = new Array2DTracer("Grid");
    LogTracer logTracer = new LogTracer("Console");
    // }

    // define input variables
    String[] messages = {
            "Visualize",
            "your",
            "own",
            "code",
            "here!",
    };

    // highlight each line of messages recursively
    void highlight(int line) {
        if (line >= messages.length) return;
        String message = messages[line];
        // visualize {
        logTracer.println(message);
        array2dTracer.selectRow(line, 0, message.length() - 1);
        Tracer.delay();
        array2dTracer.deselectRow(line, 0, message.length() - 1);
        // }
        highlight(line + 1);
    }

    Main() {
        // visualize {
        Layout.setRoot(new VerticalLayout(new Commander[]{array2dTracer, logTracer}));
        array2dTracer.set(messages);
        Tracer.delay();
        // }
        highlight(0);
    }

    public static void main(String[] args) {
        new Main();
    }
}
```

Check out the [API reference](https://algorithm-visualizer.github.io/tracers.java/) for more information.

## Contributing

Check out the [contributing guidelines](https://github.com/algorithm-visualizer/tracers.java/blob/master/CONTRIBUTING.md).
