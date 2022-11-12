package cpit252.project;

public class Milk implements Items{
    String name = "Milk";
    private static double price = 7;
    Discount discountValue = Discount.getInstance();
    static int count =0;
    public  Milk(){
        if(count ==0)subscribe();
        count++;
    }
    private void subscribe(){
        discountValue.attach(this);

    }
    @Override
    public String getName() {
        // TODO Auto-generated method stub
        return name;
    }

    @Override
    public double getPrice() {
        // TODO Auto-generated method stub
        return price;
    }

    @Override
    public void update(double discount) {
        // TODO Auto-generated method stub
        this.price *= (discount/100);
    }
    
}
