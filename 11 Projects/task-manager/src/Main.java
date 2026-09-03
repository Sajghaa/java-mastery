import model.Task;            
import service.TaskManager;  
import java.util.List;       
import java.util.Scanner;     

public class Main {
    public static void main(String[] args) {
      
        TaskManager taskManager = new TaskManager();
        Scanner scanner = new Scanner(System.in); 

        boolean running = true; 

        while (running) {
           
            System.out.println("\n--- Task Manager ---");
            System.out.println("1. Add Task");
            System.out.println("2. List Tasks");
            System.out.println("3. Exit");
            System.out.print("Choose an option: ");

        
            int choice = scanner.nextInt();
            scanner.nextLine(); 
            
            if (choice == 1) {
           
                System.out.print("Enter title: ");
                String title = scanner.nextLine();

                System.out.print("Enter priority (1=Low, 2=Medium, 3=High): ");
                int priority = scanner.nextInt();
                scanner.nextLine(); 

                System.out.print("Enter due date (YYYY-MM-DD): ");
                String dueDate = scanner.nextLine();

                Task created = taskManager.addTask(title, priority, dueDate);
                System.out.println("Task added: " + created);

            } else if (choice == 2) {
                
                List<Task> allTasks = taskManager.getAllTasks();
                if (allTasks.isEmpty()) {
                    System.out.println("No tasks found.");
                } else {
                    System.out.println("--- Tasks ---");
                    for (Task t : allTasks) {
                        System.out.println(t);
                    }
                }
            } else if (choice == 3) {
            
                running = false;
                System.out.println("Goodbye!");
            } else {
           
                System.out.println("Invalid option. Please try again.");
            }
        }

        scanner.close(); 
    }
}