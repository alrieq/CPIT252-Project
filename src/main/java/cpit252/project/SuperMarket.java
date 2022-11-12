package cpit252.project;


public class SuperMarket {
    ItemMaker maker;
    Order order;
    public SuperMarket(){
        order = new Order();
        maker = new ItemMaker();
    }
    public void addItems(String itemName){
        Items item = maker.getItems(itemName);
        order.addItems(item);
    }
    public void removeItem(String itemName){
        order.removeItems(itemName);
    }
    public void sendOrder(String name, String address, String phoneNumber){
        Shipment shipOrder = new Shipment(name, address, phoneNumber,order);
    }
    public void setDiscount(String disName){
        Discount discount = Discount.getInstance();
        if(disName.equalsIgnoreCase("KSA"))
        discount.setDiscount(30);
        else if(disName.equalsIgnoreCase("KAU"))
        discount.setDiscount(15);
        
    }
}
