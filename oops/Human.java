package oops;

public class Human {
    String name;
    int age;
    char gender;
    static int population;

    Human(String name,int age,char gender){
        this.name = name;
        this.age = age;
        this.gender = gender;
        Human.population += 1;
    }

    void print(){
        System.out.println("Name: "+name);
        System.out.println("Age: "+age);
        System.out.println("Gender: "+gender);
        System.out.println("Population: "+population);
        System.out.println("--------------------------");
    }
    public static void main(String[] args) {
        Human h1 = new Human("Rahul",22,'M');
        h1.print();

        Human h2 = new Human("Ram",23,'M');
        h2.print();
    }
}
