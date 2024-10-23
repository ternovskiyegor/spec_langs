public class Main {

    public static void main(String[] args) {
        // task1
        Person person1 = new Person("Egor Ternovskyi", 20, 189);
        System.out.println(person1 + "\n");

        // task2
        ParamsClass paramsClass = new ParamsClass();
        paramsClass.setParamsArgs(1, 2.34, true, person1, "Hello");
        System.out.println();
        paramsClass.setParamsOblect(new Object[] {2, 8.41, false, person1, "Hello Java"});

    }
}
