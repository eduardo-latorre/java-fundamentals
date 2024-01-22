package exercices;

public class E02PrintReverString {
    public static void main(String[] args) {
        
        String valueToReverse = "adda";
        char[] valueIntoCharArray = valueToReverse.toCharArray();
        int arrayLenght = valueIntoCharArray.length;

        for(int i = 0; i < (arrayLenght / 2); i++){ 
            char lowChar = valueIntoCharArray[i];
            char hightChar = valueIntoCharArray[(arrayLenght-1) - i];
            valueIntoCharArray[i] = hightChar;
            valueIntoCharArray[(arrayLenght-1) - i] = lowChar;
        }

        for(int i = 0; i < valueIntoCharArray.length; i++){
            System.out.print(valueIntoCharArray[i]);
        }
    }
}
