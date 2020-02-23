

The chain of responsibility pattern creates a chain of receiver objects for a request. This pattern decouples sender and receiver of a request based on type of request.

In this pattern, normally each receiver contains reference to another receiver. If one object cannot handle the request then it passes the same to the next receiver and so on.

![pattern diagram](./images/chain_pattern_uml_diagram.jpg)

Demo class:
[../src/main/java/sample/designpattern/chainofresponsibility/Demo.java](../src/main/java/sample/designpattern/chainofresponsibility/Demo.java)

