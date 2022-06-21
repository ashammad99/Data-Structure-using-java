package Assignment1;

public class DoubleLinkedDeque<E> implements DequeInterface<E> {

    private Node<E> frontNode;
    private Node<E> backNode;
    private int size = 0;

    public DoubleLinkedDeque() {
        frontNode = null;
        backNode = null;
    }

    @Override
    public int size() {
        return size;
    }

    @Override
    public boolean isEmpty() {
        return frontNode == null;
    }

    @Override
    public E getFirst() {
        if (isEmpty()) { return null;}
        return frontNode.getElement();
    }

    @Override
    public E getLast() {
        if (isEmpty()) { return null;}
        return backNode.getElement();
    }

    @Override
    public void addFirst(E e) {
        Node<E> newest = new Node<>(e, null, frontNode);
        if (isEmpty()) {
            backNode = newest;
        } else {
            frontNode.setPrev(newest);
        }
        frontNode = backNode;
        size++;
    }

    @Override
    public void addLast(E e) {
        Node<E> newest = new Node(e, backNode, null);
        if (isEmpty()) {
            frontNode = newest;
        } else {
            backNode.setNext(newest);
            backNode = newest;
        }
        size++;
    }

    @Override
    public E removeFirst() {
        if (isEmpty()) {
            return null;
        }
        E answer = getFirst();
        frontNode = frontNode.getNext();
        if (frontNode == null) {
            backNode = null;
        } else {
            frontNode.setPrev(null);
        }
        size--;
        return answer;
    }

    @Override
    public E removeLast() {
        if (isEmpty()) {
            return null;
        }
        E answer = getLast();
        backNode = backNode.getPrev();
        if (backNode == null) {
            frontNode = null;
        } else {
            backNode.setNext(null);
        }
        size--;
        return answer;
    }

    private static class Node<E> {

        private E Element;
        private Node<E> next;
        private Node<E> prev;

        public Node(E e, Node<E> prev, Node<E> next) {
            this.next = next;
            this.prev = prev;
            Element = e;
        }

        public void setPrev(Node<E> prev) {
            this.prev = prev;
        }

        public void setNext(Node<E> next) {
            this.next = next;
        }

        public E getElement() {
            return Element;
        }

        public Node<E> getNext() {
            return next;
        }

        public Node<E> getPrev() {
            return prev;
        }

    }
}
