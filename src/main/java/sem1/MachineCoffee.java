package sem1;

import java.util.ArrayList;
import java.util.List;

public class MachineCoffee extends VendingMashine {
     @Override
    public List<Product> getProduct() {
        System.out.println("Напитки в автоматe MachineCoffee");
        return super.getProduct();
    }
}


