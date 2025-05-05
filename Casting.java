class A 
{
  public void show1()
  {
    System.out.println("in A show");
  }
}
class B extends A 
{
  public void show2()
  {
    System.out.println("in B show");
  }
}

public class Casting 
{
    public static void main(String[] args) 
     {
       // A obj = new A();
       // we can also create an object of B with the reference of class A.
        A obj = (A) new B();
        /* We can also typecast the object of class B in A 
         The same thing we are doing in the double to int typecasting.
         This is called upcasting we don't have to mentioned it because generally it works & it work implicitly.
         If we don't mentioned The (A) it will work perfectly.
        */
        obj.show1();
      
      //  obj.show2();
        // We have an object of B but we can't call the show2() because the object reference is of A.
        B obj1 = (B) obj;
        // This is called Downcasting. Where we can use the obj refernce of A without creating a new object of it simply we can Down cast the obj to reference B.
        obj1.show2();
     }
}
