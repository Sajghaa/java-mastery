package service;

import model.Task;
import java.util.ArrayList;
import java.util.List;

public class TaskManager {
    
    private List<Task> tasks;
    private int nextId;

    public TaskManager() {
        tasks = new ArrayList<>();
        nextId = 1;
    }

    public Task addTask(String title, int priority, String dueDate) {
        Task newTask = new Task(nextId, title, priority, dueDate);
        tasks.add(newTask);
        return newTask;
    }

    public List<Task> getAllTasks() {
        return tasks;
    }
}
