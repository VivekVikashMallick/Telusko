// class A{
//     public void show()
//     {
//         try {
//             Class.forName("calc");
//         } 
//         catch (ClassNotFoundException e )
//         {
//             System.out.println("Not able to find the class");
//         }
//     }
// }

// public class DuckingException {

//     static{
//         System.out.println("class loaded");
//     }
//     public static void main(String[] args) {
       
//         A obj = new A();
//         obj.show();
//     }
// }



class A{
    public void show() throws ClassNotFoundException
    {
       
            Class.forName("calc");
        
    }
}

public class DuckingException {

    static{
        System.out.println("class loaded");
    }
    //public static void main(String[] args) throws ClassNotFoundException {
    // Never write theses throws in the main method bcz it is the entry point of the program if any exception occurs here it will terminate the program abruptly.   
    // It is always better to handle the exception using try & catch block.
    // In the main the JVM will handle the exception if it is not handled here and JVM simply stop the excution of the program.
    public static void main(String[] args)  {
       
        A obj = new A();
        try {
            obj.show();
        } catch (ClassNotFoundException e) {

           // e.printStackTrace();
        }
    }
}