package W10;
import java.util.Scanner;

public class W10_04_titlestatus {
   public static void main(String[] args) {
       Scanner kb = new Scanner(System.in);
       System.out.print("ระบุเพศ (male/female): ");
       String gender = kb.next();

       System.out.print("ระบุอายุ: ");
       int age = kb.nextInt();

       System.out.print("ระบุสถานะสมรส (single/married): ");
       String ismarried = kb.next();

       if (gender.equalsIgnoreCase("male")) {
           if (age >= 15) {
               System.out.print("นาย");
           } else {
               System.out.print("ด.ช.");
           }
       } else if (gender.equalsIgnoreCase("female")) {
           if (age < 15) {
               System.out.print("ด.ญ.");
           } else if (ismarried.equalsIgnoreCase("married")) {
               System.out.print("นาง");
           } else {
               System.out.print("นางสาว");
       }
   }
 }
}
