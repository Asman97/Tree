//Creating a Christmas tree with trunk and star with two dashes on top. 
//Height has to be defined by user. Plus when user gives other value than number, 
//let them know to enter a number. 

import java.util.Scanner;

public class Baum {

  public static void main(String[] args) {

    try (Scanner sc = new Scanner(System.in)) {
      System.out.print("Enter the height of tree: ");
      int height = sc.nextInt();

      // creating a loop for rows

      for (int rows = 0; rows < height; rows++) {

        if (rows == 0) {

          // SPECIAL LOGIC FOR FIRST ROW
          for (int i = 0; i < height - 1; i++) {
            System.out.print(" ");
          }
          System.out.print("-*-");

        }
        // LOGIC FOR THE REST OF ROWS & COLUMNS
        else {

          for (int spaces = 1; spaces <= height - rows; spaces++) {
            System.out.print(" ");
          }

          // In previous code I did one column of stars and on the other side I just
          // mirrored it. This time I created stars with one "for loop"
          for (int stars = 0; stars < rows * 2 + 1; stars++) {
            System.out.print("*");
          }
        }
        // ln for new line so it prints the stars in columns not in one row
        System.out.println();

      }

      // Creating if statement for trunk of tree when height <= 5
      if (height <= 5) {
        // Calling the space method for "|" sign
        drawSpaces(height);
        System.out.println("|");

        // Call it again for second "|"
        drawSpaces(height);
        System.out.println("|");

      }

      // Creating if statement for trunk of tree when height <= 9
      if (height > 5) {
        // Calling the space method for "| |" sign
        drawSpaces(height);
        System.out.println("| |");

        // Call it again for second "| |"

        drawSpaces(height);
        System.out.print("| |");
      }

    }
    // Code to handle errors
    catch (Exception e) {
      System.out.println("Please enter a number");
    }

  }

  // Method that draws spaces depending on height

  private static void drawSpaces(int height) {

    if (height <= 5) {
      for (int spaces = 0; spaces < height; spaces++) {
        System.out.print(" ");
      }
    } else {
      for (int spaces = 0; spaces < height - 1; spaces++) {
        System.out.print(" ");
      }
    }

  }

}