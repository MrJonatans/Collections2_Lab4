package org.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        String csvFilePath = "foreign_names.csv"; // Path to the CSV file
        PersonService personService = new PersonService();

        try {
            List<Person> people = personService.readPeopleFromCSV(csvFilePath);

            System.out.println("People list:");
            for (Person person : people) {
                System.out.println(person);
            }
        } catch (Exception e) {
            System.err.println("Error: " + e.getMessage());
            e.printStackTrace();
        }
    }
}
