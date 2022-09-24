public class Sorting
{
//Bubble sort
  public static ArrayList<Integer> bubSort(ArrayList in){
          ArrayList<Integer> temp = in;
          int hold;
          int count = 0;
          boolean sorted = false;
          while(sorted!= true){
              for (int i = 0; i < temp.size()-1; i++) {
                  if(temp.get(i) > temp.get(i+1)){
                      hold = temp.get(i+1);
                      temp.set(i+1, temp.get(i));
                      temp.set(i, hold);
                      count ++;
                  }
              }
              if(count == 0){
                  break;
              }
              count = 0;
          }
          return temp;
      }
}
//Quick sort
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
