package com.example.springsecurity;


import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;
import com.example.springsecurity.model.User;
import com.example.springsecurity.repository.UserRepository;
import org.springframework.security.crypto.password.PasswordEncoder;

@Component
public class TestDataLoader implements CommandLineRunner {

    private final UserRepository userRepository;
    private final PasswordEncoder passwordEncoder;

    public TestDataLoader(UserRepository userRepository, PasswordEncoder passwordEncoder) {
        this.userRepository = userRepository;
        this.passwordEncoder = passwordEncoder;
    }

    @Override
    public void run(String... args) {
        if (userRepository.count() == 0) {
            User user = new User();
            user.setUsername("admin");
            user.setPassword(passwordEncoder.encode("admin123"));
            user.setRole("USER");
            userRepository.save(user);
            System.out.println(">>> Default user admin/admin123 created");
        }
    }
}