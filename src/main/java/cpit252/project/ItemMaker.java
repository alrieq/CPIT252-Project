package cpit252.project;

public class ItemMaker {
    public ItemMaker(){
        new Milk();
        new Cheese();
        new Bread();
    }
    public Items getItems(String itemName){ 
	    if(itemName == null){ 
		return null; } 

	if(itemName.equalsIgnoreCase("Milk")){ 
		return new Milk(); 

	} else if(itemName.equalsIgnoreCase("Cheese")){ 
		return new Cheese(); 
	} else if(itemName.equalsIgnoreCase("Bread")){
        return new Bread();
    }
	return null; 
      } 
}
