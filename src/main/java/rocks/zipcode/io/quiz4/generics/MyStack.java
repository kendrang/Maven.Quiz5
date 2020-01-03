package rocks.zipcode.io.quiz4.generics;

import java.util.EmptyStackException;
import java.util.Iterator;
import java.util.Spliterator;
import java.util.Stack;
import java.util.function.Consumer;

/**
 * @author leon on 11/12/2018.
 */
public class MyStack<SomeType> implements Iterable {

    Stack s = new Stack<>();
    public MyStack() {

    }

    public Boolean isEmpty() {
        return s.isEmpty();
    }

    public void push(SomeType i) {
        s.push(i);
    }

    public SomeType peek() {
        if(s.isEmpty()){
            return null;
        }
        return (SomeType) s.peek();
    }

    public SomeType pop() {
        if(s.isEmpty()){
            throw new EmptyStackException();
        }
        else{
        return (SomeType) s.pop();
        }
    }

    @Override
    public Iterator iterator() {
        return null;
    }

    @Override
    public void forEach(Consumer action) {

    }

    @Override
    public Spliterator spliterator() {
        return null;
    }
}
