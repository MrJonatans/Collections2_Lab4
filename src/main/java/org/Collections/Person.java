package org.Collections;

/**
 * Represents a Person entity with attributes like ID, name, gender, department, salary, and birth date.
 */
public class Person {
    private String id;
    private String name;
    private String gender;
    private Department department;
    private double salary;
    private String birthDate;

    public Person(String id, String name, String gender, Department department, double salary, String birthDate) {
        this.id = id;
        this.name = name;
        this.gender = gender;
        this.department = department;
        this.salary = salary;
        this.birthDate = birthDate;
    }

    // Getters and setters

    @Override
    public String toString() {
        return String.format("ID: %s, Name: %s, Gender: %s, Department: %s, Salary: %.2f, Birth Date: %s",
                id, name, gender, department.getName(), salary, birthDate);
    }
}

