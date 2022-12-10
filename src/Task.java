import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
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

class TodoList {
    private LinkedList<Task> tasks;
    private LinkedList<Task> completedTasks;

    public TodoList() {
        this.tasks = new LinkedList<>();
        this.completedTasks = new LinkedList<>();
    }

    public void addTask(Task task) {
        this.tasks.add(task);

    }

    public void removeTask(Task task) {
        this.tasks.remove(task);
        completedTasks.add(task);

    }

    public List<Task> getTasks() {
        return Collections.unmodifiableList(this.tasks);
    }




public void printCompletedTasks() {
        for (int i = 0; i < completedTasks.size(); i++) {
            System.out.println("Completed task:" + i + 1 + " . " + completedTasks.get(i));
        }

    }




    // print al tasks method
    public void printAllTasks() {
        for (Task task : this.tasks) {
            System.out.println("Here are all the tasks: "+ task.getDescription());
        }
    }
}
