package com.glushkov;

public class Cleaner extends Employee {
    private int rate;
    private double workedDays;

    public Cleaner(long id, String name, int age, double salary, boolean gender, int rate, double workedDays) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.salary = salary;
        this.gender = gender;
        this.rate = rate;
        this.workedDays = workedDays;
    }

    public int getRate() {
        return rate;
    }

    public void setRate(int rate) {
        this.rate = rate;
    }

    public double getWorkedDays() {
        return workedDays;
    }

    public void setWorkedDays(double workedDays) {
        this.workedDays = workedDays;
    }

    public double toCountSalary() {
        return salary + rate * workedDays;
    }

    @Override
    public String toString() {
        return "Cleaner{" + "id = " + id + ", name = " + name + ", age = " + age + ", salary = " + salary + ", " +
     "gender = " + (this.gender ? "мужской" : "женский") + ", rate = " + rate + ", workedDays = " + workedDays + "}";
    }
}
