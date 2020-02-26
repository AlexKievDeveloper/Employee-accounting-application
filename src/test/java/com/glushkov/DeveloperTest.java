package com.glushkov;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DeveloperTest {
    Developer developer = new Developer(3, "Afanasiy", 25, 50000, true, 10);

    @Test
    void getFixedBugs() {
        //prepare
        int expected = 10;
        //when
        int actual = developer.getFixedBugs();
        //then
        assertEquals(expected, actual);
    }

    @Test
    void setFixedBugs() {
        //prepare
        int expected = 50;
        //when
        developer.setFixedBugs(50);
        int actual = developer.getFixedBugs();
        //then
        assertEquals(expected, actual);
    }

    @Test
    void toCountSalary() {
        //prepare
        double expected = 50000;
        double expected1 = 60000;
        //when
        double actual = developer.toCountSalary();
        //then
        boolean salary = actual == expected || actual == expected1;
        assertTrue(salary);
    }

    @Test
    void testToString() {
        //prepare
        String expected = "Developer{id = 3, name = Afanasiy, age = 25, salary = 50000.0, gender = мужской, " +
                "fixedBugs = 10}";
        //when
        String actual = developer.toString();
        //then
        assertEquals(expected, actual);
    }
}