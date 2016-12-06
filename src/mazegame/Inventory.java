package mazegame;

public class Inventory 
{
    //Array to hold 3 items in inventory:
    private String[] inventory = new String[3];
    
    public void ViewInventory()
    {
        for(int x = 0; x < inventory.length; x++)
        {
            System.out.println(inventory[x]);
        }
 
    }
    
    public void AddItemToInventory()
    {
        if (inventory.length > 4)
        {
            System.out.println("You already have the maximum 3 items.");
        }
        else
        {
            //if picked up an item, then add it to the inventory:
        }
    }
    
    public void DropItemToInventory()
    {
        if (inventory.length < 0)
        {
            System.out.println("You don't have any items in your invemtory to drop.");
        }
        else
        {
            //Go to a specific item in the inventory, and drop it:
        }
    }
   
}
