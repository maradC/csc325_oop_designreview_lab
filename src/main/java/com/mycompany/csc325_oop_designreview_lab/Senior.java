package com.mycompany.csc325_oop_designreview_lab;

public class Senior extends Student {
    /**
     * Constructor for the Senior class.
     * Initializes the Senior's name, age, GPA, and credits.
     *
     * @param name    the name of the senior
     * @param age     the age of the senior
     * @param GPA     the GPA of the senior
     * @param credits the number of credits earned by the senior (must be at least 85)
     */
    public Senior(String name, short age, double GPA, int credits){
        super(name, age, GPA, credits);
        if(credits < 85){
            throw new IllegalArgumentException("credits must be at least 85");
        }

    }

    /**
     * Override toString method to provide specific details for Senior.
     *
     * @return a string representation of the Senior
     */
    @Override
    public String toString() {
        return "Senior{" +
                "name=" + getName() +
                ", age=" + getAge() +
                ", credits=" + getCredits() +
                ", GPA=" + getGPA() +
                '}';
    }

}
