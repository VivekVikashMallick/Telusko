import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

class Student implements Comparable<Student>
{
    String name;
   
    public Student(String name, int marks) {
        this.name = name;
        this.marks = marks;
    }
    public String toString() {
        return "Student [name=" + name + ", marks=" + marks + "]";
    }
    int marks;

    
    public int compareTo(Student that) {

        if (this.marks > that.marks) {
                    return 1;
                } else if (this.marks < that.marks) {
                    return -1;
                } else {
                    return 0;
                    
                }
        
       // throw new UnsupportedOperationException("Unimplemented method 'compareTo'");
    }

   
}

public class Comptr {
    public static void main(String[] args) {
// Comparator is an interface in java which is used to sort the collection of objects based on the custom sorting order. It means we can use our own logic to sort the given values.
    //    Comparator<Integer> cmp = new Comparator<Integer>() {
    //         @Override
    //         public int compare(Integer i1, Integer i2) {
    //             if (i1%10 > i2%10) {
    //                 return 1;
    //             } else if (i1%10 < i2%10) {
    //                 return -1;
    //             } else {
    //                 return 0;
                    
    //             }
    //         }
    //     };
        
    //     List<Integer> list = new ArrayList<>();
    //     list.add(21);
    //     list.add(35);
    //     list.add(78);
    //     list.add(56);
    //     list.add(39);

    //     Collections.sort(list, cmp);

    //     System.out.println(list);
    // }

    // we can also do the sort by normal method which is comparable.



// comparator is a functional interface so we can use lambda expression also.

    //  Comparator<Student> cmp = new Comparator<Student>() {
          
    //         public int compare(Student s1, Student s2) {
    //             if (s1.marks > s2.marks) {
    //                 return 1;
    //             } else if (s1.marks < s2.marks) {
    //                 return -1;
    //             } else {
    //                 return 0;
                    
    //             }
    //         }
    //     };
       //  Comparator<Student> cmp = (Student s1 , Student s2) ->   s1.marks > s2.marks ? 1: -1;
         Comparator<Student> cmp = (s1 , s2) ->   s1.marks > s2.marks ? 1: -1;
         
                // if (s1.marks > s2.marks) {
                //     return 1;
                // } else if (s1.marks < s2.marks) {
                //     return -1;
                // } else {
                //     return 0;
                    
                // }

               // return s1.marks > s2.marks?1 : -1;   or

              //   s1.marks > s2.marks ? 1: -1; put this in one line.
            
        
        
        List<Student> list = new ArrayList<>();
        list.add(new Student("Amar", 85));
        list.add(new Student("Bharat", 90));
        list.add(new Student("Chetan", 78));
        list.add(new Student("Dev", 95));
        list.add(new Student("Esha", 88));
        list.add(new Student("Fahad", 92));


        Collections.sort(list,cmp);

       for(Student s : list){
           System.out.println(s.name + " : " + s.marks);
       // System.out.println(list);
    }

    
}
}
