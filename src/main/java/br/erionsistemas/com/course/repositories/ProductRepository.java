package br.erionsistemas.com.course.repositories;

import br.erionsistemas.com.course.entities.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product, Long> {

}
