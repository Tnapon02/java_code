import java.util.Scanner;

public class W06_Grade_Homework {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("กรุณาใส่คะแนนของคุณ: ");
        int score = scanner.nextInt();

        char grade;
        if (score >= 80) {
            grade = 'A';
        } else if (score >= 70) {
            grade = 'B';
        } else if (score >= 60) {
            grade = 'C';
        } else if (score >= 50) {
            grade = 'D';
        } else {
            grade = 'F';
        }

        System.out.println("คะแนนของคุณคือ: " + score);
        System.out.println("เกรดของคุณคือ: " + grade);
    }
}
