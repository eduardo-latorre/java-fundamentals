package fundamentals;

public class J06MathClass {
    public static void main(String args[]){
        int val1 = 5;
        int val2 = 2;
        
        // Calculate addition
        System.out.println("Addition of two numbers: " + Math.addExact(val1, val2));

        //Rounding numbers
        float decimalNumber = 45.324f;
        System.out.println("Rounded number: " + Math.round(decimalNumber));
        
        // Getting random values
        double rndValue;
        int counter = 0, iterations = 10;

        while(counter < iterations){
            rndValue = Math.random();
            System.out.println("Random value: " + rndValue);
            counter++;
        }
    }
}
