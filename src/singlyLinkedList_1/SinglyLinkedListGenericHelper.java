package singlyLinkedList_1;

public class SinglyLinkedListGenericHelper<Type> {

    Node head = null;

    public void addLast(Type value) {
        Node toAdd = new Node(value);
        if(head == null) {
            head = toAdd;
        } else {
            Node temp = head;
            while(temp.next != null) {
                temp = temp.next;
            }
            temp.next = toAdd;
        }
    }

    public void addFirst(Type value) {
        Node toAdd = new Node(value);
        if (head != null) {
            toAdd.next = head;
        }
        head = toAdd;
    }

    public void addAt(int position, Type value) {
        Node toAdd = new Node(value);
        Node temp = head;
        Node prev = null;
        for(int i=0;i<position;i++) {
            prev = temp;
            temp = temp.next;
        }
        assert prev != null;
        prev.next = toAdd;
        toAdd.next = temp;
    }

    public void displayList() {
        Node temp = head;
        while(temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
        System.out.println();
    }

    public int displayLength() {
        int length = 0;
        Node temp = head;
        while(temp != null) {
            length++;
            temp = temp.next;
        }
        return length;
    }

    public void deleteLast() {
        Node temp = head;
        Node prev = null;
        while(temp.next != null) {
            prev = temp;
            temp = temp.next;
        }
        assert prev != null;
        prev.next = null;
    }

    public void deleteFirst() {
        Node first = head;
        Node second = first.next;
        first.next = null;
        head = second;
    }

    public void deleteAt(int position) {
        Node temp = head;
        Node prev = null;
        for(int i=0;i<position;i++) {
            prev = temp;
            temp = temp.next;
        }
        Node tempNext = temp.next;
        prev.next = tempNext;
        temp.next = null;
    }

    public Type at(int position) {
        Node temp = head;
        for(int i=0;i<position;i++) {
            temp = temp.next;
        }
        return temp.data;
    }

    public boolean hasElement(Type value) {
        boolean hasValue = false;
        for(int i=0;i<displayLength();i++) {
            if(at(i) == value) {
                hasValue = true;
                break;
            }
        }
        return hasValue;
    }

    class Node {
        Type data;
        Node next;
        public Node(Type data) {
            this.data = data;
            next = null;
        }
    }

}
