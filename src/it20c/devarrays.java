package it20c;

/**
 *
 * @author Temp
 */
public class devarrays {
    // This is a nested array
    int[][] sampleMatrix = {
        {1, 2, 3},
        {4, 5, 6},
        {7, 8, 9},
        {10, 11, 12}
    };

    // Method to print the nested array
    public void printArray() {
        // For loop intended to get the value of the array in a row
        for (int i = 0; i < sampleMatrix.length; i++) {
            // For loop intended to get the value of the array in a column
            for (int j = 0; j < sampleMatrix[i].length; j++) {
                // Print the value of the nested array
                System.out.print(sampleMatrix[i][j] + " ");
            }
            System.out.println(); // Move to the next line after each row
        }
    }
}
