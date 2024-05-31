/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package person;

import java.util.Date;

public class Student extends Person {
    private double gpa;
    private String studentId;
    private String major;
    private String degree;
    private int graduationYear;
    
    public Student(String firstName, String middleName, String lastName, Date dateOfBirth, double gpa, String studentId, String major, String degree, int graduationYear ){
        super(firstName, middleName, lastName, dateOfBirth);
        this.gpa = gpa;
        this.studentId = studentId;
        this.major = major;
        this.degree = degree;
        this.graduationYear = graduationYear;
    }
    
    
    
    //Getter and Setter methods for gpa, studentId, major, degree, and graduationYear
    public double getGpa(){
        return gpa;
    }
    
    public void setGpa(double gpa){
        this.gpa = gpa;
    }
    
    public String getStudentId(){
        return studentId;
    }
    
    public void setStudentId(String studentId){
        this.studentId = studentId;
    }
    public String getMajor(){
        return major;
    }
    public void setMajor(String major){
        this.major = major;
    }
    public String getDegree(){
        return degree;
    }
    public void setDegree(String degree){
        this.degree = degree;
    }
    public int getGraduationYear(){
        return graduationYear;
    }
    public void setGraduationYear(int graduationYear){
        this.graduationYear = graduationYear;
    }
    //Method to change students major
    public void changeMajor(String newMajor){
        this.major = newMajor;
    }
    
    //Method to convert letter grade to grade point
    private double convertGradeToPoint(String grade){
        switch(grade){
            case "A":
                return 4.0;
            case "A-":
                return 3.67;
            case "B+":
                return 3.33;
            case "B":
                return 3.0;
            case "B-":
                return 2.67;
            case "C+":
                return 2.33;
            case "C":
                return 2.0;
            case "D":
                return 1.0;
            case "F":
                return 0.0;
            default: 
                throw new IllegalArgumentException("Invalid grade: " + grade);
        }
    }
    
  // Method to calculate GPA from an array of letter grades
    public void calculateGpa(String[] grades) {
        double total = 0.0;
        for (String grade : grades) {
            total += convertGradeToPoint(grade);
        }
        this.gpa = total / grades.length;
    }
    @Override
    public String toString(){
        return super.getName() + ", Date of Birth: " + super.getDateOfBirth() + 
                ", GPA: " + gpa + ", Student ID: " + studentId +
                ", Major: " + major + ", Degree:" + degree +
                ", Graduation Year: " + graduationYear;
     }
    
 public static void main(String[] args) {
        // Example usage
        Date dateOfBirth = new Date(102, 7, 23); // August 23, 2002 (Date uses 1900-based year)
        Student student = new Student("John", "A.", "Doe", dateOfBirth, 3.5, "S12345", "Computer Science", "Bachelor's", 2024);
        System.out.println(student);

        // Change the student's major
        student.changeMajor("Mathematics");
        System.out.println("After changing major: " + student);

        // Calculate the student's GPA from an array of letter grades
        String[] grades = {"A", "A-", "B+", "B", "A"};
        student.calculateGpa(grades);
        System.out.println("After calculating GPA: " + student);
    }
    
}

