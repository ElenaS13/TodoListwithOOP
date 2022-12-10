# TodoListwithOOP

This is an example of a TODO list program that uses appropriate object-oriented design principles and patterns. 

This implementation uses the object-oriented design principles of encapsulation, inheritance, and polymorphism.

Encapsulation is used to hide the implementation details of the Task and TodoList classes. For example, the Task class has private properties for the task description and completion status, and provides public methods for accessing and modifying these properties. This allows the Task class to control how its properties are accessed and modified, and ensures that the properties are only changed in a valid and consistent manner.

Inheritance is used to create a hierarchy of classes. The Command class is defined as an abstract base class, and two concrete subclasses (AddTaskCommand and RemoveTaskCommand) are defined that inherit from Command and implement the execute method. This allows for a common interface (i.e. the execute method) to be defined for all commands, while allowing for specific implementations of that interface in each subclass.

Polymorphism is used to allow for different subclasses of Command to be treated in the same way. In the TodoList class, the executeCommand method takes a Command object as a parameter, and calls the execute method on that object. This method can be called with any object that is an instance of a Command subclass, and the appropriate execute method will be called on that object, depending on its specific type. This allows for a single method to handle different types of commands in a flexible and extensible way.


