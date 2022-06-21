/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package linkedlistds;

/**
 *
 * @author sami-
 */
public class CircularyLinkedList<E> {

    private Node<E> tail = null;
    private int size = 0;

    public CircularyLinkedList() {
    }

    ;
    
    public int getSize() {
        if (tail == null) {
            return 0;
        }
        if (tail == tail.getNext()) {
            return 1;
        }
        int counter = 1;
        for(Node<E> head = tail.getNext();head != tail ;head = head.getNext()){
            counter++;
        }
        return counter;
    }
    
    public int size() {
        return size;
    }

    public boolean isEmpty() {
        return size == 0;
    }

    public E getFirst() {
        if (isEmpty()) {
            return null;
        }
        return tail.getNext().getElement();
    }

    public E getLast() {
        if (isEmpty()) {
            return null;
        }
        return tail.getElement();
    }

    public void rotate() {
        if (tail != null) {
            tail = tail.getNext();
        }
    }

    public void addFirst(E e) {
        if (size == 0) {
            tail = new Node<>(e, null);
            tail.setNext(tail);
        } else {
            Node<E> newest = new Node<>(e, tail.getNext());
            tail.setNext(newest);
        }
        size++;
    }

    public void addLast(E e) {
        addFirst(e);
        rotate();
    }

    public E removeFirst() {
        if (isEmpty()) {
            return null;
        }
        Node<E> head = tail.getNext();
        if (head == tail) {
            tail = null;
        } else {
            tail.setNext(head.getNext());
        }
        size--;
        return head.getElement();
    }

    public E removeLast() {
        if (isEmpty()) {
            return null;
        }
        Node<E> head = tail.getNext();
        Node<E> temp = tail.getNext();
        E answer = tail.getElement();
        if (tail == head) {
            tail = null;
        } else {
            while (temp.getNext() != tail) {
                temp = temp.getNext();
            }
            tail = temp;
            tail.setNext(head);
        }
        size--;
        return answer;

    }

    public E get(int index) {
        if (isEmpty()) {
            return null;
        }
        if (index < size) {
            Node<E> element = tail.getNext();
            int counter = 0;
            while (counter != index) {
                element = element.getNext();
                counter++;
            }
            return element.getElement();
        }
        return null;
    }

    public void loopTwice() {
        if (!isEmpty()) {
            Node<E> temp = tail.getNext();
            for (int i = 0; i < size * 2; i++) {
                System.out.println(temp.getElement());
                temp = temp.getNext();
            }
        }
    }

    public void add(int index,E e) // Adds element to this list.
    {
        Node<E> newNode = new Node<>(e,null);   // Reference to the new node being added

        if (isEmpty()) // Adding into an empty list
        {
            newNode = tail.getNext();
            tail = newNode;
            tail.getNext().setNext(tail.getNext());
            tail.setNext(tail.getNext());
        } else // Adding into a non-empty list
        {
            tail.setNext(newNode);
            newNode.getNext();
            tail = newNode;
            tail.setNext(tail.getNext());
        }
        size++;
    }
//
//    public E add(int index, E element) {
//        if (index < 0 || index > size + 1) {
//            return null;
//        }
//        if (index == 0) {
//            addFirst(element);
//            rotate();
//            return element;
//        }
//        if (index == size) {
//            addLast(element);
//            return element;
//        } else {
//            Node<E> head = tail.getNext().getNext();
//            int counter = 0;
//            while (index != counter) {
//                head = head.getNext();
//                Node<E> newNode = new Node<>(element, head);
//                
//                counter++;
//            }
//            
//            size++;
//            return element;
//        }
//    }

    public void display() {
        for (int i = 0; i < size(); i++) {
            System.out.println("Index of:" + i + " = " + get(i));
        }
    }

    private static class Node<E> {

        private E Element;
        private Node<E> nextNodeRef;

        public Node(E element, Node<E> next) {
            this.Element = element;
            this.nextNodeRef = next;
        }

        public E getElement() {
            return Element;
        }

        public void setNext(Node<E> node) {
            nextNodeRef = node;
        }

        public Node<E> getNext() {
            return nextNodeRef;
        }
    }

}
