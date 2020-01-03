package rocks.zipcode.io.quiz4.collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.Spliterator;
import java.util.function.Consumer;

/**
 * @author leon on 11/12/2018.
 */
public class SimpleStringGroup implements Iterable<String> {


    ArrayList<String> simpleString = new ArrayList<>();
    public SimpleStringGroup() {

    }

    public Integer count() {

        return simpleString.size();
    }

    public void insert(String string) {
        simpleString.add(string);
    }

    public Boolean has(String string) {

        if(simpleString.contains(string)){
            return true;
        }

        return false;
    }

    public String fetch(int indexOfValue) {

        return simpleString.get(indexOfValue);
    }

    public void delete(String string) {
        simpleString.remove(string);
    }

    public void clear() {
        simpleString.clear();
    }

    @Override
    public Iterator<String> iterator() {
        return null;
    }

    @Override
    public void forEach(Consumer<? super String> action) {

    }

    @Override
    public Spliterator<String> spliterator() {
        return null;
    }
}
