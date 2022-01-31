import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Cave {

    private List<Treasure> treasures;
    private static final int COUNT_TREASURES = 100;

    public Cave() {
        treasures = new ArrayList<>();
        for (int i = 0; i < COUNT_TREASURES; i++) {
            treasures.add(CreateTreasure.create());
        }
    }

    public List<Treasure> getTreasures() {
        return treasures;
    }

    public boolean addTreasure() {
        if (treasures.size() < COUNT_TREASURES) {
            treasures.add(CreateTreasure.create());
            return true;
        } else {
            print("В пещере нет свободного места! Удалите одно сокровище.");
            return false;
        }
    }

    public boolean removeTreasure(int id) {
        Treasure treasure = null;
        for (Treasure t : treasures) {
            if (t.getId() == id) {
                treasure = t;
            }
        }
        if (treasure != null) {
            return treasures.remove(treasure);
        } else {
            print("Такого сакровища нет в пещере");
            return false;
        }
    }

    public Treasure getTheMostExpensive() {
        double temp = 0.0;
        Treasure treasure = null;

        for (Treasure t : treasures) {

            if (t.getCost() > temp) {
                treasure = t;
                temp = t.getCost();
            }
        }
        return treasure;
    }

    public List<Treasure> choseForSum(double sum) {
        List<Treasure> treasureList = new ArrayList<>();
        double tempTotalSum = 0.0;

        List<Treasure> list = sortByCost();

        for (int i = list.size() - 1; i >= 0; i--) {
            double costCurrentTreasure = list.get(i).getCost();

            if (sum - tempTotalSum >= costCurrentTreasure) {
                tempTotalSum += costCurrentTreasure;
                treasureList.add(list.get(i));
            }
        }
        return treasureList;
    }

    public List<Treasure> sortByCost() {
        List<Treasure> list = new ArrayList<>();
        list.addAll(treasures);

        list.sort(new Comparator<Treasure>() {
            @Override
            public int compare(Treasure o1, Treasure o2) {
                return Double.compare(o1.getCost(), o2.getCost());
            }
        });
        return list;
    }
}
