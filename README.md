# tracers.java [![Maven Central](https://img.shields.io/maven-central/v/org.algorithm-visualizer/tracers-java.svg?style=flat-square)](https://search.maven.org/artifact/org.algorithm-visualizer/tracers-java) [![API reference](https://img.shields.io/badge/documentation-java-red.svg?style=flat-square)](https://javadoc.io/doc/org.algorithm-visualizer/tracers-java/) [![Travis (.com)](https://img.shields.io/travis/com/algorithm-visualizer/tracers.java.svg?style=flat-square)](https://travis-ci.com/algorithm-visualizer/tracers.java)

> This repository is part of the project [Algorithm Visualizer](https://github.com/algorithm-visualizer).

`tracers.java` is a visualization library for Java.
You can use it on [algorithm-visualizer.org](https://algorithm-visualizer.org/) or locally on your machine.

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

Check out the [API reference](https://javadoc.io/doc/org.algorithm-visualizer/tracers-java/) for more information.

## Contributing

Check out the [contributing guidelines](https://github.com/algorithm-visualizer/tracers.java/blob/master/CONTRIBUTING.md).
