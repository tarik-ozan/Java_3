package ECommerceSystem.dataAccess.concretes;

import ECommerceSystem.dataAccess.abstracts.PersonDao;
import ECommerceSystem.entities.concretes.Person;

import java.util.List;

public class MySystem implements PersonDao {
    @Override
    public void add(Person person) {
        System.out.println("Sisteme Kaydedildi : " + person.geteMail());
    }

    @Override
    public void update(Person person) {

    }

    @Override
    public void delete(Person person) {

    }

    @Override
    public Person get(String email) {
        return null;
    }

    @Override
    public List<Person> getAll() {
        return null;
    }
}
