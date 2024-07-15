import java.util.Scanner;

public class W05_02_ifelseif_PosNegZero {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter Number: ");
        int number = input.nextInt();
        if (number > 0) {
            System.out.println(number + " is a positive number.");

        } else if (number < 0) {
            System.out.println(number + " is a negative number.");
        } else {
            System.out.println(number + "is zero.");
        }
    }
}
