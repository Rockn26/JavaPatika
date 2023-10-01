package week4.Siniflar_Iliski.src;

public class Course {
    private String courseName;
    private String code;
    private  Instructor instructor;

    public Course(String courseName, String code, Instructor instructor) {
        this.courseName = courseName;
        this.code = code;
        this.instructor = instructor;
    }

    public String getCourseName() {
        return courseName;
    }

    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }

    public String getCode() {
        return code;
    }

    public void setCode() {
        this.code = code;
    }

    public Instructor getInstructor() {
        return instructor;
    }

    public void setInstructor(Instructor instructor) {
        this.instructor = instructor;
    }

    // Course uses a Student ( course sınıfı student sınıfına bağlı demektir).
    public double calcAvarage(Student[] students) {
        Student st4 = new Student("","","","",123);

        double avarage = 0.0;
        for (Student student : students) {
            avarage += student.getNote();
        }
        return avarage / students.length;
    }
}
