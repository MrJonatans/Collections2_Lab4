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

    /**
     * Constructs a Person object with the specified details.
     *
     * @param id the ID of the person
     * @param name the name of the person
     * @param gender the gender of the person
     * @param department the department of the person
     * @param salary the salary of the person
     * @param birthDate the birth date of the person
     */
    public Person(String id, String name, String gender, Department department, double salary, String birthDate) {
        this.id = id;
        this.name = name;
        this.gender = gender;
        this.department = department;
        this.salary = salary;
        this.birthDate = birthDate;
    }

    /**
     * Returns the ID of the person.
     *
     * @return the ID of the person
     */
    public String getId() {
        return id;
    }

    /**
     * Sets the ID of the person.
     *
     * @param id the ID of the person
     */
    public void setId(String id) {
        this.id = id;
    }

    /**
     * Returns the name of the person.
     *
     * @return the name of the person
     */
    public String getName() {
        return name;
    }

    /**
     * Sets the name of the person.
     *
     * @param name the name of the person
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * Returns the gender of the person.
     *
     * @return the gender of the person
     */
    public String getGender() {
        return gender;
    }

    /**
     * Sets the gender of the person.
     *
     * @param gender the gender of the person
     */
    public void setGender(String gender) {
        this.gender = gender;
    }

    /**
     * Returns the department the person works in.
     *
     * @return the department of the person
     */
    public Department getDepartment() {
        return department;
    }

    /**
     * Sets the department the person works in.
     *
     * @param department the department of the person
     */
    public void setDepartment(Department department) {
        this.department = department;
    }

    /**
     * Returns the salary of the person.
     *
     * @return the salary of the person
     */
    public double getSalary() {
        return salary;
    }

    /**
     * Sets the salary of the person.
     *
     * @param salary the salary of the person
     */
    public void setSalary(double salary) {
        this.salary = salary;
    }

    /**
     * Returns the birthday of the person.
     *
     * @return the birthday of the person
     */
    public String getBirthDate() {
        return birthDate;
    }

    /**
     * Sets the birthday of the person.
     *
     * @param birthDate the birthday of the person
     */
    public void setBirthDate(String birthDate) {
        this.birthDate = birthDate;
    }

    /**
     * Returns a string representation of the Person object.
     *
     * @return a string representation of the person, including ID, name, gender, department, salary, and birth date
     */
    @Override
    public String toString() {
        return String.format("ID: %s, Name: %s, Gender: %s, Department: %s, Salary: %.2f, Birth Date: %s",
                id, name, gender, department.getName(), salary, birthDate);
    }
}

