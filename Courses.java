/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.questiontwo;

import java.util.Scanner;

/**
 *
 * @author EK
 */
public class Courses {

    public static void main(String[] args) {
        String courseID;
        String courseName;
        int tuition;
        
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter the courseID: ");
        courseID = scanner.nextLine().trim().toUpperCase();
        
        switch (courseID) {
            case "BSE":
                courseName = "Software Engineering";
                tuition = 900000;
                break;
               
            case "BIT":
                courseName = "Information Technology";
                tuition = 750000;
                break;
                
            case "BCS":
                courseName = "Computer Science";
                tuition = 800000;
                break;
                
            case "BCE":
                courseName = "Computer Engineering";
                tuition = 950000;
                break;
                
            default:
                courseName = null;
                tuition = 0;
                break;
        }
        
        // Output the details or message
        if (courseName != null) {
            System.out.println("Course Name: " + courseName);
            System.out.println("Tuition Fee: " + tuition);
        } else {
            System.out.println("Wrong CourseID details: ");
        }
        
        scanner.close();
    }
}
