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
import org.algorithm_visualizer.*;

class Main {
    public static void main(String[] args) {
        LogTracer logTracer = new LogTracer("Scratch Paper");

        logTracer.print("Visualize your own algorithm here!");
    }
}
```

Check out the [API reference](https://algorithm-visualizer.github.io/tracers.java/) for more information.

## Contributing

Check out the [contributing guidelines](https://github.com/algorithm-visualizer/tracers.java/blob/master/CONTRIBUTING.md).
