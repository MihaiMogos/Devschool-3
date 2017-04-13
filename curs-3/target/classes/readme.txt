- Java 8
    - lambda
    - streams

- Lambdas
    - Lambda - functional interface with only one interface -> @FunctionalInterface
    - Type of lambda - functional interface
    - Creating a new object is not free: get memory, clean the memory, execute static initializer, execute static
      blocks, non static initializer, non static blocks,...
    - With lambdas - you do not create an object, you do not call new
    - java.util.function - rich set of functional interfaces - 43
    - 4 categories of functional interfaces:
        - Supplier
            - does not take any parameter and provides new object
        - Consumer
            - expects an object and does not return anything
            - ex: Consumer<T> consumer = p ->System.out.println(p);
            - BiConsumer - takes two objects
        - Predicate
            - take a parameter and returns a boolean
            - BPredicate
        - Function
            - take an object as a parameter and returns another object
            - BiFunction
            - UnaryOperator - takes an object and returns an object of the same type
            - BinaryOperator - takes two object of the same type and returns an object of the same type

========================================================================================================================
- Collectors and Stream API