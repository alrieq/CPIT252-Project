package cpit252.project;

import java.util.ArrayList;

public class Discount {
    private double discount;
    private ArrayList<Items> observers = new ArrayList<>();
    public double getDiscount() {return discount;}
    private static Discount instance=null;
    public void setDiscount(double discount) { 
		this.discount = discount; 
		notifyAllObservers(); } 
    private Discount(){
        
    }
	public void attach(Items observer){ 
		observers.add(observer); }
	 
	public void notifyAllObservers(){ 
		for (Items observer : observers) { 
			observer.update(); } 
          }
    public static Discount getInstance(){
        if(instance == null){
            instance = new Discount();
        }
        return instance;
    }
}
