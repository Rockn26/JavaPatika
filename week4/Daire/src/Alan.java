package week4.Daire.src;

public class Alan {
    public int r;
    public final double PI_SAYISI = 3.14;

    public Alan(int r) {
        this.r = r;
    }

    public void calcArea(){
        double area = PI_SAYISI * this.r * this.r;
        System.out.println("Dairenin alanı : " + area);
    }
}
