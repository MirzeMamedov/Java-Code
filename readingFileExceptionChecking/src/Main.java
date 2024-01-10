import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;


public class Main {
    public static void main(String[] args) {
        int total = 0;
        BufferedReader reader = null;
        try {
            reader = new BufferedReader(new FileReader("C:\\javaProjects\\readingFileExceptionChecking\\src\\numbers.txt"));
            String line = null;
            while((line = reader.readLine()) != null){
                total += Integer.valueOf(line);
            }
            System.out.println("Total : " + total);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch(NumberFormatException e){
            throw new NumberFormatException();
        } catch(Exception e){
            e.printStackTrace();
        } finally{
            try{
                reader.close();
            }catch (Exception exception){}
        }
    }
}