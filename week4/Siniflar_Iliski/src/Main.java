package week4.Siniflar_Iliski.src;

public class Main {
    public static void main(String[] args) {

        Student st1 = new Student("Mustafa", "Çetindağ", "123","aa", 85);
        Student st2 = new Student("Patika", "Dev", "1234", "bb", 85);
        Student st3 = new Student("Kodluyoruz", "Java102","12345","cc",85);

        // Composition, Aggretation
        // course has a Instructor(Sınıfın bir öğretmeni vardır).

        Instructor teacher = new Instructor("Matmut", "Çetindağ", "CENG");
        Course mat  = new Course("MAT101","MAT", teacher);
        System.out.println(mat.getInstructor().getName());


       // Student[] stu = {st1,st2,st3};

        // System.out.println("Ortalama: " + mat.calcAvarage(stu));



    }
}