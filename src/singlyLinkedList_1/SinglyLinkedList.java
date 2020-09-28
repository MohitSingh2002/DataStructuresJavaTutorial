package singlyLinkedList_1;

public class SinglyLinkedList {
    public static void main(String[] args) {

        SinglyLinkedListHelper singlyLinkedListHelper = new SinglyLinkedListHelper();

        for (int i=1;i<=5;i++) {
            singlyLinkedListHelper.addList(i);
        }

        System.out.println();
        int middle = singlyLinkedListHelper.findMiddle();
        System.out.println("Middle element is = "+middle);

        singlyLinkedListHelper.displayList();

        System.out.println();
        System.out.println("Length of LinkedList = "+singlyLinkedListHelper.displayLength());

        singlyLinkedListHelper.insertFirst(10);
        singlyLinkedListHelper.displayList();

        System.out.println();
        System.out.println("Length of LinkedList after adding a value at first position = "+singlyLinkedListHelper.displayLength());

        singlyLinkedListHelper.insertLast(20);
        singlyLinkedListHelper.displayList();

        System.out.println();
        System.out.println("Length of LinkedList after adding a value at last position = "+singlyLinkedListHelper.displayLength());

        singlyLinkedListHelper.insertAt(30, 3);
        singlyLinkedListHelper.displayList();

        System.out.println();
        System.out.println("Length of LinkedList after adding a value at specific position = "+singlyLinkedListHelper.displayLength());

        singlyLinkedListHelper.deleteFirst();
        singlyLinkedListHelper.displayList();

        System.out.println();
        System.out.println("Length of LinkedList after deleting first value = "+singlyLinkedListHelper.displayLength());

        singlyLinkedListHelper.deleteLast();
        singlyLinkedListHelper.displayList();

        System.out.println();
        System.out.println("Length of LinkedList after deleting last value = "+singlyLinkedListHelper.displayLength());

        singlyLinkedListHelper.deleteAt(2);
        singlyLinkedListHelper.displayList();

        System.out.println();
        System.out.println("Length of LinkedList after deleting a value at specific position = "+singlyLinkedListHelper.displayLength());

        System.out.println();
        System.out.println("Is list contains 4 ?\n"+singlyLinkedListHelper.hasElement(4));

        System.out.println();
        SinglyLinkedListHelper.ListNode reverse = singlyLinkedListHelper.reverse();
        System.out.println("Reverse LinkedList is :-");
        singlyLinkedListHelper.displayListWithHead(reverse);

    }
}
