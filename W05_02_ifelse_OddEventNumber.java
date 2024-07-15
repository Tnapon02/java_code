import java.util.Scanner;

public class W05_02_ifelse_OddEventNumber {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter Number: ");
        int number = input.nextInt();
        int result = number % 2;

        if (result == 0) {
            System.out.println(number + " is an even number.");

        } else {
            System.out.println(number + " is a odd number.");
        }

    }
}
