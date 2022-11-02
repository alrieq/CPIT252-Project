package cpit252.project;
import java.util.Random;

public class Shipment {
  private int trackingNumber;
  private String name;
  private String address;
  private String phoneNumber;
  private Logger log = Logger.getInstance();
  private Order order;
  private int getRandomNumber(){
    Random ran = new Random();
    return ran.nextInt(Integer.MAX_VALUE);
  }
  public Shipment(String name, String address, String phoneNumber,Order order){
    // Emulate slow initialization.
    try {
      Thread.sleep(2000);
    } catch (InterruptedException ex) {
      ex.printStackTrace();
    }
    this.order = order;
    this.trackingNumber = getRandomNumber();
    this.name = name;
    this.address = address;
    this.phoneNumber = phoneNumber;
    log.info("A new shipment was created for Order Number: " + this.order.getOrderNumber());
    log.info(this.toString());
  }
  public String toString(){
    return "Shipment info:\nTracking number: " + this.trackingNumber +
      "\nName " + this.name + "\nAddress: "+ this.address +
      "\nPhone: " + this.phoneNumber;
  }
}

