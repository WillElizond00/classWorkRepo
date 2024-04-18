/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package student;

/**
 *
 * @author deck
 */
public class StudentTest {
    public static void main(String[] args){
        Student student1 = new Student("Lisa", "Palombo", 123456789, "Active");
        
        System.out.println("Student Full Name: " + student1.getFullName());
        System.out.println("Student ID: " + student1.getID());
}
