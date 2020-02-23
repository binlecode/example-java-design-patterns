
Proxy means ‘in place of’, representing’ or ‘in place of’ or ‘on behalf of’ are literal meanings of proxy and that directly explains Proxy Design Pattern.

In proxy pattern, a class represents functionality of another class.
In other words, we create object having original object to interface its functionality to outer world.


We are going to create an Image interface and concrete classes implementing the Image interface. ProxyImage is a a proxy class to reduce memory footprint of RealImage object loading.

![pattern diagram](./images/proxy_pattern_uml_diagram.jpg)

Main class:

[../src/main/java/sample/designpattern/proxy/Demo.java](../src/main/java/sample/designpattern/proxy/Demo.java)


