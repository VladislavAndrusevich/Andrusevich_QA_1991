package sem1;

import java.util.List;

public class MachineCola extends VendingMashine {
    @Override
    public void setProduct(List<Product> listProduct) {
        super.setProduct(listProduct);
        System.out.println("Напиток принят в автомат MachineCola");
    }
}
