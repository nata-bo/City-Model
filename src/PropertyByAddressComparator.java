import java.util.Comparator;

public class PropertyByAddressComparator implements Comparator<RealProperty> {

    @Override
    public int compare(RealProperty o1, RealProperty o2) {
        return o1.getAddress().compareTo(o2.getAddress());
    }
}
