

Interpreter pattern is used to defines a grammatical representation for a language and provides an interpreter to deal with this grammar. In this pattern the grammar is defined in an object-oriented way which can be evaluated by the interpreter.

This pattern involves implementing an expression interface which tells to interpret a particular context. 

We are going to create an interface `Expression` and concrete classes implementing the Expression interface. A class `TerminalExpression` is defined which acts as a main interpreter of context in question. Other classes OrExpression, AndExpression are used to create combinatorial expressions aka `NonTerminalExpression`.

![pattern diagram](./images/interpreter_pattern_uml_diagram.jpg)

Demo class:

[../src/main/java/sample/designpattern/interpreter/Demo.java](../src/main/java/sample/designpattern/interpreter/Demo.java)