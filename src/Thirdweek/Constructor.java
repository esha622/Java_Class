package Thirdweek;
//constructor means special type of function which initialize the function

class Teachers {
    String name;
    String subject;
    int age;

    public void printInfo() {  //function
        System.out.println(this.name);
        System.out.println(this.subject);
        System.out.println(this.age);
    }
    Teachers(String name, int age, String subject){ //parameter constructor
        this.name = name;
        this.age = age;
        this.subject = subject;
    }
    Teachers (Teachers other){  //copy constructor
        this.name = other.name;
        this.age = other.age;
        this.subject = other.subject;
    }
}

class User{
    String name;
    String dateofbirth;
    String gender;
    String bloodtype;

    public void printDetail(){
        System.out.println(this.name);
        System.out.println(this.dateofbirth);
        System.out.println(this.gender);
        System.out.println(this.bloodtype);
    }
    User(String name, String dateofbirth, String gender, String bloodtype){
        this.name = "Wonbin";
        this.dateofbirth = "2002-02-17";
        this.bloodtype = "O+";
        this.gender = "Male";
    }
}

public class Constructor {
    public static void main(String[] args) {
        //default constructor
        Teachers t1 = new Teachers("Sohee", 30, "Dance");
        //t1.printInfo();

        Teachers t2 = new Teachers(t1);  //copy constructor
        t2.printInfo();

        User u1 = new User("Wonbin", "2002-02-17", "Male", "O+");
        u1.printDetail();
    }
}
