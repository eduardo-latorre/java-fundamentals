package exercices;

/*
    Print figure x in 1 and 0
*/
public class E03ZFigureMatrix {
    public static void main(String[] args) {
        int[][] matrix = new int[5][5];
        int backgroundDigit = 0;
        int figureDigit = 1;

        for(int i = 0; i < matrix.length; i++){
            for(int j = 0; j < matrix[0].length; j++){
                if(i == j || (matrix[i].length - (i+1)) == j){
                    matrix[i][j] = figureDigit;
                }else{
                    matrix[i][j] = backgroundDigit;
                }
            }
        }

        // Print the matrix
        for(int i = 0; i < matrix.length; i++){
            for(int j = 0; j < matrix[0].length; j++){ 
                System.out.print(matrix[i][j]);
            }
            System.out.println("");
        }
        
    }

}
