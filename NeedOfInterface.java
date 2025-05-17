// 1)
// class Laptop
// {
//   public void code()
//   {
//     System.out.println("code, compile , run ");
//   }
// }

// class Developer
// {
//    public void devApp(Laptop lap)
//    {
//       // System.out.println("Developer");

//       lap.code();
//    }
// }
// public class NeedOfInterface 
// {
//     public static void main(String[] args)
//     {
//         Laptop lap = new Laptop();
    
//        Developer Manish = new Developer();
//        Manish.devApp(lap); 
//        // Here from the main method we are calling devApp method which is inside the developer class, where we pass the laptop object i.e lap by Manish.devApp(lap),and by accepting this object we are calling the code method & we get the o/p.
//     }
// }

 // 2)

 // 2c)
interface Computer
{
   void code();
}

// 2b) abstract class Computer
// {
//    public abstract void code();
// }

// 2a) class Computer
// {
//    public void code()
//    {
      
//    }
// }
 
// for 2a & 2b
// class Laptop extends Computer
// {
//   @Override
//   public void code()
//   {
//     System.out.println("code, compile , run ");
//   }
// }
// class Desktop extends Computer
// {
//    @Override
//    public void code()
//    {
//      System.out.println("code, compile , run : Faster");
//    }
// }

class Laptop implements Computer 
// instead of using extends we use implements in case of interface, bcz it gives the authority to users like mysql & oracle to implement it according to their need.
{
  @Override
  public void code()
  {
    System.out.println("code, compile , run ");
  }
}
class Desktop implements Computer
{
   @Override
   public void code()
   {
     System.out.println("code, compile , run : Faster");
   }
}

class Developer
{
   // public void devApp(Desktop desk)
   // {

   //    desk.code();
   // }
   // public void devApp(Laptop lap)
   // public void devApp(Computer lap)
   // {
   //    lap.code();
   // }
   public void devApp(Computer desk)  // accepting the computer refernce
   {
      desk.code();
   }
}
public class NeedOfInterface 
{
    public static void main(String[] args)
    {
        
       // Laptop lap = new Laptop();
        @SuppressWarnings("unused")
        Computer lap = new Laptop();
       
        @SuppressWarnings("unused")
      //  Desktop desk = new Desktop();
        Computer desk = new Desktop();

       Developer Manish = new Developer();

      Manish.devApp(desk);  // passing a computer reference
     //  Manish.devApp(lap); 
    }
   }