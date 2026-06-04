import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        List<Student> students = new ArrayList<>();

        students.add(new Student(3L, "Cuong"));
        students.add(new Student(1L, "An"));
        students.add(new Student(2L, "Binh"));
        students.add(new Student(5L, "Dung"));


        System.out.println("===== LINEAR SEARCH =====");

        Student linearResult = Search.linearSearch(students, student -> student.getId().equals(3L));

        System.out.println(linearResult);

        System.out.println("\n===== BINARY SEARCH =====");

        students.sort(Comparator.comparing(Student::getId));

        Student binaryResult = Search.binarySearch(students, 3L);

        System.out.println(binaryResult);


    }
}