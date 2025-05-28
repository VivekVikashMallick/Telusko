// @FunctionalInterface
// interface A           
// {
//   void show(int... values); 
  
// }



// public class Funct 
// {
//     public static void main(String[] args) 
//     {
       
            
//          A obj = (values) ->
//         {
//             for(int i : values)
//             {
//                 System.out.println("in a show " + i);
//             } 
               
//      };
//       obj.show(5 , 10 , 15 , 20);
//  }
// }

@FunctionalInterface
// Lambda expression works only with functional interface.
// A functional interface is an interface that contains only one abstract method.
// It can have multiple default methods and static methods.
interface A
{
   int add(int i, int j);}

    

public class Funct 
{
    public static void main(String[] args) 
    {
        // A obj = (int i, int j) ->
        // {
        //     return i + j;
        // };
        A obj = (i, j) -> i + j;
        // when you have only one line of code in the body of the method, you can omit the return statement and the curly braces.
        // A obj = (i, j) -> { return i + j; }; // this is a lambda expression with curly braces.
        int result = obj.add(5, 10);
        System.out.println(result);
    }
}