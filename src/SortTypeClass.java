import java.util.Arrays;

public class SortTypeClass {

    private static void swapElements(int[] arr, int indexA, int indexB) {
        int tmp = arr[indexA];
        arr[indexA] = arr[indexB];
        arr[indexB] = tmp;
    }

    public static void sortBubble(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = 0; j < arr.length - 1 - i; j++) {
                if (arr[j] > arr[j + 1]) {
                    swapElements(arr, j, j + 1);
                }
            }
        }
    }

    public static void sortSelection(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            int minElementIndex = i;
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[j] < arr[minElementIndex]) {
                    minElementIndex = j;
                }
            }
            swapElements(arr, i, minElementIndex);
        }
    }

    public static void sortInsertion(int[] arr) {
        for (int i = 1; i < arr.length; i++) {
            int temp = arr[i];
            int j = i;
            while (j > 0 && arr[j - 1] >= temp) {
                arr[j] = arr[j - 1];
                j--;
            }
            arr[j] = temp;
        }
    }

    public static void main(String[] args) {

        int[] arr1 = new int[100_000];
        for (int i = 0; i < arr1.length; i++) {
            arr1[i] = (int) (Math.random() * 100) + 1;
        }
        int[] arr2 = new int[100_000];
        for (int i = 0; i < arr2.length; i++) {
            arr2[i] = (int) (Math.random() * 100) + 1;
        }
        int[] arr3 = new int[100_000];
        for (int i = 0; i < arr3.length; i++) {
            arr3[i] = (int) (Math.random() * 100) + 1;
        }


        long start1 = System.currentTimeMillis();
       sortBubble(arr1);
        System.out.println("(System.currentTimeMillis() - start) = " + (System.currentTimeMillis() - start1));

        long start2 = System.currentTimeMillis();
        sortSelection(arr2);
        System.out.println("(System.currentTimeMillis() - start) = " + (System.currentTimeMillis() - start2));

        long start3 = System.currentTimeMillis();
        sortInsertion(arr3);
        System.out.println("(System.currentTimeMillis() - start) = " + (System.currentTimeMillis() - start3));




//        System.out.println("Arrays.toString(arr) = " + Arrays.toString(arr));
//        System.out.println("Arrays.toString(arr1) = " + Arrays.toString(arr1));
//        System.out.println("Arrays.toString(arr2) = " + Arrays.toString(arr2));
//        System.out.println("Arrays.toString(arr3) = " + Arrays.toString(arr3));
//        for (int v : arr)
//            System.out.println(v);

    }

}
