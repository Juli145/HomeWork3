package Stream;

import org.junit.jupiter.api.*;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import static Stream.Cases.*;
import static Stream.Cases.listByEachFacultyAndCourse;
import static Stream.DataOfStudents.*;


public class CasesTest {

    ArrayList<Students> arrayList= new ArrayList<>();

    @BeforeAll
    static void setUp(){
        addStudents();
    }

    @Test
    public void test_getFaculty(){
        arrayList.add(STUDENT1);
        arrayList.add(STUDENT10);
        List<Students> actual = listByFaculty("Math");
        List<Students> expected = arrayList;
        Assertions.assertEquals(actual, expected);
    }

    @Test
    public void test_listByEachFacultyAndCourse(){
        arrayList.add(STUDENT1);
        arrayList.add(STUDENT10);
        arrayList.add(STUDENT2);
        arrayList.add(STUDENT7);
        arrayList.add(STUDENT3);
        arrayList.add(STUDENT4);
        arrayList.add(STUDENT8);
        arrayList.add(STUDENT5);
        arrayList.add(STUDENT6);
        arrayList.add(STUDENT9);
        ByteArrayOutputStream output = new ByteArrayOutputStream();
        System.setOut(new PrintStream(output));
        listByEachFacultyAndCourse();
        Assertions.assertEquals("Economy: {1=[Student{id: 5, firstName: Tom, lastName: Ork, yearOfBirth: 1999, address: bom str, telephone: +380555, faculty: Economy, course: 1, group: ECO-4}, Student{id: 9, firstName: Greg, lastName: Tyle, yearOfBirth: 1999, address: typer str, telephone: +380999, faculty: Economy, course: 1, group: ECO-4}], 2=[Student{id: 6, firstName: Michal, lastName: Woun, yearOfBirth: 1998, address: pourt str, telephone: +380666, faculty: Economy, course: 2, group: ECO-4}]}\r\n" +
                "Math: {2=[Student{id: 1, firstName: Alex, lastName: Rint, yearOfBirth: 2003, address: local str, telephone: +380111, faculty: Math, course: 2, group: MAT-1}, Student{id: 10, firstName: Daniel, lastName: Noun, yearOfBirth: 1998, address: wonel str, telephone: +3801212, faculty: Math, course: 2, group: MAT-1}]}\r\n" +
                "Philosophy: {2=[Student{id: 4, firstName: Oliver, lastName: Pent, yearOfBirth: 2003, address: low str, telephone: +380444, faculty: Philosophy, course: 2, group: PHIl-6}], 3=[Student{id: 3, firstName: John, lastName: Mill, yearOfBirth: 1997, address: wew str, telephone: +380333, faculty: Philosophy, course: 3, group: PHIl-6}, Student{id: 8, firstName: Nick, lastName: Clue, yearOfBirth: 1997, address: koup str, telephone: +380888, faculty: Philosophy, course: 3, group: PHIl-6}]}\r\n" +
                "Historical: {1=[Student{id: 2, firstName: Pedro, lastName: Hock, yearOfBirth: 1999, address: birg str, telephone: +380222, faculty: Historical, course: 1, group: HIS-2}], 3=[Student{id: 7, firstName: Robert, lastName: Brin, yearOfBirth: 2005, address: treel str, telephone: +380777, faculty: Historical, course: 3, group: HIS-2}]}", output.toString().trim());
        System.setOut(null);
    }

    @Test
    public void test_listByYearOfBirth(){
        arrayList.add(STUDENT1);
        arrayList.add(STUDENT4);
        arrayList.add(STUDENT7);
        List<Students> actual = listByYearOfBirth(2000);
        List<Students> expected = arrayList;
        Assertions.assertEquals(actual, expected);
    }

    @Test
    public void test_studentByYearOfBirth(){
        arrayList.add(STUDENT1);
        List<Students> actual = studentByYearOfBirth(2000);
        List<Students> expected = arrayList;
        Assertions.assertEquals(actual, expected);
    }

    @Test
    public void test_groupList() {
        List <String> expected = new ArrayList<>();
        expected.add("John Mill");
        expected.add("Oliver Pent");
        expected.add("Nick Clue");
        List<String> actual = groupList("PHIl-6");
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void test_amountOfStudents() {
        int expected = 3;
        int actual = (int) countByFaculty("Economy");
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void test_changeFaculty() {
        List<String> actual = changeFaculty("HIS-2", "Music");
        Assertions.assertEquals("Music", STUDENT2.getFaculty());
        Assertions.assertEquals("Music", STUDENT7.getFaculty());
    }

    @Test
    public void test_changeGroup() {
        List<String> actual = changeGroup("Philosophy", "MUS-7");
        Assertions.assertEquals("MUS-7", STUDENT3.getGroup());
        Assertions.assertEquals("MUS-7", STUDENT4.getGroup());
    }

    // не работает
    @Test
    public void test_findStudent () {
        ByteArrayOutputStream output = new ByteArrayOutputStream();
        System.setOut(new PrintStream(output));
        findStudent("Philosophy");
        Assertions.assertEquals("Optional[Student{id: 104, firstName: Карина, lastName: Щавлинская, yearOfBirth: 1998, address: Шевченка 2, telephone: 0669265481, faculty: Химический, course: 5-й, group: Хим-52}]", output.toString().trim());
        System.setOut(null);
    }
}
