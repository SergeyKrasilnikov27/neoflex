package ru.neoflex.neoflex.сontroller;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.Map;

@RestController
public class PostController {

    @RequestMapping(path = "/calculacte/{salary}/{day}", method = RequestMethod.GET)
    public double getSalaryPerHolliday(@PathVariable int salary, @PathVariable int day) {
        double salaryCount = 0;

        salaryCount = salary / 363 * day;

        return salaryCount;
    }

    @ExceptionHandler
    @ResponseStatus(HttpStatus.BAD_REQUEST)
    public Map<String, String> handleNegativeSalary(final IllegalArgumentException e) {
        return Map.of("error", "Зарплата отрицательная или количество дней отпуска.");
    }

    @ExceptionHandler
    @ResponseStatus(HttpStatus.BAD_REQUEST)
    public Map<String, String> handleNullableSalary(final NullPointerException e) {
        return Map.of("error", "Не указана зарплата или количество дней.");
    }

    @ExceptionHandler
    @ResponseStatus(HttpStatus.BAD_REQUEST)
    public Map<String, String> handleError(final RuntimeException e) {
        return Map.of("error", "Произошла ошибка!");
    }
}
