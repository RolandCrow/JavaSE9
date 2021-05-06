package inheritanceAndReflection.item;

import java.util.Objects;

public class DiscountItem extends Item {

    private double discount;

    public boolean equals(Object otherObject) {
        if(!super.equals(otherObject)) return false;
        DiscountItem other = (DiscountItem) otherObject;
        return discount == other.discount;

    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), discount);
    }
}
