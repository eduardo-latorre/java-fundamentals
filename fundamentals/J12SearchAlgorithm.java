package fundamentals;

/* 
 * Search Algorithms
 * - Linear or Secuential Search: Checks every element in the array, if the element is in first slots
 * it's be faster, but if it's at the bottom it'll be slower instead
 * 
 * - Binary Search: More efficient than Secuential search, stands for search sorted data, always targets
 * the middle element diving it by two
 * 
 * - Binary Recursive Search
*/

public class J12SearchAlgorithm {
    
    public static void main(String[] args) {
        
        //Secuential Search
        int secuentialData[] = {5, 12, 41, 90, 43, 12, 38, 73, 17, 91, 42, 51};
        int searchedValue = 45;

        System.out.println("Value found at: " + secuentialSearch(secuentialData, searchedValue) + " position");

        //Binary Search
        int binarySearch[] = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20};
        int searchedValueBinary = 3;
        System.out.println("Value found at: " + binarySearch(binarySearch, searchedValueBinary) + " position");
        
    }

    public static int secuentialSearch(int[] data, int searchedValue){
        for(int i = 0; i < data.length; i++){
            if(data[i] == searchedValue){
                return i+1; // Considering index starts from 0, that's why +1 
            }
        }
        return -1;
    }

    public static int binarySearch(int[] data, int searchedValue){
        int low = 0;
        int high = data.length - 1;
        while (low <= high) {
            int middle = low + (high - low) / 2;
            System.out.println("Middle: " + middle);
            if (data[middle] < searchedValue) {
                low = middle + 1;
            } else if (data[middle] > searchedValue) {
                high = middle - 1;
            } else {
                return middle;
            }
        }
        return -1;
    }    
}
