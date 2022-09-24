import static org.junit.Assert.*;
import org.junit.Test;
import java.util.*;

public class SortingTests {

    public Random random = new Random();

    @Test
    public void quickSortTest()
    {
        for (int n = 1; n < 5; n++)
        {
            int[] arr = new int[10 ^ n];
            Arrays.setAll(arr, i -> i + 1);
            int [] answer = arr.clone();

            for (int i = 0; i < arr.length - 1; i++)
            {
                int p = random.nextInt(i + 1);
                arr[i] = arr[i] ^ arr[p] ^ (arr[p] = arr[i]);
            };

            Sorting.quicksort(arr, 0, arr.length - 1);

            assertArrayEquals(arr, answer);
        };
    };

    @Test
    public void bubbleSortTest()
    {
        for (int n = 1; n < 5; n++)
        {
            int[] arr = new int[10 ^ n];
            Arrays.setAll(arr, i -> i + 1);
            int [] answer = arr.clone();

            for (int i = 0; i < arr.length - 1; i++)
            {
                int p = random.nextInt(i + 1);
                arr[i] = arr[i] ^ arr[p] ^ (arr[p] = arr[i]);
            };

            Sorting.bubblesort(arr, 0, arr.length - 1);

            assertArrayEquals(arr, answer);
        };
    };
};
