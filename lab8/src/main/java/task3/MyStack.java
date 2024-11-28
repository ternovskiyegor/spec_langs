package task3;

import java.util.ArrayList;
import java.util.Collection;
import java.util.EmptyStackException;
import java.util.List;

public class MyStack <T extends Number> {
    protected List<T> storage;

    public MyStack() {
        this.storage = new ArrayList<>();
    }

    public MyStack(MyStack<T> stack) {
        this.storage = new ArrayList<>( stack.storage );
    }

    public void push(T element) {
        this.storage.add(element);
    }

    public T pop() throws EmptyStackException {
        if (storage.isEmpty()) throw new EmptyStackException();
        return storage.removeLast();
    }

    @SuppressWarnings("unchecked")
    public void copy(MyStack<? extends Number> stack) {
        storage.addAll((Collection<? extends T>) stack.storage);
    }

    public void addAll(MyStack<? extends T> stack) {
        while ( !stack.storage.isEmpty()) {
            push( stack.pop() );
        }
    }

    public void moveAll(MyStack<? super T> stack) {
        while ( !storage.isEmpty() ) {
            stack.push( pop() );
        }
    }

    @Override
    public String toString() {
        return storage.toString();
    }

}
