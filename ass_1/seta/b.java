package ass_1.seta;
import java.util.Scanner;

class Student {
    String name;
    int rollNo, marks;

    Student(String name, int rollno, int marks){
        this.name = name;
        this.rollNo = rollno;
        this.marks = marks;
    }

    public void display(){
        System.out.println("Name: " + this.name + "\n" + "Roll No: " + this.rollNo + "\n" + "Marks: " + this.marks + "\n");
    }
}
public class b {
    public static void main (String []args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter name: ");
        String name = sc.nextLine();
        System.out.println("Enter roll no: ");
        int rollNo = sc.nextInt();
        System.out.println("Enter marks: ");
        int marks = sc.nextInt();

        Student stud1 = new Student(name, rollNo, marks);

        stud1.display();
        sc.close();
    }
}
