
Six (6) design principles embodied in desgin patterns:

1. single responsibility
one class for one well defined kind of work, otherwise partition

2. Liskov Substitution Principle (LSP)
Anywhere where a class exists, its subclass can exist without breaking functionality
this principle paves the road of reusability of base-class, and justifies the value of extensibility of subclassing 
LSP is the implementation of open-close principle: open to extension, close to change.

With LSP, subclass should maximaze reusing superclasses functionality, and try to conform to superclass's defined structure and behavior as much as possible. Any violation of such hampers the value of inheritence. 

3. Dependence Inversion Principle
Interface driven coding. Rely on abstraction not implementation. Avoid interacting with implementation classes, but interface or abstract class.

4. Interface Segregation Principle
Interface should only define methods relevant to implementers. Otherwise the interface should be segregated to address single purpose per interface.

5. Demeter Principle
A class should know as little as possible about its dependencies. It should only talk to its immediate collaborators (aka friends). A friend should hide all complexity inside itself and only expose public methods to external world.
Least knowledge of adjacency promotes loose coupling and high cohesion.

6. Composite Reuse Principle
Composition over inheritance.
