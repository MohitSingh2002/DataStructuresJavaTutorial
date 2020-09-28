package circularLinkedList_3;

public class CircularLinkedList {

    public static void main(String[] args) {

        CircularLinkedListHelper list = new CircularLinkedListHelper();

        for(int i=1;i<=5;i++) {
            list.addLast(i);
        }
        for(int i=6;i<=10;i++) {
            list.addFirst(i);
        }

        System.out.println("The List after above operations are : ");
        list.displayList();

        System.out.println("The Length of the Circular Linked List is : " + list.displayLength());

    }

}
