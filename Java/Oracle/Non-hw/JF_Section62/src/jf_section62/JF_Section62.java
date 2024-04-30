/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package jf_section62;

/**
 *
 * @author 0618506375
 */
public class JF_Section62 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    
        //Declare arrays 
        
        String[] myBouquet; //2 line Declaration only 
        myBouquet = new String[6];
    
       // String[] myBouquet2 = new String[6]; //1 line declaration
        
        
        //Primitive data type examples 
        // python: myInt = [0,1,2,3,4,5]
        
         // ClassName[] objName = new Constructor
        int[] myInt = new int[10]; // Integer 1D array
        double[] myDouble = new double[10];
        boolean[] myBoolean = new boolean[10];
        char[] myChar = new char[10];
        
        //Alternative declaration
        int myInt2[]= new int[15];
        double myDouble2[] = new double[15];
        
       
        // 2D primitive array declaration
       
        int[][] my2DInt = new int[4][3]; // 4 rows & 3 cols
        
        //Initialize my String array with 6 elements
        myBouquet[0]= "Rose"; // store 'Rose' as first element.
        myBouquet[1]= "Sunflower";
        myBouquet[2]= "Daisy";
        myBouquet[3]= "Dandelion";
        myBouquet[4]= "Violet";
        myBouquet[5]= "Lily";
        
        String[] myBouquet2 = {"Rose", "Sunflower", "Daisy", "Dandelion", "Violet", "Lily"};
        
        for(int i = 0; i<myBouquet2.length; i++){
            System.out.println(myBouquet2[i]);
        }
        
        
        myDouble[9] = 25.5;
        System.out.println("myInt : " + myInt.length);
        System.out.println("myBouquet : " + myBouquet.length);
        System.out.println(myInt[0]);
        System.out.println(myDouble[myDouble.length - 1]);
        
        
        //Use a for-each method (variableName:Array)
         for(String myElement:myBouquet2 ){
            System.out.println(myElement);
        } // end of for loop
        
        // 2D Arrays
        int[][] num1 = new int[4][3]; // 4 rows x 3 cols
        int[][] num2 = {{14, 15, 16},{17,18,19},{20,21,22},{23,24,25}};

        System.out.println(num2[1][1]);
        System.out.println(num1[1][1]);
        
        System.out.println(num1.length); // If I ask for length of the array Rows
        System.out.println(num1[0].length); // cols = length of first row
        
        int myRows = num1.length;
        int myCols = num1[0].length;
        
        for (int x = 0; x <myRows; x++){ // Rows
            for (int y = 0; y < myCols; y++){
                num1[x][y] = x;
            } //end of for x
        } // end of for y
    
          for (int x = 0; x <myRows; x++){ // Rows
            for (int y = 0; y < myCols; y++){
               System.out.println(num1[x][y]);
            } //end of for x
          
        } // end of for y
        
    }//end of main
    
}//end of class
