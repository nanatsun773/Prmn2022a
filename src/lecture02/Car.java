package lecture02;

public class Car {
    int fuel;
    Tire[] tires;
    Engine engine;

    public Car(Tire[] tires, Engine engine) {
        this.fuel = 0;
        this.tires = tires;
        this.engine = engine;
    }

    public void run() {
        if(fuel <= 0) {
            System.out.println("燃料が足りないため走れませんでした。");
        }else {
            System.out.println("燃料を1消費して走りました。");
            fuel-=1;
        }
    }

    public void startEngine() {
        engine.start();
    }
}
