public class InstructorManager extends UserManager{

    Instructor instructor = new Instructor();

    @Override
    public void logIn(User user) {
        System.out.println("Yönetici girişi yapıldı: " + user.getUserName());
    }

    public void ogrenciEkle(Student student){
        System.out.println("Öğrenci Eklendi: " + student.getUserName() + " " +student.getId());
    }

    public void ogrenciSil(Student student){
        System.out.println("Öğrenci silindi: " + student.getUserName());
    }

    public void dersEkle(String dersAdi){
        System.out.println("Ders Eklendi: " +  dersAdi);
    }
}
