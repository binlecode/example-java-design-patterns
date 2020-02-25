
Abstract Factory pattern is almost similar to Factory Pattern is considered as another layer of abstraction over factory pattern. Abstract Factory patterns work around a super-factory which creates other factories, aka factory of factories. So at runtime, abstract factory is coupled with any desired concrete factory which can create objects of desired type.

In Abstract Factory pattern an interface is responsible for creating a factory of related objects without explicitly specifying their classes. Each generated factory can create the objects as per the Factory pattern.

We are going to create a Shape interface and a concrete class implementing it. We create an abstract factory class AbstractFactory as next step. Factory class ShapeFactory is defined, which extends AbstractFactory. A factory creator/generator class FactoryProducer is created.

The main method in FactoryProducer is to get a AbstractFactory object. It will pass information (CIRCLE / RECTANGLE / SQUARE for Shape) to AbstractFactory to get the type of object it needs.

![pattern diagram](./images/abstractfactory_pattern_uml_diagram.jpg)


[main class ./src/main/java/sample/designpattern/abstractfactory/FactoryProducer.java](../src/main/java/sample/designpattern/abstractfactory/FactoryProducer.java)

run main class:

```bash
./mvnw exec:java -Dexec.mainClass="sample.designpattern.abstractfactory.FactoryProducer"
```