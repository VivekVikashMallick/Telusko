import java.util.ArrayList;
import java.util.Collection;


public class CollectionApi {
    public static void main(String[] args) {
        // API simply means a library which we can simply use it without implementing it ourselves.
        // Collection API is a library which provides us many classes & interfaces to work with data structures.

        @SuppressWarnings("Convert2Diamond")
        Collection <Integer> nums = new ArrayList <Integer> ();
        // we can typecast the data type in collection using generics <>.
        // This generics also help us to find the error at compile time only as there is no restriction of data type in collection we only typecast it using generics and if we use it wrongly it will show error at compile time only.
        //nums.add("Hello");
        nums.add(1);
        nums.add(2);
        nums.add(3);
        nums.add(4);
        //System.out.println(nums);

        //for (int n : nums){
        //for (Object n : nums){
             for (int n : nums){
            // in collection the data type is Object. So we have to do type casting here.
            System.out.println(n);
        }
        }    
        // or we can use List<Integer> nums = new ArrayList<Integer>(); 
        // instead of collection that will give us more specific methods to work with list data structure like nums.indexOf(), nums.get() etc.
}
