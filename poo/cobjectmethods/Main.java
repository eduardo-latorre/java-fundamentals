package poo.cobjectmethods;

import java.util.Scanner;

/* 
    - Using parameters and args 
        - Parameters are declared in the method
        - Arguments are what we pass when calling a method
    - Returning values
    - Constructor method, helps to initialize a class and is the only that does not require void/returning value
*/
public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Car myCar = new Car();
        int speedIncrease = 5;
        int option = 0;

        System.out.println("Welcome on board");
        System.out.println("You'll have the follow option in this car: ");
        System.out.println("1.- Accelerate the car by 10km/h");
        System.out.println("2.- Slow down the car by 10km/h");
        System.out.println("3.- Show the current speed");
        System.out.println("4.- Exit the car/program");

        while(option != 4){
            System.out.print("Enter your choice: ");
            option = scanner.nextInt();

            System.out.println("Option: " + option);
            switch (option) {
                case 1:
                    myCar.speedUp(speedIncrease);
                    break;
                case 2:
                    myCar.slowDown(speedIncrease);
                    break;
                case 3:
                    System.out.println("Your current speed: " + myCar.getSpeed());
                    break;
                case 4:
                    System.out.println("Bye ...");
                    break;
                default:
                    break;
            }    
        }

        scanner.close();
    }
}
