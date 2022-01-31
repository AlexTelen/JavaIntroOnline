import java.io.IOException;

public class Menu {

    private Bouquet bouquet;

    public Menu() {
        bouquet = null;
    }

    public Menu(Bouquet bouquet) {
        this.bouquet = bouquet;
    }

    private void createBouquet() {
        print("Имя цветочной композиции: ");

        String nameBouquet = "";
        try {
            nameBouquet = readString();
        } catch (IOException e) {
        }
        bouquet = new Bouquet(nameBouquet);
    }

    private void menu() {
        print("\n************ Цветочная композиция ************");
        print("1. Выбрать/заменить упаковку");
        print("2. Добавить случайные цветы");
        print("3. Добавить цветы");
        print("4. Удалить цветы");
        print("5. Показать информацию о букете");
        print("6. Собрать новый букет");
        print("7. Выход");
        print("Выберете действие: ");
    }

    private void chosePoint() {
        switch (readInteger()) {
            case 1:
                chosePack();
                break;
            case 2:
                addRandomFlowers();
                break;
            case 3:
                addFlowers();
                break;
            case 4:
                removeFlowers();
                break;
            case 5:
                print(bouquet.toString());
                break;
            case 6:
                bouquet = null;
                break;
            case 7:
                System.exit(0);
            default:
                print("Такого пункта меню нет! Попробуйте еще раз\n");
        }
    }

    private void addRandomFlowers() {
        int countFlowers = getCountFlowers();
        for (int i = 0; i < countFlowers; i++) {
            bouquet.addNewRandomFlower();
        }

    }

    private void removeFlowers() {
        bouquet.removeFlowers();
    }

    private void addFlowers() {
        KindOfFlower kind = null;
        do {
            kind = enterKindOfFlower();
        } while (kind == null);

        int countFlowers = getCountFlowers();

        Color color = null;
        do {
            color = enterColorOfFlower();
        } while (color == null);

        for (int i = 0; i < countFlowers; i++) {
            bouquet.addNewFlower(FlowerCreator.getFlower(kind, color));
        }
    }

    private int getCountFlowers() {
        int countFlowers = 0;
        do {
            print("Введите количество цветов: ");
            countFlowers = readInteger();
        } while (countFlowers <= 0 || countFlowers > bouquet.getMaxCount());
        return countFlowers;
    }

    private Color enterColorOfFlower() {
        print("Укажите цвет цветов: ");

        Color color;
        String strColor = null;
        try {
            strColor = readString();
        } catch (IOException e) {
            e.printStackTrace();
        }

        if (strColor.matches(".*роз.*")) {
            color = Color.PINK;
        } else if (strColor.matches(".*красн.*")) {
            color = Color.RED;
        } else if (strColor.matches(".*бел.*")) {
            color = Color.WHITE;
        } else if (strColor.matches(".*жел.*")) {
            color = Color.YELLOW;
        } else if (strColor.matches(".*фио.*")) {
            color = Color.PURPLE;
        } else {
            return null;
        }
        return color;
    }

    private KindOfFlower enterKindOfFlower() {
        print("Укажите вид цветов: ");

        KindOfFlower kind;
        String strKindFlower = null;
        try {
            strKindFlower = readString();
        } catch (IOException e) {
            e.printStackTrace();
        }

        if (strKindFlower.matches(".*тюльпан.*")) {
            kind = KindOfFlower.TULIP;
        } else if (strKindFlower.matches(".*нарцис.*")) {
            kind = KindOfFlower.NARCISSUS;
        } else if (strKindFlower.matches(".*лили.*")) {
            kind = KindOfFlower.LILY;
        } else if (strKindFlower.matches(".*орх.*")) {
            kind = KindOfFlower.ORCHID;
        } else if (strKindFlower.matches(".*роз.*")) {
            kind = KindOfFlower.ROSE;
        } else {
            return null;
        }
        return kind;
    }

    private void chosePack() {
        print("1. Бумага\n" +
                "2. Целлофан\n" +
                "3. Корзина\n" +
                "Выберете тип упаковки: ");
        int num = -1;
        while (num == -1) {
            num = readInteger();
            if (num < 1 || num > KindOfPack.values().length) {
                num = -1;
            }
        }
        bouquet.setPack(PackCreator.getPack(KindOfPack.values()[num - 1]));
    }

    public void run() {
        while (true) {
            if (bouquet == null) {
                createBouquet();
            } else {
                menu();
                chosePoint();
            }
        }
    }
}
