package algorythms;

import java.util.Arrays;

public class QuickSort {
    public static void main(String[] args) {
//        int [] array = new int[] {64, 42, 73, 41, 32, 53, 16, 24, 57, 42, 74, 55, 36};
//        System.out.println(arrayToString(array));
//        quickSort(array, 0, array.length -1);
        test2();

    }

    private static void quickSort(int[] array, int from, int to) {

        if (from < to) {
            int divideIndex = partition(array, from, to);

//            printSortStep(array, from, to, divideIndex);

            quickSort(array, from, divideIndex - 1);

            quickSort(array, divideIndex, to);

        }
    }

    private static int partition(int[] arr, int from, int to) {

        int rightIndex = to;
        int leftIndex = from;
        int pivot = arr[from + (to - from) / 2];

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

    private static void bubbleSort(int[] array) {
        boolean isSorted = false;
        while (!isSorted) {
            isSorted = true;
            for (int i = 1; i < array.length; i++) {
                if (array[i] < array[i - 1]) {
                    int temp = array[i];
                    array[i] = array[i - 1];
                    array[i - 1] = temp;
                    isSorted = false;
                }
            }
        }
    }

    private static void printSortStep(int[] arr, int from, int to, int partitionIndex) {
        System.out.print(arrayToString(arr));
        System.out.print("\npartition at index: " + partitionIndex);
        System.out.print(", left: " + arrayToString(Arrays.copyOfRange(arr, from, partitionIndex)));
        System.out.println(", right: " + arrayToString(Arrays.copyOfRange(arr, partitionIndex, to + 1)) + "\n");
    }

    private static void test1() {
        int testLen = 100000;

        int[] arr1 = new int[testLen];
        int[] arr2 = new int[testLen];

        System.out.println("\n-----Random array-----");

        for (int i = 0; i < testLen; i++) {
            arr2[i] = arr1[i] = (int) Math.round(Math.random() * 10000);
        }

        System.out.println("Quick Sort: ");
        measureTime(() -> quickSort(arr1, 0, testLen - 1));

        System.out.println("Bubble Sort: ");
        measureTime(() -> bubbleSort(arr2));
    }

    private static void test2() {
        int testLen = 100000;

        int[] arr1 = new int[testLen];
        int[] arr2 = new int[testLen];

        System.out.println("\n-----Sorted array-----");

        for (int i = 0; i < testLen; i++)
            arr2[i] = arr1[i] = i;

        System.out.println("Quick Sort: ");
        measureTime(() -> quickSort(arr1, 0, testLen - 1));

        System.out.println("Bubble Sort: ");
        measureTime(() -> bubbleSort(arr2));
    }

    private static void measureTime(Runnable task) {
        long startTime = System.currentTimeMillis();
        task.run();
        long elapsed = System.currentTimeMillis() - startTime;
        System.out.println("Elapsed time: " + elapsed + "ms");
    }
}
