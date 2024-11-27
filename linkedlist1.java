import java.util.*;

public class linkedlist1 {
   public static void main(String[] args)  {
    
 LinkedList<Integer> linkedList = new LinkedList<Integer>();
        linkedList.add(3);
        linkedList.add(2);
        linkedList.add(5);
        linkedList.add(6);


        linkedList.remove(2);

        Integer firstelement = linkedList.get(0);
        System.out.println(firstelement);

        for(Integer i: linkedList) {
         System.out.println(i);
        }
   }  
}
