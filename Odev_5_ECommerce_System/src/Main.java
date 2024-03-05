import ECommerceSystem.business.abstracts.PersonService;
import ECommerceSystem.business.concretes.PersonManager;
import ECommerceSystem.core.GoogleRegisterManagerAdapter;
import ECommerceSystem.core.SendVerificationMail;
import ECommerceSystem.dataAccess.concretes.MySystem;
import ECommerceSystem.entities.concretes.Person;

import java.util.regex.Matcher;

public class Main {
    public static void main(String[] args) {


        PersonService personService = new PersonManager(new GoogleRegisterManagerAdapter(),new MySystem(), new SendVerificationMail());
        Person person = new Person("Tarık", "Ozan","tarikozan123@gmail.com","123456");
        personService.register(person);
        personService.logIn(person,"tarikozan123@gmail.com","123456");
    }
}