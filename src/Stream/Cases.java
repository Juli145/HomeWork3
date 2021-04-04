package Stream;

import java.util.*;
import java.util.stream.Collectors;

import static Stream.DataOfStudents.listOfStudents;


public class Cases<Collect> {

    public static List<Students> listByFaculty(String facultyName) {
        return listOfStudents.stream()
                .filter(s -> s.getFaculty().equals(facultyName))
                .collect(Collectors.toList());
    }

    public static void listByEachFacultyAndCourse() {

        Map<String, Map<String, List<Students>>> hashMap;

        hashMap = listOfStudents.stream()
                .collect(Collectors.groupingBy(Students::getFaculty,
                        Collectors.groupingBy(Students::getCourse)));

        Set<Map.Entry<String, Map<String, List<Students>>>> set = hashMap.entrySet();
        for (Map.Entry<String, Map<String, List<Students>>> me : set) {
            System.out.print(me.getKey() + ": ");
            System.out.println(me.getValue());
        }
    }

    public static List<Students> listByYearOfBirth(int birthYear) {
        return listOfStudents.stream()
                .filter(s -> s.getYearOfBirth() > birthYear)
                .collect(Collectors.toList());
    }

    public static List<Students> studentByYearOfBirth(int birthYear) {
        return listOfStudents.stream()
                .filter(s -> s.getYearOfBirth() > birthYear).limit(1)
                .collect(Collectors.toList());
    }

    public static List<String> groupList (String groupName) {
        return listOfStudents.stream()
                .filter(s -> s.getGroup().equals(groupName))
                .map(s -> s.getFirstName() + " " + s.getLastName())
                .collect(Collectors.toList());
    }

    public static long countByFaculty(String facultyName) {
        return listOfStudents.stream()
                .filter(s -> s.getFaculty().equals(facultyName))
                .count();
    }

    public static List<String> changeFaculty(String groupName, String newFacultyName){
        return  listOfStudents.stream()
                .filter(s -> s.getGroup().equals(groupName))
                .map(students -> students.setFaculty(newFacultyName))
                .collect(Collectors.toList());
    }

    public static List<String> changeGroup(String facultyName, String newGroupName){
        return  listOfStudents.stream()
                .filter(s -> s.getFaculty().equals(facultyName))
                .map(students -> students.setGroup(newGroupName))
                .collect(Collectors.toList());
    }

    // не работает
    public static void findStudent(String groupName) {
        Optional<Students> sd = listOfStudents.stream()
                .filter(s -> s.getGroup().equals(groupName))
                .findFirst();
        System.out.println(sd);
    }
}