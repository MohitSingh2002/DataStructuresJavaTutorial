package stack_4;

public class StackGeneric {

    public static void main(String[] args) {

        StackHelperGeneric<Double> list = new StackHelperGeneric<>();

        for(double i=1;i<=5;i++) {
            list.push(i);
        }

        System.out.println("The List after above operation is : ");
        list.displayList();

        System.out.println("The List after pop operation is : ");
        list.pop();
        list.displayList();

        System.out.println("The Top most element is : " + list.peek());

        System.out.println("The Length of the list is : " + list.displayLength());

        System.out.print("Is List is empty ? " + list.isEmpty());

    }

}
