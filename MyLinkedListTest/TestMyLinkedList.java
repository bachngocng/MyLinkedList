public class TestMyLinkedList {
    public static void main(String[] args) {
        System.out.println("/=/=/=/= TESTING /=/=/=/=");
        MyLinkedList ll = new MyLinkedList(20);
        ll.addFirst(21);
        ll.addFirst(65);
        ll.addFirst(97);

        ll.add(2,9);
        ll.add(0,7);
        ll.printList();
    }
}
