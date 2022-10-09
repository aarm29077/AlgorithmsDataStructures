package dataStructures.linkedList;

public class CircularDoublyLinkedListImpl<T> {
    Node<T> head;

    public void addNode(T value) {
        Node<T> newNode = new Node<>(value);
        if (head == null) {
            newNode.next = newNode.previous = newNode;
            head = newNode;
            return;
        }
        // find last node in the list if list is not empty
        Node<T> last = head.previous;    //previous of head is the last node
        newNode.next = head;
        head.previous = newNode;
        newNode.previous = last;
        last.next = newNode;
    }

    public void print() {
        Node<T> current = head;
        //traverse in forward direction starting from head to print the list
        while (current.next != head) {
            System.out.println(current.value + " ");
            current = current.next;
        }
        System.out.println(current.value);

        //OR

    }
    public static void main(String[] args)
    {
        //the empty list
        Node l_list = null;

        CircularDoublyLinkedListImpl<Integer> circularDoublyLinkedList = new CircularDoublyLinkedListImpl<>();
        // add nodes to the list
        circularDoublyLinkedList. addNode(40);
        circularDoublyLinkedList.addNode(50);
        circularDoublyLinkedList.addNode(60);
        circularDoublyLinkedList.addNode(70);
        circularDoublyLinkedList.addNode(80);

        //print the list
        System.out.println("Circular doubly linked list: ");
        circularDoublyLinkedList.print();
    }
}
