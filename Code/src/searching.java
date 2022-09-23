public class searching
{
    
    //Linear Search
    public static int linears(int arr[], int target) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == target) {

                return i; //Returns target index
            }


	//Binary Search
	public static int binarys(int arr[], int z)
    {
        int x = 0, y = arr.length - 1;
        while (x <= y) {
            int m = x + (y - x) / 2;
 
            if (arr[m] == z)
                return m;
 
            if (arr[m] < z)
                x = m + 1;
 
            else
                y = m - 1;
        }
 
        
        return -1;
        
    }
	 
	
}