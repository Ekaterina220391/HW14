//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Product product1 = new Product(123456, "iphone", 110000, "телефоны");
        Product product2 = new Product(123000, "iphone", 90000, "телефоны");
        Product product3 = new Product(123456, "iphone", 90000, "телефоны");
        Product product4 = new Product(123400, "samsung", 80000, "телефоны");
        Product product5 = new Product(123154, "samsung", 100000, "телефоны");
        System.out.println(product1.toString());
        System.out.println(product2.toString());
        System.out.println(product3.toString());
        System.out.println(product4.toString());
        System.out.println(product5.toString());
        System.out.println(product1.equals(product2));
        System.out.println(product1.equals(product3));
        System.out.println(product1.equals(product4));
        Product [] arrayProduct = { product1, product2,product3 };






    }
}
