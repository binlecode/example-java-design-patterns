
Facade pattern hides the complexities of the system and provides an interface to the client. This type of design pattern comes under structural pattern as this pattern adds an interface to existing system to hide its complexities.

One common use of facade pattern is for API/service aggregation (in favor of composition over inhertance).

We are going to create a Shape interface and concrete classes implementing the Shape interface. A facade class ShapeMaker is defined as a next step.

ShapeMaker class uses the concrete classes to delegate user calls to these classes.

![pattern diagram](./images/facade_pattern_uml_diagram.jpg)

Main class:

[../src/main/java/sample/designpattern/facade/ShapeMaker.java](../src/main/java/sample/designpattern/facade/ShapeMaker.java)