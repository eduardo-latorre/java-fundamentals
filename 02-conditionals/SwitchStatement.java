import java.util.Scanner;

public class SwitchStatement {

    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Pick 1 or 2 number: ");
        int num = scanner.nextInt();
        System.out.println(num);
        
        switch (num){
            case 1:
                System.out.println("Value is one");
                break;
            case 2:
                System.out.println("Value is two");
                break;
            default:
                System.out.println("No predefined value");
                break;
        }
    }
    
}
