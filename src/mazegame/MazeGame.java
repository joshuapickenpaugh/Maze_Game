/*
Joshua Pickenpaugh
Maze Game
December 4th, 2016
 */
package mazegame;
import java.util.Scanner;

public class MazeGame 
{

    public static void main(String[] args) {
        
        //Variables:
        int intUserChoice;
        int quit = 1;
        String player;
        
        //Size of the maze:
        final int ROWS = 10;
        final int COLS = 10;
        int[][] maze = new int [ROWS][COLS];         
        
        Inventory invtry = new Inventory();
                
        //create a Scanner object to read from the keyboard
	Scanner keyboard = new Scanner(System.in);      
        
        //Gets name of player:
        System.out.println("Enter your name: ");
        player = keyboard.nextLine();
        
        do
        {
            System.out.println("Choose an option:");
            System.out.println("_________________");
            System.out.println("1: View Inventory");
            System.out.println("9: QUIT");

            System.out.println();
            intUserChoice = keyboard.nextInt();     
            System.out.println();
            
            switch(intUserChoice)
            {
                case 1:
                    invtry.ViewInventory();
                    break;
                case 9:
                    quit = 0;
                    break;
                default:
                    System.out.println("Invalid key. Please make a selection...");
            }
            
        }while(quit == 1);
        
        System.out.println("Goodbye, " + player + ".");
    }
    
}
