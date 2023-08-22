public class Project {
    public static void main(String[] args) {

        int number = 42;
        int num1 = 1;
        int num2 = 2;
        int num3 = 1;

        String name1 = "Fred";
        String name2 = "Fred";
        String name3 = "Barney";
        String name4 = "Fred";
        String name5 = new String( "Fred");//creates new fred and points to it in the heap
        String name6 = new String( "Fred");//creates new fred and points to it in the heap
        System.out.println(name1.equals(name5));//compares the contents of the object
        System.out.println(name5 == name6);//as it creates a new object that points to they wont be considered the same
        Integer newnumber = 50; //Object
        String name = "Hamza";
        String choice= "Make your selection:";
        System.out.println("Hello " + name);
        System.out.println(newnumber.toString());
        System.out.println("""
                Main Menu
                    1. Say Hello
                    2. Say Goodbye
                """ +choice);
        System.out.println("Hello \nMy Guy");
        System.out.println(num1 + " + " + num2 + " = " + (num1+num2));
    }
}
