

In Factory pattern, we create object without exposing the creation logic (aka the direct `new()` call) to the client but instead requesting a new object using a common interface.
Specific type of object being created is defined by subclasses sharing same superclass or interface.

![pattern diagram](./images/factory_pattern_uml_diagram.jpg)


[main class: ../src/main/java/sample/designpattern/factory/ShapeFactory.java](../src/main/java/sample/designpattern/factory/ShapeFactory.java)
