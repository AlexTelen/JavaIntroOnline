import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.StringJoiner;

public class Bouquet {
    private static int count = 1;
    public static final int MAX_COUNT = 100;

    private String name;
    private List<Flower> flowers;
    private Pack pack;

    public Bouquet(String name) {
        if (!name.isEmpty() && name != null) {
            this.name = name;
        } else {
            this.name = "Bouquet #" + String.valueOf(count++);
        }
        flowers = new ArrayList<>();
        pack = null;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void addNewFlower(Flower flower) {
        flowers.add(flower);
    }

    public void addNewRandomFlower() {
        int numberKind = new Random().nextInt(KindOfFlower.values().length);
        int numberColor = new Random().nextInt(Color.values().length);

        Flower flower = FlowerCreator.getFlower(KindOfFlower.values()[numberKind], Color.values()[numberColor]);

        flowers.add(flower);
    }

    public void removeFlowers() {
        flowers = new ArrayList<>();
    }

    public void setPack(Pack pack) {
        this.pack = pack;
    }

    public double getCost() {
        double costFlowers = flowers.stream().mapToDouble(f -> f.getCost()).sum();
        double costPack = pack != null ? pack.getCost() : 0;
        double cost = costFlowers + costPack;
        return cost;
    }

    public int getMaxCount() {
        return MAX_COUNT - flowers.size();
    }

    @Override
    public String toString() {
        StringBuffer stringBuffer = new StringBuffer();
        flowers.forEach(fl -> stringBuffer.append(fl + "\n"));

        return new StringJoiner("")
                .add("'" + name + "'\n")
                .add("Flowers:\n" + stringBuffer.toString())
                .add("Pack:\t" + (pack != null ? pack.toString() : " "))
                .add("\n")
                .add("Cost:\t" + getCost() + "\n")
                .toString();
    }
}
