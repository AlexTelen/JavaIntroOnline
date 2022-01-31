import by.bemn.java_intro_online.lesson05_basics_of_oop.task4.dragon_cove.Cove;

import static by.bemn.java_intro_online.lesson05_basics_of_oop.task4.console.ConsoleHelper.*;

public class Menu {

    private Cove cove;

    public Menu(Cove cove) {
        this.cove = cove;
    }

    private void menu() {
        print("\n************ Dragon's cove ************");
        print("1. Показать все сокровища");
        print("2. Добавить новое сокровище");
        print("3. Удалить сокровище");
        print("4. Показать самое дорогое сокровище");
        print("5. Отсортировать по стоимости");
        print("6. Выбрать сокровища на заданную сумму");
        print("7. Выход");
        print("Выберете действие: ");
    }

    private void chosePoint() {
        switch (readInteger()) {
            case 1:
                view();
                break;
            case 2:
                addNewTreasure();
                break;
            case 3:
                print("Введите ID сокровища, которое нужно удалить:");
                removeTreasure(readInteger());
                break;
            case 4:
                selectTheMostExpensive();
                break;
            case 5:
                sort();
                break;
            case 6:
                print("Введите сумму, на которую необходимо выбрать сокровища:");
                choseTreasureForSum(readDouble());
                break;
            case 7:
                System.exit(0);
            default:
                print("Такого пункта меню нет! Попробуйте еще раз\n");

        }
    }

    private void sort() {
        cove.sortByCost().forEach(tr -> print(tr.toString()));
    }

    private void choseTreasureForSum(double sum) {
        cove.choseForSum(sum).forEach(tr -> print(tr.toString()));
    }

    private void view() {
        cove.getTreasures().forEach(tr -> print(tr.toString()));
    }

    private void addNewTreasure() {
        cove.addTreasure();
    }

    private void removeTreasure(int id) {
        cove.removeTreasure(id);
    }

    private void selectTheMostExpensive() {
        print(cove.getTheMostExpensive().toString());
    }

    public void run() {
        while (true) {
            menu();
            chosePoint();
        }
    }
}
