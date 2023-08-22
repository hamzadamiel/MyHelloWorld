public class WorkingWithDataTypes {
    public static void main(String[] args) {
        String name = "Trevpr Smith";
        System.out.println(name.toLowerCase());
        System.out.println(name.length());
        Integer ages = 16;
        System.out.println(ages);
        byte age = 127;
        System.out.println(age);
        int aged = 2147483647;// exceeded the maximum value that can be represented by a 32-bit signed integer in Java
        aged = aged+1;
        System.out.println(aged);

        int day = 031; //OCTAL 31 = DECIMAL 25 (3*8 +1)
        System.out.println(day);

        int day1 = 0b1100;
        System.out.println(day1);

        int colour = 0xFFFFFF;//RGB ---HEXIDECIMAL
        System.out.println(colour);




    }
}
