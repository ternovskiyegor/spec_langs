package task3;

import java.io.*;

public class Main {

    public static void main(String[] args) {

        long num = 158134523545431343L;
        double pi = Math.PI;
        String str = "Україна is a beautiful country located in Eastern Europe. Столиця of Ukraine - Киів.";
        Person p1 = new Person("Vasil", 23, 189.5);
        Person p2 = new Person("Maria", 18, 169.3);
        try (DataOutputStream out = new DataOutputStream
                (new BufferedOutputStream(
                        new FileOutputStream("lab6/src/main/java/task3/binaryFile.dat")))) {
            out.writeLong(num);
            out.writeDouble(pi);
            out.writeUTF(str);
            // write object 1
            out.writeUTF(p1.name);
            out.writeInt(p1.age);
            out.writeDouble(p1.height);
            // write object 2
            out.writeUTF(p2.name);
            out.writeInt(p2.age);
            out.writeDouble(p2.height);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        try (DataInputStream in = new DataInputStream(
                new BufferedInputStream(
                        new FileInputStream("lab6/src/main/java/task3/binaryFile.dat"))
                )
        ) {
            long l = in.readLong();
            double d = in.readDouble();
            String s = in.readUTF();

            System.out.println("L = " + l);
            System.out.println("d = " + d);
            System.out.println("s = " + s);

            System.out.println("\nPerson 1 info:");
            System.out.println("name: " + in.readUTF());
            System.out.println("age: " + in.readInt());
            System.out.println("height: " + in.readDouble());

            System.out.println("\nPerson 2 info:");
            System.out.println("name: " + in.readUTF());
            System.out.println("age: " + in.readInt());
            System.out.println("height: " + in.readDouble());

        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
