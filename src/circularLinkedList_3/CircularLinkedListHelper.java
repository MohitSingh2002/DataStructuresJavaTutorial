package circularLinkedList_3;

public class CircularLinkedListHelper {

    Node last = null;
    int length = 0;

    public void addLast(int value) {
        Node toAdd = new Node(value);
        if (last == null) {
            last = toAdd;
            last.next = last;
        } else {
            toAdd.next = last.next;
            last.next = toAdd;
            last = toAdd;
        }
        length++;
    }

    public void addFirst(int value) {
        Node toAdd = new Node(value);
        if(last == null) {
            last = toAdd;
        } else {
            toAdd.next = last.next;
        }
        last.next = toAdd;
        length++;
    }

    public void displayList() {
        Node first = last.next;
        while(first != last) {
            System.out.print(first.data + " ");
            first = first.next;
        }
        System.out.print(first.data + " ");
        System.out.println();
    }

    public int displayLength() {
        return length;
    }

    static class Node {
        int data;
        Node next;
        Node(int data) {
            this.data = data;
            next = null;
        }
    }

}
