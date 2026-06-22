package br.erionsistemas.com.course.repositories;

import br.erionsistemas.com.course.entities.OrderItem;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderItemRepository extends JpaRepository<OrderItem, Long> {

}
