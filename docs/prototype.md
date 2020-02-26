

Prototype pattern refers to creating duplicate object while keeping performance in mind. 

Prototype pattern specifies the kinds of objects to create using a **prototypical** instance, and create new objects by copying this prototype.

This pattern involves implementing a prototype interface which tells to create a clone of the current object. This pattern is used when creation of object directly is costly.

We're going to create an abstract class Shape and concrete classes extending the Shape class. A class ShapeCache is defined as a next step which stores shape objects in a Hashtable and returns their clone when requested.

![pattern diagram](./images/prototype_pattern_uml_diagram.jpg)


[main class: ../src/main/java/sample/designpattern/prototype/ShapeCache.java](../src/main/java/sample/designpattern/prototype/ShapeCache.java)
