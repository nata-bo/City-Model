public class Forest extends RealProperty {
    private final boolean isProtectedZone;

    public Forest(Person owner, String cadastralNumber, double area, double price, String address, boolean isProtectedZone) {
        super(owner, cadastralNumber, area, price, address);
        this.isProtectedZone = isProtectedZone;
    }

    @Override
    public String toString() {
        return "Forest{" +
                "isProtectedZone=" + isProtectedZone +
                "} " + super.toString();
    }

    @Override
    public double getPropertyTax() {
        if (isProtectedZone) {
            return 0;
        }
        return getPrice() * 0.0025;
    }

}
