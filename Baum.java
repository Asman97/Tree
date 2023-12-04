import java.util.ArrayList;
import java.util.Scanner;

public class Baum{
    public static void main (String[] args) {
      try (Scanner sc = new Scanner(System.in)) {
        System.out.print("Enter the height of tree: ");  
        int height = sc.nextInt(); 

        /* Defining: a=Rows, b=stars, c=spaces */ 
        int a;
        int b;
        int c;
        /*creating a loop for rows */
            for(a=1; a<=height; a++){
              for(c=1; c<=height-a; c++){
                  System.out.print(" ");                
                }

            for(b=1; b<=a; b++){
                System.out.print("*");
              }

            for(b=2; b<=a; b++){
                System.out.print("*");  
            }
          
            System.out.println();

                /*Creating if statement for trunk of tree when height <= 5*/
                if(height<5){ 
                
                  System.out.println("|");
                  System.out.println("|");
                  
                }  

                /* Creating if statement for trunk of tree when height <= 9*/
                if(height<9 ){
                  System.out.println("| |");
                  System.out.print("| |");
                }
          
            }
      }

    }
}