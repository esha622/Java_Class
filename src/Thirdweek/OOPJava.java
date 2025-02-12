package Thirdweek;

class Dog {
    int size;
    int age;
    String color;
    String breed;

    public void sleep() {
    }

    public void bark() {
    }
}

class Teacher {
    String name;
    String subject;
    int age;

    public void printInfo() {  //function
        System.out.println(this.name);
        System.out.println(this.subject);
        System.out.println(this.age);
    }
}

public class OOPJava {
    public static void main(String[] args) {
        Dog dogA= new Dog(); //"new" keyboard creates an object
        dogA.age = 3;
        dogA.breed = "breed a";
        dogA.size = 45;
        dogA.color = "brown";

        Dog dogB= new Dog();
        dogB.age = 6;
        dogB.breed = "breed b";
        dogB.size = 100;
        dogB.color = "white";

        Teacher t1 = new Teacher();   //object
        t1.age = 30;
        t1.subject = "Vocal Class";
        t1.name = "Sohee";

        t1.printInfo();
    }
}