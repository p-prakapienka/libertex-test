package by.prakapienka.libertex;

import by.prakapienka.libertex.controller.UserController;
import by.prakapienka.libertex.entity.User;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.orm.ObjectOptimisticLockingFailureException;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

@SpringBootTest
class LibertexTestApplicationTests {

	private ExecutorService executor;

	@Autowired
	private UserController controller;

	@BeforeEach
	void init() {
		executor = Executors.newFixedThreadPool(10);

		controller.create(new User("User 1"));
		controller.create(new User("User 2"));
		controller.create(new User("User 3"));
	}

	@Test
	void contextLoads() {
	}

	@Test
	void testOptimisticLock() {
		Assertions.assertThrows(
			ObjectOptimisticLockingFailureException.class,
			() -> IntStream.range(1, 4).parallel().forEach(i -> {
				final User updated = controller.update(new User(1, "Rename" + i));
				System.out.println(updated);
			})
		);
	}

}
