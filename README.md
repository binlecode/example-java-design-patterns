# java-design-patterns

Github page url: [https://binlecode.github.io/example-java-design-patterns/](https://binlecode.github.io/example-java-design-patterns/)

Github CI status:

![Java CI](https://github.com/binlecode/example-java-design-patterns/workflows/Java%20CI/badge.svg)

Pattern: a (general) **solution** to a (recuring) **problem** in a (given) **context** (mixture of assumptions and constraints).

GOF design pattern samples in Java.

This repository contains Java snippets of patterns that are widely used in enterprise software development.

Referance tutorial url: https://www.tutorialspoint.com/design_pattern/index.htm 

[See detailed pattern list](./docs/index.md)



## maven setup

JDK 1.8+
Maven version 3.5.4.

```bash
./mvn archetype:generate -DgroupId=binlecode.example \
    -DartifactId=example-java-design-pattern  \
    -DarchetypeArtifactId=maven-archetype-quickstart \
    -DarchetypeVersion=1.4 \
    -DinteractiveMode=false

cd example-java-design-pattern
# setup local mvn wrapper
mvn -N io.takari:maven:wrapper -Dmaven=3.5.4
```

