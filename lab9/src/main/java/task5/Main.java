package task5;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.*;

public class Main {

    static final String PATH = "D:\\4 курс\\спецмови\\project\\lab9\\src\\main\\java\\task5\\marks.txt";

    public static void main(String[] args) {
        List<Student> students = new LinkedList<>();
        try (BufferedReader reader = new BufferedReader
                (new FileReader( PATH ))) {
            String line;
            while ((line = reader.readLine()) != null) {
                String [] data = line.split("\\s+");
                int idx = checkStudentExists(students, data[0]);
                if (idx < 0) {
                    students.add(new Student(data[0], data[1], data[2], Double.parseDouble(data[3])));
                    // відсортування за алфавітом
                    students.sort(new Comparator<Student>() {
                        @Override
                        public int compare(Student student1, Student student2) {
                            return student1.compareTo(student2);
                        }
                    });
                } else {
                    students.get(idx).addSubject(data[2], Double.parseDouble(data[3]));
                }
            }

        } catch (IOException e) {
            e.printStackTrace();
        }
        Set<String> courses = new TreeSet<>();
        for (Student student : students) {
            courses.addAll(student.getSubjects());
        }
        System.out.println("\nList of subjects: " + courses);

        Set<String> groups = new TreeSet<>();
        for (Student student : students) {
            groups.add(student.getGroup());
        }
        System.out.println("\nList of groups: " + groups);

        Iterator<Student> iterator = students.listIterator();
        System.out.println("\nStudent by groups [KB-41]:");
        while (iterator.hasNext()) {
            Student s = iterator.next();
            if (s.getGroup().equals("KB-41")) {
                System.out.println(s);
            }
        }

        System.out.println("\nStudent by subject java:");
        List<Student> temp = new ArrayList<>();
        iterator = students.listIterator();
        while (iterator.hasNext()) {
            Student s = iterator.next();
            if (s.getSubjects().contains("java")) {
                temp.add(s);
            }
        }
        System.out.println(temp);
    }

    public static int checkStudentExists(List<Student> students, String surname) {
        int idx = -1;
        for (Student student : students) {
            if (student.getSurname().equals(surname)) {
                return students.indexOf(student);
            }
        }
        return idx;
    }
}
