public class Treasure {

    private int id;
    private Jewel type;
    private double cost;

    public Treasure(int id, Jewel type, double cost) {
        this.id = id;
        this.type = type;
        this.cost = cost;
    }

    public Jewel getType() {
        return type;
    }

    public double getCost() {
        return cost;
    }

    public int getId() {
        return id;
    }

    @Override
    public String toString() {
        return String.format("ID: %-5d%-10s\t\tcost: %5.2f", id, type, cost);
    }
}
