package sem1;

public class Coffee extends Product {
    int temp;

    public Coffee(String name, int temp, double cost) {
        super(name, cost);
        this.temp=temp;
    }

    @Override
    public String toString() {
        return "Coffee{" +
                "name='" + name +
                ", temp=" + temp +
                ", cost=" + cost +
                '}';
    }
}
