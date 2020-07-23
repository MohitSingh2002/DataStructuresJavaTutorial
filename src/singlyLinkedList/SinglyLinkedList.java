package singlyLinkedList;

import java.util.*;

public class SinglyLinkedList {
    public static void main(String[] args) {

        SinglyLinkedListHelper singlyLinkedListHelper = new SinglyLinkedListHelper();

        for (int i=1;i<=10;i++) {
            singlyLinkedListHelper.addList(i);
        }

        singlyLinkedListHelper.displayList();

        System.out.println();
        System.out.println("Length of LinkedList = "+singlyLinkedListHelper.displayLength());
    }
}
