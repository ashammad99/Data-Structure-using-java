/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package singlelinkedlist;

/**
 *
 * @author sami-
 */
public class SingleLinkedListClass<E> {

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
    private int size;
    private Node<E> head;
    private Node<E> tail;

    public SingleLinkedListClass() {
        this.size = 0;
        this.head = null;
        this.tail = null;
    }

    public int size() {
        return size;
    }

    public boolean isEmpty() {
        return size == 0;
    }
        public void addFirst(E e) {
        /*
        Node<E> newest = new Node<>(e, null);
        newest.setNext(head);
        head = newest;
         */
        head = new Node<E>(e, head);
        if (size == 0) {
            tail = head;
        }
        size++;
    }

    public E removeFirst() {
        if (isEmpty()) {
            return null;
        }
        E answer = head.getElement();
        head = head.nextNodeRef;
        size--;
        if (size == 0) {
            tail = null;
        }
        return answer;
    }

    public E removeLast() {
        if (isEmpty()) {
            return null;
        }
        if (head != null && size == 1) {
            E answer = head.getElement();
            head = null;
            tail = head;
            return answer;
        }
        E answer = tail.getElement();
        Node<E> temp = head;
        while (temp.getNext().getNext() != null) {
            temp = temp.getNext();
        }
        tail = temp;
        temp = null;
        size--;
        return answer;
    }

    public void remove(int index) {
        Node temp = head;
        for (int i = 0; i < index - 1 && temp.getNext() != null; i++) {
            temp = temp.getNext();
        }
        temp.nextNodeRef = temp.nextNodeRef.nextNodeRef;
        size--;
    }

    public E get(int index) {
        if (isEmpty()) {
            return null;
        }
        if (index < size || index < 0) {
            int counter = 0;
            Node<E> currentNode = head;
            while (index != counter) {
                currentNode = currentNode.getNext();
                counter++;
            }
            return currentNode.getElement();
        } else {
            return null;
        }
    }

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

    public void display(SingleLinkedListClass objLinkedList) {
        for (int i = 0; i < objLinkedList.size(); i++) {
            System.out.println("Index of:" + i + " = " + objLinkedList.get(i));
        }
    }

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

    public void merge(SingleLinkedListClass<E> linkedListObj) {
        for (int i = 0; i < linkedListObj.size; i++) {
            addLast(linkedListObj.get(i));
        }
    }
}
