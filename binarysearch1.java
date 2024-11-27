import java.util.*;

public class binarysearch1{
    
    public static int binarysearch(int[] arr,int target) {
   int left=0;
   int right=arr.length-1;

   while(left<=right){
    int mid=(left+right)/2;
    if(arr[mid]==target)
    {
        return mid;
    }
    else if(arr[mid]<target)
    {
        return mid+1;

    }
    else
    {
        return mid-1;
    }
}
   return -1;
} 


public static void main(String[] Args){
    int arr[]={1,3,6,8,9,10,11,13,18};
    int target =9;
    int index=binarysearch(arr,target);
    System.out.println("index of "+ target +" in array is " + index );
}
}