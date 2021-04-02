package Stream;

import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;


public class Cases<Collect> {
// COLLECT
// - список студентов заданного факультета;

    List<Students> students = DataOfStudents.getStudents();

    public List<Students> listOfFaculty() {
        return students.stream().filter(students -> students.getFaculty().contains("Math")).collect(Collectors.toList());
    }
}