package doublyLinkedList_2;

public class DoublyLinkedList {

    public static void main(String[] args) {

        DoublyLinkedListHelper list = new DoublyLinkedListHelper();

        for(int i=1;i<=5;i++) {
            list.addLast(i);
        }
        for(int i=6;i<=10;i++) {
            list.addFirst(i);
        }
        System.out.println("The list after above operations are : ");
        list.printList();

        System.out.println("The length of the list is : "+list.printLength());

        System.out.println("The list after adding 20 at 3rd index is : ");
        list.addAt(3, 20);
        list.printList();

        System.out.println("The list after deleting last element is : ");
        list.deleteLast();
        list.printList();

        System.out.println("The list after deleting first element is : ");
        list.deleteFirst();
        list.printList();

        System.out.println("The data at 4th index is : " + list.at(4));

        System.out.println("Is List have 20 ? " + list.hasElement(20));

    }

}
