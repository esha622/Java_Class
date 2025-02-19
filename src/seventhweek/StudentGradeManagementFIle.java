package seventhweek;

import java.io.*;

public class StudentGradeManagementFIle {
    public static void main(String[] args) {
        try{
            File studentFile = new File("student.txt");
            if(studentFile.createNewFile()){
                System.out.println("Student File Created. Student name: "+ studentFile.getName());
            }
            else{
                System.out.println("Already created.");
            }
        }
        catch (Exception e){
            System.out.println("Exception: " + e.getMessage());
        }
        try{
            FileWriter writer = new FileWriter("student.txt");
            writer.write("Name: Sohee \n");
            writer.write("Subject: Math \n");
            writer.write("Practical Marks: 12 \n");
            writer.write("Theory marks: 20");
            writer.close();
        }
        catch (IOException e) {
            System.out.println("Exception: " + e.getMessage());
        }
        try{
            BufferedReader newReadFile = new BufferedReader(new FileReader("student.txt"));
            String result;

            while((result=newReadFile.readLine()) != null){
                System.out.println(result);
            }
        }
        catch(Exception e){
            System.out.println("Exception: " + e.getMessage());
        }
    }
}
