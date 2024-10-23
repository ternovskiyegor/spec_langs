package task4;

public class Main {

    public static void main(String[] args) {
        Person person1 = new Person();
        System.out.println("(Person 1) Name: " + person1.name + " Age: " + person1.age);

        Person person2 = new Person("John", 22);
        System.out.println("(Person 2) Name: " + person2.name + " Age: " + person2.age);

        Person person3 = new Person("Egor", 20);
        Person person4 = new Person(person3);
        System.out.println("(Person 4) Name: " + person4.name + " Age: " + person4.age);
    }
}
