package queue_5;

import java.util.NoSuchElementException;

public class QueueHelper {

    Node front = null;
    Node rear = null;
    int length = 0;

    public boolean isEmpty() {
        return (length == 0);
    }

    public int displayLength() {
        return length;
    }

    public void enqueue(int value) {
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

    public int dequeue() {
        if(isEmpty()) {
            throw new NoSuchElementException();
        } else {
            int answer = front.data;
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
        int data;
        Node next;
        Node(int data) {
            this.data = data;
            next = null;
        }
    }

}
