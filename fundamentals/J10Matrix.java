package fundamentals;
/* 
 * Fixed sized and type
*/
public class J10Matrix {
   public static void main(String[] args) {
        String matrix[][] = new String[2][2];

        System.out.println("Amount of columns: " + matrix.length);
        System.out.println("Amount of rows: " + matrix[0].length);

        // Looping a matrix
        for(int i = 0; i < matrix.length; i++){
            for(int j = 0; j < matrix[0].length; j++){
                matrix[i][j] = " Value";
            }
        }

        // Looping a matrix
        for(int i = 0; i < matrix.length; i++){
            for(int j = 0; j < matrix[0].length; j++){
                System.out.print(matrix[i][j]);
            }
            System.out.println("");
        }
   }
    
}
