package doublyLinkedList_2;

public class DoublyLinkedListHelper {

    Node head;

    public void addLast(int value) {
        Node toAdd = new Node(value);
        if(head == null) {
            head = toAdd;
        } else {
            Node temp = head;
            while(temp.next != null) {
                temp = temp.next;
            }
            temp.next = toAdd;
            toAdd.previous = temp;
        }
    }

    public void addFirst(int value) {
        Node toAdd = new Node(value);
        if(head == null) {
            head = toAdd;
        } else {
            head.previous = toAdd;
            toAdd.next = head;
            head = toAdd;
        }
    }

    public void printList() {
        Node temp = head;
        while(temp != null) {
            System.out.print(temp.data+" ");
            temp = temp.next;
        }
        System.out.println();
    }

    public int printLength() {
        Node temp = head;
        int length = 0;
        if(head == null) {
            return 0;
        }
        while(temp != null) {
            length++;
            temp = temp.next;
        }
        return length;
    }

    public void addAt(int position, int value) {
        Node toAdd = new Node(value);
        Node temp = head;
        Node prev = null;
        for(int i=0;i<position;i++) {
            prev = temp;
            temp = temp.next;
        }
        prev.next = toAdd;
        toAdd.previous = prev;
        toAdd.next = temp;
        temp.previous = toAdd;
    }

    public void deleteLast() {
        Node temp = head;
        Node prev = null;
        while(temp.next != null) {
            prev = temp;
            temp = temp.next;
        }
        prev.next = null;
        temp.previous = null;
    }

    public void deleteFirst() {
        Node temp = head;
        Node nextToHead = temp.next;
        nextToHead.previous = null;
        temp.next = null;
        head = nextToHead;
    }

    public int at(int position) {
        Node temp = head;
        for(int i=0;i<position;i++) {
            temp = temp.next;
        }
        return temp.data;
    }

    public boolean hasElement(int value) {
        boolean isTrue = false;
        for(int i=0;i<printLength();i++) {
            if(at(i) == value) {
                isTrue = true;
                break;
            }
        }
        return isTrue;
    }

    static class Node {
        int data;
        Node next;
        Node previous;
        public Node(int data) {
            this.data = data;
            next = null;
            previous = null;
        }
    }

}
