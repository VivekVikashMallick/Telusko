@FunctionalInterface
interface A{
    void show(int i);
    
}

public class Lambda {
    public static void main(String[] args) {

        // without lambda expression.
        // A obj = new A() {
        //     public void show(int i) {
        //         System.out.println("in a show: " + i);

        //       //obj.show(10);
        //     }
              
        // };
        // obj.show(10);

        // with lambda expression. we can compress the code .
      // A obj = (i) -> System.out.println("in a show: " + i);
      
        A obj = i -> System.out.println("in a show: " + i);
               
        obj.show(10);        

        
    }
}
