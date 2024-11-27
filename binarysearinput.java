import java.util.*;
import java.util.Scanner;

public class binarysearinput{

 public static int binarysearinp(int[] arr,int target) {
    int left=0 ;
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
    
    int target;
    Scanner read =new Scanner(System.in);
    int n=read.nextInt();
    target =read.nextInt();
    int[] arr=new int[n];
    for(int i=0;i<n;i++){
     arr[i]=read.nextInt();
    }
    int index=binarysearinp(arr,target);
    System.out.println("index of "+target+" in array is "+ index);
    }
}