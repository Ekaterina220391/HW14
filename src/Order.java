import java.util.Arrays;

public class Order {
    public Product[] basket;
    public String custumer;

    public Order(String custumer, Product[] basket) {
        this.custumer = custumer;
        this.basket =  Product [basket.length];
        @Override
        public String toString() {
            return "Покупатель" + this.custumer + Arrays.toString(basket);
        }


    }

}






