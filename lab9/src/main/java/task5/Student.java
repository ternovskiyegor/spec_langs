package task5;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

public class Student implements Comparable<Student> {
    private String surname;
    private String group;
    private Map<String, Double> subjects = new HashMap<>();

    public Student(String surname, String group, String subject, double mark) {
        this.surname = surname;
        this.group = group;
        this.subjects.put(subject, mark);
    }

    public void addSubject(String subject, double mark) {
        this.subjects.put(subject, mark);
    }

    public String getSurname() {
        return surname;
    }

    public String getGroup() {
        return group;
    }

    public Collection<String> getSubjects() {
        return subjects.keySet();
    }

    @Override
    public int compareTo(Student student) {
        return surname.compareTo(student.getSurname());
    }

    @Override
    public String toString() {
        return "Student{" +
                "surname='" + surname + '\'' +
                ", group='" + group + '\'' +
                ", subjects=" + subjects +
                '}';
    }
}
