package week6.DosyadanSayılarıOkuma.src;

import java.io.*;

public class Main {
    public static void main(String[] args) {
        try {
            File file = new File("kod.txt");
            if (!file.exists()) {
                file.createNewFile();
            }

            String val = "5";
            int number = Integer.parseInt(val);
            String val1 = "10";
            int number1 = Integer.parseInt(val1);
            String val2 = "20";
            int number2 = Integer.parseInt(val2);
            String val3 = "12";
            int number3 = Integer.parseInt(val3);
            String val4 = "33";
            int number4 = Integer.parseInt(val4);

            /*
            FileWriter fileWriter = new FileWriter(file, false);
            BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);

            bufferedWriter.write(val);
            bufferedWriter.newLine();
            bufferedWriter.write(val1);
            bufferedWriter.newLine();
            bufferedWriter.write(val2);
            bufferedWriter.newLine();
            bufferedWriter.write(val3);
            bufferedWriter.newLine();
            bufferedWriter.write(val4);
            bufferedWriter.newLine();



            bufferedWriter.close();
            fileWriter.close();

             */

            FileReader fileReader = new FileReader(file);

            BufferedReader bufferedReader = new BufferedReader(fileReader);
            String line;
            int toplam = 0;
            while ((line = bufferedReader.readLine()) != null) {
                int sayi = Integer.parseInt(line);
                toplam += sayi;
            }
            System.out.println("Dosyadaki sayıların toplamı : " + toplam);
            fileReader.close();
            bufferedReader.close();

        } catch (Exception e) {
            e.getMessage();
        }
    }
}