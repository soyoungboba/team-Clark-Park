/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.Hogwarts.model;

/**
 *
 * @author Cody
 */

    
    
/**
 *
 * @author boba
 */
public enum ItemType{
    Wand("Tool 1", 50),
    Invisibility_cloak("Tool 2", 50),
    Broomstick("Tool 3", 50),
    Gillyweed("Tool 4", 50);
    
    // class instance variables
   
    private String discription;
    private double quantityInStock;

ItemType(String inventoryType, double quantityInStock) {
    this.discription = inventoryType;
    this.quantityInStock = quantityInStock;
}

  
    //created array(list) of items
    /*Item[] items = new Item[4];
    
    Item wand = new Item();
    wand.setDescription("Wand");
    wand.setInventoryType(inventoryType);
    wand.setQuantityInStock(0);
    items[Item.wand.ordinal()] = wand;
   
    
    Item invisibility cloak  = new Item();
    invisibility_cloak.setDescription("Invisibility cloak");
    invisibility_cloak.setInventoryType(inventoryType);
    items[1] = invisibility_cloak;
    
    Item  = new Item();
    broomstick.setDescription("Broomstick");
    broomstick.setInventoryType(inventoryType);
    broomstick.setQuantityInStock(0);
    items[2] = broomstick;
    
    Item  = new Item();
    gillyweed.setDescription("Gillyweed");
    gillyweed.setInventoryType(inventoryType);
    gillyweed.setQuantityInStock(0);
    items[3] = gillyweed;
}*/

    public String getInventoryType() {
        return discription;
    }

    public double getQuantityInStock() {
        return quantityInStock;
    }
}
