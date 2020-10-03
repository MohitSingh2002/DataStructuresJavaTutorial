package queue_5;

import java.util.NoSuchElementException;

public class QueueHelperGeneric<Type> {

    Node front = null;
    Node rear = null;
    int length = 0;

    public boolean isEmpty() {
        return (length == 0);
    }

    public int displayLength() {
        return length;
    }

    public void enqueue(Type value) {
        Node toAdd = new Node(value);
        if(front == null) {
            front = toAdd;
        } else {
            rear.next = toAdd;
        }
        rear = toAdd;
        length++;
    }

    public void displayList() {
        Node temp = front;
        while(temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
        System.out.println();
    }

    public Type dequeue() {
        if(isEmpty()) {
            throw new NoSuchElementException();
        } else {
            Type answer = front.data;
            front = front.next;
            if(front == null) {
                rear = null;
            }
            length--;
            return answer;
        }
    }

    public void poll() {
        if(isEmpty()) {
            throw new NoSuchElementException();
        } else {
            front = front.next;
            if(front == null) {
                rear = null;
            }
            length--;
        }
    }

    class Node {
        Type data;
        Node next;
        Node(Type data) {
            this.data = data;
        }
    }

}
