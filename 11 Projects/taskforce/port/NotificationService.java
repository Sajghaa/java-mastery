

import models.Task;
import models.User;

public interface NotificationService {
    void notifyTaskAssigned(Task task, User user);
    
} 
