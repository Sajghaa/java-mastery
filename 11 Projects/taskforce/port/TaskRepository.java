
import models.Task;
import models.User;

import java.util.List;
import java.util.Optional;

public interface TaskRepository {

    void save(Task task);

    Optional<Task> findById(String id);

    List<Task> findAll();

    List<Task> findByAssignee(User user);
    
}
