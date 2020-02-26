package com.glushkov;

public class Test {
    public static void main(String[] args) {
        Cleaner cleaner1 = new Cleaner(1, "Petrovna", 65, 6000, false, 50, 22);
        Manager manager1 = new Manager(2, "Kiril", 24, 18000, true);
        Developer developer1 = new Developer(3, "Alex", 30, 50000, true, 14);

        Cleaner cleaner = new Cleaner(1, "Efimovna", 68, 5000, false, 50, 20);
        Manager manager = new Manager(2, "Sergey", 26, 20000, true);
        Developer developer = new Developer(3, "Afanasiy", 25, 50000, true, 10);
        Employee[] allEmployee2 = {cleaner, manager, developer};
        EmployeeService service1 = new EmployeeService(allEmployee2);
        service1.printEmployees();

        Employee[] allEmployee = {cleaner1, manager1, developer1};
        EmployeeService service = new EmployeeService(allEmployee);


        service.printEmployees();
        System.out.println();

        System.out.println(service.calculateSalaryAndBonus());
        System.out.println();

        System.out.println(service.getById(3));
        System.out.println();

        System.out.println(service.getByName("Petrovna"));
        System.out.println(service.getByName("Kiril"));
        System.out.println();

        service.sortByName();
        service.printEmployees();
        System.out.println();

        service.edit(manager1);
        service.printEmployees();
    }
}
