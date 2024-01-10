import java.util.Scanner;

class Kaprekar {
    int number;

    Kaprekar() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter number : ");
        number = scanner.nextInt();

        NumberOfDigits(number);

    }
    public void NumberOfDigits(int number) {
        if (Integer.toString(number).length() != 4) {
            new Kaprekar();
        } else {
            new Solution(number);
        }
    }

    public static void main(String[] args) {
        new Kaprekar();
    }
}
