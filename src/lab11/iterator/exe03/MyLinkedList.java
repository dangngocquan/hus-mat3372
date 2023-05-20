package lab11.iterator.exe03;

public class MyLinkedList extends MyAbstractList {
    private MyLinkedListNode head;
    private int size;

    public MyLinkedList() {
        head = null;
        size = 0;
    }

    @Override
    public int size() {
        return size;
    }

    @Override
    public Object get(int index) {
        return  getNodeByIndex(index).getPayload();
    }

    @Override
    public void set(Object payload, int index) {
        if (index < 0 || index >= size) {
            throw new ArrayIndexOutOfBoundsException();
        }

        if (index == 0 && index == size - 1) {
            head = new MyLinkedListNode(payload);
            return;
        }

        if (index == 0) {
            MyLinkedListNode afterNode = getNodeByIndex(index+1);
            MyLinkedListNode currentNode = new MyLinkedListNode(payload);
            currentNode.setNext(afterNode);
            head = currentNode;
            return;
        }

        if (index == size - 1) {
            MyLinkedListNode previousNode = getNodeByIndex(index-1);
            MyLinkedListNode currentNode = new MyLinkedListNode(payload);
            previousNode.setNext(currentNode);
            return;
        }

        MyLinkedListNode previousNode = getNodeByIndex(index-1);
        MyLinkedListNode afterNode = getNodeByIndex(index+1);
        MyLinkedListNode currentNode = new MyLinkedListNode(payload);
        previousNode.setNext(currentNode);
        currentNode.setNext(afterNode);
    }

    @Override
    public void remove(int index) {
        if (index < 0 || index >= size) {
            throw new ArrayIndexOutOfBoundsException();
        }
        if (index == 0 && index == size - 1) {
            head = null;
            size--;
            return;
        }

        if (index == 0) {
            MyLinkedListNode afterNode = getNodeByIndex(index+1);
            head = afterNode;
            size--;
            return;
        }

        if (index == size - 1) {
            MyLinkedListNode previousNode = getNodeByIndex(index-1);
            previousNode.setNext(null);
            size--;
            return;
        }

        MyLinkedListNode previousNode = getNodeByIndex(index-1);
        MyLinkedListNode afterNode = getNodeByIndex(index+1);
        previousNode.setNext(afterNode);
        size--;
    }

    @Override
    public void append(Object payload) {
        if (size == 0) {
            head = new MyLinkedListNode(payload);
            size++;
            return;
        }

        MyLinkedListNode lastNode = getNodeByIndex(size-1);
        MyLinkedListNode newNode = new MyLinkedListNode(payload);
        lastNode.setNext(newNode);
        size++;
    }

    @Override
    public void insert(Object payload, int index) {
        if (index < 0 || index > size) {
            throw new ArrayIndexOutOfBoundsException();
        }

        if (index == size) {
            append(payload);
            return;
        }

        if (index == 0) {
            MyLinkedListNode newNode = new MyLinkedListNode(payload);
            newNode.setNext(head);
            head = newNode;
            size++;
            return;
        }

        MyLinkedListNode previousNode = getNodeByIndex(index-1);
        MyLinkedListNode currentNode = getNodeByIndex(index);
        MyLinkedListNode newNode = new MyLinkedListNode(payload);
        previousNode.setNext(newNode);
        newNode.setNext(currentNode);
        size++;
    }

    @Override
    public MyIterator iterator() {
        return new MyLinkedListIterator(head);
    }

    private MyLinkedListNode getNodeByIndex(int index) {
        if (index < 0 || index >= size) {
            throw new ArrayIndexOutOfBoundsException();
        }
        MyLinkedListNode node = head;
        while (index-- > 0) {
            node = node.getNext();
        }
        return node;
    }
}
