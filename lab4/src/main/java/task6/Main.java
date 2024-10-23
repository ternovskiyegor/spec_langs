package task6;

public class Main {
    public static void main(String[] args) {
        Animal cat = new Animal() {
            @Override
            public void makeSound() {
                System.out.println("Мяу-мяу!");
            }
        };

        Animal dog = new Animal() {
            @Override
            public void makeSound() {
                System.out.println("Гав-гав!");
            }
        };

        Animal pig = new Animal() {
            @Override
            public void makeSound() {
                System.out.println("Хрю-Хрю!");
            }
        };

        cat.makeSound();
        dog.makeSound();
        pig.makeSound();

        //  виклик методу анонімного класу без визначення локальної змінної
        new Animal() {
            @Override
            public void makeSound() {
                System.out.println("Мууу!!!");
            }
        }.makeSound();
    }
}
