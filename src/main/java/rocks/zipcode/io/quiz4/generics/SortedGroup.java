package rocks.zipcode.io.quiz4.generics;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Set;
import java.util.TreeSet;

/**
 * @author leon on 18/12/2018.
 */
public class SortedGroup<_> extends Group<_> {

    ArrayList<_> sorted = new ArrayList<>();
    public SortedGroup() {

    }

    @Override
    public void insert(_ value) {
        sorted.add(value);

    }

    @Override
    public void delete(_ value) {
        sorted.remove(value);
    }

    public Integer indexOf(_ value) {
        return sorted.indexOf(value);
    }
}
