package chapter14.filesFromDue.linsearch;

/**
 * A class for executing linear searches through an array.
 */
public class LinearSearcher {

   public int comparasins;
   /**
    * Constructs the LinearSearcher.
    * 
    * @param anArray an array of integers
    */
   public LinearSearcher(int[] anArray) {
      comparasins = 0;
      a = anArray;
   }

   /**
    * Finds a value in an array, using the linear search algorithm.
    * 
    * @param v the value to search
    * @return the index at which the value occurs, or -1 if it does not occur in
    *         the array
    */
   public int search(int v) {
      for (int i = 0; i < a.length; i++) {
         comparasins++;
         if (a[i] == v)
            return i;
      }
      return -1;
   }
   public boolean isFound(int v){
      for (int i = 0; i < a.length; i++) {
         if (a[i] == v)
            return true;
      }
      return false;
   }

   public int getComparasins(){
      return comparasins;
   }

   public String isFoundMessage(int v){
      String s;
      if(isFound(v)){
         s = "Number " + v + " found at location " + search(v) + ". " + getComparasins() + " where made.";
      } else {
         s = "Number " + v + " was not found. " + getComparasins() + " comparasins where made.";
      }
      return s;
   }
   private int[] a;
}
