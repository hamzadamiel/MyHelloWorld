import java.util.Scanner;

public class UsingInputs {
    public static void main(String[] args) {
        Scanner hamza = new Scanner(System.in);
        System.out.println("Enter your first name:");
        String fname = hamza.nextLine();
        System.out.println("Enter your last name:");
        String lname = hamza.nextLine();
        System.out.println("Enter your age: ");
        int age;
        try{
            age = hamza.nextInt();
            System.out.println("Hey your name is " + fname.trim() + " " + lname.trim() + " and your age is " + age);
        }
        catch(Exception e){
            System.out.println("Only numbers, please!");
            System.out.println(e);
        }

        int x = 45;
        int number = 55;

        if (number>0){
            System.out.println("The number is positive!");
            if (number> x)
            {
                System.out.println("The number is greater 55");
            }
        }
        if (x <= 50 ){
            System.out.println("The value is less than or equal to 50");
        }
        else {
            System.out.println("The value os greater than 50!");
        }
        if (1<3){
            System.out.println("Yes");
        }
        else{
            System.out.println("No");
        }
        System.out.println((1<3) ? "Yes!" : "No!");//uses less memory

        String greeting = "Hello world";
        boolean result = greeting instanceof  String;
        System.out.println("Is the greeting variable a String?");

    }
}
