package MåDuKøbeAlkohol;

import MåDuKøbeAlkohol.PersonRepository.PersonRepository;

// Import the Person class
import MåDuKøbeAlkohol.Person;
import org.springframework.stereotype.Repository;

import java.util.Arrays;
import java.util.List;

@Repository
public class PersonRepositoryImpl implements PersonRepository {
    @Override
    public List<Person> findAll() {
        // Return hardcoded list of Person objects
        return Arrays.asList(
                new Person("John", 25),
                new Person("Alice", 20),
                new Person("Bob", 30)
        );
    }
}