package ru.neoflex.neoflex;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.util.Assert;
import ru.neoflex.neoflex.сontroller.PostController;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

@SpringBootTest
class NeoflexApplicationTests {

	@Test
	public void getCheckSalaryCountValue() {
		PostController postController = new PostController();
		double expected = 5782.0;
		double salaryCount = postController.getSalaryPerHolliday(150000, 14);

		assertNotNull(salaryCount);
		assertEquals(expected, salaryCount);
	}

	@Test
	public void getIllegalArgumentExceptionSalary(){

		try {
			PostController postController = new PostController();
			double expected = 5782.0;
			double salaryCount = postController.getSalaryPerHolliday(-150000, 14);

			assertNotNull(salaryCount);
			assertEquals(expected, salaryCount);
		} catch (IllegalArgumentException thrown) {
			Assert.notNull("", thrown.getMessage());
		}
	}

	@Test
	public void getIllegalArgumentExceptionDay(){

		try {
			PostController postController = new PostController();
			double expected = 5782.0;
			double salaryCount = postController.getSalaryPerHolliday(150000, -14);

			assertNotNull(salaryCount);
			assertEquals(expected, salaryCount);
		} catch (IllegalArgumentException thrown) {
			Assert.notNull("", thrown.getMessage());
		}
	}

	@Test
	public void getNullPointerExceptionSalary(){

		try {
			PostController postController = new PostController();
			double expected = 5782.0;
			double salaryCount = postController.getSalaryPerHolliday(0, 14);

			assertNotNull(salaryCount);
			assertEquals(expected, salaryCount);
		} catch (NullPointerException thrown) {
			Assert.notNull("", thrown.getMessage());
		}
	}

	@Test
	public void getNullPointerExceptionDay(){

		try {
			PostController postController = new PostController();
			double expected = 5782.0;
			double salaryCount = postController.getSalaryPerHolliday(150000, 0);

			assertNotNull(salaryCount);
			assertEquals(expected, salaryCount);
		} catch (NullPointerException thrown) {
			Assert.notNull("", thrown.getMessage());
		}
	}
}
