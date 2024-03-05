package ECommerceSystem.business.abstracts;

import ECommerceSystem.entities.concretes.Person;

public interface PersonService {
    void register(Person person);
    void logIn(Person person, String email, String password);
    void delete(Person person);

}
