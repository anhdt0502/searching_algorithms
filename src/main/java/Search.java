import java.util.List;
import java.util.function.Predicate;

public class Search {
    public static Student linearSearch(List<Student> students, Predicate<Student> predicate) {
        for (Student student : students) {
            if (predicate.test(student)) {
                return student;
            }
        }
        return null;
    }



    public static Student binarySearch(
            List<Student> students,
            Long targetId
    ) {

        int left = 0;

        int right = students.size() - 1;

        while (left <= right) {

            int mid = (left + right) / 2;

            Student midStudent = students.get(mid);

            if (midStudent.getId().equals(targetId)) {

                return midStudent;
            }

            if (midStudent.getId() < targetId) {

                left = mid + 1;

            } else {

                right = mid - 1;
            }
        }

        return null;
    }


}
