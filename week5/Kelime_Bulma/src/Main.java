package week5.Kelime_Bulma.src;

import java.util.HashMap;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        System.out.print("Metin giriniz : ");
        String sentence = inp.nextLine();

        // Metinimizi .split kullanıp " " kelime kelime ayırdık.
        String[] words = sentence.split(" ");


        HashMap<String, Integer> hmap = new HashMap<>();

        // for each ile cümleyi kelimelere ayırdık.
        for (String word : words) {
            if (hmap.containsKey(word)) {
                int count = hmap.get(word);
                hmap.put(word, count + 1);
            } else {
                hmap.put(word, 1);
            }
        }

        int maxCount = 0;
        String target = "";

        // burada for each ile en çok tekrar eden kelimeyi ve bunun tekrar sayısını bulduk.
        for (String kelime : hmap.keySet()){
            int count = hmap.get(kelime);
            if (count > maxCount){
                maxCount = count;
                target = kelime;
            }
        }
        System.out.println("En çok tekrar eden kelime : " + target +
                "\n " + maxCount +  " kez tekrar etti");


    }
}