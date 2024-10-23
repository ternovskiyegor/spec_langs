public class Person {
    public String name;
    public int age;
    public double height;

    public Person(String name, int age, double height) {
        this.name = name;
        this.age = age;
        this.height = height;
    }

    @Override
    public String toString() {
        return "Name: " + name + "; age: " + age + "; height: " + height;
    }
}
