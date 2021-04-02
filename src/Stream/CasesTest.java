package Stream;

import org.junit.jupiter.api.Test;

import java.util.List;


public class CasesTest {

    Cases cases = new Cases();

    @Test
    public void test_getFaculty(){
        List<Students> expected = cases.listOfFaculty();
        System.out.println(cases.listOfFaculty());
    }
}
