package threads.parkhaus;

public class Parking {
    public static void main(String... args) {
        ParkingGarage counter = new ParkingGarage();
        for (int j = 0; j < 10; j++) {
            new Car(counter, j).start();
        }
    }
}
