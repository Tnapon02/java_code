import java.util.Scanner;

public class W04_02_ifelse_Homework {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("ป้อนรัศมีวงกลม: ");
        double radius = input.nextDouble();
        double area;
        double PI=3.14159;
        if (radius > 0) {
            area = PI*radius*radius;
            System.out.println("พื้นที่ของวงกลมมีรัศมีเท่ากับ "+radius+area);
        } else {
            System.out.println("หาค่าไม่ได้");
        }
    }
}