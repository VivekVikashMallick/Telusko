
@SuppressWarnings("unused")
class Mobile
{
    String brand;
    int price;
    static  String name;
    
    public Mobile()
    {
        brand = "";
        price = 200;
        System.out.println("In a constructor");
    }
    static 
    {
        // static block will be executed only once when the class is loaded into memory.
        name = "phone";
        System.out.println("This is a static block");
    }
    // O/p = Give the static block output then call the constructor & give o/p. This is because every time when it load the class it will call the static block first then it will create the object & then call the constructor , so if we have 2 or 3 object it will give the o/p of constructor 2/3 times.

    // If we don't create any object it will give you no o/p.
    // If we want to load the class without creating the object then we have to use class.forName method();

public void show()
{
    System.out.println(brand  + " : "  + price  +  " : "  + name);
}

    
}
public class Statc
{
    public static void main(String[] args) throws ClassNotFoundException 
    {
    //    Mobile obj1 = new Mobile();
    //     obj1.brand = "Nokia";
    //     obj1.price = 15000;
    //    Mobile.name = "Smartphone";
        
    //     Mobile obj2 = new Mobile();
       Class.forName("Mobile");

    //    Everytime we create the object , there are 2 step behind the scene.
    //    1)class is loaded into memory.
    //    2) objects are instantiated.
    // There is a special are inside the JVM called class loader which is responsible for loading the class into memory.
   // so all the class get loaded from library to the class loader.


    }

}
