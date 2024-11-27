public class nooftimesarrrotated {
    // public static void main (String[] args){
   //linear search 
        // int[] arr={12,11,2,3,5,8};
        //      int inde=0;
        // for(int i=0;i<arr.length;i++){
        //     if(arr[i]<arr[i+1]){
        //         inde=i;                                                             
        //         break;
        //     }
        // }
        // System.out.println("smallest  element in an array is at index "+inde);   
        // System.out.println("the array rotated "+ inde+" times");
   //binary search      
            static int countRotations(int[] arr) {
                int left = 0;
                int right = arr.length - 1;
        
                while (left <= right) {
                    if (arr[left] <= arr[right]) { // Array is not rotated
                        return left;
                    }
        
                    int mid = (left + right) / 2;
                    int nextMid = (mid + 1) % arr.length;
                    int prevMid = (mid - 1 + arr.length) % arr.length;
        
                    if (arr[mid] <= arr[nextMid] && arr[mid] <= arr[prevMid]) {
                        return mid;
                    } else if (arr[mid] <= arr[right]) {
                        right = mid - 1;
                    } else if (arr[mid] >= arr[left]) {
                        left = mid + 1;
                    }
                }
         
                return 0; // Default case
            }
        
            public static void main(String[] args) {
                int[] arr = {4, 5, 6, 7, 1, 2, 3};
                int rotations = countRotations(arr);
                System.out.println("The array is rotated " + rotations + " times.");
           }
         }
         
      
    

