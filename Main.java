
public class Main
{
    public static void inc(int[] arr,int i){
        
       if(i<arr.length){
       
       System.out.println(arr[i]);
       inc(arr,i+1);
    }
    }
    
    public static void rev(int arr[] ,int i){
        if(i>=0){
            System.out.println(arr[i]);
            rev(arr,i-1);
        }
    }
     public static int mini(int arr[] ,int i,int mini){
      if(i<arr.length){
          if(arr[i]<mini){
              mini=arr[i];
          }
         return mini(arr,i+1,mini);
      }
      return mini;
        
 }
    public static int max(int arr[] ,int i,int max){
       if(i<arr.length){
          if(arr[i]>max){
              max=arr[i];
          }
         return max(arr,i+1,max);
      }
      return max;
          
    }
    
    
    
	public static void main(String[] args) {
	  
		int[]arr={1,2,3,4,5,6,7,8,9};
		  int i=arr.length-1;
		  int mini=arr[0];
		  int max=arr[0];
	 inc(arr,0);
	 rev(arr,i);
	 int minimum=mini(arr,0,mini);
	 System.out.println(minimum);
	 int maximum=max(arr,0,max);
	 System.out.println(maximum);
		
	}
}
