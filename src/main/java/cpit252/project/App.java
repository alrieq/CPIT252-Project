package cpit252.project;

public class App 
{
    public static void main( String[] args )
    {
        SuperMarket s = new SuperMarket();
        s.addItems("Milk");
        s.addItems("cheese");
        
        s.setDiscount("KSA");
        s.addItems("Milk");
        s.addItems("Bread");
        s.addItems("Bread");
        s.addItems("Bread");
        s.addItems("cheese");
        s.sendOrder("Khalid", "Alnaseem, Mohammed Ibn Malukah St. Jeddah", "0554638495");
        
    }
}
