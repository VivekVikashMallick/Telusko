enum status    
{
    // Here status is a special class which is a enum i.e we can have multiple object inside this without creating seperate objects for that.

    Running, Failed, Pending,
    Success ;             // Named constant
}

public class StatusEnum 
{
    public static void main(String[] args) 
    {
        @SuppressWarnings("unused")
        int i =5;  // status can be used as a normal variable as int .
        status s = status.Running;   // Running is my object which is assigned to s .
        status[] ss = status.values(); // value() is of array type so we have to make status as status[].
       // status s1 = status.Success;   
        // System.out.println(s);
         for(status s2: ss)
            
          {
             System.out.println(s2 + " :" + s2.ordinal() ) ;
         }

      //  System.out.println(s.ordinal());
       
       // System.out.println(s1.ordinal());

       // System.out.println(ss); 
        // it will give you the hexacode value. To print all the value at a time we have to use inhanced for loop.
    }
}
