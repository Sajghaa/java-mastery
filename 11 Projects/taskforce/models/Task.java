package models;

import java.time.LocalDate;
import java.util.Objects;
import java.util.Optional;
import java.util.UUID;


public final class Task {
    
    private final String id;
    private final String title;
    private final LocalDate dueDate;

    private TaskStatus status;
    private User assignee;

    public Task(String title, LocalDate dueDate) {
        if (title == null || title.isBlank()) {
            throw new IllegalArgumentException("Task title cannot be empty");
        }

        if (dueDate == null) {
            throw new IllegalArgumentException("Task due date cannot be null");
        }

        this.id = UUID.randomUUID().toString();
        this.title = title;
        this.dueDate = dueDate;
    }

    public void assigneeTo(User user){
        Objects.requireNonNull(user, "Cannot assign task to a null user");

        if (this.status == TaskStatus.DONE) {
            throw new IllegalArgumentException("Cannot assign a task that is already completed");
        }
        this.assignee = user;
        this.status = TaskStatus.IN_PROGRESS;
    }

    public void complete() {
        if (this.status == TaskStatus.DONE) {
            throw new IllegalArgumentException("Task is already completed");
        }
        this.status = TaskStatus.DONE;
    }

    public boolean isOverdue(LocalDate today) {
        return this.status != TaskStatus.DONE && today.isAfter(this.dueDate);
    }

    public String id() { return id; }

    public String title() { return title; }

    public LocalDate dueDate() { return dueDate; }

    public TaskStatus status() { return status; }

    public Optional<User> assignee() {
        return Optional.ofNullable(assignee);
    }

}
