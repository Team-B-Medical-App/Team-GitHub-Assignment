import static org.junit.Assert.*;
import org.junit.Test;
import java.util.*;

public class SearchingTests 
{

    public Random random = new Random();

    @Test
    public void linearSearchTest()
    {
        for (int n = 1; n < 5; n++)
        {
            int[] arr = new int[10 ^ n];
            Arrays.setAll(arr, i -> i + 1);

            for (int i = 0; i < arr.length - 1; i++)
            {
                int p = random.nextInt(i + 1);
                arr[i] = arr[i] ^ arr[p] ^ (arr[p] = arr[i]);
            };

            int index = random.nextInt(arr.length);
            int target = arr[index];

            assertEquals(searching.linears(arr, target), index);
        };
    };

    @Test
    public void binarySearchTest()
    {
        for (int n = 1; n < 5; n++)
        {
            int[] arr = new int[10 ^ n];
            Arrays.setAll(arr, i -> i + 1);

            for (int i = 0; i < arr.length - 1; i++)
            {
                int p = random.nextInt(i + 1);
                arr[i] = arr[i] ^ arr[p] ^ (arr[p] = arr[i]);
            };

            int index = random.nextInt(arr.length);
            int target = arr[index];

            assertEquals(searching.binarys(arr, target), index);
        };
    };
};
