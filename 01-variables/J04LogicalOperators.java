public class J04LogicalOperators {

    public static void main(String[] args){
        // Basic logical comparison
        int num1 = 10, num2 = 10;
        boolean result = num1 >= num2;
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
