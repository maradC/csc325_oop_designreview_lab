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

	// ToDo 1: Make this class a child of Human
    public Student(String name, short age, double GPA){
        super(name, age);
        this.GPA = GPA;
    }

	// ToDo 2: Fix the resulting errors

	// ToDo 3: Add a field for GPA and create a setter and a getter

    public double getGPA() {
        return GPA;
    }

    public void setGPA(double GPA) {
        this.GPA = GPA;
    }

    @Override
    public String getAddress() {
        return super.address;
    }

    @Override
    public void setAddress(String address) {
        super.address = address;
    }


    // ToDo 4: Add comments to your code
}
