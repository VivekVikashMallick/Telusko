@FunctionalInterface
interface A           
// SAM = Single abstract method interface. or Functional interface i.e an interface that has only one method. 
{
 // void show();
   // void run();
  void show(int... values); 
  // var args i.e we can pass multiple values in this method.
//    void show(int i, int j);  for multiple method we have to use the {}.
//    void show(int i);  // if we have multiple method then we have to use the {}.
   // what if we want to pass some value here, then we also pass the value where we put the Lambda expression.
}

// class B implements A
// {
//     // Annotation are the extra information which we provide to our JVM .
//    @Override
//    public void show()
//    {
//      System.out.println("in B show");
//    }
// }


public class Funct 
{
    public static void main(String[] args) 
    {
        // A obj = (int i) -> System.out.println("In a show");
        // A obj = i -> System.out.println("In a show");
        // A obj = i -> System.out.println("in a show " + i );
       //  A obj =(i , j) -> System.out.println("in a show " + i + " , " + j);

    // here we also have to pass the value & we can also pass multiple value without showing the data type & the ().
                // if we have multiple statement then we can use this {} or otherwise we can avoid it.  
          // Lambda expression = syntactically we reduce the code by this Lambda expression & behind the scene the public void show(){
        //.           } is there 
        // A obj = new A()
        // {
            
        //     public void show()
    //}
            
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
