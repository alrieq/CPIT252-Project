package cpit252.project;

public class Cheese implements Items {

        String name = "Cheese";
        private static double price = 2;
        Discount discountValue = Discount.getInstance();
        static int  count =0;
        public  Cheese(){
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
        public void update() {
            // TODO Auto-generated method stub
            this.price *= (discountValue.getDiscount()/100);
        }
    
}
