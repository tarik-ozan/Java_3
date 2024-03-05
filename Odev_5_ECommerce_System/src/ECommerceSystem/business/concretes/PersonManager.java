package ECommerceSystem.business.concretes;

import ECommerceSystem.business.abstracts.PersonService;
import ECommerceSystem.core.EmailCheckService;
import ECommerceSystem.core.EmailSendService;
import ECommerceSystem.core.SendVerificationMail;
import ECommerceSystem.dataAccess.abstracts.PersonDao;
import ECommerceSystem.entities.concretes.Person;

import java.util.regex.Pattern;

public class PersonManager implements PersonService {

    private EmailCheckService emailCheckService;
    private PersonDao personDao;
    private EmailSendService emailSendService;

    public PersonManager(EmailCheckService emailCheckService, PersonDao personDao, EmailSendService emailSendService) {
        this.emailCheckService = emailCheckService;
        this.personDao = personDao;
        this.emailSendService = emailSendService;
    }

    @Override
    public void register(Person person) {

        if(person.getPassword().length()<6){
            System.out.println("Parola en az 6 karakterden oluşmalıdır");
            return;
        }
        String regexPattern = "^[a-zA-Z0-9_!#$%&'*+/=?`{|}~^-]+(?:\\.[a-zA-Z0-9_!#$%&'*+/=?`{|}~^-]+)*@"
                + "[a-zA-Z0-9-]+(?:\\.[a-zA-Z0-9-]+)*$";
        boolean emailFormat = Pattern.matches(regexPattern,person.geteMail());

        if (!emailFormat){
            System.out.println("Email formatınız yanlıştır");
            return;
        }

        if ((person.getName().length()<2)||(person.getLastName().length()<2) ){
            System.out.println("Ad veya Soyad 2 karakterden az olamaz");
            return;
        }

        else
            personDao.add(person);
            emailCheckService.checkSystem(person.geteMail());
            emailSendService.send(person.geteMail());
    }

    @Override
    public void logIn(Person person,String email, String password) {
        if ((person.geteMail()!= email)||(person.getPassword()!=password)){
            System.out.println("Email veya parola hatalı");
        }
        else
            System.out.println("Sisteme başarıyla giriş yapıldı");
    }

    @Override
    public void delete(Person person) {

    }
}
