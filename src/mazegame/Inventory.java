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
        
    }
    
    public void DropItemToInventory()
    {
        
    }
   
}
