import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

class Task {
    private String description;
    private boolean isCompleted;

    public Task(String description) {
        this.description = description;
        this.isCompleted = false;
    }

    public String getDescription() {
        return this.description;
    }

    public boolean getIsCompleted() {
        return this.isCompleted;
    }

    public void setIsCompleted(boolean isCompleted) {
        this.isCompleted = isCompleted;
    }
}




abstract class Command {
    protected TodoList todoList;

    public Command(TodoList todoList) {
        this.todoList = todoList;
    }

    public abstract void execute();


}




class AddTaskCommand extends Command {
    private Task task;

    public AddTaskCommand(TodoList todoList, Task task) {
        super(todoList);
        this.task = task;
    }

    @Override
    public void execute() {
        this.todoList.addTask(this.task);
    }
}



class RemoveTaskCommand extends Command {
    private Task task;

    public RemoveTaskCommand(TodoList todoList, Task task) {
        super(todoList);
        this.task = task;
    }

    @Override
    public void execute() {
        this.todoList.removeTask(this.task);
    }
}



class TodoList {
    private List<Task> tasks;
    private List<Command> commands;
    private int currentCommandIndex;

    public TodoList() {
        this.tasks = new ArrayList<>();
        this.commands = new ArrayList<>();
        this.currentCommandIndex = -1;
    }

    public void addTask(Task task) {
        this.tasks.add(task);
        Command command = new AddTaskCommand(this, task);
        this.executeCommand(command);
    }

    public void removeTask(Task task) {
        this.tasks.remove(task);
        Command command = new RemoveTaskCommand(this, task);
        this.executeCommand(command);
    }

    public List<Task> getTasks() {
        return Collections.unmodifiableList(this.tasks);
    }

    private void executeCommand(Command command) {
        this.commands.add(command);
        this.currentCommandIndex++;
        command.execute();
    }

    public void undo() {
        if (this.currentCommandIndex >= 0) {
            Command command = this.commands.get(this.currentCommandIndex);
            this.currentCommandIndex--;
            command.undo();
        }
    }

    public void redo() {
        if (this.currentCommandIndex < this.commands.size() - 1) {
            this.currentCommandIndex++;
            Command command = this.commands.get(this.currentCommandIndex);
            command.execute();
        }
    }
}
