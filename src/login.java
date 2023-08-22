import java.util.Scanner;

public class login {
    public static void main(String[] args) {
        Scanner user  = new Scanner(System.in);
        System.out.println("Enter your username:");
        String username = user.nextLine();
        System.out.println("Enter your username:");
        String password = user.nextLine();
        if (username.equals("admin")  && password.equals("password") ){
            System.out.println("Welcome");
        }
        else{
            System.out.println("Access Denied!");
        }

    }
}
