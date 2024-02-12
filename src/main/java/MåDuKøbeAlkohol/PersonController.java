package MåDuKøbeAlkohol;

import MåDuKøbeAlkohol.Person;
import MåDuKøbeAlkohol.PersonRepository.PersonRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class PersonController {

    private final PersonRepository personRepository;

    @Autowired
    public PersonController(PersonRepository personRepository) {
        this.personRepository = personRepository;
    }

    @GetMapping("/findAll")
    public List<Person> findAll() {
        return personRepository.findAll();
    }


}
