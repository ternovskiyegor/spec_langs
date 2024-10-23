package task3;

// Зовнішній клас
public class Test {

    private static int a = 1;
    public String field = "Поле зовнішнього класу";

    public void void1 () {
        System.out.println("Метод зовнішнього класу");
    }

    public class Test2 {
        public void mainClassTest2 () {
            System.out.println("Виконання методу у внутрішньому класі.");
            void1();
            System.out.println(field);
        }
    }

    public static class Test3 {
        public void mainClassTest3 () {
            System.out.println("Значення поля а (зовнішнього класу): " + a);
        }
    }

    public static void main(String[] args) {
        Test test = new Test();

        // Можна створити лише через екземпляр зовнішнього класу
        Test2 test2 = test.new Test2();
        test2.mainClassTest2();

        Test3 test3 = new Test3();
        test3.mainClassTest3();
    }

}
