package pl.comarch.it.akademia;

import java.util.Comparator;

public class PorownywaczPoImieniuRosnaco implements Comparator<Pet> {
    @Override
    public int compare(Pet o1, Pet o2) {
        return o1.name.compareTo(o2.name);
    }
}
