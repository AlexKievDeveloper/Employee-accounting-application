package com.glushkov;

import org.junit.jupiter.api.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.jupiter.api.Assertions.*;


class EmployeeServiceTest {

    Cleaner cleaner = new Cleaner(1, "Efimovna", 68, 5000, false, 50, 20);
    Manager manager = new Manager(2, "Sergey", 26, 20000, true);
    Developer developer = new Developer(3, "Afanasiy", 25, 50000, true, 10);
    Employee[] allEmployee = {cleaner, manager, developer};
    EmployeeService service = new EmployeeService(allEmployee);

    @Test
    void printEmployees() {
        //prepared
        ByteArrayOutputStream output = new ByteArrayOutputStream();
        System.setOut(new PrintStream(output));
        String expected = "Cleaner{id = 1, name = Efimovna, age = 68, salary = 5000.0, gender = женский, rate = 50," +
                " workedDays = 20.0}\r\n" +
                "Manager{id = 2, name = Sergey, age = 26, salary = 20000.0, gender = мужской}\r\n" +
                "Developer{id = 3, name = Afanasiy, age = 25, salary = 50000.0, gender = мужской, fixedBugs = 10}\r\n";
        //when
        service.printEmployees();
        //then
        assertEquals(expected, output.toString());
        System.setOut(null);
    }

    @Test
    void calculateSalaryAndBonus() {
        //prepare
        double expected = 0;
        for (int i = 1; i < allEmployee.length+1; i++) {
            expected = expected + service.getById(i).toCountSalary();
        }
        //when
        double actual = service.calculateSalaryAndBonus();
        // then
        assertEquals(expected, actual);
    }

    @Test
    void getById() {
        //prepare
        Employee expected = cleaner;
        //when
        Employee actual = service.getById(1);
        //then
        assertEquals(expected, actual);
    }

    @Test
    void getByName() {
        //prepare
        Employee expected = cleaner;
        //when
        Employee actual = service.getByName("Efimovna");
        //then
        assertEquals(expected, actual);
    }

    @Test
    void sortByName() {
        //prepare
        Employee expected = service.allEmployee[2];
        //when
        service.sortByName();
        Employee actual = service.allEmployee[0];
        //then
        assertEquals(expected, actual);
    }

    @Test
    void edit() {
        //prepare
        double expected = service.allEmployee[1].salary + 10000;
        //when
        double actual = service.edit(manager).salary;
        //then
        assertEquals(expected, actual);
    }
}