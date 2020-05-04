package by.prakapienka.libertex.repository;

import by.prakapienka.libertex.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Integer> {
}
