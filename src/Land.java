public class Land extends RealProperty {
    private final Purpose purpose;

    public Land(Person owner, String cadastralNumber, double area, double price, Purpose purpose) {
        super(owner, cadastralNumber, area, price);
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

}
