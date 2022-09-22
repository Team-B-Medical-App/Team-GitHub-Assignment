public class Sorting
{
    public static void quicksort(int[] arr, int lmp, int rmp)
    {
        if (lmp < rmp)
        {
            int p = lmp;
            for (int i = lmp; i < rmp; i++)
            {
                if (arr[i] < arr[rmp])
                {
                    arr[i] = arr[i] ^ arr[p] ^ (arr[p] = arr[i]);
                    p++;
                };
            };

            arr[rmp] = arr[rmp] ^ arr[p] ^ (arr[p] = arr[rmp]);
            quicksort(arr, lmp, p - 1);
            quicksort(arr, p + 1, rmp);
        };
    };
};