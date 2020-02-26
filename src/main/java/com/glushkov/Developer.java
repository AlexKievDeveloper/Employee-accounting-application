package com.glushkov;

import java.util.Random;

public class Developer extends Employee {
    private int fixedBugs;
    private Random random = new Random();
    private boolean randomBoolean = random.nextBoolean();

    public Developer(long id, String name, int age, double salary, boolean gender, int fixedBugs) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.salary = salary;
        this.gender = gender;
        this.fixedBugs = fixedBugs;
    }

    public int getFixedBugs() {
        return fixedBugs;
    }

    public void setFixedBugs(int fixedBugs) {
        this.fixedBugs = fixedBugs;
    }

    public double toCountSalary() {
        return salary + fixedBugs * (randomBoolean ? 1000 : 0);
    }

    @Override
    public String toString() {
        return "Developer{" + "id = " + id + ", name = " + name + ", age = " + age + ", salary = " + salary + ", " +
                "gender = " + (this.gender ? "мужской" : "женский") + ", fixedBugs = " + fixedBugs + "}";
    }
}
