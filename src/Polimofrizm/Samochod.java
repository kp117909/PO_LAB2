package Polimofrizm;
import Polimofrizm.Main.Tuning;

abstract class Samochod extends Pojazd implements Tuning {
    private int doorcount;

    public Samochod() {
        super();
    }

    @Override
    public int getSpeed() {
        return super.getSpeed();
    }

    @Override
    public void setSpeed(int speed) {
        super.setSpeed(speed);
    }

    @Override
    public String getModel() {
        return super.getModel();
    }

    @Override
    public void setModel(String model) {
        super.setModel(model);
    }

    @Override
    public String toString() {
        return "Samochód " + super.toString() +  " o liczbie drzwi równej " + this.doorcount;
    }

    public Samochod(int speed, String model, int doorcount) {
        super(speed, model);
        if(doorcount > 0)
        this.doorcount = doorcount;
        else
        this.doorcount = 0;
    }

    @Override
    public void increaseSpeed(int new_speed) {
        if (new_speed > 0)
            speed = new_speed;
        else
            speed = 0;
    }
}
