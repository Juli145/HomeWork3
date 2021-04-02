package Collections;

import java.util.LinkedList;

public class LList1 implements IList {

    int size;
    Node head;

    public static class Node {
        Object data;
        Node next;
    }

    @Override
    public void clear() {
    }

    @Override
    public int size() {
        return size;
    }

    // не работает
    @Override
    public int get(int index){
        Node node = new Node();
        Node tempNode = head;
        while(tempNode.next != null){
            for (int i = 1; i == index; i++) {
                tempNode = node;
            }
            break;
        }
        System.out.println(tempNode.data);
        return 0;
    }

    @Override
    public boolean add (int value) {
        Node node = new Node();
        node.data = value;
        node.next = null;
        if (head == null) {
            head = node;
        } else {
            Node tempNode = head;
            while (tempNode.next != null) {
                tempNode = tempNode.next;
            }
            tempNode.next = node;
        }
        size++;
        return true;
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
        Node tempNode = head;
        boolean result = false;
        while (tempNode.next != null) {
            if((Integer) tempNode.data == value) {
                result = true;
            } break;
        } return result;
    }

    @Override
    public boolean set(int index, int value) {
        return false;
    }

    @Override
    public void print() {
        Node tempNode = head;
        while (tempNode.next != null) {
            System.out.println(tempNode.data);
            tempNode = tempNode.next;
        }
        System.out.println(tempNode.data);
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
