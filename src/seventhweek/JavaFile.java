package seventhweek;

import java.io.*;
import java.util.Scanner;

public class JavaFile {
    public static void main(String[] args) {
        /*try{
            File createdFile = new File("test.txt");
            if(createdFile.createNewFile()){
                System.out.println("File Created. File name: "+ createdFile.getName());
            }
            else{
                System.out.println("Already created.");
            }
        }
        catch (Exception e){
            System.out.println("Exception: " + e.getMessage());
        }*/
        /*try{
            FileWriter writer = new FileWriter("example.txt");
            writer.write("This is first line \n");
            writer.write("This is second line \n");
            writer.write("This is third line");
            writer.close();
        }
        catch (IOException e) {
            System.out.println("Exception: " + e.getMessage());
        }*/
        /*try {
            File readFile = new File("example.txt");
            Scanner sc = new Scanner(readFile);

            while (sc.hasNextLine()) {
                String line = sc.nextLine();
                System.out.println(line);
            }
            sc.close();
        } catch (Exception e) {
            System.out.println("Exception: " + e.getMessage());
        }*/

        //read buffered reader
        try{
            BufferedReader newReadFile = new BufferedReader(new FileReader("example.txt"));
            String line;

            while((line=newReadFile.readLine()) != null){
                System.out.println(line);
            }
        }
        catch(Exception e){
            System.out.println("Exception: " + e.getMessage());
        }

        //delete file
        try{
            File prevFile = new File("test.txt");
            if(prevFile.delete()){
                System.out.println("File delete: File name" + prevFile.getName());
            }
            else{
                System.out.println("Unable to delete file");
            }
        }
        catch (Exception e){
            System.out.println("Exception: " + e.getMessage());
        }
    }
}
