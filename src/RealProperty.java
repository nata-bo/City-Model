public abstract class RealProperty {
    private final String cadastralNumber;
    private double price;
    private Person owner;
    private double area;
    private final String address;


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

    public String getCadastralNumber() {
        return cadastralNumber;
    }

    public double getPrice() {
        return price;
    }

    public String getAddress() {
        return address;
    }
    public double getArea() {
        return area;
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


    public Person getOwner() {
        return owner;

    }
}
