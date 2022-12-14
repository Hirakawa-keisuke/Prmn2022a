package lecture02;

public class Car03 {
    int fuel;
    Tire[] tires;
    Engine engine;

    Car03(Tire[] tires, Engine engine){
        this.fuel = 0;
        this.tires = tires;
        this.engine = engine;
    }

    void run() {
        if (this.fuel > 0) {
            this.fuel -= 1;
            System.out.println("燃料を1消費して走りました。");
        } else {
            System.out.println("燃料が足りないため走れませんでした。");
        }
    }

    void startEngine(){
        this.engine.start();
    }
}
