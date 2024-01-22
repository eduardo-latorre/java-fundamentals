package fundamentals;

import java.util.Random;
import java.util.Scanner;

/*
 * A data structure
 * Arrays a fixed sized
 * Use an index and they start from 0 
 * They're the defined as the same type
 * Empty positions are set 0
 * Array lenght is going to return the size of and array:
 *  - int[] array = new int[10]
 *  - lenght: 10
 *  - positions: 0 - 9  
*/

public class J09Arrays {
    public static void main(String[] args) {
        int[] numbers = new int[10];
        char characters[] = new char[20];

        numbers[0] = 1;
        characters[0] = 'a';

        System.out.println("Print numbers at o position: " + numbers[0]);
        System.out.println("Print characters at o position: " + characters[0]);

        // Store a character every iteration according to the user need
        Random random = new Random();
        Scanner scanner = new Scanner(System.in);
        int amountOfNumbers = 0;

        // Get a number between 1 and 99
        do{
            System.out.print("How many random numbers do you want to store? ");
            amountOfNumbers = scanner.nextInt();
        }while(amountOfNumbers <= 0 || amountOfNumbers >= 100);

        scanner.close();

        int randomNumber[] = new int[amountOfNumbers]; 
        for(int i = 0; i < randomNumber.length; i++){
            randomNumber[i] = random.nextInt(100); // From 0 to 99
        }

        for(int i = 0; i < randomNumber.length; i++){
            System.out.println("Valor en posición " + i + ", es: " + randomNumber[i]);
        }
    }
}
