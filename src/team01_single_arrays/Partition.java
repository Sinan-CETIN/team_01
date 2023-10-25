package week_01;

import java.util.Arrays;

public class Partition {
    // soru  32
    public static void main(String[] args) {
        int[] arr = createArray();

        System.out.println("Pivot -> " + arr[0]);

        // Before Sorted
        System.out.println(Arrays.toString(arr));

        // After sorted cozum 1 ->
//        int index = partition(arr);
//        System.out.println(Arrays.toString(arr));

        // After sorted cozum 2 ->
        arr = partition1(arr);
        System.out.println(Arrays.toString(arr));
//        System.out.println("Pivot index -> " + index1);

    }

    public static int[] createArray() {
        int[] array = new int[10];
        for (int i = 0; i < array.length; i++) {
            array[i] = (int) (Math.random() * 10 + 1);
        }
        return array;
    }

    // cozum2
    private static int[] partition1(int[] arr) {

        // yeni bir array olustururak cozum
        int[] arr2 = new int[arr.length];
        int startindex = 0;
        int endindex = arr.length - 1;

        for (int i = 1; i < arr.length; i++) {
            if (arr[i] <= arr[0]) {
                arr2[startindex] = arr[i];
                startindex++;
            } else {
                arr2[endindex] = arr[i];
                endindex--;
            }

        }
        arr2[endindex] = arr[0];

        return arr2;
    }


    // cozum 1
    public static int partition(int[] arr) {

        // array olusturmadan sayilari kaydirarak cozum
        int pivot = arr[0];
        int pivotIndex = 0;
        int low = 1;
        int high = arr.length - 1;


        while (low <= high) {
            while (pivot >= arr[low]) {
                // Eger pivottan ufak bir sayi ile karsilasirsan sayilari
                // ufak sayinin oldugu yere kadar bir saga kaydir ve ufak sayiyi arrayin basina al.
                shiftRightArr(arr, low);
                low++;
            }
            pivotIndex = low - 1;


            if (pivot > arr[high]) {
                // Arrayin sonundaki sayi pivottan kucuk ise bir sonraki sayi ufaksa yer degistir
                // (66 - 71 arasindaki kod pivottan bir sonraki sayinin pivottan buyuk oldugunu garantiliyor)
                // degisimden sonra tekrardan yukari gidip kaydirma islemini tekrarla

                int temp = arr[low];
                arr[low] = arr[high];
                arr[high] = temp;
                high--;
            } else {
                high--;
            }
        }
        return pivotIndex;
    }


    public static void shiftRightArr(int[] arr, int low) {
        int start = arr[low];
        for (int i = low; i > 0; i--) {
            arr[i] = arr[i - 1];
        }
        arr[0] = start;
    }
}
