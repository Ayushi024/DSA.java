public class countofelement {
    public static void main(String[] args){
int ele=4;
 int[] arr={23,45,3,4,5,4,56,4,2,7,4,3,9};
 int count=0;
 for(int i=0;i<arr.length;i++){
    if(arr[i]==ele){
        count=count+1;
    }   
 }
 System.out.println("count of an element in an array is "+count);
 
    }
}
