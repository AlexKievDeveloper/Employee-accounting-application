package com.glushkov;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;


class ManagerTest {
    Manager manager = new Manager(2, "Sergey", 26, 20000, true);
    @Test
    void toCountSalary() {
        //prepare
        double expected = 20000;
        //when
        double actual = manager.toCountSalary();
        //then
        assertEquals(expected, actual);
    }

    @Test
    void testToString() {
        //prepare
        String expected = "Manager{id = 2, name = Sergey, age = 26, salary = 20000.0, gender = мужской}";
        //when
        String actual = manager.toString();
        //then
        assertEquals(expected, actual);
    }
}