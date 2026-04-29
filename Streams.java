import java.util.ArrayList;
//import java.util.Arrays;
import java.util.List;
//import java.util.function.Consumer;
//import java.util.stream.Stream;
import java.util.Random;

public class Streams {
    public static void main(String[] args) {
        
       // list.stream().filter(s -> s.marks > 90).forEach(s -> System.out.println(s.name + " : " + s.marks));

     //  List <Integer> nums = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
 
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
//    Consumer<Integer> con = n -> System.out.println(n);
  

//     nums.forEach(con);

    // forEach gives one value at a time.


    // 5) method is by using stream.

 
   // a) Stream<Integer> s1 = nums.stream();

   // s1.forEach(n -> System.out.println(n));
   // s1.forEach(n -> System.out.println(n)); // this will give error because stream can be used only once. after that it will be closed. if we want to use it again we have to create a new stream. 

    // b) Stream<Integer> s2 = s1.filter(n -> n % 2 == 0);
    // s2.forEach(n -> System.out.println(n));
// in stream we can only print or run one value either s1 or s2 but not both. So if we want to print the filter value use s2 in Sysout or s1 for all the values. And we have more mehtods also.


 // c)   Stream<Integer> s3 = s2.map(n -> n * 2);
//s3.forEach(n -> System.out.println(n));
        // s1 have all the value which is in nums and if we perform any operation in s1 it doesn't effect the original nums data.
        // s2 have the filter method in which it filter the required or desired data from the s1 stream .
        //s3 have the map mehthod in which we cam map the value according to our requirement which we get from s2.
        
       // int result = s3.reduce(0, (a, b) -> a + b);

    //    int result = nums.stream().filter(n -> n % 2 == 0).map(n -> n * 2).reduce(0, (a, b) -> a + b);
    //     System.out.println(result);
        // reduce method is used to reduce the stream to a single value. it takes two parameters one is the initial value and the other is a binary operator which takes two values and returns a single value. in this case we are adding the values of s3 stream and returning the sum. so the result will be the sum of all the values in s3 stream which is the double of the even numbers in the original nums list. so the result will be 60 (2*2 + 4*2 + 6*2 + 8*2 + 10*2 = 4 + 8 + 12 + 16 + 20 = 60).

        // or we can do it in one line also.


        // check the paralel stream.

        int size = 10_000;
        List<Integer> nums = new ArrayList<>(size);

        Random ran = new Random();

        for (int i = 0; i < size; i++) {
        nums.add(ran.nextInt(100));
    }
      int sum1 = nums.stream()
      .map(i -> i*2)
      .reduce(0 ,(c,e) -> c+e);

      long startseq = System.currentTimeMillis();

      int sum2 = nums.stream()
      .map(i -> i*2)
    //   .map(i ->{
    //     try {
    //         Thread.sleep(1);
    //     } catch (Exception e) { 
    //     }

    //    return i*2;})
      .mapToInt(i -> i)
      .sum(); 
    long endseq = System.currentTimeMillis();
      // this is the best way to do it because it is more efficient than the reduce method. it is also faster than the reduce method because it uses the internal iteration and it is optimized for parallel execution. so if we want to use parallel stream we can use this method. and it will give us the same result as the reduce method. and it will be faster than the reduce method.

      long startpar = System.currentTimeMillis();
      int sum3 = nums.parallelStream()
      .map(i -> i*2)
    //   .map(i ->{
    //     try {
    //         Thread.sleep(1);
    //     } catch (Exception e) { 
    //     }

    //    return i*2;})
       // Avoid this thread.sleep if you don't need. it just for checking.
      .mapToInt(i -> i)
      .sum();
    long endpar = System.currentTimeMillis();

    System.out.println(sum1 + " : " + sum2 + " : " + sum3);
    System.out.println("Sequential Stream Time: " + (endseq - startseq) + " ms");
    System.out.println("Parallel Stream Time: " + (endpar - startpar) + " ms");
}
}
