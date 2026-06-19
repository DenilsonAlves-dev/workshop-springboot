package br.erionsistemas.com.course.repositories;

import br.erionsistemas.com.course.entities.Category;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CategoryRepository extends JpaRepository<Category, Long> {
}
