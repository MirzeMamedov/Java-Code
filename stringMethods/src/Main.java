import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        // String = a reference data type that can store one or more characters
        // reference data types have access to useful methods

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter Word : ");
        String name = scanner.nextLine();

        boolean result_1 = name.equalsIgnoreCase("bro");
        int result_2 = name.length();
        char result_3 = name.charAt(0);
        int result_4 = name.indexOf("o");
        boolean result_5 = name.isEmpty();
        String result_6 = name.toUpperCase();
        String result_7 = name.toLowerCase();
        String result_8 = name.trim();
        String result_9 = name.replace('o', 'a');

        System.out.print("result_1 : " + result_1 + " | ");
        System.out.print("result_2 : " + result_2 + " | ");
        System.out.print("result_3 : " + result_3 + " | ");
        System.out.print("result_4 : " + result_4 + " | ");
        System.out.print("result_5 : " + result_5 + " | ");
        System.out.print("result_6 : " + result_6 + " | ");
        System.out.print("result_7 : " + result_7 + " | ");
        System.out.print("result_8 : " + result_8 + " | ");
        System.out.print("result_9 : " + result_9 + " | ");


    }

}