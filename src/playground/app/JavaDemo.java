package playground.app;

import com.github.javafaker.Faker;

import java.util.ArrayList;
import java.util.IntSummaryStatistics;
import java.util.List;
import java.util.stream.Collectors;

/**
 * Created by henry on 4/15/17.
 */
public class JavaDemo {
    public static void main(String[] args) {
        Faker faker = new Faker();
        List<Student> students = new ArrayList<>();
        for (int i = 0; i < 100; i++) {
            Student student = new Student();
            student.id = i + 1;
            student.firstName = faker.name().firstName();
            student.lastName = faker.name().lastName();
            student.age = faker.number().numberBetween(6, 21);
            students.add(student);
        }
        IntSummaryStatistics summaryStatistics = students.stream().collect(Collectors.summarizingInt(s -> s.age));
        System.out.println(summaryStatistics);
    }
}

class Student {
    int id;
    String firstName;
    String lastName;
    int age;

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", age=" + age +
                '}';
    }
}