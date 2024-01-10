public class Main {

    public static void main(String[] args) {

        // final == keyword. Depending on where it's used:
        // - For classes: Prevents class extension; class cannot be subclassed.
        // - For methods: Prevents method overriding; method cannot be changed in subclasses.
        // - For variables: Makes a variable constant; its value cannot be changed after assignment.

        /* final */

        // -----------------------------
        final double PI = 3.14159;
        //PI = 4;
        System.out.println(PI);
        // -----------------------------


    }
}