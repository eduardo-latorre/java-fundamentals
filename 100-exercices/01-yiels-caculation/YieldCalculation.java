import java.util.Scanner;

/*
    Calculate the yield of a property
*/

public class YieldCalculation{

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double annualRental, propertyValue;

        System.out.print("Enter the anual rental: ");
        annualRental = scanner.nextDouble();
        
        System.out.print("Enter the property value: ");
        propertyValue = scanner.nextDouble();

        System.out.println("The yield is: " + caculateYield(annualRental, propertyValue));

        scanner.close();
    }

    public static double caculateYield(double annualRental, double propertyValue){
        return (annualRental / propertyValue) * 100;
    }

}