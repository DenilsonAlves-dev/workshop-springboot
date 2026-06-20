package br.erionsistemas.com.course.config;

import br.erionsistemas.com.course.entities.Category;
import br.erionsistemas.com.course.entities.Order;
import br.erionsistemas.com.course.entities.Product;
import br.erionsistemas.com.course.entities.User;
import br.erionsistemas.com.course.entities.enums.OrderStatus;
import br.erionsistemas.com.course.repositories.CategoryRepository;
import br.erionsistemas.com.course.repositories.OrderRepository;
import br.erionsistemas.com.course.repositories.ProductRepository;
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
    private ProductRepository productRepository;

    @Autowired
    private UserRepository userRepository;

    @Autowired
    private OrderRepository orderRepository;

    @Autowired
    private CategoryRepository categoryRepository;

    @Override
    public void run(String... args) throws Exception {
        Product p1 = new Product(null, "Produto 1", "400G", 2.5, "c:/Products");
        Product p2 = new Product(null, "Produto 2", "400G", 2.5, "c:/Products");

        productRepository.saveAll(Arrays.asList(p1,p2));

        Category cat1 = new Category(null, "Eletronics");
        Category cat2 = new Category(null, "Books");
        Category cat3 = new Category(null, "Computers");

        categoryRepository.saveAll(Arrays.asList(cat1, cat2, cat3));

        User u1 = new User(null, "Maria Brow", "maria@gmail.com", "988", "123");
        User u2 = new User(null, "Fernando", "fernando@gmail.com", "988", "123");

        Order o1 = new Order(null, Instant.parse("2026-06-18T08:43:44Z"), OrderStatus.CANCELED, u1);
        Order o2 = new Order(null, Instant.parse("2026-06-18T08:43:44Z"), OrderStatus.PAID, u2);
        Order o3 = new Order(null, Instant.parse("2026-06-18T08:43:44Z"),OrderStatus.DELIVERED, u1);

        userRepository.saveAll(Arrays.asList(u1, u2));
        orderRepository.saveAll(Arrays.asList(o1,o2,o3));

    }
}
