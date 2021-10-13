package Polimofrizm;

public class Main {

    public interface Tuning {
        void increaseSpeed(int new_speed);
    }

    public static void main(String[] args)
    {
        int i;
        Pojazd[] pojazdy = new Pojazd[4];
        pojazdy[0] = new Pojazd(190, "Ferrari") {};
        pojazdy[1] = new Pojazd(120, "Maluch") {};
        pojazdy[2] = new Pojazd(250, "Lambo") {};
        pojazdy[3] = new Samochod(250 , "Fiesta", 2) {};
        System.out.println("Cars before tuning");
        for (i = 0 ; i < pojazdy.length; i++)
        {
            System.out.println(pojazdy[i].toString());
        }
        pojazdy[1].setSpeed(200);
        System.out.println(pojazdy[1].toString());
        Tuning pojazd_1 = (Tuning) pojazdy[3];
        pojazd_1.increaseSpeed(300);
        System.out.println("Cars after tuning");
        for (i = 0 ; i < pojazdy.length; i++)
        {
            System.out.println(pojazdy[i].toString());
        }

    }
}
