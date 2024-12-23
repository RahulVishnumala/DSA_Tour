package oops;

public class Constructor {
    public static void main(String[] args) {
        Student s1 = new Student();
        s1.rollNo = 13;
        s1.name = "Raj";
        s1.marks = 87;
        System.out.println(s1.rollNo);
        System.out.println(s1.name);
        System.out.println(s1.marks);

        Student s2 = new Student(2,"Ram",100);
        Student s3 = new Student(3,"Mohan",76);
    }
}

class Student{
    int rollNo;
    String name;
    int marks;

    Student(){
        System.out.println("***Default Constructor***");
    }

    Student(int roll,String name,int marks){
        this.rollNo = roll;
        this.name = name;
        this.marks = marks;

        System.out.println("***Parameterized Constructor***");
        System.out.println("Roll : "+rollNo);
        System.out.println("Name: "+name);
        System.out.println("Marks: "+marks);
    }
}


