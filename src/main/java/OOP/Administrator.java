package OOP;

import com.sun.scenario.effect.impl.sw.sse.SSEBlend_SRC_OUTPeer;

import java.util.Scanner;

public class Administrator {
    String loginName = "admin";
    String password = "abc";

    public void introduce(){
        System.out.println(loginName);
        System.out.println(password);
    }

    public static void main(String[] args) {
        Administrator admin = new Administrator();
        while (true){
            Scanner sc = new Scanner(System.in);
            System.out.println("请输入用户名称:");
            String name = sc.nextLine();
            System.out.println("请输入密码:");
            String pwd = sc.nextLine();

            if(name.equals(admin.loginName) && pwd.equals(admin.password)){
                admin.loginName = sc.nextLine();
                admin.password = sc.nextLine();
                System.out.println("密码修改成功！");
                break;

            }else{
                System.out.println("用户名和密码不正确，请重新输入");
            }
        }



        admin.introduce();

    }

}
