package poo.bmethods;

import java.util.Scanner;

public class Calculator {
    int num1;
    int num2;

    public void requestNumbersToUser(){
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter your first number: ");
        num1 = sc.nextInt();

        System.out.print("Enter your second number: ");
        num2 = sc.nextInt();

        sc.close();
    }

    public void addition(){
        System.out.println("The addition result is: " + (num1 + num2));
    }

    public void subtraction(){
        System.out.println("The subtraction result is: " + (num1 - num2));
    }

    public void multiplication(){
        System.out.println("The multiplication result is: " + (num1 * num2));
    }

    public void division(){
        System.out.println("The division result is: " + (num1 / num2));
    }
}
