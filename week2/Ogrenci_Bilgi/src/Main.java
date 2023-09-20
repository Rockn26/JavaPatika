package week2.Ogrenci_Bilgi.src;


public class Main {
    public static void main(String[] args) {
        Teacher t1 = new Teacher("Mahmut Hoca", "MAT", "905");
        Teacher t2 = new Teacher("Graham Bell","FZK","0000");
        Teacher t3 = new Teacher("Külyutmaz", "KMY", "1111");

        Course mat = new Course("Matematik","101","MAT");
        mat.addTeacher(t1);

        Course fizik = new Course("Fizik", "102","FZK");
        fizik.addTeacher(t2);

        Course kimya = new Course("Kimya", "103", "KMY");
        kimya.addTeacher(t3);

        Student s1 = new Student("İnek Şaban","123", "4",mat,fizik,kimya);
        s1.addBulkExamNote(100,85,80);
        s1.addVerbalNote(90,80,85);
        s1.isPass();
        s1.printNote();


        Student s2 = new Student("Güdük Necmi", "444","4",mat,fizik,kimya);
        s2.addBulkExamNote(85,80,100);
        s2.addVerbalNote(100,100,100);
        s2.isPass();
        s2.printNote();


    }
}