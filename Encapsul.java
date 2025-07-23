class Human
{
//   private String name = "Mono";
//   private int age = 25;
  
  private String name ;
  private int age;

//  Here we are using encapsulation to hide the data members of the class.
//  we are making the data private and the only way to access is through the getter method.
// in the first code we can directly assign the value of the private data and get this data by getter method.
// //  This is a good practice to use encapsulation in java.
// and in the second code we are using setter method to assign the value to the private data members of the class.
  public String getName() 
  {
    return name;
  }
  public void setName(String n) 
  {
    name = n;
  }
  public int getAge() 
  {
    return age;
  }
  public void setAge(int a) 
  {
    age = a;
  }
}

public class Encapsul {
    public static void main(String[] args) 
    {
     Human obj = new Human();
        obj.setName("Mono");
        obj.setAge(25);
        // here we are assigning the value to the private data members of the class using the setter method.
     System.out.println(obj.getName() + " : " + obj.getAge());   
    }
}
