import java.io.*;
import java.util.Scanner;
/*
File file = new File("C:\\javaProjects\\workingWithFiles\\src\\students.txt");

file.exists() , file.createNewFile()

file.getName() , file.getAbsolutePath() , file.canWrite() , file.canRead() , file.length()
*/

public class Main {
    public static void main(String[] args) throws IOException {
        create_new_file();
        get_info();
        read_file();
        write_files();
        read_file();
    }

    public static void create_new_file() {
        File file = new File("C:\\javaProjects\\workingWithFiles\\src\\students.txt");
        try {
            if (file.createNewFile()) {
                System.out.println("file has been created");
            } else {
                System.out.println("it has already exist");
            }
        } catch (IOException e) {
            //e.printStackTrace();
        }
    }

    public static void get_info() {
        File file = new File("C:\\javaProjects\\workingWithFiles\\src\\students.txt");
        if (file.exists()) {
            System.out.println("file name : " + file.getName());
            System.out.println("file path : " + file.getAbsolutePath());
            System.out.println("file is writable or not : " + file.canWrite());
            System.out.println("file is readable or not : " + file.canRead());
            System.out.println("file size (byte) : " + file.length());
        }
    }

    public static void read_file() {
        File file = new File("C:\\javaProjects\\workingWithFiles\\src\\students.txt");
        try {
            Scanner reader = new Scanner(file);
            while (reader.hasNextLine()) {
                String line = reader.nextLine();
                System.out.println(line);
            }
            reader.close();
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }
    }
    public static void write_files(){
        try {
            //FileWriter file = new FileWriter("C:\\javaProjects\\workingWithFiles\\src\\students.txt");
            BufferedWriter writer = new BufferedWriter(new FileWriter("C:\\javaProjects\\workingWithFiles\\src\\students.txt",true));
            writer.newLine();
            writer.write("File");
            System.out.println("File has been writed");
            writer.close();
        }catch (IOException e) {
            throw new RuntimeException(e);
        }

    }
}