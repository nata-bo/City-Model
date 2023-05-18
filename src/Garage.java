public class Garage extends RealProperty {
    public final int numberOfParkingSpaces;

    public Garage(Person owner, String cadastralNumber, double area, double price, int numberOfParkingSpaces) {
        super(owner, cadastralNumber, area, price);
        this.numberOfParkingSpaces = numberOfParkingSpaces;
    }

    @Override
    public String toString() {
        return "Garage{" +
                "numberOfParkingSpaces=" + numberOfParkingSpaces +
                "} " + super.toString();
    }
}
