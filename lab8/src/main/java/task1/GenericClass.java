package task1;

public class GenericClass <T extends Comparable<T>> implements Comparable<GenericClass<T>> {
    T t1, t2, t3;

    public GenericClass(T t1, T t2, T t3) {
        this.t1 = t1;
        this.t2 = t2;
        this.t3 = t3;
    }

    @Override
    public int compareTo(GenericClass<T> t) {
        int compare1 = t1.compareTo(t.t1);
        int compare2 = t2.compareTo(t.t2);
        int compare3 = t3.compareTo(t.t3);

        return (compare1 + compare2 + compare3) / 3;
    }
}
