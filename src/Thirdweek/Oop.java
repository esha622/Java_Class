package Thirdweek;

//Inheritance
class College{
    String name;
    String address;
    String university;

    College(String name, String address, String university){
        this.name = name;
        this.address = address;
        this.university = university;
    }

    void collegeInfo(){
        System.out.println("Name: " + name);
        System.out.println("Address: " + address);
        System.out.println("University: " + university);
    }
}

class HistorySection extends College{
    HistorySection(String name, String headName){
        super("PGS", "Thapagaun", "Westcliff");
        this.name = name;
        this.headName = headName;
    }
    String name;
    String headName;

    void historyInfo(){
        collegeInfo();
        System.out.println("Section name: " + this.name);
        System.out.println("Head Name" + this.headName);
    }
}
class ITSection extends College{
    ITSection(String name, String headName){
        super("PGS", "Thapagaun", "Westcliff");
        this.name = name;
        this.headName = headName;
    }
    String name;
    String headName;

    void itsectionInfo(){
        collegeInfo();
        System.out.println("Section name: " + this.name);
        System.out.println("Head Name" + this.headName);
    }
}
class Library extends College{
    Library(String name, String headName){
        super("PGS", "Thapagaun", "Westcliff");
        this.name = name;
        this.headName = headName;
    }
    String name;
    String headName;

    void libraryInfo(){
        collegeInfo();
        System.out.println("Section name: " + this.name);
        System.out.println("Head Name" + this.headName);
    }
}

public class Oop {
    public static void main(String[] args) {
        HistorySection h1 = new HistorySection("section his", "head his");

        h1.historyInfo();
    }
}
