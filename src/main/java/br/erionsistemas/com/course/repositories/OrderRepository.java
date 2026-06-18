package br.erionsistemas.com.course.repositories;

import br.erionsistemas.com.course.entities.Order;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderRepository extends JpaRepository<Order, Long> {

}
