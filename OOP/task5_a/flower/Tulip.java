import java.util.StringJoiner;

public class Tulip extends Flower {
    private int height;

    public Tulip(String value, Color color) {
        super(value, color);
        cost = 1.25;
        height = 30;
    }

    @Override
    public String toString() {
        return new StringJoiner("\t")
                .add(super.toString())
                .add("height: " + height)
                .toString();
    }
}
