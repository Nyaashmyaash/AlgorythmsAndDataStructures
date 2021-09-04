package structures;

import java.util.Arrays;
import java.util.Collections;
import java.util.Random;

public class Experiments {
    public static void main(String[] args) {
        int[] array = new int[]{1,2,3,4,5};
//        int down = 10;
//        int up = 99;
//        fillArray(array, down, up);
//        write(array);



    }

    //[9,18,99,....]
    public static void fillArray(int[] array, int down, int up) {
        array[0] = (int) ((up - down + 1)*Math.random());
        int i = 1;
        while (i < array.length) {
            array[i] = (int) ((up - down + 1)*Math.random());
            boolean flag = false;
            for (int j = 0; j < i; j++) {
                if (array[j] == array[i])
                    flag = true;
                if (!flag)
                    i++;
            }
        }


    }


    private static void write(int[] m) {
        for (int j : m) System.out.print(j + " ");
    }
}
