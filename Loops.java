import java.util.Scanner;

public class Loops {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        // double c = a+b;
        // System.out.println(c);
        int c = sc.nextInt();

        int max = Math.max(c, Math.max(a, b));
        System.out.println(max);
        sc.close();
    }
    
}
