package fundamentals;
public class J05Operators {
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
        int increment = 1;
        System.out.println("pre-increment: " + increment++); // Gets the value first and then increments it
        System.out.println("post-increment: " + ++increment); // Increments it and then gets the value

        // ----------------------------

        // Logical Operators
        // Basic logical comparison
        int logical1 = 10, logical2 = 10;
        boolean result = logical1 >= logical2;
        System.out.println("basic comparison: " + result);

        // Compounded comparison
        float f = 2.2f;
        double d = 2;
        char c1 = 'a', c2 = 'b';

        // Using OR ||
        boolean compoundedResult1 = f == d || c1 != c2;
        System.out.println("compounded comparison1: " + compoundedResult1);

        // Using AND &&
        compoundedResult1 = f > d && c1 != c2;
        System.out.println("compounded comparison2: " + compoundedResult1);

        // Using non equal
        boolean foreverFalse =  !(f > d && c1 != c2);
        System.out.println("forever false even true hehe: " + compoundedResult1);

        // Advanced logical operators
        boolean advancedOperator = (100 > 99) ? true : false;
        System.out.println("Advanced operator: " + advancedOperator);
    }
}
