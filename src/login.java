import java.util.Scanner;

public class login {
    public static void main(String[] args) {
        String login[][] = {{"ADMIN", "hamza", "User", "LEvi", "Ash"}, {"password", "Hamza", "pass", "Ackerman", "Ketchum"},};


        for (int x = 0; x < login[0].length; x++) {
            login[0][x] = login[0][x].toLowerCase();
            //System.out.println(login[0][x]);
        }
        Scanner user = new Scanner(System.in);
        String username;
        do {
            System.out.println("Enter your username:");
            username = user.nextLine();
            username = username.toLowerCase();
        } while (username == "");
        String password;
        int passwordcount = 0;
        while (passwordcount < 3) {
            System.out.println("Enter your password:");
            password = user.nextLine();
            for (int i = 0; i < login[0].length; i++) {
                //System.out.println(login[0][i]);
                if (username.equals(login[0][i])){
                    if(password.equals(login[1][i])){
                        System.out.println("Welcome");
                        passwordcount = 4;
                        break;
                    }
                    else{
                        System.out.println("Access Denied");
                        passwordcount++;
                    }

                };

            /*if (username.equals("admin")  && password.equals("password") ){
                System.out.println("Welcome");
                passwordcount=4;
            }
            else{
                System.out.println("Access Denied!");
                passwordcount++;
            }*/


            }
            if (passwordcount == 3) {
                System.out.println("No more password attempts...goodbye");
            }
            //this works!
            //test
        }
    }
}
