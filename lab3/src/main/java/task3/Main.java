package task3;

public class Main {
    public static void main(String[] args) {
        TestClass testClass = new TestClass("Tom", 65);
        System.out.println("Name: " + testClass.name);
        // System.out.println("Age: " + testClass.age); // --> NO ACCESS
    }
}
