package org.Collections;

/**
 * The Department class represents an organizational department.
 */
public class Department {
    private int id; // ID of the department
    private String name; // Name of the department

    /**
     * Constructs a Department object with the specified ID and name.
     *
     * @param id the ID of the department
     * @param name the name of the department
     */
    public Department(int id, String name) {
        this.id = id;
        this.name = name;
    }

    /**
     * Returns the ID of the department.
     *
     * @return the ID of the department
     */
    public int getId() {
        return id;
    }

    /**
     * Sets the ID of the department.
     *
     * @param id the ID of the department
     */
    public void setId(int id) {
        this.id = id;
    }

    /**
     * Returns the name of the department.
     *
     * @return the name of the department
     */
    public String getName() {
        return name;
    }

    /**
     * Sets the name of the department.
     *
     * @param name the name of the department
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * Returns a string representation of the Department object.
     *
     * @return a string representation of the department, including ID and name
     */
    @Override
    public String toString() {
        return String.format("Department(ID: %d, Name: %s)", id, name);
    }
}
