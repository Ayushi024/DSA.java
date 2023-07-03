import java.util.*;

public class Main {
    public static int linearsearch(int[] arr,int target)
    {
        for(int i=0;i<=arr.length;i++){
            if(arr[i]==target) {
                return i;
            }
        }
                return -1;
            }
        
    
     
     public static void main(String[] args){
      int[] arr={5,3,9,2,8};
      int target =9;
      int index=linearsearch(arr, target);
      System.out.println("index of"+target+"in the array is"+index);
     }

}
