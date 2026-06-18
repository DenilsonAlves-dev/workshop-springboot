package br.erionsistemas.com.course.config;

import br.erionsistemas.com.course.entities.Order;
import br.erionsistemas.com.course.entities.User;
import br.erionsistemas.com.course.repositories.OrderRepository;
import br.erionsistemas.com.course.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

import java.time.Instant;
import java.util.Arrays;

@Configuration
@Profile("test")
public class TestConfig implements CommandLineRunner {

    @Autowired
    private UserRepository userRepository;

    @Autowired
    private OrderRepository orderRepository;

    @Override
    public void run(String... args) throws Exception {
        User u1 = new User(null, "Maria Brow", "maria@gmail.com", "988", "123");
        User u2 = new User(null, "Fernando", "fernando@gmail.com", "988", "123");

        Order o1 = new Order(null, Instant.parse("2026-06-18T08:43:44Z"), u1);
        Order o2 = new Order(null, Instant.parse("2026-06-18T08:43:44Z"), u2);
        Order o3 = new Order(null, Instant.parse("2026-06-18T08:43:44Z"), u1);

        userRepository.saveAll(Arrays.asList(u1, u2));
        orderRepository.saveAll(Arrays.asList(o1,o2,o3));

    }
}
