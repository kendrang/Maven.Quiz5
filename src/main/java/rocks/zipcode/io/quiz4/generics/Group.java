package rocks.zipcode.io.quiz4.generics;

import java.util.ArrayList;
import java.util.Iterator;

/**
 * @author leon on 18/12/2018.
 */
public class Group<_> implements GroupInterface <_> {

    @Override
    public String toString() {
        return list.toString();
    }

    ArrayList<_> list = new ArrayList<>();

    public Group() {

    }

    public Integer count() {
        return list.size();
    }

    public void insert(_ value) {
        list.add(value);
    }

    public Boolean has(_ value) {
        return list.contains(value);
    }

    public _ fetch(int indexOfValue) {
        return list.get(indexOfValue);
    }

    public void delete(_ value) {
        list.remove(value);
    }

    public void clear() {
        list.clear();
    }

    public Iterator<_> iterator() {
        return list.iterator();
    }
}
