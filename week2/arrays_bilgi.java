package week2;

import java.util.Arrays;

public class arrays_bilgi {

    public static void main(String[] args) {

        // Arrays.toString(dizi) diziye ait olan elemanları direkt ekrana basmak için kullanılıyor.
        // Arrays.fill metodu ile dizilerin verilerini değiştirebiliyorsun. İster tamamını ister başlangıç ve bitiş değerini belirle ve öyle değiştir.
        // Arrays.sort() metodu ile dizileri sıralayabiliyoruz.
        // Arrays.binarySearch ile aranan elamanın indeksini buluyor. Fakat bunu sadece sıralı listede yapıyor. Önce Arrays.sort ile sıralayıp sonra binarySearch komutunu girmwmiz gerekiyor.
        // Arrays.copyArray mevcut bir belli uzunluktan yeni bir diziyi oluşturmak için kullanılıyor. 0-4
        // Arrays.copyOfRangeArray isi diziden belli bir aralıkta yeni bir dizi oluşturmak için kullanılıyor. 0- dizi.length;
        // Arrays.equeals metodu verilen iki dizinin eşitliğini sorgular. boolean bir değer döndürür.

        int[] list1 = {1, 2, 3};
        int[] list2 = {1, 2, 3};
        int[] list3 = {1, 2, 10};

        System.out.println(Arrays.equals(list1, list2)); // true ya da false bir değer verecek.
        System.out.println(Arrays.equals(list2, list3));


        /*
        int[] dizi = {3, 5, 79, 12, 25, -3, 66, 82 - 49, 152};

        int[] copyArray = Arrays.copyOf(dizi,4);
        System.out.println(Arrays.toString(copyArray));

        int[] copyOfRangeArray = Arrays.copyOfRange(dizi,0,dizi.length);
        System.out.println(Arrays.toString(copyOfRangeArray));


         */

    }

}
