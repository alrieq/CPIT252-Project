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
    public void setDiscount(double value){
        Discount discount = Discount.getInstance();
        discount.setDiscount(value);
    }
}
