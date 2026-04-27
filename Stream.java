import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class Stream {
    public static void main(String[] args) {
        
       // list.stream().filter(s -> s.marks > 90).forEach(s -> System.out.println(s.name + " : " + s.marks));

       List <Integer> nums = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
 
    //      int sum = 0;
    //    for(Integer n : nums){
    //     if(n % 2 == 0){
    //       n = n*2;
    //       sum = sum + n;

    //         System.out.println(sum);
    //     }
    //    }

     // 2) method to do this is by using forloop.

    //      int sum = 0;
    //  for(int i = 0; i < nums.size(); i++){

    //         if(nums.get(i) % 2 == 0){
    //             nums.set(i, nums.get(i)*2);
    //             sum = sum + nums.get(i);
    //         }
    //    System.out.println(nums.get(i));
    //  }
    //  System.out.println("Sum: " + sum);

    // 3) method is by using foreach loop.

    // for (int n: nums) {
    //     if (n % 2 == 0) {
    //         n = n * 2;
    //         System.out.println(n);
    //     }
        
    // }

    // nums.forEach(n-> System.out.println(n));

   
//    Consumer<Integer> con = new Consumer<Integer>() {
       
//         public void accept(Integer n) {
//             System.out.println(n);
//         }
//    };

 // as Consumer is a functional interface so we can use lambda expression also.
   Consumer<Integer> con = n -> System.out.println(n);
  

    nums.forEach(con);

    // forEach gives one value at a time.


    }
}
