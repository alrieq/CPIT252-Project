package cpit252.project;

public class Bread implements Items {
    String name = "Bread";
    private static double price = 2;
    Discount discountValue = Discount.getInstance();
    static int count = 0;

    public Bread() {
        if (count == 0)
            subscribe();
        count++;
    }

    private void subscribe() {
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
        this.price -= this.price * (discount/100);
    }
}
