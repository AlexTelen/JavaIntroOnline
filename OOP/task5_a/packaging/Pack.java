import java.util.StringJoiner;

public abstract class Pack {
    private String material;
    private int size;
    private double cost;

    public Pack(String material, int size, double cost) {
        this.material = material;
        this.size = size;
        this.cost = cost;
    }

    public String getMaterial() {
        return material;
    }

    public void setMaterial(String material) {
        this.material = material;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public double getCost() {
        return cost;
    }

    public void setCost(double cost) {
        this.cost = cost;
    }

    @Override
    public String toString() {
        return new StringJoiner("\t")
                .add("material: " + material)
                .add("size: " + size)
                .add("cost: " + cost)
                .toString();
    }
}
