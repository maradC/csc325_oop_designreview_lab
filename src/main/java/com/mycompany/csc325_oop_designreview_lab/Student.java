/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.csc325_oop_designreview_lab;

/**
 *
 * @author MoaathAlrajab
 */
public class Student extends Human {
    private double GPA;

    /**
     * Constructor for the Student class.
     * Initializes the student's name, age, and GPA.
     *
     * @param name the name of the student
     * @param age the age of the student
     * @param GPA the GPA of the student
     */
    public Student(String name, short age, double GPA){
        super(name, age);
        this.GPA = GPA;
    }
    /**
     * Gets the GPA of the student.
     *
     * @return the GPA as a double
     */
    public double getGPA() {
        return GPA;
    }
    /**
     * Sets the GPA of the student.
     *
     * @param GPA the new GPA value to set
     */
    public void setGPA(double GPA) {
        this.GPA = GPA;
    }

    /**
     * Gets the address of the student.
     * Overrides the abstract method from the Human class.
     *
     * @return the address as a String
     */
    @Override
    public String getAddress() {
        return super.address;
    }
    /**
     * Sets the address of the student.
     * Overrides the abstract method from the Human class.
     *
     * @param address the new address to set
     */
    @Override
    public void setAddress(String address) {
        super.address = address;
    }


    // ToDo 4: Add comments to your code
}
