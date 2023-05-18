import java.util.ArrayList;

public class Land extends RealProperty {
    private final Purpose purpose;
    ArrayList<House> houses = new ArrayList<>();

    public Land(Person owner, String cadastralNumber, double area, double price, String address, Purpose purpose) {
        super(owner, cadastralNumber, area, price, address);
        this.purpose = purpose;
    }


    @Override
    public String toString() {
        return "Land{" +
                "purpose=" + purpose +
                "} " + super.toString();
    }

    @Override
    public double getPropertyTax() {
        return switch (purpose) {
            case AGRICULTURAL -> getPrice() * 0.002;
            case SETTLEMENT -> getPrice() * 0.003;
            case INDUSTRIAL -> getPrice() * 0.005;
        };
    }

    public Purpose getPurpose() {
        return purpose;
    }

    public void addHouse(House house){
        houses.add(house);
    }



}
