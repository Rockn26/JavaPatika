package week2.Boks_Maci.src;
public class Main {
    public static void main(String[] args) {
        Fighther f1 = new Fighther("A",10,120,90, 10);
        Fighther f2 = new Fighther("B",15,85,85, 10);

        Match match = new Match(f1,f2,85,90);
        match.run();
    }
}