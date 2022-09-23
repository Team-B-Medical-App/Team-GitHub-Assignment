import java.util.ArrayList;


public class main {
    public static void main(String[] args) {
        bubblesort();
    }


    //Bubble sort function, requires one Arraylist of Int type and returns a sorted arraylist.
    public static void bubblesort(){
        ArrayList <Integer> a = new ArrayList<Integer>(){{
            add(3);
            add(2);
            add(1);
            add(4);
        }};
        bubblesort b = new bubblesort();
        System.out.println("Initial array: ");
        System.out.println(a);
        System.out.println("bubble sorted: ");
        System.out.println(b.bubSort(a));

    }

    //Insertion sort
    public static void insertsort(){

    }

    //Binary search
    public static void binarys(){

    }

    //Linear search
    public static void linears(){

    }
}
