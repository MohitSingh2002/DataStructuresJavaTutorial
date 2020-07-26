package singlyLinkedList;

public class SinglyLinkedListHelper {
    
    private ListNode head;

    public void addList(int data) {
        ListNode toAdd = new ListNode(data);
        if (head == null) {
            head = toAdd;
            return;
        }

        ListNode temp = head;
        while (temp.next != null) {
            temp = temp.next;
        }
        temp.next = toAdd;

    }

    public void displayList() {
        ListNode currentValue = head;
        while (currentValue != null) {
            System.out.print(currentValue.data+" ");
            currentValue = currentValue.next;
        }
    }

    public void displayListWithHead(ListNode head) {
        ListNode currentValue = head;
        while (currentValue != null) {
            System.out.print(currentValue.data+" ");
            currentValue = currentValue.next;
        }
    }

    public int displayLength() {
        if(head == null) {
            return 0;
        }
        int length = 0;
        ListNode current = head;
        while (current != null) {
            length++;
            current = current.next;
        }
        return length;
    }

    public void insertFirst(int value) {
        ListNode newNode = new ListNode(value);
        newNode.next = head;
        head = newNode;
    }

    public void insertLast(int value) {
        ListNode newNode = new ListNode(value);
        if (head == null) {
            head = newNode;
            return;
        }
        ListNode current = head;
        while (current.next != null) {
            current = current.next;
        }
        current.next = newNode;
    }

    public void insertAt(int data, int position) {
        ListNode toAdd = new ListNode(data);
        int count = 0;
        ListNode previous = head;
        while(count < position-1) {
            previous = previous.next;
            count++;
        }
        ListNode current = previous.next;
        previous.next = toAdd;
        toAdd.next = current;
    }

    public void deleteFirst() {
        if(head == null) {
            return;
        }
        ListNode temp = head;
        head = head.next;
        temp.next = null;
    }

    public void deleteLast() {
        if(head == null) {
            return;
        }
        ListNode last = head;
        ListNode previousToLast = null;
        while(last.next != null) {
            previousToLast = last;
            last = last.next;
        }
        previousToLast.next = null;
    }

    public void deleteAt(int position) {
        if(head == null) {
            return;
        }
        ListNode previous = head;
        int count = 0;
        while(count < position -1) {
            previous = previous.next;
            count++;
        }
        ListNode current = previous.next;
        previous.next = current.next;
        current.next = null;
    }

    public boolean hasElement(int searchData) {
        if (head == null) {
            return false;
        }
        ListNode current = head;
        while (current != null) {
            if (current.data == searchData) {
                return true;
            }
            current = current.next;
        }
        return false;
    }

    public ListNode reverse() {
        if (head == null) {
            return head;
        }
        ListNode current = head;
        ListNode previous = null;
        ListNode future = null;
        while (current != null) {
            future = current.next;
            current.next = previous;
            previous = current;
            current = future;
        }
        return previous;
    }

    public int findMiddle() {
        if (head == null) {
            return 0;
        }
        ListNode slow = head;
        ListNode fast = head;
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow.data;
    }
    
    static class ListNode {
        private int data;
        private ListNode next;

        public ListNode(int data) {
            this.data = data;
            this.next = null;
        }

    }

}
