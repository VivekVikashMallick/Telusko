import java.util.Scanner;

public class condition {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            int salary;
            salary = sc.nextInt();
            if (salary>=10000) {
                salary = salary+1000;
                System.out.println("salary : " + salary);
            }else{
                salary= salary+2000;
                System.out.println("salary : " + salary);
            }
        }    
    }
    
}
