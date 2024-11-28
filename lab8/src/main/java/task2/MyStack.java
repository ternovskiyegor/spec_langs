package task2;

import java.util.Arrays;
import java.util.EmptyStackException;
import java.util.Objects;

public class MyStack <E extends Comparable<E>> implements Comparable<MyStack<E>> {
    protected E [] storage;
    private int capacity = 16;
    protected int size = 0;

    @SuppressWarnings("unchecked")
    public MyStack() {
        storage = (E []) new Comparable [ capacity ];
    }

    @SuppressWarnings("unchecked")
    public MyStack(int capacity) {
        this.capacity = capacity;
        storage = (E []) new Comparable [ capacity ];
    }

    @SuppressWarnings("unchecked")
    public MyStack(MyStack<E> stack) {
        this.size = stack.size;
        this.capacity = stack.capacity;
        storage = (E []) new Comparable [ capacity ];
        copy(stack);
    }

    public boolean isEmpty() {
        return size == 0;
    }

    public void push(E element) {
        checkCapacity();
        size++;
        storage[size - 1] = element;
    }

    private void checkCapacity() {
        if (size + 1 > capacity) {
            this.capacity *= 2;
            storage = Arrays.copyOf(storage, capacity);
        }
    }

    public E pop() throws EmptyStackException {
        if ( isEmpty() ) throw new EmptyStackException();
        E element = storage[size- 1];
        storage[size - 1] = null;
        size--;
        return element;
    }

    public void copy(MyStack<E> stack) {
        for (int i = 0; i < stack.size; i++) {
            checkCapacity();
            push(stack.storage[i]);
        }
    }

    public int getCapacity() {
        return capacity;
    }

    public int getSize() {
        return size;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("[");
        for (int i = 0; i < size; i++) {
            sb.append(storage[i]);
            if (i + 1 < size) {
                sb.append(", ");
            }
        }
        sb.append("]");
        return sb.toString();
    }

    /**
     * Метод порівнює стеки між собою. Стек більше, якщо в ньому більше елементів; якщо однаково - елементи
     * порівнюються, починаючи з крайнього вміщеного, результат для стека - compareTo для першого елемента,
     * що відрізняється від нуля; в іншому випадку стеки рівні
     * @param o обьект для порідняння.
     * @return
     */
    @Override
    public int compareTo(MyStack<E> o) {
        if (size > o.size) {
            return 1;
        } else if (size < o.size) {
            return -1;
        }
        for (int i = size - 1; i >= 0; i--) {
            int comparison = storage[i].compareTo(o.storage[i]);
            if (comparison != 0) {
                return comparison;
            }
        }
        return 0;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        MyStack<?> myStack = (MyStack<?>) o;
        return capacity == myStack.capacity && size == myStack.size && Objects.deepEquals(storage, myStack.storage);
    }

    @Override
    public int hashCode() {
        return Objects.hash(Arrays.hashCode(storage), capacity, size);
    }
}
