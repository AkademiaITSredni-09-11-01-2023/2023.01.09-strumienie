package pl.comarch.it.akademia;

import java.util.Comparator;

public class PorownywaczPoWiekuMalejaco implements Comparator<Pet> {
    @Override
    public int compare(Pet o1, Pet o2) {
        return o2.age - o1.age;
    }
}
