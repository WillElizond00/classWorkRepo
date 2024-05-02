/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tryingsomething;

/**
 *
 * @author 0618506375
 */
public class TryingSomething {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    
    int [][] num = {{3,3,3}, {2,2,2}};
    int[] array = {4,3,2};
    for(int i = 0; i < 3; i++){
        num[1][i] = num[0][i]+array[i];
    }

    System.out.println(num[1]);
    
    }
    
}
