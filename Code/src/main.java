import java.util.ArrayList;


public class main {
    public static void main(String[] args) {
      bubblesort();
      quicksort();
      linearsearch();
      binarys();
      
    }


    //Bubble sort function, requires one Arraylist of Int type and returns a sorted arraylist.
    public static void bubblesort(){
        //Initialize arraylist
        ArrayList <Integer> a = new ArrayList<Integer>(){{
            add(3);
            add(2);
            add(1);
            add(4);
        }};
        bubblesort b = new bubblesort();
        System.out.println("Initial array: "); //Print array before sorting
        System.out.println(a);
        System.out.println("bubble sorted: "); //Print array after sorting
        System.out.println(b.bubSort(a));

    }
    //Quicksort function
    public static void quicksort()
    {
        int [] a= {3,1,2,5,7,8};
        System.out.println("input array: " + Arrays.toString(a));
        Sorting.quick(a, 0, 5);
        System.out.println("Output array");
        System.out.println(Arrays.toString(a));
    };

    // Binary search
    public static void binarys() {
    	int [] x = {7, 34,49 ,342 , 90};
    	System.out.println("Intital array: " + Arrays.toString(x));
    	System.out.println("Integer 342 is at index: " + searching.binarys(x,342));
    	//Done


    }
    //Linear search
    public static void linearsearch() {
        // Intializing array for linear search
        int[] a = { 10, 20, 30, 40, 50 };
        System.out.println("Initial array: ");
        System.out.println(Arrays.toString(a));
        System.out.print("Integer '30' is at index: ");
        System.out.println(searching.linears(a, 30)); // Returns index of 30 in the array
    }
}
