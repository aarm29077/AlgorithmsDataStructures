package dataStructures.linkedList;

public class DoublyLinkedListImpl<T> {
    Node<T> head, tail = null;

    public void addNode(T value) {
        Node<T> newNode = new Node<>(value);

        if (head == null) {
            head = tail = newNode;
            head.previous = null;
            head.next = null;
        } else {
            tail.next = newNode;
            newNode.previous = tail;
            tail = newNode;
            tail.next = null;
        }
    }
    public void printNodes(){
        Node<T> current = head;
        if (head == null){
            System.out.println("Doubly linked list is empty");
            return;
        }
        System.out.println("Nodes of doubly linked list: ");
        while(current!=null){
            System.out.println(current.value + " ");
            current = current.next;
        }
    }
}
