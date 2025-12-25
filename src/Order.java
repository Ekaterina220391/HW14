import java.util.Arrays;
import java.util.Objects;

public class Order {
    public Product[] basket;
    public String custumer;


    public Order(String custumer, Product[] basket) {
        this.custumer = custumer;
        this.basket = basket;
    }
    @Override
    public String toString() {
        return "Покупатель: " + this.custumer + Arrays.toString(basket);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if(o ==null|| getClass() !=o.getClass()) {
        return false;
    }

    Order order = (Order) o;

            if(!Objects.equals(custumer,order.custumer))return false;
            if(basket ==null&&order.basket ==null)return true;
            if(basket ==null||order.basket ==null)return false;
            if(basket.length !=order.basket.length)return false;

        for(int i = 0; i<basket.length;i++) {
        if (basket[i] == null && order.basket[i] != null) return false;
        if (!basket[i].equals(order.basket[i])) return false;
    }
        return true;
    }
}

























