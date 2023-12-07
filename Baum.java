//Creating a Christmas tree with trunk and star with two dashes on top. 
//Height has to be defined by user. Plus when user gives other value than number, 
//let them know to enter a number. 

import java.util.Scanner;

public class Baum {

  private static Scanner _scanner;

  public static void main(String[] args){
      _scanner = new Scanner(System.in);
      boolean restart = false;
      do{
        printTree();
        restart = getUserContinueInput();
      }while(restart);
    }

  private static boolean getUserContinueInput() {
        // your code
        // ...
        // output: eingabe y/n
        // scanner -> get next
        // input == y -> restart should be true
        System.out.println();
        System.out.println("Continue? Yes or No?");
        
        String input = getNextUserInput();
        boolean isYes = input.equalsIgnoreCase("Yes") || input.equalsIgnoreCase("Y") || input.equalsIgnoreCase("Ja") || input.equalsIgnoreCase("J");
        return isYes;

        // return getNextUserInput() == "y";

  }

  private static String getNextUserInput(){
    return _scanner.next();
  }

  /*
   * public static - can be accessed from within the class as well as outside the class.
   * private static - can be accessed from within the class only.*/

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

  private static void printTree() {

    System.out.print("Enter the height of tree, it should contain numbers from 1 to 35: ");

    if (!_scanner.hasNextInt()) {
      _scanner.nextLine(); // clears the invalid input
      System.out.println();
      System.out.println("Please enter a number");
      return;
    }

    int height = _scanner.nextInt();

    if (height < 1 || height > 35) {

      System.out.println("Number is not between 1 and 35.");
      return;

    }

    // creating a loop for rows

    for (int rows = 0; rows < height; rows++) {

      if (rows == 0) {

        // SPECIAL LOGIC FOR FIRST ROW, ich muss dies codeblock benutzen, sonst -*- wird
        // on first row geprintet ohne leerzeichen
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
}