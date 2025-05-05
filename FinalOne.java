/*final*/ class calc
/*we cannot extend the final class i.e inharitence is not possible for final class.  */
{
 /* public final void show() */ 
 public void show()
  {
    System.out.println("in a show");
  }
  public void add(int a, int b)
  {
    System.out.println(a+b);
  }
}
class Advcalc extends calc
/* If we have final class calc then we cannot extends this calc class. */
{
    @SuppressWarnings("override")
    public void show()
    /* we cannot override the final method i.e show()  */
    {
      System.out.println("in a show");
    }
}

public class FinalOne
 {
  public static void main(String[] args) 
  {
     /* final int num = 8;
     num = 9;
     System.out.println(num);
      
     We cannot change the value of final variable.
     */
     calc obj = new calc();
     obj.show();
     obj.add(4,5);  

     Advcalc obj1 = new Advcalc();
     obj1.show();
     
  }  
}
