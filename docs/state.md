
State design pattern is used when an Object changes its behavior based on its internal state.

In State pattern, we create objects which represent various states and a context object whose behavior varies as its state object changes.

State pattern is used to provide a systematic and lose-coupled way to achieve this through Context and State implementations.

![pattern diagram](./images/state_pattern_uml_diagram.jpg)

Context: Defines an interface to client to interact. It maintains references to concrete state object which may be used to define current state of object.
State: Defines interface for declaring what each concrete state should do.
ConcreteState: Provides implementation for methods defined in State.

State pattern advantages:
- ease of implementing polymorphic behavior, and it is also easier to add states to support additional behavior.
- the behavior gets changed at runtime depending on the state, which removes the dependency on the if/else or switch/case conditional logic
- improves Cohesion since state-specific behaviors are aggregated into the ConcreteState classes


Demo class:

[../src/main/java/sample/designpattern/state/Demo.java](../src/main/java/sample/designpattern/state/Demo.java)