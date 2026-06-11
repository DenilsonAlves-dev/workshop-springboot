package br.erionsistemas.com.course.repositories;

import br.erionsistemas.com.course.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {

}
