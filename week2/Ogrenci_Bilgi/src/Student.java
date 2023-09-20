package week2.Ogrenci_Bilgi.src;

public class Student {
    String name;
    String stuNo;
    String classes;
    double avarage;
    boolean isPass;
    Course mat;
    Course fizik;
    Course kimya;

    Student(String name, String stuNo, String classes, Course mat, Course fizik, Course kimya) {

        this.name = name;
        this.stuNo = stuNo;
        this.classes = classes;
        this.mat = mat;
        this.fizik = fizik;
        this.kimya = kimya;
        this.avarage = 0;
        this.isPass = false;
    }

    void addBulkExamNote(int matNote, int fizikNote, int kimyaNote) {
        if (matNote >= 0 && matNote <= 100) {
            this.mat.note = matNote;
        }

        if (fizikNote >= 0 && fizikNote <= 100) {
            this.fizik.note = fizikNote;
        }

        if (kimyaNote >= 0 && kimyaNote <= 100) {
            this.kimya.note = kimyaNote;
        }
    }

    void addVerbalNote(int matVerbalNote, int fizikVerbalNote, int kimyaVerbalNote) {
        if (matVerbalNote >= 0 && matVerbalNote <= 100) {
            this.mat.verbalNote = matVerbalNote;
        }

        if (fizikVerbalNote >= 0 && fizikVerbalNote <= 100) {
            this.fizik.verbalNote = fizikVerbalNote;
        }

        if (kimyaVerbalNote >= 0 && kimyaVerbalNote <= 100) {
            this.kimya.verbalNote = kimyaVerbalNote;
        }
    }


    void calcAvarage() {
        double matNote = (this.mat.note*0.80) + (this.mat.verbalNote*0.20);
        double fizikNote = (this.fizik.note*0.80) + (this.fizik.verbalNote*0.20);
        double kimyaNote = (this.kimya.note*0.80) + (this.kimya.verbalNote*0.20);
        this.avarage = (matNote + fizikNote + kimyaNote) / 3;
    }


    void isPass(){
        calcAvarage();
        if (this.avarage >= 55) {
            System.out.println("Başarılı");
            this.isPass = true;
        } else {
            System.out.println("Sınıf tekrarı");
            this.isPass = false;
        }
    }

    void printNote() {
        System.out.println("=====================");
        System.out.println("Öğrenci : " + this.name);
        System.out.println("Mat notu : " + this.mat.note + " Mat sözlü notu : " + this.mat.verbalNote);
        System.out.println("Fizik notu : " + this.fizik.note + " Fizik sözlü notu: " + this.fizik.verbalNote);
        System.out.println("Kimya notu : " + this.kimya.note + " Kimya sözlü notu: " + this.kimya.verbalNote);
        System.out.println("Ortalamnız : " + this.avarage);
    }

}
