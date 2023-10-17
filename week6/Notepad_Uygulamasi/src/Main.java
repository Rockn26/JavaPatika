package week6.Notepad_Uygulamasi.src;

import java.io.*;
import java.util.Scanner;

public class Main {
    public static Scanner inp = new Scanner(System.in);

    public static void main(String[] args) {

        try {
            // Dosya oluşturma işlemi, dosya yoksa dosya yaratılacak.
            File file = new File("notepad.txt");
            if (!file.exists()) {

                file.createNewFile();
            }

            // Scanner sınıfımız
            System.out.print("Bir metin giriniz : ");
            String metin = inp.nextLine();

            // Yazma işleminin yapıldığı yer.
            FileWriter fileWriter = new FileWriter(file, true);
            BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);

            // yeni girilen metin sonrasında yeni satıra geçmek için newLine ekledik.
            bufferedWriter.write(metin); bufferedWriter.newLine();

            bufferedWriter.close();


            // okuma işleminin yapıldığı yer.
            FileReader fileReader = new FileReader(file);
            BufferedReader bufferedReader = new BufferedReader(fileReader);
            while ((metin = bufferedReader.readLine()) != null) {
                System.out.println(metin);
            }
            bufferedReader.close();


        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}