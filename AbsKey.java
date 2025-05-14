abstract class Car
{
  public abstract void drive();
  public abstract void fly();
  
  /* 
  1) class Car
   {
     public void drive()
     {
     }
   } 
  Let suppose our requirement is to implements this drive ethod later not at the initial stage i.e according to the requirement.
   Then we extends the car class and the drive method in calss wagonR , but the problem is we cannot extend it directly we have to make the drive method abstract & also the class car to be abstract because abstract method doesnot have a body. 
   2) We have to implents all the abstract method.
   */
  public void playMusic()
  {
    System.out.println("play the music");
  }
  
}
abstract class WagonR extends Car
  // If you are extending an abstract class you must define it.
  {
    @SuppressWarnings("override")
    public void drive()
    {
        System.out.println("Driving");
    }
    /*public void fly()
    {
        System.out.println("Flying");
    }
        */
    /* Now what if we don't want to use this fly method now. So in this case we have to make this wagonR class abstract because fly is the abstract nmethod. And we know abstract class may or may not have the abstract method */
  }
  class updateWagonR extends WagonR      // Concrete class -- So we can create an object of concrete class not for an Abstract class.   
  {
     @Override
     public void fly()
     {
        System.out.println("Flying");
     }
  }



public class AbsKey 
{
    public static void main(String[] args) 
    {
       // 1) Car obj  = new Car();
        // car is an abstract class so we cannot create an object of it.
       //2) Car obj = new WagonR();
        // now we cannot create an object of wagonR bcz it is an abstract class. So now we have to create one more class and extend this wagonR class.
        Car obj = new updateWagonR();
        obj.drive();
        obj.playMusic();
        obj.fly();
    }

    
    
}
