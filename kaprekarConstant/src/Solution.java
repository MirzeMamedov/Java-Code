import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;


public class Solution {

    static int count;
    ArrayList<Integer> digits = new ArrayList<Integer>();
    int digit;
    int number_1_int;
    String number_1_str = "";
    int number_2_int;
    String number_2_str = "";

     Solution(int number) {

        EveryDigits(number);
        discrepancy(number_1(digits), number_2(digits), number);

    }

    public void discrepancy(int number_1_int, int number_2_int, int number) {
        if (number_1_int != 7641) {
            count += 1;
            number = (number_1_int - number_2_int);
            System.out.println("---------------------------");
            System.out.println("New Number : " + number);
            System.out.println("---------------------------");
            new Solution(number);
        } else {
            System.out.println("count : " + count);
        }
    }

    public void EveryDigits(int number) {
        for (int i = 3; i > -1; i--) {
            digit = (int) (number / (Math.pow(10, i)));
            number = number % (int) (Math.pow(10, i));
            digits.add(digit);
        }
    }

    public int number_1(ArrayList<Integer> digits) throws NumberFormatException {
        Collections.sort(digits, Comparator.reverseOrder());

        for (int digit : digits) number_1_str += digit;

        number_1_int = Integer.valueOf(number_1_str);
        System.out.println("---------------------------");
        System.out.println("number_1 : " + number_1_int);
        System.out.println("---------------------------");
        return number_1_int;
    }

    public int number_2(ArrayList<Integer> digits) throws NumberFormatException {
        Collections.sort(digits, Comparator.naturalOrder());

        for (int digit : digits) number_2_str += digit;

        number_2_int = Integer.valueOf(number_2_str);
        System.out.println("---------------------------");
        System.out.println("number_2 : " + number_2_int);
        System.out.println("---------------------------");
        return number_2_int;
    }
}
