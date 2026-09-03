package model;

public class Task {
 
    private int id;
    private String title;
    private int priority;
    private String dueDate;


    public Task(int id, String title, int priority, String dueDate) {
        this.id = id;
        this.title = title;
        this.priority = priority;
        this.dueDate = dueDate;
    }

    public int getId() { return id; }
    public String getTitle() { return title; }
    public int getPriority() { return priority; }
    public String getDueDate() { return dueDate; }

    @Override
    public String toString(){
        return String.format(
            "ID: %d | Title: %s | Priority: %d | Due: %s",
            id, title, priority, dueDate
        );
    }

}
