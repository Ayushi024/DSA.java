public class arrayreplace {

    public static void main(String[] args){
        int[] arr={2,5,9,4,8,6};
        int[] arr2=new int[5];
        arr[3]=10;
        System.out.println(arr[3]);
        System.out.println("the new array is:-");
        for(int i=0;i<arr.length;i++){
           System.out.println(arr[i]);
        }
    }
    
}
