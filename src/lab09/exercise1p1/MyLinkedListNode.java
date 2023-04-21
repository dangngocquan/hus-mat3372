package lab09.exercise1p1;

public class MyLinkedListNode {
    private Object value;
    private MyLinkedListNode next;

    public MyLinkedListNode(Object value) {
        this.value = value;
        this.next = null;
    }

    public MyLinkedListNode(Object value, MyLinkedListNode nextNode) {
        this.value = value;
        this.next = nextNode;
    }

    public MyLinkedListNode getNext() {
        return next;
    }

    public void setNext(MyLinkedListNode next) {
        this.next = next;
    }

    @Override
    public String toString() {
        return this.value.toString();
    }
}
