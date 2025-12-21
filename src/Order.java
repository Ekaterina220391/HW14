import java.util.Arrays;
import java.util.Objects;

public class Order {
    public Product[] basket;
    public String custumer;

    public Order(String custumer, Product[] basket) {
        this.custumer = custumer;
        this.basket = basket;

    }
        public String toString() {
            return "Покупатель: " + this.custumer + this.basket;

        }
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        Order order = (Order) o;
        return basket == order.basket && Objects.equals(custumer, order.basket);
    }




    }








