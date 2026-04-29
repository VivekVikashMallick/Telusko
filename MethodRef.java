import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class Student{
    private String name;
    private int age;
    

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String toString() {
        return "Student [name=" + name + ", age=" + age + "]";
    }

public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

public Student(String name) {
        this.name = name;
    }

public Student() {
    }

}

public class MethodRef {

    public static void main(String[] args) {
        // Mehtod reference.
        // 1) List<String> names = List.of("Alice", "Bob", "Charlie", "David", "Eve");

        // List<String> upperCaseNames = names.stream()
        //         //  .map(name -> name.toUpperCase())
        //         .map(String::toUpperCase)
        //         // :: is called method reference operator. It is used to refer to a method without invoking it. It is a shorthand notation of lambda expression. It can be used to refer to static methods, instance methods and constructors.
                
        //         .toList();
        // //System.out.println(upperCaseNames);

        // //upperCaseNames.forEach(i -> System.out.println(i));
        // upperCaseNames.forEach(System.out::println);

       // 2) Constructor reference.

        List<String> names = Arrays.asList("Alice", "Bob", "Charlie", "David", "Eve");

        // List<Student> students = names.stream()
        //         .map(Student::new)
        //         .toList();

        List<Student> students = new ArrayList<>();

    //     for (String name : names) {
    //         students.add(new Student(name));
    //     }

    //    // students.forEach(System.out::println);

    //    System.out.println(students);

    students = names.stream()
            //.map(Student::new)
            // Here the stream have 5 student elements and the map method take each student name and create the student object and add it to the list.
            .map(name -> new Student(name) )
            .toList();

            System.out.println(students);
    }
    
}
