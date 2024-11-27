import java.util.*;

public class Hashing{

    public static void main(String args[]){
        HashMap<String, Integer> map= new HashMap<>();
       

        map.put("India",123);
        map.put("US",30);
        map.put("china",150);

        System.out.println(map);
//value change
        map.put("china",40);
        System.out.println(map);
//Search
        if(map.containsKey("china")){

            System.out.println("KEy is present");
        }
        else{
             System.out.println("KEy is absent");
        }
        
  //  System.out.println(map.get("china")) ;   //key exists
   //     System.out.println(map.get("Indonesia")) ; //  key doesn't exist (for this it will print null bcoz it is not present)


        for(Map.Entry<String, Integer>e : map.entrySet()){
            System.out.println(e.getKey());
            System.out.println(e.getValue());            //through entry set

        Set<String> keys =map.keySet();
        for(String key : keys)
        {                                                //through keyset
            System.out.println(key+ ' ' + map.get(key));

        }    
    
        }
         map.remove("china");    // to remove
         System.out.println(map);

    }

}