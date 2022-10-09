package ru.neoflex.neoflex;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import ru.neoflex.neoflex.сontroller.PostController;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

@SpringBootTest
class NeoflexApplicationTests {

	@Test
	void getCheckSalaryCountValue() {
		PostController postController = new PostController();
		double expected = 5782.0;
		double salaryCount = postController.getSalaryPerHolliday(150000, 14);

		assertNotNull(salaryCount);
		assertEquals(expected, salaryCount);
	}
}
