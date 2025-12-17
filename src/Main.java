//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Product phone1 = new Product(123456, "iphone", 11000, "телефоны");
        Product phone2 = new Product(123000, "iphone", 90000, "телефоны");
        Product phone3 = new Product(123456, "iphone", 90000, "телефоны");
        System.out.println(phone1.toString());
        System.out.println(phone2.toString());
        System.out.println(phone3.toString());


    }
}
