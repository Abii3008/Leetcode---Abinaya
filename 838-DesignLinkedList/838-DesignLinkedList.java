// Last updated: 11/08/2026, 16:07:50
import java.util.*;

class MyLinkedList {
    LinkedList<Integer> list;

    public MyLinkedList() {
        list = new LinkedList<>();
    }

    public int get(int index) {
        return (index < 0 || index >= list.size()) ? -1 : list.get(index);
    }

    public void addAtHead(int val) {
        list.addFirst(val);
    }

    public void addAtTail(int val) {
        list.addLast(val);
    }

    public void addAtIndex(int index, int val) {
        if (index >= 0 && index <= list.size())
            list.add(index, val);
    }

    public void deleteAtIndex(int index) {
        if (index >= 0 && index < list.size())
            list.remove(index);
    }
}