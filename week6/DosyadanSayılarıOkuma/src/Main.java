package week6.DosyadanSayılarıOkuma.src;

import java.io.*;

public class Main {
    public static void main(String[] args) {
        try {
            File file = new File("kod.txt");
            if (!file.exists()) {
                file.createNewFile();
            }


            FileWriter fileWriter = new FileWriter(file, false);
            BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);

            bufferedWriter.write(String.valueOf(5));
            bufferedWriter.newLine();
            bufferedWriter.write(String.valueOf(10));
            bufferedWriter.newLine();
            bufferedWriter.write(String.valueOf(20));
            bufferedWriter.newLine();
            bufferedWriter.write(String.valueOf(12));
            bufferedWriter.newLine();
            bufferedWriter.write(String.valueOf(33));
            bufferedWriter.newLine();

            bufferedWriter.close();
            fileWriter.close();


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