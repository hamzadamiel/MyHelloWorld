import java.util.Scanner;

public class LoopsTask {
    public static void main(String[] args) {
        Scanner reader = multiplication();
        sumofnumbers(reader);
    }

    private static void sumofnumbers(Scanner reader) {
        System.out.println("Input a number to sum to  :");
        int sumTo = reader.nextInt();
        int i=0 ;
        while(i <=sumTo){
            i = i+sumTo;
        }
        System.out.println(i);
    }

    private static Scanner multiplication() {
        Scanner reader = new Scanner(System.in);
        System.out.println("What times tables would you like?  :");
        int timesTable = reader.nextInt();
        for(int i = 1; i<=12; i++){
            int answer = i * timesTable;
            System.out.println(timesTable + "x"+ i + "=" + answer);
        }
        return reader;
    }


}
