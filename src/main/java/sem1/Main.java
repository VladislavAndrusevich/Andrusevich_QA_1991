package sem1;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        VendingMashine VM = new VendingMashine();
        Product Cappuccino = new Product("Cappuccino", 5.5);
        System.out.println(Cappuccino.name);
        VendingMashine VM1 = new VendingMashine();
        VM1.setProduct(List.of(new Product("Cookies", 3.65),new Product("Chocolate", 2.6),new Product("Coca-Cola", 2.3)));
        System.out.println(VM1.getProduct().toString());
        System.out.println("____________________________________");
        MachineCola cola = new MachineCola();
        cola.setProduct(List.of(new Product("Lemonade", 3.4)));
        System.out.println(cola.getProduct());
        System.out.println("____________________________________");
        MachineCoffee coffee1 = new MachineCoffee();
        coffee1.setProduct(List.of(new Coffee("Cappuccino", 56, 5.5),new Coffee("Latte", 45, 7.0),new Coffee("Espresso", 80, 4.3)));
        System.out.println(coffee1.getProduct());
        MachineCoffee coffee2 = new MachineCoffee();
        coffee2.setProduct(List.of(new Coffee("Raf", 56, 5.5),new Coffee("Ice Late", 45, 7.0),new Coffee("Mocachino", 80, 4.3)));
        System.out.println(coffee2.getProduct());
    }

}
