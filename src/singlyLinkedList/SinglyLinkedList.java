package singlyLinkedList;

import java.util.*;

public class SinglyLinkedList {
    public static void main(String[] args) {

        SinglyLinkedListHelper singlyLinkedListHelper = new SinglyLinkedListHelper();

        for (int i=1;i<=5;i++) {
            singlyLinkedListHelper.addList(i);
        }

        singlyLinkedListHelper.displayList();

        System.out.println();
        System.out.println("Length of LinkedList = "+singlyLinkedListHelper.displayLength());

        singlyLinkedListHelper.insertFirst(10);
        singlyLinkedListHelper.displayList();

        System.out.println();
        System.out.println("Length of LinkedList after adding a value at first position = "+singlyLinkedListHelper.displayLength());

    }
}
