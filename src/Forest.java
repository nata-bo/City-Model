public class Forest extends RealProperty {
    private final boolean isProtectedZone;
    private int tree;

    public Forest(Person owner, String cadastralNumber, double area, double price, String address, boolean isProtectedZone) {
        super(owner, cadastralNumber, area, price, address);
        this.isProtectedZone = isProtectedZone;
        this.tree = 0;
    }

    @Override
    public String toString() {
        return "Forest{" +
                "isProtectedZone=" + isProtectedZone +
                ", tree="+tree+
                "} " + super.toString();
    }

    @Override
    public double getPropertyTax() {
        if (isProtectedZone) {
            return 0;
        }
        return getPrice() * 0.0025;
    }
    public void addTree(int tree){
        this.tree+=tree;
    }

    public void removeTree(int tree){
        if (this.tree>=tree){
            this.tree-=tree;
        }else{
         this.tree=0;
        }

    }

    public int getTree() {
        return tree;
    }

    public void setTree(int tree) {
        this.tree = tree;
    }
}
