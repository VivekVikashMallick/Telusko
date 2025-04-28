
class A
{
    public void show()
    {
      System.out.println("In A show");
    }

    
}
class B extends  A
{
    @Override
    public void show()
    {
      System.out.println("In B show");
    }
}
/* public class Dynamic
{
    public static void main(String[] args)
     {
        A obj = new B();
        obj.show();
    }
}
   Here we have created a object of B with reference of A , Which is due to the class B extends the class A  
    It is possible that we create a reference of parent class or super class & object of child clas or sub class. */ 



 class C extends A
{
    @Override
    public void show()
    {
      System.out.println("In C show");
    }
} 



 public class Dynamic 
{
    public static void main(String[] args) 
    {
        A obj = new A();
        obj.show();

     /* Now here we create an object of A with reference of obj variable & then we call the show method with that reference to get the o/p  */   

        obj = new B();
        obj.show();

         obj = new C();
        obj.show();
        
    }
} 

