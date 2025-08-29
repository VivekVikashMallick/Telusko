import java.util.Scanner;

public class Uppercase {
    @SuppressWarnings("ConvertToTryWithResources")
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // System.out.println(sc.next().trim());

         String word = "Hello";

        System.out.println(word.charAt(2));
        sc.close();
    }
    
}
