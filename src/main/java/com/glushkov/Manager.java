package com.glushkov;

public class Manager extends Employee {

    public Manager(long id, String name, int age, double salary, boolean gender) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.salary = salary;
        this.gender = gender;
    }

    public double toCountSalary() {
        return salary;
    }

    @Override
    public String toString(){
        return "Manager{" + "id = " + id + ", name = " + name + ", age = " + age + ", salary = " + salary + ", " +
                "gender = " + (this.gender ? "мужской" : "женский") + "}";
    }
}
