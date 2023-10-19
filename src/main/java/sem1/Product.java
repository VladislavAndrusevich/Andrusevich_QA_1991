package sem1;

public class Product {
    String name;
    double cost;

    public Product(String name, double cost) {
        this.name=name;
        this.cost=cost;
    }

    public Product(double cost) {
        this.cost=cost;
    }

    public String getName(String name) {
        return name;
    }

    public double getCost(double cost) {
        return cost;
    }

    @Override
    public String toString() {
        return "Product{" +
                "name='" + name + '\'' +
                ", cost=" + cost +
                '}';
    }
}
