/**
 * 2. Создать объект класса Автомобиль,
 * используя классы Колесо, Двигатель.
 * Методы: ехать, заправляться, менять
 * колесо, вывести на консоль марку
 * автомобиля.
 */

class Wheel {
    private boolean isOkay;

    public boolean getIsOkay() {
        return isOkay;
    }

    public void setIsOkay(boolean isOkay) {
        this.isOkay = isOkay;
    }

    public Wheel(boolean isOkay) {
        this.isOkay = isOkay;
    }
}

class Engine {
    private boolean enoughFuel;

    public boolean getEnoughFuel() {
        return enoughFuel;
    }

    public void setEnoughFuel(boolean enoughFuel) {
        this.enoughFuel = enoughFuel;
    }

    public Engine(boolean enoughFuel) {
        this.enoughFuel = enoughFuel;
    }
}

class Auto {
    private Wheel[] wheels;
    private Engine engine;
    private String mark;

    public void drive() {
        for (Wheel wheel : this.wheels) {
            if (!wheel.getIsOkay()) {
                changeWheel(wheel);
            }
        }
        if (!this.engine.getEnoughFuel())
            fuel();

    }

    public void fuel() {
        this.engine.setEnoughFuel(true);
        System.out.println("The engine has been fueled");
    }

    public void changeWheel(Wheel wheel) {
        wheel.setIsOkay(true);
        System.out.println("The wheel has been changed");
    }

    public void showMark() {
        System.out.println(mark);
    }

    public Auto(String mark, Engine engine, Wheel[] wheels) {
        this.mark = mark;
        this.engine = engine;
        this.wheels = wheels;
    }

    public void setWheels(Wheel[] wheels) {
        this.wheels = wheels;
    }

    public Wheel[] getWheels() {
        return wheels;
    }

    public void setEngine(Engine engine) {
        this.engine = engine;
    }

    public Engine getEngine() {
        return engine;
    }

    public void setMark(String mark) {
        this.mark = mark;
    }
}


public class AggComp2 {

    public static void main(String[] args) {
        Engine engine1 = new Engine(true);
        Wheel[] wheels1 = {new Wheel(true), new Wheel(true), new Wheel(true), new Wheel(true)};
        Auto auto1 = new Auto("Audi", engine1, wheels1);

        auto1.getWheels()[0].setIsOkay(false);
        auto1.getWheels()[3].setIsOkay(false);

        auto1.getEngine().setEnoughFuel(false);

        auto1.drive();

        auto1.showMark();
    }

}
