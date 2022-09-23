public class searching {
    
    //Linear Search
    public static int linears(int arr[], int target) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == target) {

                return i; //Returns target index
            }

        }

        return -1;

    }
}