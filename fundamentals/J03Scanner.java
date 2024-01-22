package fundamentals;

import java.util.Scanner;

public class J03Scanner {
    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);
        String name;
        int age;
        float heigth;
        double weigth;

        // Scann a string
        System.out.print("Enter your name: ");
        name = scanner.nextLine();

        // Scann a int
        System.out.print("Enter your age: ");
        age = scanner.nextInt();

        // Scann a float, Depending on the PC it can use , or .
        System.out.print("Enter your heigh: ");
        heigth = scanner.nextFloat();

        // Scann a double, Depending on the PC it can use , or .
        System.out.print("Enter your weigth: ");
        weigth = scanner.nextDouble();

        System.out.println("Your name is: " + name);
        System.out.println("Your age is: " + age);
        System.out.println("Your age heigth: " + heigth);
        System.out.println("Your age weigth: " + weigth);

        // Closing the scanner
        scanner.close();
    }
}
