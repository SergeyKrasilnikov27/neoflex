package ru.neoflex.neoflex.сontroller;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PostController {

    @RequestMapping(path = "/calculacte/{salary}/{day}", method = RequestMethod.GET)
    public double getSalaryPerHolliday(@PathVariable int salary, @PathVariable int day) {
        double salaryCount = 0;

        salaryCount = salary / 363 * day;

        return salaryCount;
    }
}
