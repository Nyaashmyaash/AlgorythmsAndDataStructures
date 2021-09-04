package algorythms;

import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;

public class ShuffleArray {
        public static void main(String[] args)
        {
            int[] solutionArray = { 1, 2, 3, 4, 5, 6, 16, 15, 14, 13, 12, 11 };

            shuffleArray(solutionArray);
            for (int i = 0; i < solutionArray.length; i++)
            {
                System.out.print(solutionArray[i] + " ");
            }
            System.out.println();
        }

        // Implementing Fisher–Yates shuffle
        static void shuffleArray(int[] array)
        {
            // If running on Java 6 or older, use `new Random()` on RHS here
            Random rnd = ThreadLocalRandom.current();
            for (int i = array.length - 1; i > 0; i--)
            {
                int index = rnd.nextInt(i + 1);
                // Simple swap
                int temp = array[index];
                array[index] = array[i];
                array[i] = temp;
            }
        }

    private static void fisherYatesShuffleArray(int[] array)
    {
        int index;
        Random random = new Random();
        for (int i = array.length - 1; i > 0; i--)
        {
            index = random.nextInt(i + 1);
            if (index != i)
            {
                array[index] ^= array[i];
                array[i] ^= array[index];
                array[index] ^= array[i];
            }
        }
    }

    private static void anotherFisherYatesShuffleArray(int[] array)
    {
        int index, temp;
        Random random = new Random();
        for (int i = array.length - 1; i > 0; i--)
        {
            index = random.nextInt(i + 1);
            temp = array[index];
            array[index] = array[i];
            array[i] = temp;
        }
    }
    }
