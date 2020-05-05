package by.prakapienka.libertex.config;

import by.prakapienka.libertex.entity.User;
import by.prakapienka.libertex.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;

import javax.annotation.PostConstruct;

@Configuration
public class UserRepositoryConfig {

    @Autowired
    private UserRepository repository;

    @PostConstruct
    public void init() {
        repository.save(new User("User 1"));
        repository.save(new User("User 2"));
        repository.save(new User("User 3"));
    }

}
