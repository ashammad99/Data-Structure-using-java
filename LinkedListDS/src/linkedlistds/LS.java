package linkedlistds;

public class LS<E> {

    private Node<E> head = null;
    private Node<E> tail = null;
    private int size = 0;

    public LS() {
    }

    //Methods
    //1-Size 
    public int size() {
        return size;
    }

    //2-is Empty 
    public boolean isEmpty() {
        return size == 0;
    }

    //3- Get First
    public E getFirst() {
        if (isEmpty()) {
            return null;
        }
        return head.getElement();
    }

    //4-Get Last
    public E getLast() {
        if (isEmpty()) {
            return null;
        }
        return tail.getElement();
    }

    //5- Get by Index
    public E get(int index) {
        if (isEmpty()) {
            return null;
        }
        if (index < size) { //To Avoid Out of Bounds Exception
            Node<E> element = head;
            int Counter = 0;
            while (Counter != index) {
                element = element.getNext();
                Counter++;
            }
            return element.getElement();
        } else {
            return null;
        }
    }

    //6- add First 
    public void addFirst(E e) {
        head = new Node<>(e, head);
        if (size == 0) {
            tail = head;
        }
        size++;
    }

    //7- add Last
    public void addLast(E e) {
        Node<E> newest = new Node<>(e, null);
        if (isEmpty()) {
            head = newest;
        } else {
            tail.setNext(newest);
        }
        tail = newest;
        size++;
    }

    //8- Remove First
    public E removeFirst() {
        if (isEmpty()) {
            return null;
        }
        E answer = head.getElement();
        head = head.getNext();
        size--;
        if (size == 0) {
            tail = null;
        }
        return answer;
    }

    //9 Remove Last
    public E removeLast() {
        if (isEmpty()) {
            return null;
        }
        if (size == 1 && head != null) {
            E element = head.getElement();
            head = null;
            tail = head;
            return element;
        }
        E element = tail.getElement();
        Node<E> temp = head;
        while (temp.getNext().getNext() != null) {
            temp = temp.getNext();
        }
        tail = temp;
        temp.next = null;
        size--;
        return element;
    }

    //10- Get index of Element by Value's obj
    public int indexOf(Object o) {
        int index = 0;
        for (Node<E> x = head; x != null; x = x.getNext()) {
            if (o.equals(x.getElement())) {
                return index;
            }
            index++;
        }

        return -1;
    }

    //11- Remove by index
    public void remove(int index) {
        Node temp = head;
        for (int i = 0; i < index - 1 && temp.next != null; i++) {
            temp = temp.next;
        }
        temp.next = temp.next.next;
        size--;
    }

    public static class Node<E> {

        private E element;      //value
        private Node<E> next;   //Reference to the next Node
        

        public Node(E element, Node<E> next) {
            this.element = element;
            this.next = next;
        }


        public E getElement() {
            return element;
        }

        public Node<E> getNext() {
            return next;
        }

        public void setNext(Node<E> next) {
            this.next = next;
        }

    }
}
