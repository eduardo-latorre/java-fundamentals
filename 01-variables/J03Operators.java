public class J03Operators {

    public static void main(String a[]){
        // Basic operation
        int num1 = 7, num2 = 2;
        System.out.println("add: " + (num1 + num2));
        System.out.println("minus: " + (num1 - num2));
        System.out.println("division: " + (num1 / num2));
        System.out.println("multiplication: " + (num1 * num2));
        System.out.println("reminder: " + (num1 % num2));

        // Operate on the same value and store it into the same variable
        int num3 = 8;
        num3 *= 2;
        System.out.println("Self operation: " + num3);

        // Increment
        int numb4 = 3;
        numb4++;
        System.out.println("Increment:" + numb4);
        numb4--; // Decrement

        // Pre-increment and post-increment
        int num = 1;
        System.out.println("pre-increment: " + num++); // Gets the value first and then increments it
        System.out.println("post-increment: " + ++num); // Increments it and then gets the value
    }
    
}
