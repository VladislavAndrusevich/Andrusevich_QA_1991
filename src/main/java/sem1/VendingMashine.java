package sem1;

import java.util.ArrayList;
import java.util.List;

public class VendingMashine {
    List<Product> listProduct = new ArrayList();

    public List<Product> getProduct() {
        return listProduct;
    }

    public void setProduct(List<Product> listProduct) {
        this.listProduct = listProduct;
    }

    @Override
    public String toString() {
        return "VendingMashine{" +
                "listProduct=" + listProduct +
                '}';
    }
}


