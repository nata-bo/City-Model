import java.util.ArrayList;

public class Apartment extends RealProperty {
    private final int numberOfRoom;
    ArrayList<Person> residents;


    public Apartment(Person owner, String cadastralNumber, double area, double price,
                     String address, int numberOfRoom, ArrayList<Person> residents) {
        super(owner, cadastralNumber, area, price, address);
        this.numberOfRoom = numberOfRoom;
        this.residents = residents;
    }

    @Override
    public String toString() {
        return "Apartment{" +
                "numberOfRoom=" + numberOfRoom +
                ", residents=" + residents +
                "} " + super.toString();
    }

    @Override
    public double getPropertyTax() {
        return getPrice() * 0.004;
    }
}
