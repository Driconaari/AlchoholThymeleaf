package MåDuKøbeAlkohol;

import java.util.List;

public interface ServiceInterface {

    public interface PersonService {
        List<Person> findAll();

        List<Person> findAllPersons();
    }
}
