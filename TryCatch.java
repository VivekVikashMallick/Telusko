// 1) public class TryCatch
//  {
//     public static void main(String[] args) {
//        // int i = 10;
//         int i = 0;
//         int j = 0;
        
//         try {
//             j = 40 / i; // This will throw an ArithmeticException if i is 0
            
//         } catch (Exception  e) {
//             // Catching the exception and printing a message
//             System.out.println("An error occurred  or somethng went wrong");
//         } 
//         System.out.println("Value of j is: " + j);
//         // The program continues to run even after the exception is caught
//         System.out.println("Bye bye");
//     }
// }


// 2) public class TryCatch {
//     public static void main(String[] args) {
//         int i = 41; 
//         int j = 0;

//         try {
//             j = 40 / i; 
     
//             if (j == 0) 
//             throw new ArithmeticException("Division by zero is not allowed or I don't want to print Zero");


//         } catch (ArithmeticException e) {
//             j = 40/1; // Assigning a default value to j in case of an exception
//             System.out.println("that's the default value." + e);
//         } catch (Exception e) {
            
//             System.out.println("An unexpected error occurred: ");
//         } 

//         System.out.println("Value of j is: " + j);
//         // The program continues to run even after the exception is caught
//         System.out.println("Bye bye");
//     }
// }


class MallickException extends Exception {
   // we  cannot create a class of custom exception we have to extends it from parent class Exception.
    // In Java, to create a custom exception, we need to extend the Exception class.
    // This allows us to create our own exception types that can be thrown and caught like standard exceptions.
    // we have to create a constructor for the custom exception class
    // that takes a string message as an argument.
    public MallickException(String str) {
        super(str);
    }
}
public class TryCatch {
    public static void main(String[] args) {
        int i = 41; 
        int j = 0;

        try {
            j = 40 / i; 
     
            if (j == 0) 
                throw new MallickException("I don't want to print Zero");

        } catch (MallickException e) {
            j = 40 / 1; // Assigning a default value to j in case of an exception
            System.out.println("that's the default value." + e);
        } catch (Exception e) {
            System.out.println("An unexpected error occurred: " + e);
        } 

        System.out.println("Value of j is: " + j);
        // The program continues to run even after the exception is caught
        System.out.println("Bye bye");
        
    }
} 