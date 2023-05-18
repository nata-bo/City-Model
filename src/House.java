import java.util.ArrayList;

public class House extends RealProperty {
    private final int numberOfFloors;
    ArrayList<Person> residents;


    public House(Person owner, String cadastralNumber, double area, double price,
                 int numberOfFloors, ArrayList<Person> residents) {
        super(owner, cadastralNumber, area, price);
        this.numberOfFloors = numberOfFloors;
        this.residents = residents;
    }

    @Override
    public String toString() {
        return "House{" +
                "numberOfFloors=" + numberOfFloors +
                ", residents=" + residents +
                "} " + super.toString();
    }

    @Override
    public double getPropertyTax() {
        return getPrice() * 0.003;
    }
}
