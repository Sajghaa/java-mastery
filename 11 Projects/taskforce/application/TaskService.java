package application;

import exceptions.TaskNotFoundException;
import exceptions.TaskStateException;
import models.Task;
import models.User;
import port.NotificationService;
import port.TaskRepository;

import java.time.LocalDate;
import java.util.List;
import java.util.stream.Collectors;

public class TaskService {

    private final TaskRepository repository;
    private final NotificationService notificationService;

    public TaskService(TaskRepository repository, NotificationService notificationService) {
        this.repository = repository;
        this.notificationService = notificationService;
    }
    
    public Task createTask(String title, LocalDate duedate) {
        Task task = new Task(title, duedate);
        repository.save(task);
        return task;
    }

    public void assignTask(String taskId, User user) {
        Task task = repository.findById(taskId)
                    .orElseThrow(() -> new TaskNotFoundException(taskId));


        task.assigneeTo(user);
        repository.save(task);
        notificationService.notifyTaskAssigned(task, user);
    }

    public void completeTask(String taskID) {
        Task task = repository.findById(taskID)
                    .orElseThrow(() -> new TaskNotFoundException(taskID));

        try {
            task.complete();
            repository.save(task);

        } catch (IllegalStateException e) {
            throw new TaskStateException(e.getMessage());
        }
    }

    public List<Task> getOverdueTasks(LocalDate today) {

        return repository.findAll().stream()
                .filter(task -> task.isOverdue(today))
                .collect(Collectors.toList());
    }
}
