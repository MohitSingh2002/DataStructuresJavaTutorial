package stack_4;

public class StackHelperGeneric<Type> {

    Node top = null;
    int length = 0;

    public void push(Type value) {
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

    public int displayLength() {
        return length;
    }

    public void pop() {
        top = top.next;
        length--;
    }

    public Type peek() {
        return top.data;
    }

    public boolean isEmpty() {
        return (length == 0);
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
