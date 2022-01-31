import java.util.StringJoiner;

public class Rose extends Flower {
    private int height;

    public Rose(String name, Color color) {
        super(name, color);
        cost = 5.25;
        height = 50;
    }

    @Override
    public String toString() {
        return new StringJoiner("\t")
                .add(super.toString())
                .add("height: " + height)
                .toString();
    }
}
