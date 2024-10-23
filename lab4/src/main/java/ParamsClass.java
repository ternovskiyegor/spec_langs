public class ParamsClass {
    public int a;
    public double b;
    public boolean c;
    public Person person;
    public String string;

    // метод з завданням параметрів через масив object[]
    public void setParamsOblect(Object [] oblect) {
        for (Object o : oblect) {
            System.out.println("Type: " + o.getClass().getSimpleName() + " Value: " + o);
        }
    }

    public void setParamsArgs(Object ...args) {
        for (Object o : args) {
            System.out.println("Type: " + o.getClass().getSimpleName() + " Value: " + o);
        }
    }
}
