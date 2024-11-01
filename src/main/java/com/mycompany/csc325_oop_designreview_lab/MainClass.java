/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.csc325_oop_designreview_lab;

import java.util.Scanner;

/**
 *
 * @author MoaathAlrajab
 */
public class MainClass {

 public static void main(String[] args) {
	 // Create a Scanner object to get user input
	 Scanner scanner = new Scanner(System.in);

	 // Create a Student instance with initial details (GPA will be updated later)
	 Student std1 = new Student("James", (short) 20, 3.5, 12); // name, age, GPA, credits
	 System.out.println("Initial details of student: " + std1);

	 // Allow user to update GPA for std1
	 System.out.print("Enter the new GPA for James: ");
	 double newGPA = Double.parseDouble(scanner.nextLine());
	 std1.setGPA(newGPA);
	 System.out.println("Updated details of student: " + std1); // Output updated student details

	 // Create a Freshman instance using the same details as std1
	 Freshman freshman = new Freshman("James", (short) 20, 3.5, 12); // name, age, GPA, credits
	 System.out.println("\nDetails of Freshman: " + freshman); // Output freshman details

	 // Create a Senior instance with at least 85 credits
	 Senior senior = null;
	 try {
		 senior = new Senior("John", (short) 30, 3.8, 90); // name, age, GPA, credits
		 System.out.println("\nDetails of Senior: " + senior); // Output senior details
	 } catch (IllegalArgumentException e) {
		 System.out.println("Error: " + e.getMessage());
	 }

	 // Close the scanner to avoid resource leak
	 scanner.close();
 }
	}

}

