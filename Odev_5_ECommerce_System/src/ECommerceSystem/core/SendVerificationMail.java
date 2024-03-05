package ECommerceSystem.core;

public class SendVerificationMail implements EmailSendService{

    @Override
    public void send(String message) {
        System.out.println(message + " emailine doğrulama linki gönderilmiştir");
    }
}
