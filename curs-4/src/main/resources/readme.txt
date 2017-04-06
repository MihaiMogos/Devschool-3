Why Design Patterns:

- Common platform for developers

- Best Practices
===================================

- Program to an interface and not an implementation
    - implementing can change
    - testing is a lot easier
    - dependencies are easy to introduce, but difficult to remove
    - hide implementation

- Favour Composition over Inheritance
    - behaviour is easy to change @ runtime
    - no assumptions when overriding
=====================================================================
- Creational patterns involve object instantiation and all provide a way to decouple a client from the
 objects it needs to instantiate
    - factory - we create object without exposing the creation logic to the client and refer to newly created
                object using a common interface.

    - abstract factory - an interface is responsible for creating a factory of related objects without
                         explicitly specifying their classes. Each generated factory can give the objects as per
                         the Factory pattern

    - singleton - this pattern involves a single class which is responsible to create an object while
                  making sure that only single object gets created. This class provides a way to access
                  its only object which can be accessed directly without need to instantiate the object of the class

    - builder - builds the final object step by step. This builder is independent of other objects.

    -prototype - creating duplicate object while keeping performance in mind. This pattern involves
                 implementing a prototype interface which tells to create a clone of the current object. This
                 pattern is used when creation of object directly is costly. For example, an object is to be created
                 after a costly database operation. We can cache the object, returns its clone on next
                 request and update the database as and when needed thus reducing database calls.

- Any pattern that is a Behavioral Pattern is concerned with how classes and objects interact and distribute
  responsibility
    - chain of responsibility
    - command
