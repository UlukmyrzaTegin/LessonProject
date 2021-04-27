package less_19_Set_HashSet_LinkedHashSet_TreeSet.homeWorkHashSet;

import java.util.Comparator;

/**
 * TheSusanin
 * 27 апрель 2021
 */
public class AnimalHashSet{
    private int price;

    public AnimalHashSet(int price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "AnimalHashSet{" +
                ", price=" + price +
                '}';
    }

    static class ComparatorByPrice implements Comparator {
        @Override
        public int compare(Object o1, Object o2) {
            return ((AnimalHashSet) o1).price - ((AnimalHashSet) o2).price;
        }
    }
}
