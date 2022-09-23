public class Sorting
{
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
