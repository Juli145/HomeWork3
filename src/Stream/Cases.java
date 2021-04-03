package Stream;

import java.util.Arrays;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;


public class Cases<Collect> {

    DataOfStudents data = new DataOfStudents();

    // COLLECT
    // - список студентов заданного факультета;

    public List<Students> listOfFaculty() {
        Stream<Students> stream = Arrays.stream(data.getStudents());
        return stream.filter(s -> s.getFaculty().equals("Math"))
                .collect(Collectors.toList());
    }

    // списки студентов для каждого факультета и курса;
    public Set<List> studentsForEachFacultyAndCourse(){

        return null;
    }
}