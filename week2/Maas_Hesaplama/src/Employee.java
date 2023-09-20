package week2.Maas_Hesaplama.src;

public class Employee {
    String name;
    double salary;
    int workHours;
    int hireYear;

    Employee(String name, double salary, int workHours, int hireYear) {
        this.name = name;
        this.salary = salary;
        this.workHours = workHours;
        this.hireYear = hireYear;
    }



    double tax() {
        if (this.salary > 1000) {
            return this.salary*0.03;
        } else {
            return 0;
        }
    }


    double bonus(){
       if (this.workHours >40) {
           return (workHours-40)*30;
       }else {
           return 0;
       }
    }

    double raiseSalary() {
       int workyears = 2021- hireYear;
       if (workyears < 10) {
           return this.salary*0.05;
       } else if (workyears <20) {
           return this.salary*0.10;
       }else  {
           return this.salary*0.15;
       }
    }



    void toString(Employee employee) {
        System.out.println("Çalışan adı : " + this.name);
        System.out.println("Çalışan maaşı : " + this.salary + " Tl");
        System.out.println("Çalışan saati : " + this.workHours);
        System.out.println("Başlangıç yılı : " + this.hireYear);
        System.out.println("Vergi : " + tax() + " Tl");
        System.out.println("Bonus : " + bonus() + "Tl");
        System.out.println("Maaş artışı : " + raiseSalary() + "Tl");
        System.out.println("Vergi ve bonuslar ile birlikte maaş : " + (this.salary + bonus()- tax()) + " Tl");
        System.out.println("Toplam Maaş : " + (this.salary + raiseSalary()) + " Tl");
    }

}
