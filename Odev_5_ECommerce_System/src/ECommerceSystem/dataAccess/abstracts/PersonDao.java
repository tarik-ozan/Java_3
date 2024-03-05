package ECommerceSystem.dataAccess.abstracts;

import ECommerceSystem.entities.concretes.Person;

import java.util.List;

public interface PersonDao {
    void add(Person person);
    void update(Person person);
    void delete(Person person);
    Person get(String email);
    List<Person> getAll();

}
