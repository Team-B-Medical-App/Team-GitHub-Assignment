
import java.util.*;

public class main {
    public static void main(String[] args) {
        linearsearch();
        binarys();
    }

    // Bubble sort
    public void bubblesort() {

    }

    // Insertion sort
    public void insertsort() {

    }

    // Binary search
    public static void binarys() {
    	
    	int [] x = {7, 34,49 ,342 , 90};
    	System.out.println("Intital array: " + Arrays.toString(x));
    	System.out.println("Integer 342 is at index: " + searching.binarys(x,342));
    	//Done 
    	

    }

    public static void linearsearch() {
        // Intializing array for linear search
        int[] a = { 10, 20, 30, 40, 50 };

        System.out.println("Initial array: ");
        System.out.println(Arrays.toString(a));
        System.out.print("Integer '30' is at index: ");
        System.out.println(searching.linears(a, 30)); // Returns index of 30 in the array
    }

}
