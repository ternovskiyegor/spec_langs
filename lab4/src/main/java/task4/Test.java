package task4;

public class Test {

    private String test = "Hello Java!";
    private int a = 4;

    public void testVoid() {

        int b = 13;

        class LocalClass {
            // Спробуємо вивести поля зовнішнього класу
            public void printInfo() {
                System.out.println("Поле зовнішнього класу (test): " + test);
                System.out.println("Поле зовнішнього класу (a): " + a);

                System.out.println("Поле локального класу (b): " + b);
            }
        }

        LocalClass localClass = new LocalClass();
        localClass.printInfo();
    }

    public static void main(String[] args) {
        Test t = new Test();
        t.testVoid();
    }
}
