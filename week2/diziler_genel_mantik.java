package week2;

public class diziler_genel_mantik {


    public static int[] reverse(int[] list) {
        int[] result = new int[list.length];

        for (int i = 0, j = result.length - 1; i < list.length; i++, j--) {
            result[j] = list[i];
        }

        return result;
    }


    static void printArray(int[] list) {
        for (int i = 0; i < list.length; i++) {
            System.out.println(list[i]);
        }
    }

    public static void main(String[] args) {

        int [] list = {10,20,30,40,50,60,70,80,90,100};
        int [] newListe = reverse(list);
        printArray(newListe);

    }
}
