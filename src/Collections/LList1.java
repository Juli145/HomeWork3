package Collections;

import java.util.LinkedList;

public class LList1 implements IList {

     public LList1(){
         int capacity = 10;
     }

    LinkedList<String> list = new LinkedList<String>();

    @Override
    public void clear() {

    }

    @Override
    public int size() {
        return 0;
    }

    @Override
    public int get(int index) {
        return 0;
    }

    @Override
    public boolean add(int value) {
        return false;
    }

    @Override
    public boolean add(int index, int value) {
        return false;
    }

    @Override
    public int remove(int number) {
        return 0;
    }

    @Override
    public int removeByIndex(int index) {
        return 0;
    }

    @Override
    public boolean contains(int value) {
        return false;
    }

    @Override
    public boolean set(int index, int value) {
        return false;
    }

    @Override
    public void print() {

    }

    @Override
    public int[] toArray() {
        return new int[0];
    }

    @Override
    public boolean removeAll(int[] ar) {
        return false;
    }
}
