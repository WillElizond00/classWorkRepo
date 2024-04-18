/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package student;

/**
 *
 * @author deck
 */
public class StudentPart2 {
    private String fName;
    private String lName;
    private int stuId;
    private String stuStatus;
   
    public StudentPart2(String fName, String lName, int stuId, String stuStatus){
        this.fName = fName;
        this.lName = lName;
        this.stuId = stuId;
        this.stuStatus = stuStatus;
    }
    
    public String getFullName(){
        return fName + " " + lName;
    }
    
    public int getId(){
        return stuId;
    }
    public String getStatus(){
    return stuStatus;
    }
    
    /**
     * @param args the command line arguments
     */
    
    public static void main(String[] args) {
        // TODO code application logic here
  
    }
    
}
