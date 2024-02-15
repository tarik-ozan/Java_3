public class Main {
    public static void main(String[] args) {

        Instructor instructor = new Instructor();
        instructor.setId(1);
        instructor.setUserName("Engin Demiroğ");
        instructor.setPassword("11111");
        instructor.setVerilenDersler("Java");

        Student student = new Student();
        student.setId(9);
        student.setUserName("Tarık");
        student.setPassword("77777");
        student.setAlinanDersler("Java");
        student.setYorum("https://github.com/xxxxx/11111");

        StudentManager studentManager = new StudentManager();
        studentManager.logIn(student);
        student.setYorum(student.getYorum());

        InstructorManager instructorManager = new InstructorManager();
        instructorManager.logIn(instructor);
        instructorManager.ogrenciEkle(student);
        instructorManager.dersEkle("C#");
    }
}