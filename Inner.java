/* class A
{
   public void Add()
   {

   }
    
}
class B
    {
      public void Sus()
      {

      }

    }

public class Inner 
{
    public static void main(String[] args) 
     {
        A obj = new A();
        obj.Add();

        B obj1 = new B();
        obj1.Sus();

     }
}
*/

// 2) Anonymus Inner class

// class A
// {
//    public void Add()
//    {
//       System.out.println("In A show");
//    }
    
// }

// public class Inner 
// {
//     public static void main(String[] args) 
//      {
//         A obj = new A()
//         {
//           @Override
//           public void Add()
//            {
//              System.out.println("In new show");
//            }
//         };
        // Here we are creating a class withiut giving a name to the class , because this is a Anonymus Inner class.Which is inside the Inner class and when we Run this program it will give the o/p In new show .And it generate the class file Inner$1.class and if we create multiple class it will give the no. accordingly.

       // obj.Add();

       
    // }
// }

// 3) Anonymous abstract class

abstract class AB
{
   //   public void sum()
   //   {
   //      System.out.println(" This is Sum method");
   //   }
      public abstract void sum();
      public abstract void show();
   // if we want to use abstract class only once then Anonymous class perfectly work.
        
}
// class B extends AB{
//    public void show()
//    {
//      System.out.println("In B show");
//    }
// }
// Now the question is if we have to use this show() only once then why we create a new class B and then extends the class AB we can directly create a new Anonymous Inner class and there is no limit we can create 1,2,4,5 as much we need.
public class Inner 
{
    public static void main(String[] args) 
     {
        AB obj = new AB()
        // Here we are not creating the boject of class AB , we are creating the class of Anonymous class.And we can create the object of abstract class as well with the help of anonymous class. 
        {
          
          @Override
          public void sum()
           {
             System.out.println("In new sum");
           }
        @Override
        public void show()
           {
             System.out.println("In new show");
           };
        
         
           } ; 
           obj.sum();
           obj.show();
         }
   }