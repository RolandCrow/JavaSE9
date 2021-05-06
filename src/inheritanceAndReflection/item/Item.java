package inheritanceAndReflection.item;

import java.util.Objects;

public class Item {
    private String description;
    private double prices;

    @Override
    public boolean equals(Object otherObject) {
        if (this == otherObject) return true;
        if (otherObject == null) return false;
        if(getClass() != otherObject.getClass()) return false;
        Item item = (Item) otherObject;
        return Objects.equals(description, ((Item) otherObject).description) && prices ==  ((Item) otherObject).prices; // сравнение
    }

    @Override
    public int hashCode() {
        return Objects.hash(description, prices);
    }
}
