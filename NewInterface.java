// interface A
// {
//      int age = 31;    // bydefault every variable inside the interface is ....final & static
//      String area = "Delhi";

//   void show();
//   void config(); // when we use interface bydefault the method is public abstract so no need to write here.
// }
// // why final variable ? 
// // bcz it will not have the own memory in heap we cannot create an object of this , we create the object of B so that's why
// // if we have no memory than how you create a non-final variable
// // why static ? 
// // bcz we want to use the interface name. 
// class B implements A
// // here in B we implements the interface not extends it that's why we get the method only not hte variable from A.
// {

//     @Override
//     public void show()
//     {
//         System.out.println("in a show method");
//     }
//     @Override
//     public void config()
//     {
//         System.out.println("in a config method");
//     }


// }

// public class NewInterface
// {
//     public static void main(String[] args) 
//     {
//         A obj;
//       //  obj = new A(); // we cannot instanciate interface directly. we create an object of a class not for an interface.
//         obj = new B(); // we can create object of B bcz it implements the A .
//        obj.config();
//        obj.show(); 
//        // A.age = 32;
//        System.out.println(A.age); // bcz age & area are static so we can use it directly without creating an object & we cannot change it bcz this is final .
//     }
// }


interface A
{

    // public static int getAge() {
    //     int age;
    //     return age;
    // }

    // public static String getArea() {
    //     String area;
    //     return area;
    // }
     int age = 31;
     String area = "Delhi";
    // public static String getArea() {
    //     return area;
    // }

    // public static int getAge() {
    //     return age;
    // }
    // int age = 31;    
     //String area = "Delhi";

  void show();
  void config(); 
}

interface X
{
    void run();
}

interface Y extends X
// interface also use the inharitance property and can use the parent method
{

}

   // class B implements A,X 
    // we can implements multiple interface in a single class but we have to define all the method of the second or third interface what we have created.
    // in abstract class we can extends only 1 class .
    
    class B implements A,Y 
    // if we remove the run method then it will show error in class B.
  {

    @Override
    public void show()
    {
        System.out.println("in a show method");
    }
    @Override
    public void config()
    {
        System.out.println("in a config method");
    }

    @SuppressWarnings("override")
    public void run()
    {
        System.out.println("run fast");
    }


  }


public class NewInterface
{
    public static void main(String[] args) 
    {
        A obj;
     
        obj = new B(); // we can have reference of A and can create an object of B.But to call the run method we have to create an object of X bcz interface A doesn't know about the run method which is inside the X interface.
        
       obj.config();
       obj.show(); 
       
       X obj1 = new B();
       obj1.run();
      
       System.out.println(A.age); 
       
    }
}
