
import java.util.Scanner;

public class Baum {

  public static void main(String[] args) {

    try (Scanner sc = new Scanner(System.in)) {
      System.out.print("Enter the height of tree: ");
      int height = sc.nextInt();

      // Defining: a=Rows, b=stars, c=spaces
      int a;
      int b;
      int c;
      // creating a loop for rows
      for (a = 1; a <= height; a++) {

        // if first line (a==1) drawTip()
        // else draw leafRow() (stuff below)
        for (c = 1; c <= height - a; c++) {
          System.out.print(" ");
        }



        for (b = 1; b <= a; b++) {
          System.out.print("*");
        }

        for (b = 2; b <= a; b++) {
          System.out.print("*");
        }

        System.out.println();

      }

      // Creating if statement for trunk of tree when height <= 5
      if (height <= 5) {
        // Call space method
        drawSpaces(height);
        System.out.println("|");

        // Call it again
        drawSpaces(height);
        System.out.println("|");

      }

      // Creating if statement for trunk of tree when height <= 9
      if (height > 5) {

        drawSpaces(height);
        System.out.println("| |");
        drawSpaces(height);
        System.out.print("| |");
      }

    }

  }

  // Method that draws spaces depending on height

  private static void drawSpaces(int height) {

    if (height <= 5) {
      for (int i = 0; i < height - 1; i++) {
        System.out.print(" ");
      }
    } else {
      for (int i = 0; i < height - 2; i++) {
        System.out.print(" ");
      }
    }

  }

}