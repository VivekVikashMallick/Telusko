@FunctionalInterface
interface A           
{
  void show(int... values); 
  
}



public class Funct 
{
    public static void main(String[] args) 
    {
       
            
         A obj = (values) ->
        {
            for(int i : values)
            {
                System.out.println("in a show " + i);
            } 
               
     };
      obj.show(5 , 10 , 15 , 20);
 }
}
