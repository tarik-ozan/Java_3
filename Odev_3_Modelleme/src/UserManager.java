public class UserManager {
    public void logIn(User user){
        System.out.println("Giriş başarılı: " + user.getUserName());
    }

    public void logOut(User user){
        System.out.println("Çıkış başarılı: " + user.getUserName());
    }

    public void signIn(User user){
        System.out.println("Kayıt tamamlandı: " + user.getUserName() +" "+ user.getId());
    }
}
