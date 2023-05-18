public class Garage extends RealProperty {
    public final int numberOfParkingSpaces;


    public Garage(Person owner, String cadastralNumber, double area,
                  double price, String address, int numberOfParkingSpaces) {
        super(owner, cadastralNumber, area, price, address);
        this.numberOfParkingSpaces = numberOfParkingSpaces;
    }

    @Override
    public String toString() {
        return "Garage{" +
                "numberOfParkingSpaces=" + numberOfParkingSpaces +
                "} " + super.toString();
    }
}
