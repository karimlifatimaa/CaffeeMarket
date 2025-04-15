package cofeMarkedApp;

public class CoffeeProduct {
    private int id;
    private String name;
    private double price;

    public CoffeeProduct(int id, double price, String name) {
        this.id = id;
        this.price = price;
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public double getPrice() {
        return price;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", price=" + price ;
    }
}
