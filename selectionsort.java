import java.util.Scanner;

public class selectionsort {
  
public static void selectionsort1(int[] arr) {
 Scanner sc=new Scanner(System.in);
 for(int i=0;i<arr.length;i++){
    for(int j=0;j<arr.length;j++){
    if(arr[i]>arr[j]){
       int  temp=arr[j];
        arr[i]=arr[j];
        arr[j]=temp;
    }
 }
 }

 }
  
  public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();
     int[] arr= new int[n];
    for(int i=0;i<n;i++){
       arr[i]=sc.nextInt();
       }
    selectionsort1(arr);
    System.out.println("Sorted Array:");
    for (int i = 0; i < n; i++) {
        System.out.print(arr[i] + " ");
    }
  }
}
