package pl.comarch.it.akademia.optional;

import java.util.function.Function;

public class Funkcja implements Function<Integer, Integer> {
    @Override
    public Integer apply(Integer integer) {
        return integer * 5;
    }
}
