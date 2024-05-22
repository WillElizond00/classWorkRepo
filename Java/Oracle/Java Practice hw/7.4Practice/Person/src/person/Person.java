/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package person;
import java.util.Date;
/**
 *
 * @author 0618506375
 */
public class Person {
    private String firstName;
    private String middleName;
    private String lastName;
    private Date dateOfBirth;
    
    public Person(String firstName, String middleName, String lastName, Date dateOfBirth){
        this.firstName = firstName;
        this.middleName = middleName;
        this.lastName = lastName;
        this.dateOfBirth = dateOfBirth;
    }
    
    public String getFirstName(){
        return firstName;
    }
    
    public String getLastName(){
        return lastName;
    }
    
    public String getName(){
        return firstName + " " + middleName + " " + lastName;
    }
    
    public Date getDateOfBirth(){
        return dateOfBirth;
    }
    
    /**
     * @param args the command line arguments
     */
    
    
}//end of class
