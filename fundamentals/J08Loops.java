package fundamentals;

/*
 * These are the loops used in Java
 * For, While and Do While
 * The main difference between while and do-while is that in
 * do-while the block es executed first and then evaluated
*/

public class J08Loops {

    public static void main(String[] args) {
        int iterations = 3;

        //For loop
        for(int i = 0; i < iterations; i++){
            System.out.println("Hello inside for loop");
        }        

        // While loop
        int counter = 0;
        while (counter < iterations) {
            System.out.println("Hello inside while loop");
            counter++;
        }

        //Do While
        counter = 0;
        do {
            System.out.println("Hello from do-while");
            counter++;
        }while (counter < iterations);

    }

}