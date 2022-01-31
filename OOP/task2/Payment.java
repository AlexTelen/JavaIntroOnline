import java.util.ArrayList;
import java.util.List;
import java.util.StringJoiner;

public class Payment {
    private int id;
    private List<Product> products;
    private double bill;

    public Payment(int id) {
        this.id = id;
        this.bill = 0;
        this.products = new ArrayList<>();
    }

    public Payment(int id, List<Product> products) {
        this.id = id;
        this.products = products;
    }

    public static class Product {
        private String name;
        private int id;
        private double price;

        public Product(String name, int id, double price) {
            this.name = name;
            this.id = id;
            this.price = price;
        }

        @Override
        public String toString() {
            return new StringJoiner("  ")
                    .add("name = '" + name + "'")
                    .add("id = " + id)
                    .add("price = " + price)
                    .toString();
        }
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public List<Product> getProducts() {
        return products;
    }

    public void setProducts(List<Product> products) {
        this.products = products;
    }

    public double getBill() {
        return products.stream().mapToDouble(pr -> pr.price).sum();
    }

    public void addProduct(Product product) {
        products.add(product);
    }

    public void removeProduct(Product product) {
        products.remove(product);
    }
}
