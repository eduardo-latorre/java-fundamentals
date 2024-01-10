public class Conditionals {
    public static void main (String args[]){
        // Printing the greater number
        int num1 = 3, num2 = 10, num3 = 20;
        if(num1 > num2 && num1 > num3){
            System.out.println( num1 + " is greater than " + num2 + " and " + num3);
        }else if(num2 > num1 && num2 > num3){
            System.out.println( num2 + " is greater than " + num1 + " and " + num3);
        }else{
            System.out.println( num3 + " is greater than " + num1 + " and " + num2);
        }

        // Ternary operator
        int evenOrOdd = 1;
        boolean result = evenOrOdd%2==0 ? true : false;
        System.out.println("Result is: " + result);
    }
}
