package com.glushkov;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;


class CleanerTest {
    Cleaner cleaner = new Cleaner(1, "Efimovna", 68, 5000, false, 50, 20);

    @Test
    void getRate() {
        //prepare
        int expected = 50;
        //when
        int actual = cleaner.getRate();
        //then
        assertEquals(expected, actual);
    }

    @Test
    void setRate() {
        //prepare
        int expected = 100;
        //when
        cleaner.setRate(100);
        int actual = cleaner.getRate();
        //then
        assertEquals(expected, actual);
    }

    @Test
    void getWorkedDays() {
        //prepare
        double expected = 20;
        //when
        double actual = cleaner.getWorkedDays();
        //then
        assertEquals(expected, actual);
    }

    @Test
    void setWorkedDays() {
        //prepare
        double expected = 29.5;
        //when
        cleaner.setWorkedDays(29.5);
        double actual = cleaner.getWorkedDays();
        //then
        assertEquals(expected, actual);
    }

    @Test
    void toCountSalary() {
        //prepare
        double expected = 6000;
        //when
        double actual = cleaner.toCountSalary();
        //then
        assertEquals(expected, actual);
    }

    @Test
    void testToString() {
        //prepare
        String expected = "Cleaner{id = 1, name = Efimovna, age = 68, salary = 5000.0, gender = женский, rate = 50, " +
                "workedDays = 20.0}";
        //when
        String actual = cleaner.toString();
        //then
        assertEquals(expected, actual);
    }
}