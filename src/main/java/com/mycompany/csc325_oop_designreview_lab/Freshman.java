package com.mycompany.csc325_oop_designreview_lab;



public class Freshman extends Student {
    /**
     * Constructor for the Freshman class.
     * Initializes the Freshman's name, age, GPA, and credits.
     *
     * @param name    the name of the freshman
     * @param age     the age of the freshman
     * @param GPA     the GPA of the freshman
     * @param credits the number of credits earned by the freshman should be less than 30
     */
    public Freshman(String name, short age,double GPA, int credits) {
        super(name, age, GPA, credits);
        if(credits < 30){
            throw new IllegalArgumentException("credits must be at least 30");
        }
    }

    /**
     * Override toString method to provide specific details for Freshman.
     *
     * @return a string representation of the Freshman
     */
    @Override
    public String toString() {
        return "Freshman{" +
                "name=" + getName() +
                ", age=" + getAge() +
                ", credits=" + getCredits() +
                ", GPA=" + getGPA() +
                '}';
    }
}
