import java.util.Scanner;

/**
 * prints a box of stars based on the number provided by the user
 * @author Neil Fischer
 */
public class Main {

  /**
   * The method that is executed when you hit the run button.
   * @param args the command line arguments
   */
  public static void main(String[] args) {
    //Create scanner for user input 
    Scanner input = new Scanner(System.in); 

    //prompt the user to enter in a number between 1-10 and declare variable for user's number 
    System.out.println("Please enter a number between 1 and 10"); 
    int userNum = input.nextInt(); 

    //create nest loop for program 
    for(int count = 1; count <= userNum; count++){
      for(int count2 = 1; count2 <= userNum; count2++){
         System.out.print("*"); 
      }
      System.out.println();
    } 
    

    
  }
}
