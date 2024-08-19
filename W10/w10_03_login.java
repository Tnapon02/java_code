package W10;
import java.util.Scanner;
public class w10_03_login {
    public static void main(String[] args) {
        String username = "admin";
        String password = "1234";
        Scanner kb = new Scanner(System.in);
        System.out.print("ป้อนชื่อผู้ใช้: ");
        String inputusername = kb.nextLine();
        System.out.print("ป้อนรหัสผ่าน: ");
        String inputpassword = kb.nextLine();

        if(username.equals(inputusername) && password.equals(inputpassword)){
        System.out.print("เข้าสู่ระบบสำเร็จ");

        }else{
        if(!username.equals(inputusername) && password.equals(inputpassword)){
           System.out.print("ชื่อผู้ใช้ไม่ถูกต้อง");
             }else if(username.equals(inputusername) && !password.equals(inputpassword)){
          System.out.print("รหัสผ่านไม่ถูกต้อง");
             }else{
                 System.out.print("ชื่อผู้ใช้และรหัสผ่านไม่ถูกต้อง");
        }

    }
}
}