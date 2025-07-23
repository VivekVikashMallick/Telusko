
import java.util.Arrays;

class Student 
{
  int rollNo;
  String name;
  int marks;
}

public class ArrayObject {
    public static void main(String[] args) {
    Student s1 = new Student();
    s1.rollNo = 1;
    s1.name = "John";
    s1.marks = 85;  

    Student s2 = new Student();
    s2.rollNo = 2;
    s2.name = "Jane";
    s2.marks = 90;

    Student s3 = new Student();
    s3.rollNo = 3;
    s3.name = "Doe";
    s3.marks = 95;
    
    
    
    Student students[] = new Student[3];  
    students[0] = s1;
    students[1] = s2;
    students[2] = s3;

 // example of for loop.

    // for (int i = 0; i < students.length; i++) {
    //         System.out.println("Roll No: " + students[i].rollNo + ", Name: " + students[i].name + ", Marks: " + students[i].marks);
    //     } 
    //     
   // In for loop we have to use the length of the array to iterate through the array.
   // for example :-

    int[] n = new int[5];  
    n[0] = 10;
    n[1] = 20;
    n[2] = 30;
    n[3] = 40;
    n[4] = 50;
    // This is an array of integers with 5 elements.
    // This is an array of integers with 5 elements.
    System.out.println("Array length: " + n.length);
    for (int i = 0; i < n.length; i++) {
        System.out.println("Element at index " + i + ": " + n[i]);    }

    
        for (Student student : students) {
            System.out.println("Roll No: " + student.rollNo + ", Name: " + student.name + ", Marks: " + student.marks);
        }
      //  example of for each loop/ enhanced for loop.
     // In this loop, we don't need to use the length of the array to iterate through the array.
      // It automatically iterates through the array.

      int arr[] = {100,20,80,30};
    Arrays.sort(arr);
    for(int elem : arr) {
        System.out.println("Element: " + elem);
    }
 }
}
