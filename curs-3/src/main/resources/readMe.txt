- Java 8
    - Lambdas
    - Streams


       =========================================

 Lambdas:
    - You spend more time reading code than writing code
    - Lambda expressions: easier way to write anonymous classes (functional interfaces - interface with only one abstract method)
    @FunctionalInterface
    - Type of a lambda: functional interface
    - Creating a new object IS NOT FREE: get memory, clean memory, execute static initializer...
    With lambda: you do not create new objects
    - java.util.function - rich set of functional interface ~43
    - 4 categories of functional interfaces:
        - Supplier
            - does not take any parameter and provides a new object
        - Consumer
            expects an object and does not return anything
        - Predicate
            - take a parameters and return a boolean (FILTER)
        - Function
             - takes an object as a parameter and returns another object
             - BiFunction - takes two parameters
             - UnaryOperator - takes an object and return an object of the same type
             - BinaryOperator - takes two objects and return same type



=========================================================
 - Collectors and Stream API
    - Stream<Person> personStream = persons.stream();
    - typed interface; Stream IS NOT A COLLECTIONS; provides a way to process large amounts of data
    - streams do not contain any data
    - operations that can be applied:
        - intermediary
        - final: may be called only once

    - Operations that can be applied to streams map / filer / reduce
        - map -> used a Function ( takes a List<Person> and returns a List<Integer>
              -> THE SIZE OF BOTH LISTS IS THE SAME;
              -> changes the type
        - filter -> used a Predicate ( takes a List<Person> and returns a List<Integer>
                 -> does not change the type, but changes the size
        - reduce
                 -> final operation; equivalent to an SQL aggregation
                 -> basic: SQL operation - min, max, sum, average