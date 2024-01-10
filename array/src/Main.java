import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        String student_1 = "Mirze";
        String student_2 = "Seymur";
        String student_3 = "Adem";
        String student_4 = "Hevva";

        System.out.println("student_1 : " + student_1);
        System.out.println("student_2 : " + student_2);
        System.out.println("student_3 : " + student_3);
        System.out.println("student_4 : " + student_4);

        System.out.println("-----------------------------------------");

        String[] Students = new String[4];
        Students[0] = "Mirze";
        Students[1] = "Seymur";
        Students[2] = "Adem";
        Students[3] = "Hevva";

        System.out.println(Arrays.asList(Students));
        System.out.println("-----------------------------------------");

        for(int i = 0 ;  i < Students.length  ; i++ ){
            System.out.println((i+1) + ". " + Students[i]);
        }
        System.out.println("-----------------------------------------");

        //  Arrays.asList(Students) == Students ?
        for(String student: Arrays.asList(Students)){
            System.out.println(student);
        }
    }
}