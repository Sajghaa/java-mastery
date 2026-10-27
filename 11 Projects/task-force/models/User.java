
public record User(String id, String name, String email) {
   
    public User {
        if (id == null || id.isBlank()) {
            throw new IllegalArgumentException("User ID cannot be null or empty");
        }

        if (name == null || name.isBlank()) {
            throw new IllegalArgumentException("User name cannot be null or empty");
        }

        if (email == null || email.contains("@")) {
            throw new IllegalArgumentException("Email must be valid");
        }
    }
    
}
