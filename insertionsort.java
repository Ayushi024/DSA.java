import java.util.Scanner;

public class insertionsort {
    public static void insertionsortSort(int n) {
    Scanner sc=new Scanner(System.in);
    int[] arr=new int[n];
for(int i=1;i<=n;i++){
    for(int j=0;j<=i-1;j++){
     
     if(arr[0]==null){
          arr[0]=sc.nextInt();
     }
else{
       arr[j+1]=sc.nextInt();
        if(arr[j]>arr[j+1]){
         int temp=arr[j];
         arr[j]=arr[j+1];
         arr[j+1]=temp;
        }
    }
}
}
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
       
 insertionsortSort(n);
    System.out.println("sorted array");
    for(int i=0;i<arr.length;i++){
        System.out.print(arr[i]+" ");
    }

 }
}
  

