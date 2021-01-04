package threads.parkhaus;

public class ParkingGarage {
    private int autoCount = 0;
    public final static int AUTOLIMIT = 10;

    synchronized void enter(int name) {
        if (autoCount < AUTOLIMIT) {
            autoCount++;
            System.out.println(autoCount + "Auto " + name + ": eingefahren.");
        }
        if (autoCount > AUTOLIMIT) {
            System.out.println("Zu viel Autos im Parking: " + autoCount);
        }
    }

    synchronized void leave(int name) {
        if (autoCount > 0) {
            autoCount--;
            System.out.println(autoCount + "Auto " + name + ": ausgefahren.");
        }
        if (autoCount < 0) {
            System.out.println("Zu wenig Autos im Parking: " + autoCount);
        }
    }
}
