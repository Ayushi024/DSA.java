import java.io.*;
import java.util.*;

public class arraylist {
    
    public static void main(String[] args){
       
        Scanner read=new Scanner(System.in);
        int n=read.nextInt();

        ArrayList<Integer> arr=new ArrayList<Integer>();
        ArrayList<Integer> arr2=new ArrayList<Integer>();
        System.out.println("Array 1 is:"+ arr);
        System.out.println("Array 1 is:"+ arr2);
        for(int i=0;i<=8;i++){
         arr.add(i);
         System.out.println("Enter the value of"+ i +"index for arr2");
         arr2.add(read.nextInt());
        }
     for(int i=0;i<arr.size();i++){
        System.out.println("Array 1:" + arr.get(i)); 
       System.out.println("Array 1:" + arr2.get(i));
     }

    // ArrayList<Integer> arr=new ArrayList<Integer>();
    // arr.add(3);
    // arr.add(3);
    // arr.add(3);
    // arr.add(3);
    // arr.add(3);
    // arr.add(3);
    // arr.add(3);
    // for(int i=0;i<arr.size();i++){
    // System.out.println(arr.get(i));
    }
}
