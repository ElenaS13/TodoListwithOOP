# TodoListwithOOP

This is an example of a TODO list program that uses appropriate object-oriented design principles and patterns. 

This implementation uses the object-oriented design principles of encapsulation, inheritance, and polymorphism.

Encapsulation is used to hide the implementation details of the Task and TodoList classes. For example, the Task class has private properties for the task description and completion status, and provides public methods for accessing and modifying these properties. This allows the Task class to control how its properties are accessed and modified, and ensures that the properties are only changed in a valid and consistent manner.

Inheritance is used to create a hierarchy of classes. The Command class is defined as an abstract base class, and two concrete subclasses (AddTaskCommand and RemoveTaskCommand) are defined that inherit from Command and implement the execute method. This allows for a common interface (i.e. the execute method) to be defined for all commands, while allowing for specific implementations of that interface in each subclass.

Polymorphism is used to allow for different subclasses of Command to be treated in the same way. In the TodoList class, the executeCommand method takes a Command object as a parameter, and calls the execute method on that object. This method can be called with any object that is an instance of a Command subclass, and the appropriate execute method will be called on that object, depending on its specific type. This allows for a single method to handle different types of commands in a flexible and extensible way.

the Command class represents an abstract base class for commands that can be executed on a TodoList object. It defines an execute method that must be implemented by concrete subclasses, and it also holds a reference to a TodoList object.



The Command class is part of an implementation of the Command pattern, which is a design pattern used to separate the responsibilities of an object into distinct, independent components. In this case, the Command class represents the "command" part of the pattern, which defines the interface for executing an action on a TodoList object. The concrete subclasses of Command (such as AddTaskCommand and RemoveTaskCommand) represent the specific actions that can be performed on a TodoList.

In the TodoList class, the executeCommand method takes a Command object as a parameter and calls the execute method on that object. This allows for different actions to be performed on a TodoList object by passing different Command objects to the executeCommand method. This separation of concerns makes the TodoList class more modular and easier to extend and maintain.
