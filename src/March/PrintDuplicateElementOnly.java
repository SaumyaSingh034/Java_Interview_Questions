package March;

import java.util.LinkedHashSet;
import java.util.Set;

public class PrintDuplicateElementOnly {
  public static void main(String[] args){
      int[] arr = {4,2,3,5,1,6,7,2,3, 4};
      printDuplicateElements(arr);
  }

    private static void printDuplicateElements(int[] arr) {
      Set<Integer> set = new LinkedHashSet<>();
      for(int i : arr){
          if(!set.add(i)){
              System.out.print(i+" ");
          }else{
              set.add(i);
          }
      }
    }
}
