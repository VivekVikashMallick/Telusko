

/* enum status    
{
    // Here status is a special class which is a enum i.e we can have multiple object inside this without creating seperate objects for that.
    // we cannot extends the enum class.***
    // we can define method , we can define constructor & also we can create our own constructor.
    // enum in java itself extends enum class..(java.lang.Enum -> package)

    Running, Failed, Pending,
    Success ;             // Named constant
}

public class StatusEnum 
{
    public static void main(String[] args) 
    {
        @SuppressWarnings("unused")
       // int i =5;  // status can be used as a normal variable as int .
       // @SuppressWarnings("unused")
      //  status s = status.Running;   // Running is my object which is assigned to s .
        status s = status.Pending;   
     //   status[] ss = status.values(); // value() is of array type so we have to make status as status[].
       // status s1 = status.Success;   
        // System.out.println(s);
        //  for(status s2: ss)
        //   {
        //      System.out.println(s2 + " :" + s2.ordinal() ) ;
        //  }
        //  System.out.println(s.ordinal());
        // System.out.println(s1.ordinal());
        // System.out.println(ss); 
        // it will give you the hexacode value. To print all the value at a time we have to use inhanced for loop.
       
        // if else

       // if(s == status.Running)
        // System.out.println("All Good");
        // else if(s == status.Failed)
        // System.out.println("Try Again");
        // else if(s == status.Pending)
        // System.out.println("Wait for a minute");
        // else
        // System.out.println("Done");
        
        // Switch

        // switch (s)
        //  {
        //     case Running :
        //         System.out.println("All Good");
        //         break;
        //         case Failed :
        //         System.out.println("Try Again");
        //         break;
        //         case Pending :
        //         System.out.println("Wait for a minute");
        //         break;
        //     default:
        //         System.out.println("Done");
        // }

       // Rule switch
        switch (s) {
            case Running -> System.out.println("All Good");
            case Failed -> System.out.println("Try Again");
            case Pending -> System.out.println("Wait for a minute");
            default -> System.out.println("Done");
        }
        
       
        
    
    }
} */


enum Laptop
{
   Macbook(2000), Dell(1800), HP, Lenovo(1200); 
  // Macbook(2000), Dell(1800), HP(1500), Lenovo(1200); 
   // as these are the object so we can define the price.

    

    // public static Laptop getMacbook() {
    //     return Macbook;
    // }

    // public static Laptop getDell() {
    //     return Dell;
    // }

    // public static Laptop getHP() {
    //     return HP;
    // }

    // public static Laptop getLenovo() {
    //     return Lenovo;
    // }

   // @SuppressWarnings({"unused", "FieldMayBeFinal"})
   // private final int price;
    private int price;
    
     private Laptop()            // Default constructor -- without any given paramemter for object.
     {
        price = 500;
     }


    private Laptop(int price)           // parameterise constructor
    {
        this.price = price;
        System.out.println("Laptop " + " : " + this.name());
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }



}

public class StatusEnum 
{
    public static void main(String[] args)
     {
        // Laptop lap = Laptop.Macbook;
        // System.out.println(lap + " : " + lap.getPrice());

        for (Laptop lap : Laptop.values())
         {
           System.out.println(lap + " : " + lap.getPrice()); 
         }
         // So by the use of value() inside the for loop we can get all the object & by .getprice() we get their object value. 
    }
}