package exercices;

import java.util.Scanner;

/*
    Write a program the detects odd and even numbers
    - the program must print if it's odd or even
    - the program must exits when the user enters 0
*/

public class E01OddNumbers {
    public static void main(String[] args) {
        int userNumber;
        Scanner scanner = new Scanner(System.in);

        do {
            System.out.print("Enter your number: ");
            userNumber = scanner.nextInt();

            if (userNumber == 0) {
                break; //Breaks the code and quits the loop
            }else if(userNumber%2 == 0){
                System.out.println(userNumber + " is an even number");
            }else{
                System.out.println(userNumber + " is a odd number");
            }
        }while(true);

        System.out.println("You exited the program");
        scanner.close();
    }
}
