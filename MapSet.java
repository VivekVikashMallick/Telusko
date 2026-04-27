import java.util.HashMap;
import java.util.Map;

public class MapSet {

    public static void main(String[] args) {
        
        Map<Integer, String> students = new HashMap<>();
// In Map it doesn't allow duplicate keys but it allows duplicate values. if we try to add duplicate key then it will override the previous value. 
// In set the hashset gives the value in random order but in linkedhashset it gives the value in insertion order and in treeset it gives the value in sorted order.

        students.put(1, "Amar");
        students.put(2, "Bharat");
        students.put(3, "Chetan"); 
        students.put(4, "Dev") ;
        students.put(5, "Esha");
        students.put(6, "Fahad ");  
        
        // we use the put method because the main agenda is not to add it's to put the key and value in that place if some other value is there than replace it with the new one.


        System.out.println(students.keySet());
// this for loop help to print the value one by one.
        for(Integer key : students.keySet()){
            System.out.println(key + " : " + students.get(key));
        }
// The main agenda is to print the key and value with the help of keyset and get method. we can also use entryset to print the key and value.


    }
    
}
