# tracers.java [![Maven Central](https://img.shields.io/maven-central/v/org.algorithm-visualizer/tracers-java.svg?style=flat-square)](https://search.maven.org/artifact/org.algorithm-visualizer/tracers-java)

> `tracers.java` is a visualization library for Java.

This repository is part of the project [Algorithm Visualizer](https://github.com/algorithm-visualizer).

## Installation

- Gradle
    ```gradle
    dependencies {
      implementation 'org.algorithm-visualizer:tracers-java:+'
    }
    ```

- Maven
    ```xml
    <dependency>
      <groupId>org.algorithm-visualizer</groupId>
      <artifactId>tracers-java</artifactId>
      <version>[1.0.0,)</version>
    </dependency>
    ```

## Usage

```java
import org.algorithm_visualizer.*;

class Main {
    public static void main(String[] args) {
        LogTracer logTracer = new LogTracer("Scratch Paper");

        logTracer.print("Visualize your own algorithm here!");
    }
}
```

Check out the [API reference](https://github.com/algorithm-visualizer/algorithm-visualizer/wiki) for more information.

## Contributing

Check out the [contributing guidelines](https://github.com/algorithm-visualizer/tracers.java/blob/master/CONTRIBUTING.md).
