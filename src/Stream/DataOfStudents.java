package Stream;

import java.util.List;


public class DataOfStudents {
     static List<Students> getStudents() {
        return List.of(
                new Students(1, "Alex", "Rint", 1998, "local str", "+380111", "Math", "2", "MAT-1"),
                new Students(2, "Pedro", "Hock", 1999, "birg str", "+380222", "Historical", "1", "HIS-2"),
                new Students(3, "John", "Mill", 1997, "wew str", "+380333", "Physical", "3", "PHIS-3"),
                new Students(4, "Oliver", "Pent", 1998, "low str", "+380444", "Philosophy", "2", "PHIl-6"),
                new Students(5, "Tom", "Ork", 1999, "bom str", "+380555", "Economy", "1", "ECO-4"),
                new Students(6, "Michal", "Woun", 1998, "pourt str", "+380666", "Literature", "2", "LIT-5"),
                new Students(7, "Robert", "Brin", 1997, "treel str", "+380777", "Historical", "3", "HIS-2"),
                new Students(8, "Nick", "Clue", 1997, "koup str", "+380888", "Philosophy", "3", "PHIS-3"),
                new Students(9, "Greg", "Tyle", 1999, "typer str", "+380999", "Economy", "1", "ECO-4"),
                new Students(10, "Daniel", "Noun", 1998, "wonel str", "+3801212", "Math", "2", "MAT-1")
                );
    }
}

//    public static Set<Students> SET_STUDENTS = Set.of(STUDENT1,STUDENT2, STUDENT3, STUDENT4, STUDENT5, STUDENT6, STUDENT7, STUDENT8, STUDENT9, STUDENT10);
//


