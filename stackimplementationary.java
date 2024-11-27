import java.util.Scanner;
public class stackimplementationary
{
     static final int MAX_SIZE = 100;
    static int[] stack_arr=new int[MAX_SIZE];
    static int top = -1;
    
     public static void push(int data){
         if(isFull()){
             	System.out.println("Stack overflow");
             	return;
         }
         top=top+1;
         stack_arr[top]=data;
         
     }    
    
     public static int pop(){
         if(isEmpty()){
            	System.out.println("Stack underflow"); 
            	return -1;
         }
         int var=stack_arr[top];
         top=top-1;
         return var;
     }
    
    
    
    public static void print(){
        if(isEmpty()){
            	System.out.println("Stack underflow");
            	return;
        }
        for(int i=top;i>=0;i--){
            	System.out.println(stack_arr[i]);
            		System.out.println("\n");
        }
        
    }
      public static boolean isFull() {
        return top == MAX_SIZE - 1;
    }

    public static boolean isEmpty() {
        return top == -1;
    }
    

	public static void main(String[] args) {
	   
	Scanner sc=new Scanner(System.in);
	int data,choice;
	while(true){
	System.out.println("\n");
	System.out.println("1.push\n");
		System.out.println("2.Pop\n");
			System.out.println("3.print the top of the element\n");
				System.out.println("4.Print all the elements of a stack\n");
					System.out.println("5.Quit\n");
						System.out.println("Please enter your choice:");
						 choice=sc.nextInt();
						switch(choice) {
						    case 1:
						        	System.out.println("Enter the element that you want to push\n");
						        	data=sc.nextInt();
						        	push(data);
						        	break;
						
						case 2:{
						    data=pop();
						    	System.out.println("Deleted element is"+data);
						    	break;
						}
						case 3:{
						   if (isEmpty()) {
                        System.out.println("Stack underflow");
                    } else {
                        data = stack_arr[top];
                        System.out.println("The top element is: " + data);
                    }
                    break;
						}
						case 4:{
						   print();
						    break;
						        
						    }
					
						case 5:{
						    System.exit(0);
						    	
						}
						default:
							System.out.println("Wrong choice");
						 
						
}
}
}
}

	
	

