package org.Collections;
import com.opencsv.*;
import java.io.*;
import java.util.*;
import java.util.concurrent.atomic.AtomicInteger;

/**
 * Service for handling operations related to Person entities, including reading from a CSV file.
 */
public class PersonService {
    private static final char SEPARATOR = ';';

    /**
     * Reads a CSV file and returns a list of Person objects.
     *
     * @param filePath the path to the CSV file
     * @return a list of Person objects parsed from the CSV file
     */
    public List<Person> readPeopleFromCSV(String filePath) {
        List<Person> people = new ArrayList<>();
        Map<String, Department> departmentMap = new HashMap<>();
        AtomicInteger departmentIdCounter = new AtomicInteger(1);

        try (InputStream in = getClass().getClassLoader().getResourceAsStream(filePath);
             InputStreamReader reader = in == null ? null : new InputStreamReader(in)) {
            if (reader == null) {
                throw new FileNotFoundException(filePath);
            }

            CSVParser parser = new CSVParserBuilder().withSeparator(SEPARATOR).build();
            CSVReader csvReader = new CSVReaderBuilder(reader).withCSVParser(parser).build();

            String[] nextLine;
            boolean isFirstLine = true;
            while ((nextLine = csvReader.readNext()) != null) {
                if (isFirstLine) {
                    isFirstLine = false;
                    continue; // Skip the header row
                }

                String id = nextLine[0];
                String name = nextLine[1];
                String gender = nextLine[2];
                String birthDate = nextLine[3];
                String departmentName = nextLine[4];
                double salary = Double.parseDouble(nextLine[5]);

                // Create or get existing department
                Department department = departmentMap.computeIfAbsent(departmentName, k -> {
                    int departmentId = departmentIdCounter.getAndIncrement();
                    return new Department(departmentId, departmentName);
                });

                // Create a Person object
                Person person = new Person(id, name, gender, department, salary, birthDate);
                people.add(person);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }

        return people;
    }
}
