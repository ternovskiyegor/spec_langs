package task4;

public class Person {
    public String name;
    public int age;

    public Person() {
        this.name = "";
        this.age = 0;
    }

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public Person(Person someone) {
        this.name = someone.name;
        this.age = someone.age;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
