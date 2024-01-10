// built-in

import mathematics.*;

import java.util.Scanner;
// scanner.nextInt();
// scanner.nextLine();
// scanner.nextDouble();
public class Main {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.print("number : ");
        String name = scanner.nextLine();
        System.out.println("hello " + name);
        basicfunctions basicfunctions = new basicfunctions();
        basicfunctions.add(1,2);
        logaritma logaritma = new logaritma();
        logaritma.logaritma_hesabla();
    }
}