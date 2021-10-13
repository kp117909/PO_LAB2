package Polimofrizm;

public abstract class Pojazd {
    public int speed = 0;
    public String model = "noknown";

    public Pojazd() {
            speed = 0 ;
            model = new String();
    }

    public Pojazd(int speed, String model)
    {
        if(speed >= 0)
        this.speed = speed;
        else this.speed = 0;
        this.model = model;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }
    @Override
    public String toString()
    {
        return getModel() + " o prędkości: " + getSpeed() + " Km/h";
    }

}
