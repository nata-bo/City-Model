public abstract class RealProperty {
   private final String cadastralNumber;
   private double price;
    Person owner;
    double area;

    public RealProperty(Person owner,String cadastralNumber, double area, double price) {
        this.cadastralNumber = cadastralNumber;
        this.price = price;
        this.owner = owner;
        this.area = area;
    }

    @Override
    public String toString() {
        return "RealProperty{" +
                "cadastralNumber='" + cadastralNumber + '\'' +
                ", owner=" + owner +
                ", area=" + area +
                ", price=" + price+
                '}';
    }
    public double getPropertyTax(){
        return price*0.001;
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
