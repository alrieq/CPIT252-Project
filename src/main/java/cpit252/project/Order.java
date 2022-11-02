package cpit252.project;
import java.util.ArrayList;
import java.util.Random;
import java.time.LocalDate;

public class Order {
    private int orderNumber;
    public int getOrderNumber() {
        return orderNumber;
    }

    private LocalDate orderDate;
    private Logger log = Logger.getInstance();
    private ArrayList<Items> items = new ArrayList<>();
    private int getRandomNumber() {
        Random ran = new Random();
        return ran.nextInt(Integer.MAX_VALUE);
    }

    public Order() {
        // Emulate slow initialization.
        try {
            Thread.sleep(2000);
        } catch (InterruptedException ex) {
            ex.printStackTrace();
        }
        try {
            Thread.sleep(2000);
        } catch (InterruptedException ex) {
            ex.printStackTrace();
        }
        this.orderNumber = getRandomNumber();
        this.orderDate = LocalDate.now();
        log.info("A new order was created");
        log.info(this.toString());
    }
    
    public void addItems(Items item){
        items.add(item);
        String msg = item.getName() + " has been added to your Order and the price is " + item.getPrice();
        System.out.println(msg);
        log.info(msg);
    }

    public void removeItems(String itemName){

        for (int i = 0; i < items.size(); i++) {
            if(items.get(i).getName().equalsIgnoreCase(itemName)){
                items.remove(items.get(i));
                String msg = items.get(i).getName() + " has been removed from your Order";
                System.out.println(msg);
                log.info(msg);
            }
        }

    }

    public String toString() {
        return "Order info:\nOrder number: " + this.orderNumber +
                "\nDate" + this.orderDate;
    }
}