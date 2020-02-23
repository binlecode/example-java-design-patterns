
Visitor pattern is used when we have to perform an operation on a group of similar kind of Objects. With visitor pattern, we can move the operational logic from the objects to another class.

The visitor pattern consists of two parts:
- a method called `Visit()` which is implemented by the **visitor** and is called for every element in the data structure
- **visitable** classes providing `Accept()` methods that accept a visitor, upon being accepted, the visitor will do `visit()` operation on the visitable object


We are going to create a ComputerPart interface defining `accept` operation.Keyboard, Mouse, Monitor and Computer are concrete classes implementing ComputerPart interface. We will define another interface `ComputerPartVisitor` which will define a visitor class operations. Computer uses concrete visitor to do corresponding action.

![pattern diagram](./images/visitor_pattern_uml_diagram.jpg)

Demo class:
[../src/main/java/sample/designpattern/visitor/Demo.java](../src/main/java/sample/designpattern/visitor/Demo.java)


