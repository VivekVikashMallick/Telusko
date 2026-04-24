interface A {

   // int age;      // by default all the variables in interface are final and static. we cannot change the value of age variable.
    String area = "Delhi";
    int age = 10;

    void show();
    void config();
    
}
class B implements A
{
    public void show()
    {
        System.out.println("in a show");
    }
    public void config()
    {
        System.out.println("in a config");
    }
}

public class Interfc {
    public static void main(String[] args) {
        A obj = new B();
        obj.show();
        obj.config();

      //  A.area = "Mumbai";  // we cannot change the value of area & age variable as it is final.

        System.out.println(A.area);
        System.out.println(A.age);


        // we cannot instantiate the interface, we instatiate the class B which implements the interface A.  And we are not extending the interface A because we cannot extend the interface, we can only implement the interface.
        // And in implement we only get the method of interface not the variables.
        // interface don;t have their own memroy in Heap.we only create the object of B not hte A.
    }
    
}
