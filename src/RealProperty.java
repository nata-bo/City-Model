public abstract class RealProperty {
    private final String cadastralNumber;
    private double price;
    Person owner;
    private double area;
    private String address;


    public RealProperty(Person owner, String cadastralNumber, double area, double price,String address) {
        this.cadastralNumber = cadastralNumber;
        this.price = price;
        this.owner = owner;
        this.area = area;
        this.address = address;
    }

    @Override
    public String toString() {
        return "RealProperty{" +
                "cadastralNumber='" + cadastralNumber + '\'' +
                ", price=" + price +
                ", owner=" + owner +
                ", area=" + area +
                ", address='" + address + '\'' +
                '}';
    }

    public double getPropertyTax() {
        return price * 0.001;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public void setOwner(Person owner) {
        this.owner = owner;
    }

    public void setArea(double area) {
        this.area = area;
    }

    public double getArea() {
        return area;
    }

    public Person getOwner() {
        return owner;

    }
}
