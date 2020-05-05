package by.prakapienka.libertex.controller;

import by.prakapienka.libertex.entity.User;
import by.prakapienka.libertex.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/user")
public class UserController {

    @Autowired
    private UserRepository repository;

    @PostMapping
    public User create(final User user) {
        return repository.save(user);
    }

    @PutMapping
    public User update(final User user) {
        return repository.save(user);
    }

    @GetMapping
    public List<User> getAll() {
        return repository.findAll();
    }

}
