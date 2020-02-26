package com.glushkov;

import java.util.Arrays;


public class EmployeeService {

    protected  Employee[] allEmployee;

    public EmployeeService(Employee[] allEmployee) {
        this.allEmployee = allEmployee;
    }

    void printEmployees() {
        for (Employee employee : allEmployee) {
            System.out.println(employee.toString());
        }
    }

    double calculateSalaryAndBonus() {
        double allSalary = 0;
        for (Employee employee : allEmployee) {
            allSalary = allSalary + employee.toCountSalary();
        }
        return allSalary;
    }

    Employee getById(long id) {
        for (Employee employee : allEmployee) {
            if (employee.id == id) {
                return employee;
            }
        }
        throw new ArrayIndexOutOfBoundsException("Работник с указанным ID отсутствует в базе, попробуйте ввести " +
                "другой ID");
    }

    Employee getByName(String name) {
        for (Employee employee : allEmployee) {
            if (employee.name.equals(name)) {
                return employee;
            }
        }
        throw new ArrayIndexOutOfBoundsException("Работник с указанным именем отсутствует в базе, попробуйте ввести " +
                "другое имя");
    }

    Employee[] sortByName() {
        String[] names = new String[allEmployee.length];
        for (int i = 0; i < allEmployee.length; i++) {
            names[i] = allEmployee[i].name;
        }
        Arrays.sort(names);
        Employee[] temp = new Employee[allEmployee.length];
        for (int i = 0; i < allEmployee.length; i++) {
            for (Employee employee : allEmployee) {
                if (names[i].equals(employee.name)) {
                    temp[i] = employee;
                }
            }
        }
        allEmployee = temp;
        return allEmployee;
    }

    Employee edit(Employee employee) throws IllegalArgumentException {
        for (Employee tempVariable : allEmployee) {
            if (tempVariable.id == employee.id) {
                tempVariable.salary = tempVariable.salary + 10000;
                return tempVariable ;
            }
        }
        throw new IllegalArgumentException("Данный сотрудник отсутствует в базе, попробуйте ввести " +
                "другого сотрудника");
    }
}
