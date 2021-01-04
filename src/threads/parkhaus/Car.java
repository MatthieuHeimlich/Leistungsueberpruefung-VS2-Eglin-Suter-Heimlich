package threads.parkhaus;

public class Car extends Thread {
    ParkingGarage auto;
    private int autoName = 0;

    Car(ParkingGarage auto, int autoName) {
        this.auto = auto;
        this.autoName = autoName;
    }

    public int getAutoName() {
        return (autoName);
    }

    public void run() {
        while (true) {
            try {
                Thread.sleep((long) (Math.random() * (10000)));
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

            auto.enter(getAutoName());
            //System.out.println("Auto " + getAutoName() + ": eingefahren.");

            try {
                Thread.sleep((long) (Math.random() * (10000)));
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

            auto.leave(getAutoName());

            //System.out.println("Auto " + getAutoName() + ": ausgefahren.");
        }
    }
}

