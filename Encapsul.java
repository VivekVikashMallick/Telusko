class Human
{
//   private String name = "Mono";
//   private int age = 25;

// There is a standard which we follow that whenever we have to perform an operation we should do it inside a method.Don't do it in a openly statement like above.(assignment or calculation.)
  
  private int age;
    private String name;
  

//  Here we are using encapsulation to hide the data members of the class.
//  we are making the data private and the only way to access is through the getter method.
// in the first code we can directly assign the value of the private data and get this data by getter method.
// //  This is a good practice to use encapsulation in java.
// and in the second code we are using setter method to assign the value to the private data members of the class.

//   public String getName()
//  // public String xyz() 
//   {
//     return name;
//   }
//    public void setName(String n) 
//   //  public void abc(String n) 
//     {
//         name = n;
//     } 
  
//   public int getAge() 
//   {
//     return age;
//   }
//   public void setAge(int a) 
//   {
//     age = a;
//   }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
        // this keyword is used to refer the current object.
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }


}

public class Encapsul {
    public static void main(String[] args) 
    {
     Human obj = new Human();
       obj.setName("Mono");
       // obj.abc("Mono");
        obj.setAge(25);
        // here we are assigning the value to the private data members of the class using the setter method.
    System.out.println(obj.getName() + " : " + obj.getAge());
    //  System.out.println(obj.xyz() + " : " + obj.getAge());   
    //  we can put any name insteed getName() and setName() method.
    //  But the main point is we can put the name which can easily understand by the user.It's not about just writting a code it's about writing a code which is easy to understand by the user.
    }
}
