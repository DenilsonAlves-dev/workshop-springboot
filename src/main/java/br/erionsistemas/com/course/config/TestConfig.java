package br.erionsistemas.com.course.config;

import br.erionsistemas.com.course.entities.User;
import br.erionsistemas.com.course.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

import java.util.Arrays;

@Configuration
@Profile("test")
public class TestConfig implements CommandLineRunner {

    @Autowired
    private UserRepository userRepository;

    @Override
    public void run(String... args) throws Exception {
        User u1 = new User(null, "Maria Brow", "maria@gmail.com", "988", "123");
        User u2 = new User(null, "Fernando", "fernando@gmail.com", "988", "123");

        userRepository.saveAll(Arrays.asList(u1, u2));

    }
}
