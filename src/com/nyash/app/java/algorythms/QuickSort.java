package algorythms;

import java.util.Arrays;

public class QuickSort {
    public static void main(String[] args) {
        int[] array = new int[]{64, 42, 16, 71, 15, 43, 31, 53, 24, 57, 43, 74, 55, 36, 4, 18, 6};
        System.out.println(arrayToString(array));
        quickSort(array, 0, array.length -1);
    }

    private static void quickSort(int[] array, int from, int to) {

        if (from < to) {
            int divideIndex = partition(array, from, to);

            printSortStep(array, from, to, divideIndex);

            quickSort(array, from, divideIndex -1);

            quickSort(array, divideIndex, to);

        }
    }

    private static int partition(int[] arr, int from, int to) {

        int rightIndex = to;
        int leftIndex = from;
        int pivot = arr[from];

        while (leftIndex <= rightIndex) {
            while (arr[leftIndex] < pivot) {
                leftIndex++;
            }
            while (arr[rightIndex] > pivot) {
                rightIndex--;
            }
            if (leftIndex <= rightIndex) {
                swap(arr, rightIndex, leftIndex);
                leftIndex++;
                rightIndex--;
            }
        }
        return leftIndex;
    }

    private static void swap(int[] arr, int index1, int index2) {

        int tmp = arr[index1];
        arr[index1] = arr[index2];
        arr[index2] = tmp;
    }

    private static String arrayToString(int[] array) {
        StringBuilder sb = new StringBuilder();
        sb.append("[");
        for (int i = 0; i < array.length; i++) {
            if (i > 0) {
                sb.append(", ");
            }
            sb.append(array[i]);
        }
        sb.append("]");
        return sb.toString();
    }

    private static void printSortStep(int[] arr, int from, int to, int partitionIndex) {
        System.out.print(arrayToString(arr));
        System.out.print("\npartition at index: " + partitionIndex);
        System.out.print(", left: " + arrayToString(Arrays.copyOfRange(arr, from, partitionIndex)));
        System.out.println(", right: " + arrayToString(Arrays.copyOfRange(arr, partitionIndex, to + 1)) + "\n");
    }
}
