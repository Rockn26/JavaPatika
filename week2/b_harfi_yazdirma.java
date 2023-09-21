package week2;

public class b_harfi_yazdirma {

    public static void main(String[] args) {

        String[][] latter = new String[6][4];

        for (int i = 0; i < latter.length; i++){
            for (int j = 0; j < latter[i].length; j++){
                if (i == 0 || i == 2 || i == 5){
                    latter[i][j] = " * ";
                } else if (j == 0 || j == 3) {
                    latter[i][j] = " * ";
                } else {
                    latter[i][j] = "   ";
                }
            }
        }

        for (String[] row : latter) {
            for (String col : row) {
                System.out.print(col);
            }
            System.out.println();
        }

    }
}
