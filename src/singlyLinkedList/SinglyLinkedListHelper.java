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
    
    static class ListNode {
        private int data;
        private ListNode next;

        public ListNode(int data) {
            this.data = data;
            this.next = null;
        }

    }

//    public static void main(String[] args) {
//
//        SinglyLinkedListHelper singlyLinkedListHelper = new SinglyLinkedListHelper();
//
//        SinglyLinkedListHelper.ListNode head = new SinglyLinkedListHelper.ListNode(1);
//        SinglyLinkedListHelper.ListNode second = new SinglyLinkedListHelper.ListNode(2);
//        SinglyLinkedListHelper.ListNode third = new SinglyLinkedListHelper.ListNode(3);
//        SinglyLinkedListHelper.ListNode fourth = new SinglyLinkedListHelper.ListNode(4);
//        SinglyLinkedListHelper.ListNode fifth = new SinglyLinkedListHelper.ListNode(5);
//        head.next = second;
//        second.next = third;
//        third.next = fourth;
//        fourth.next = fifth;
//
////        singlyLinkedListHelper.displayList(head);
//    }
    
}
