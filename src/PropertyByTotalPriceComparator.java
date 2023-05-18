import java.util.Comparator;

public class PropertyByTotalPriceComparator implements Comparator<RealProperty> {

    @Override
    public int compare(RealProperty o1, RealProperty o2) {
        return Double.compare(o1.getPrice()+o1.getPropertyTax(), o2.getPrice()+o2.getPropertyTax());
    }
}
