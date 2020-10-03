package queue_5;

public class Queue {

    public static void main(String[] args) {

        QueueHelper list = new QueueHelper();

        for(int i=1;i<=5;i++) {
            list.enqueue(i);
        }

        System.out.println("The List after above operations are : ");
        list.displayList();

        System.out.println("The Length of the list is : " + list.displayLength());

        list.poll();
        System.out.println("The List after above operation is : ");
        list.displayList();

        System.out.println("The first element which is to be replaced first is : " + list.dequeue());
        System.out.println("The List after above operation is : ");
        list.displayList();

    }

}
