package lab11.iterator.exe03;

public class MyLinkedListNode {
    private Object payload;
    private MyLinkedListNode next;

    public MyLinkedListNode(Object payload) {
        this.payload = payload;
    }

    public MyLinkedListNode(Object payload, MyLinkedListNode next) {
        this.payload = payload;
        this.next = next;
    }

    public Object getPayload() {
        return this.payload;
    }

    public MyLinkedListNode getNext() {
        return this.next;
    }

    public void setNext(MyLinkedListNode node) {
        this.next = node;
    }
}
