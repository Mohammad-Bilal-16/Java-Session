package Conditional;

import java.sql.SQLOutput;
import java.util.Scanner;

public class StudentMarks {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Enter the Student Marks Here: ");
        int marks = scan.nextInt();

        if(marks > 60 && marks <= 70){
            System.out.println("Grade -> C");
        }
        else if (marks > 70 && marks <= 80) {
            System.out.println("Grade -> B");
        }
        else if (marks > 80 && marks <= 90) {
            System.out.println("Grade -> A");
        }
        else if(marks > 90 && marks <= 100){
            System.out.println("Grade -> A+");
        }
        else {
            System.out.println("Fail try Again!!");
        }
    }
}
