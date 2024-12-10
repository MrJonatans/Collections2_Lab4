package org.Collections;

/**
 * Represents a Department entity with attributes like ID and name.
 */
public class Department {
    private int id;
    private String name;

    public Department(int id, String name) {
        this.id = id;
        this.name = name;
    }

    // Getters and setters

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return String.format("Department(ID: %d, Name: %s)", id, name);
    }
}

