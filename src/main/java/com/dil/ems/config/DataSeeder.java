package com.dil.ems.config;

import com.dil.ems.model.Role;
import com.dil.ems.model.User;
import com.dil.ems.repository.UserRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.boot.CommandLineRunner;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Component;

@Component
@RequiredArgsConstructor
public class DataSeeder implements CommandLineRunner {

    private final UserRepository userRepository;
    private final PasswordEncoder passwordEncoder;

    @Override
    public void run(String... args) {
        seedUser("admin", "admin123", Role.ADMIN);
        seedUser("manager", "manager123", Role.MANAGER);
        seedUser("employee", "employee123", Role.EMPLOYEE);
    }

    private void seedUser(String username, String rawPassword, Role role) {
        userRepository.findByUsername(username).orElseGet(() ->
                userRepository.save(User.builder()
                        .username(username)
                        .password(passwordEncoder.encode(rawPassword))
                        .role(role)
                        .enabled(true)
                        .build())
        );
    }
}