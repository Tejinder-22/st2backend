package service;

import org.springframework.beans.factory.annotation.Autowired;

public class UserService {
    @Autowired
    private UserRepository userRepository;

    // Contain all the business logic and communicate to db
    public User login(User user) {
        User existingUser = userRepository.checkCredentials(user.getUsername(), user.getPassword());
        if(existingUser == null) {
            return null;
        } else {
            return existingUser;
        }
    }
}
