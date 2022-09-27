package dataStructures.queue;

public class QueueImplLinkedList<T> {
    private Node<T> head;
    private Node<T> tail;

    public boolean isEmpty(){
        return head == null;
    }

    public T peek(){
        return head.value;
    }
    public void add(T value){
        Node<T> newNode = new Node<>(value);
        if (tail != null){
            tail.next = newNode;
        }
        tail = newNode;
        if(head == null){
            head = newNode;
        }
    }
    public T delete(){
        T value = head.value;
        head = head.next;
        if(head == null){
            tail = null;
        }
        return value;
    }
}