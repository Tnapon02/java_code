import java.util.Scanner;
public class W04_01_AreaCircle {
public static void main(String[] args) { 
    Scanner sc = new Scanner(System.in);
    System.out.println("ป้อนรัศมีวงกลม: ");
    double radius = sc.nextDouble();
    //radius = 10;
    double area;
    double PI=3.14159;
    area = PI*radius*radius;
    System.out.println("พื้นที่ของวงกลมมีรัศมีเท่ากับ "+radius+area);
     } 
}
