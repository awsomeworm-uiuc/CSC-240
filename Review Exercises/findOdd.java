import java.util.HashSet;

public class FindOdd {
    public static int findIt(int[] a) {
        HashSet<Integer> isOdd = new HashSet<Integer>();
        for(int i = 0; i < a.length; ++i){
          if(isOdd.contains(a[i])){
            isOdd.remove(a[i]);
          }
          else{
            isOdd.add(a[i]);
          }
        }
        return isOdd.iterator().next();
    }
}
