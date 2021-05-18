package algorythms;

public class MinValueSort {
    public static void main(String[] args) {
        int[] array = new int[]{64, 42, 16, 71, 15, 43, 31, 53, 24, 57, 43, 74, 55, 36, 4};

        int minValue = array[0];
        int minIndex = 0;

        for (int i = 1; i < array.length; i++) {
            if (array[i]< minValue) {
                minValue = array[i];
                minIndex = i;
            }
        }
        System.out.println("min value: " + minValue);
        System.out.println("min index: " + minIndex);
    }
}
