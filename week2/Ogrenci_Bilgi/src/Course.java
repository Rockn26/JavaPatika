package week2.Ogrenci_Bilgi.src;

public class Course {
    Teacher teacher;
    String name;
    String code;
    String prefix;
    int note;
    int verbalNote;

    Course(String name, String code, String prefix) {
        this.name = name;
        this.code = code;
        this.prefix = prefix;
        this.note = 0;
        this.verbalNote = 0;
    }

    void addTeacher(Teacher teacher){
        if (teacher.branch.equals(this.prefix)){
            this.teacher = teacher;
        }  else {
            System.out.println("Öğretmen ve ders bölümleri uyuşmuyor.");
        }
    }

    void printTeacher(){
        this.teacher.print();;
    }
}
