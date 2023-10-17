package week6.Enum_Alistirma.src;

public enum Day {

    PAZARTESI(1),
    SALI(2),
    CARSAMBA(3),
    PERSEMBE(4),
    CUMA(5),
    CUMARTESI(6),
    PAZAR(7);



    private int day;

    Day(int day) {
        this.day = day;
    }


    public void getDayName(){
        String day = null;

        switch (this.day){
            case 1:
                day = "PAZARTESİ";
                break;
            case 2 :
                day = "SALI";
                break;
            case 3 :
                day = "ÇARŞAMBA";
                break;
        }

        System.out.println(day);
    }

    public int getDay() {
        return day;
    }

    public void setDay(int day) {
        this.day = day;
    }
}
