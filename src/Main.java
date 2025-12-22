//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Product product1 = new Product(123456, "iphone", 11000, "телефоны");
        Product product2 = new Product(123000, "iphone", 90000, "телефоны");
        Product product3 = new Product(123456, "iphone", 90000, "телефоны");
        System.out.println(product1.toString());
        System.out.println(product2.toString());
        System.out.println(product3.toString());
        System.out.println(product1.equals(product2));
        Product [] arrayProduct = { product1, product2,product3 };
        Order basket1 = new Order(" Покупатель1 ",arrayProduct);
        System.out.println(lenght);




    }
}
