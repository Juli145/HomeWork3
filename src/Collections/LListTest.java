package Collections;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class LListTest {
    LList1 lList1 = new LList1();

    @BeforeEach
    public void setUp(){
        lList1.clear();
        lList1.add(1);
        lList1.add(2);
        lList1.add(3);
        lList1.add(4);
        lList1.add(5);
    }

    @Test
    public void test_add(){
        int[] expected = {1, 2, 3, 4, 5};
        int[] actual = lList1.toArray();
        Assertions.assertArrayEquals(actual, expected);
    }

    @Test
    public void test_clear() {
        lList1.clear();
        int[] expected = {};
        int[] actual = lList1.toArray();
        Assertions.assertArrayEquals(actual, expected);
    }

    @Test
    public void test_size(){
        int expected = 5;
        int actual = lList1.size();
        Assertions.assertEquals(actual, expected);
    }

    @Test
    public void test_get(){
        int expected = 3;
        int actual = lList1.get(3);
        Assertions.assertEquals(actual, expected);
    }

    @Test
    public void test_addByIndex(){
        lList1.add(4, 25);
        int[] expected = {1, 2, 3, 4, 25, 5};
        int[] actual = lList1.toArray();
        Assertions.assertArrayEquals(actual, expected);
    }

//    @Test
//    public void test_remove(){
//        lList1.remove(4);
//        int[] expected = {1, 2, 3, 5};
//        int[] actual = lList1.toArray();
//        Assertions.assertArrayEquals(actual, expected);
//    }

//    @Test
//    public void test_removeByIndex(){
//        lList1.removeByIndex(2);
//        int[] expected = {1, 3, 4, 5};
//        int[] actual = lList1.toArray();
//        Assertions.assertArrayEquals(actual, expected);
//    }

    @Test
    public void test_containsTrue(){
        boolean actual = lList1.contains(3);
        Assertions.assertTrue(actual);
    }

    @Test
    public void test_containsFalse(){
        boolean actual = lList1.contains(34);
        Assertions.assertFalse(actual);
    }

    @Test
    public void test_set(){
        lList1.set(2, 100);
        int[] expected = {1, 100, 3, 4, 5};
        int[] actual = lList1.toArray();
        Assertions.assertArrayEquals(actual, expected);
    }

    @Test
    public void test_print(){
    }

    @Test
    public void test_toArray(){
    }

    @Test
    public void test_removeAll(){
    }
}

