import org.Collections.PersonService;
import org.Collections.Person;

import org.junit.jupiter.api.Test;
import java.util.List;
import static org.junit.jupiter.api.Assertions.*;

/**
 * Unit tests for the PersonService class.
 */
public class PersonServiceTest {

    @Test
    public void testReadCSV() {
        PersonService personService = new PersonService();

        // Path to the CSV file
        String csvFilePath = "foreign_names.csv";

        try {
            // Read the list of people
            List<Person> people = personService.readPeopleFromCSV(csvFilePath);

            // Ensure that the list is not null and contains elements
            assertNotNull(people, "The list of people should not be null.");
            assertFalse(people.isEmpty(), "The list of people should not be empty.");

            // Optionally, check if the first person has the expected properties
            Person firstPerson = people.get(0);
            assertNotNull(firstPerson.getId(), "The person ID should not be null.");
            assertNotNull(firstPerson.getName(), "The person name should not be null.");
            assertNotNull(firstPerson.getGender(), "The person gender should not be null.");
            assertNotNull(firstPerson.getDepartment(), "The department should not be null.");
            assertNotNull(firstPerson.getSalary(), "The person salary should not be null.");
            assertNotNull(firstPerson.getBirthDate(), "The person birth date should not be null.");

            // Print success message (can be removed in production)
            System.out.println("Test passed: Data read successfully!");
        } catch (Exception e) {
            fail("Error reading CSV: " + e.getMessage());
        }
    }
}
