public class StudentManager extends UserManager{

    //Student student = new Student();


    @Override
    public void logIn(User user) {
        System.out.println("Öğrenci girişi yapıldı: " +  user.getUserName());
    }

    public void odevEkle(Student student){
        System.out.println("Ödev eklendi: " + student.getYorum());
    }
}
