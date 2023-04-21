package lab09.exercise1p1;

public class MyLinkedList extends MyAbstractList {
    private int size;
    private MyLinkedListNode head;

    private MyLinkedListNode getNodeByIndex(int index) {
        this.checkBoundaries(index, size);
        MyLinkedListNode tempNode = head;
        for (int i = 0; i < index; i++) {
            tempNode = tempNode.getNext();
        }
        return tempNode;
    }

    @Override
    public void add(Object object, int index) {
        if (index == 0) {
            MyLinkedListNode newNode = new MyLinkedListNode(object, this.head);
            this.head = newNode;
            size++;
        } else if (index == size) {
            this.add(object);
        } else {
            this.checkBoundaries(index, size);
            MyLinkedListNode prevNode = getNodeByIndex(index-1);
            MyLinkedListNode afterNode = getNodeByIndex(index);
            MyLinkedListNode currentNode = new MyLinkedListNode(object, afterNode);
            prevNode.setNext(currentNode);
            size++;
        }
    }

    @Override
    public void remove(int index) {
        if (index == 0) {
            this.head = this.getNodeByIndex(1);
            size--;
            return;
        }
        if (index == size - 1) {
            MyLinkedListNode prevNode = this.getNodeByIndex(index-1);
            prevNode.setNext(null);
        }
        this.checkBoundaries(index, size);
        MyLinkedListNode prevNode = this.getNodeByIndex(index - 1);
        MyLinkedListNode afterNode = this.getNodeByIndex(index + 1);
        prevNode.setNext(afterNode);
        size--;
    }

    @Override
    public int size() {
        return size;
    }

    @Override
    public Object get(int index) {
        return getNodeByIndex(index);
    }

    @Override
    public void add(Object object) {
        MyLinkedListNode lastNode = getNodeByIndex(size-1);
        MyLinkedListNode newNode = new MyLinkedListNode(object);
        lastNode.setNext(newNode);
        size++;
    }
}
