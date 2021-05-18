package algorythms;

public class SelectionSort {
    public static void main(String[] args) {
        int[] array = new int[]{64, 42, 16, 71, 15, 43, 31, 53, 24, 57, 43, 74, 55, 36, 4, 18};
        for (int step = 0; step < array.length; step++){
            System.out.println(arrayToString(array));
            int index = min(array, step);

            int tmp = array[step];
            array[step] = array[index];
            array[index] = tmp;
        }
    }

    private static int min(int[] array, int start) {
        int minValue = array[start];
        int minIndex = start;

        for (int i = start + 1; i < array.length; i++) {
            if (array[i] < minValue) {
                minValue = array[i];
                minIndex = i;
            }
        }
        return minIndex;
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
}

