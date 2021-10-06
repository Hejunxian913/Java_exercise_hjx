package basic;

import java.util.Scanner;

public class PlateNumber {

  public static void main(String[] args) {
    /*int number = (int) (Math.random() * 10000);
    String zimu = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
    int zimunumber1 = (int) (Math.random() * 26);
    int zimunumber2 = (int) (Math.random() * 26);
    int zimunumber3 = (int) (Math.random() * 26);

    char zimu1 = zimu.charAt(zimunumber1);
    char zimu2 = zimu.charAt(zimunumber2);
    char zimu3 = zimu.charAt(zimunumber3);

    String plate = (zimu1 + "  " + zimu2 + "  " + zimu3 + "  " + number);

    System.out.println(plate);*/
    Scanner input = new Scanner(System.in);

    // Prompt the user to enter the number of students
    System.out.print("Enter the number of students: ");
    int numberOfStudents = input.nextInt();

    int score,          // Holds students' score
        highest = 0,      // Highest score
        secondHigest = 0;  // Second highest score
    String name = "",    // Holds students' name
        student1 = "",  // Highest scoring student name
        student2 = "";  // Second highest scoring student name

    // Prompt the user to enter each students' name and score
    System.out.println("Enter each students' name and score:");
    for (int i = 0; i < numberOfStudents; i++) {
      System.out.print(
          "Student: " + (i + 1) + "\n   Name: ");
      name = input.next();
      System.out.print("   Score: ");
      score = input.nextInt();

      if (i == 0) {
        // Make the first student the highest scoring student so far
        highest = score;
        student1 = name;
      } else if (i == 1 && score > highest) {
        // Second student entered scored
        // higher than first student
        secondHigest = highest;
        highest = score;
        student2 = student1;
        student1 = name;
      } else if (i == 1) {
        // Second student entered scored
        // lower than first student
        secondHigest = score;
        student2 = name;
      } else if (i > 1 && score > highest && score > secondHigest) {
        // Last student entered has the highest score
        secondHigest = highest;
        student2 = student1;
        highest = score;
        student1 = name;
      } else if (i > 1 && score > secondHigest) {
        // Last student entered has the second highest score
        student2 = name;
        secondHigest = score;
      }
    }

    // Display the student with the hightest score
    // and the student with the second-hightest score.
    System.out.println(
        "Higest scoring student: " + student1 +
            "\nSecond Higest scoring student: " + student2);


  }

}
