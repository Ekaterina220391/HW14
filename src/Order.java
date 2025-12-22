import java.util.Arrays;
import java.util.Objects;

public class Order {
    public Product[] basket;
    public String custumer;
    int i=0;

    public Order(String custumer, Product[] basket) {
        this.custumer = custumer;
        this.basket = basket;

    }
    @Override
        public String toString() {
            return "Покупатель: " + this.custumer + Arrays.toString(basket) ;

        }
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        Order order = (Order) o;
        return custumer == order.custumer && Objects.equals(custumer, order.basket);
        for (int i = 0; i < basket.length; i++) {
            if (basket != null && basket.length > 0) {
            }
        }
    }
        @Override
        public boolean equals(Product o ) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        Product product = (Product) o;
        return id == product.id && Objects.equals(category, product.category);
          }

        }










    }








