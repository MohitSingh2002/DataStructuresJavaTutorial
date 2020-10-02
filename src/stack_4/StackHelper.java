package stack_4;

public class StackHelper {

    Node top = null;
    int length = 0;

    public void push(int value) {
        Node toAdd = new Node(value);
        toAdd.next = top;
        top = toAdd;
        length++;
    }

    public void displayList() {
        Node temp = top;
        while(temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
        System.out.println();
    }

    public void pop() {
        top = top.next;
        length--;
    }

    public int peek() {
        Node temp = top;
        top = top.next;
        return temp.data;
    }

    public int displayLength() {
        return length;
    }

    public boolean isEmpty() {
        return (length == 0);
    }

    static class Node {
        int data;
        Node next;
        public Node(int data) {
            this.data = data;
            next = null;
        }
    }

}
