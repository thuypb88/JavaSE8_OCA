package practiceTest1;

import java.util.ArrayList;
import java.util.List;

/** Q:What will be the result of compiling and executing Test class?
 * Consider below code:
 *
 *Options are :
 * Student[James, 27]
 * Student[James, 25] Student[James, 27] Student[James, 25] Student[James, 25]
 * Student[James, 25] Student[James, 27] Student[James, 25]
 * Student[James, 27] Student[James, 25] Student[James, 25] (Correct)
**/
class Student {
    private String name;
    private int age;

    Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String toString() {
        return "Student[" + name + ", " + age + "]";
    }

    public boolean equals(Object obj) {
        if(obj instanceof Student) {
            Student stud = (Student)obj;
            if(this.name.equals(stud.name) && this.age == stud.age) {
                return true;
            }
        }
        return false;
    }
}

public class Question_09 {
    public static void main(String[] args) {
        List<Student> students = new ArrayList<>();
        students.add(new Student("James", 25));
        students.add(new Student("James", 27));
        students.add(new Student("James", 25));
        students.add(new Student("James", 25));

        students.remove(new Student("James", 25));

        for(Student stud : students) {
            System.out.println(stud);
        }
    }
}