public class Hangar {
    public static void main(String[] args) {
        Car car = new Car("Ford", 12000);
        Boat boat = new Boat("Pardo", 800);

        System.out.println(car.doStuff());
        System.out.println(boat.doStuff());
    }
}
