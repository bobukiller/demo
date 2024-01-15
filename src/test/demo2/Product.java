package test.demo2;

public class Product {
    private String id;
    private String name;
    private double price;
    private int remain;

    public Product() {
    }

    public Product(String id, String name, double price, int remain) {
        this.id = id;
        this.name = name;
        this.price = price;
        this.remain = remain;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getRemain() {
        return remain;
    }

    public void setRemain(int remain) {
        this.remain = remain;
    }
}
