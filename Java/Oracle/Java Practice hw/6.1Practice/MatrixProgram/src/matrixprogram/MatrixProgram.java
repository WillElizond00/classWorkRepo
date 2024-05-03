/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package matrixprogram;
import java.util.Scanner; //Import Scanner class to read input
/**
 *
 * @author 0618506375
 */
public class MatrixProgram {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
       
    
        Scanner scanner = new Scanner(System.in);//Create a scanner object to handle input
        boolean isRunning = true; // Control the main loop of the program
        
        //Placeholder matrices
        int[][] matrixA = null; //placeholder
        int[][] matrixB = null; //placeholder
        
        while (isRunning){ // Main loop to show menu
        System.out.println("Choose an option:");
        System.out.println("a. Enter Matrix A");
        System.out.println("b. Enter Matrix B");
        System.out.println("c. Display A + B");
        System.out.println("d. Display A - B");
        System.out.println("e. Display A * B");
        System.out.println("f. Exit");
        System.out.println("Extra options");
        System.out.println("g. Print matrixA");
        System.out.println("h. Print matrixB");
        System.out.println("Enter your choice: ");
        String choice = scanner.nextLine(); // Read the user's menu choice

        
        
        //switch statement to process the choice
        
        switch(choice){ //Proces the user's choice
            case "a":
                // Call the method to enter matrix A
                matrixA = enterMatrix(scanner); //Enter Matrix A
                break;
            case "b":
                // Call the method to enter matrix B
                matrixB = enterMatrix(scanner); //Enter Matrix B
                break;
            case "c":
                // Addition method
                if (matrixA != null && matrixB != null){
                int[][] result = addMatrices(matrixA, matrixB);
                if (result != null) {
                    printMatrix(result);
                    }
                } else {
                    System.out.println("Please enter both matrices first.");
                }
                break;
            case "d":
                //Subtraction method
                if (matrixA != null && matrixB != null){
                int[][] result = subMatrices(matrixA, matrixB);
                if (result != null) {
                    printMatrix(result);
                    }
                } else {
                    System.out.println("Please enter both matrices first.");
                }
                break;
            case "e":
                //Multiplication method
                if (matrixA != null && matrixB != null){
                    int[][]result = multiplyMatrices(matrixA, matrixB);
                    if (result != null){
                        printMatrix(result);
                    }
                } else {
                    System.out.println("Please enter both matrices first.");
                }
                break;
            case "f":
                // Print exit message and change the loop flag to false to stop the program 
                System.out.println("Exiting...");
                isRunning = false;
                break;
            case "g":
                 System.out.println("Displaying Matrix A:");
                 printMatrix(matrixA);
                break;
            case "h":
                System.out.println("Displaying Matrix B:");
                printMatrix(matrixB);
                break;
            default:
                // Handle invalid options
                System.out.println("Invalid option. Please choose again.");
        }
       
    }
      
        scanner.close();
      
    } //end of main
    
    
    //Method to enter a matrix
    // Prompts users to specify the size and elements of the matrix.
    
    private static int[][] enterMatrix(Scanner scanner){
        // Prompt user to enter the number of rows
        System.out.println("Enter the number of rows: ");
        int rows = scanner.nextInt();
        // Prompt and read the number of columns
        System.out.println("Enter the number of cols: ");
        int cols = scanner.nextInt();
        // Initialize the matrix with specified dimensions
        int[][] matrix = new int[rows][cols];
    
        //Prompt the user to enter each element of the matrix
        System.out.println("Enter the matrix elements row by row:");
        for(int i =0; i < rows; i++){
            for(int j=0; j < cols; j++){
                matrix[i][j] = scanner.nextInt();
            }
        }
        scanner.nextLine();
        return matrix;
   }
    
    private static int[][] addMatrices(int[][] matrixA, int[][] matrixB){
        //Implement logic here to add matrices and return the sum
    if(matrixA.length != matrixB.length || matrixA[0].length != matrixB[0].length){
        System.out.println("Matrices must be of the same dimension to add.");
        return null; // 
        }
    
    //Initialize the result matrix
    int[][] resultMatrix = new int[matrixA.length][matrixA[0].length];
    
    // Perform element-wise addition
    for (int i = 0; i < matrixA.length; i++){
        for (int j = 0; j < matrixA[i].length; j++){
            resultMatrix[i][j] = matrixA[i][j] + matrixB[i][j];
        }
    }
    return resultMatrix;
    }
    //Subtraction method
    private static int[][] subMatrices(int[][] matrixA, int[][] matrixB) {
    // First, check if both matrices are not null and have the same dimensions
    if (matrixA == null || matrixB == null || matrixA.length != matrixB.length || matrixA[0].length != matrixB[0].length) {
        System.out.println("Matrices must be of the same dimension and not null.");
        return null;
    }

    // Initialize the result matrix with the same dimensions as matrixA and matrixB
    int[][] resultMatrix = new int[matrixA.length][matrixA[0].length];

    // Perform element-wise subtraction
    for (int i = 0; i < matrixA.length; i++) {
        for (int j = 0; j < matrixA[i].length; j++) {
            resultMatrix[i][j] = matrixA[i][j] - matrixB[i][j];
        }
    }

    return resultMatrix;
}
 
    // Multiplication method 
    private static int[][] multiplyMatrices(int[][] matrixA, int[][] matrixB) {
    // Check if multiplication is possible
    if (matrixA == null || matrixB == null || matrixA[0].length != matrixB.length) {
        System.out.println("Matrix multiplication is not possible. Check dimensions.");
        return null;
    }

    // Initialize the result matrix
    int[][] resultMatrix = new int[matrixA.length][matrixB[0].length];

    // Calculate the matrix multiplication
    for (int i = 0; i < matrixA.length; i++) {
        for (int j = 0; j < matrixB[0].length; j++) {
            for (int k = 0; k < matrixA[0].length; k++) {
                resultMatrix[i][j] += matrixA[i][k] * matrixB[k][j];
            }
        }
    }

    return resultMatrix;
}

    
    //Print matrix to console method 
    public static void printMatrix(int[][] matrix){
        if (matrix == null){
            // If the matrix is null, inform the user and exit the method
        System.out.println("No Matrix to display");
        return;
    }
        //Iterate through each row of the matrix
    for (int i = 0; i < matrix.length; i++){
        //Iterate through each column in the current row
        for (int j = 0; j < matrix[i].length; j++){
            //Print each element followed by a space for separation
            System.out.print(matrix[i][j]+ " ");
        }
        System.out.println();
        }    
        
    }
    
    
    
} // end of class 
      

