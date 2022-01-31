public abstract class Flower {
    protected String name;
    protected Color color;
    protected double cost;

    protected Flower(String name, Color color) {
        this.name = name;
        this.color = color;
        this.cost = 0;
    }

    public double getCost() {
        return cost;
    }

    @Override
    public String toString() {
        return String.format("\t%-15s\tcolor: %-15s\tcost: %3.2f", name, color.getValue(), cost);
    }
}
