Why Design Patterns:

- Common platform for developers
Design patterns provide a standard terminology and are specific to particular scenario. For example, a singleton
design pattern sigonifies use f single object so all developers familiar with single design pattern will make
use of single object and they can tell each other that program is following a singleton pattern.

- Best Practices
Design patterns have been evolved over a long period of time and they provide best solutions to certain problems
faced during software development. Learning these patterns helps inexperienced developers to learn software
design in an easy and faster way.
=============================================================================================================
- Program to an interface and not an implementation
     - implementation can change
     - testing is a lot easier
     - dependencies are easy to introduce, but difficult to remove
     - hide implementation

So this approach gives you flexibility, but it also separates the really valuable part, the design, from the
implementation, which allows clients to be decoupled from the implementation. One question is whether you
should always use a Java interfaces for that. An abstract class is good as well. In fact, an abstract class
gives you more flexibility when it comes to evolution. You can add new behavior without breaking clients.

Bill Venners: How's that?

Erich Gamma: In Java when you add a new method to an interface, you break all your clients. When you
have an abstract class, you can add a new method and provide a default implementation in it. All the
clients will continue to work. As always there is a trade-off, an interface gives you freedom with regard
to the base class, an abstract class gives you  the freedom to add new methods later. It isn't always
possible to define an interface in an abstract class, but in the light of evolution you should consider
whether an abstract class is sufficient.

- Favour Composition over Inheritance
     - behaviour is easy to change @ runtime
     - no assumptions when overriding

Erich Gamma: I still think it's true even after ten years. Inheritance is a cool way to change behavior. But we
know that it's brittle, because the subclass can easily make assumptions about the context in which a method it
overrides is getting called. There's a tight coupling between the base class and the subclass, because of the
implicit context in which the subclass code I plug in will be called. Composition has a nicer property. The
coupling is reduced by just having some smaller things you plug into something bigger, and the bigger object
just calls the smaller object back.

From an API point of view defining that a method can be overridden is a stronger commitment than defining that
a method can be called.

In a subclass you can make assumptions about the internal state of the superclass when the method you override
is getting called. When you just plug in some behavior, then it's simpler. That's why you should favor
composition. A common misunderstanding is that composition doesn't use inheritance at all. Composition is
using inheritance, but typically you just implement a small interface and you do not inherit from a big class.
The Java listener idiom is a good example for composition. With listeners you implement a listener interface
or inherit from what is called an
adapter. You create a listener object and register it with a Button widget, for example. There is no need to
subclass Button to react to events.

Erich Gamma: We call this black box reuse. You have a container, and you plug in some smaller objects. These
smaller objects configure the container and customize the behavior of the container. This is possible since
the container delegates some behavior to the smaller thing. In the end you get customization by configuration.
This provides you with both flexibility and reuse opportunities for the smaller things. That's powerful.
Rather than giving you a lengthy explanation, let me just point you to the Strategy pattern. It is my
prototypical example for the flexibility of composition over inheritance. The increased flexibility comes
from the fact that you can plug-in different strategy objects and, moreover, that you can even change the
strategy objects dynamically at run-time.

=============================================================================================
- Creational patterns involve object instantiation and all provide a way to decouple a client from the
objects it needs to instantiate.
    - factory - we create object without exposing the creation logic to the client and refer to  newly created
      object using a common interface.
    - abstract factory - an interface is responsible for creating a factory of related objects  without
    explicitly specifying their classes. Each generated factory can give the objects as per the Factory
    pattern.
    - singleton - this pattern involves a single class which is responsible to create an object while
    making sure that only single object gets created. This class provides a way to access its only object
    which can be accessed directly without need to instantiate the object of the class.
    - builder - builds the final object step by step. This builder is independent of other objects.
    - prototype - creating duplicate object while keeping performance in mind. This pattern involves
    implementing a prototype interface which tells to create a clone of the current object. This pattern
    is used when creation of object directly is costly. For example, an object is to be created after a
    costly database operation. We can cache the object, returns its clone on next request and update the
    database as and when needed thus reducing database calls.

- Any pattern that is a Behavioral Pattern is concerned with how classes and objects interact and
distribute responsibility.
    - chain of responsability - the chain of responsibility pattern creates a chain of receiver objects
    for a  request. This pattern decouples sender and receiver of a request based on type of request.
    This pattern comes under behavioral patterns. In this pattern, normally each receiver contains
    reference to another receiver. If one object cannot handle the request then it passes the same to
    the next receiver and so on.
    - command - data driven design pattern and falls under behavioral pattern category.
    A request is wrapped under an object as command and passed to invoker object. Invoker object
    looks for the appropriate object which can handle this command and passes the command to the
    corresponding object which executes the command.
    - iterator - very commonly used design pattern in Java and .Net programming environment. This
    pattern is used to get a way to access the elements of a collection object in sequential manner
    without any need to know its underlying representation.
    - observer - used when there is one-to-many relationship between objects such as if one object is
    modified, its depenedent objects are to be notified automatically
    - strategy - a class behavior or its algorithm can be changed at runtime. In Strategy pattern,
    we create objects which represent various strategies and a context object whose behavior varies as
    per its strategy object. The strategy object changes the executing algorithm of the context object
    - template - an abstract class exposes defined ways/templates to execute its methods. Its subclasses
    can override the method implementation as per need but the invocation is to be in the same way as
    defined by an abstract class.

- Structural patterns let you compose classes or objects into larger structures.
    - adapter - Adapter pattern works as a bridge between two incompatible interfaces. This pattern
    involves a single class which is responsible to join functionalities of independent or incompatible
    interfaces. A real life example could be a case of card reader which acts as an adapter between
    memory card and a laptop. You plugin the memory card into card reader and card reader into the
    laptop so that memory card can be read via laptop. We are demonstrating use of Adapter pattern
    via following example in which an audio player device can play mp3 files only and wants to use
    an advanced audio player capable of playing vlc and mp4 files.
    - decorator - allows a user to add new functionality to an existing object without altering its
    structure. This type of design pattern comes under structural pattern as this pattern acts as a
    wrapper to existing class. This pattern creates a decorator class which wraps the original class
    and provides additional functionality keeping class methods signature intact.