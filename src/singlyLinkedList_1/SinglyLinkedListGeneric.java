package singlyLinkedList_1;

public class SinglyLinkedListGeneric {

    public static void main(String[] args) {

        SinglyLinkedListGenericHelper<Double> list = new SinglyLinkedListGenericHelper<>();

        for(double i=1;i<=5;i++) {
            list.addLast(i);
        }
        for(double i=6;i<=10;i++) {
            list.addFirst(i);
        }

        System.out.println("The List after above operations are : ");
        list.displayList();

        System.out.println("The Length of the list is : " + list.displayLength());

        System.out.println("After Adding 20.0 at 2nd index, the list is : ");
        list.addAt(2, 20.0);
        list.displayList();

        System.out.println("The List after deleting last element is : ");
        list.deleteLast();
        list.displayList();

        System.out.println("The List after deleting first element is : ");
        list.deleteFirst();
        list.displayList();

        System.out.println("The List after deleting element at 3rd index is : ");
        list.deleteAt(3);
        list.displayList();

        System.out.println("The element at 4th index is : " + list.at(4));

        System.out.println("Is List have 2.0 ? " + list.hasElement(2.0));

    }

}
