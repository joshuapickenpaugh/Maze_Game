package mazegame;

public class Inventory 
{
    //Array to hold 3 items in inventory:
    static int[] inventory = new int[3];    
    
    public static void ViewInventory()
    {
        for(int x = 0; x < inventory.length; x++)
        {
            System.out.println(inventory[x]);
        }
    }
}
