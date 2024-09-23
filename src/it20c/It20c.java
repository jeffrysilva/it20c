
package it20c;

public class It20c {
  
    public static void main(String[] args) {
        //this is a nested Array
        int[][] sampleMatrix = {
            {1,2,3},
            {4,5,6},
            {7,8,9}
        };
        //for loop intended to get the value of array in a row
       for(int i = 0;i<sampleMatrix.length;i++){
           //for loop intended to get the value of array in a column
        for(int j = 0; j<sampleMatrix[i].length;j++) {
            //Print the value of the Nested array 
        System.out.print(sampleMatrix[i][j]+" ");
        }
         System.out.println();
    }           
    }   
}
