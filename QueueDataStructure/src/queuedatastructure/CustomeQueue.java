/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package queuedatastructure;

import java.util.Iterator;

/**
 *
 * @author sami-
 */
public class CustomeQueue<E> implements Iterable<E> {

    private Node<E> front, rear;
    private int size;

    public CustomeQueue() {
        this.front = this.rear = null;
        size = 0;
    }

    public boolean isEmpty() {
        return front == null;
    }

    public int size() {
        return size;
    }

    public void enqueue(E element) {
        Node<E> temp = new Node<>(element);
        if (this.rear == null) {
            this.front = this.rear = temp;
            size++;
            return;
        }
    }

    public E dequeue() {
        if (isEmpty()) {
            return null;
        }
        Node<E> temp = this.front;
        this.front = this.front.next;
        if (this.front == null) {
            this.rear = null;
        }
        size--;
        return temp.getElement();
    }

    public E getFront() {
        return this.front.getElement();
    }

    public E getRear() {
        return this.rear.getElement();
    }

    /**
     *
     * @return
     */
    @Override
    public CustomeIterator<E> iterator() {
        return new CustomeIterator(this);
    }

    class Node<E> {

        private E element;
        private Node<E> next;

        public Node(E element) {
            this.element = element;
            this.next = null;
        }

        /**
         * @return the element
         */
        public E getElement() {
            return element;
        }

        /**
         * @return the next
         */
        public Node<E> getNext() {
            return next;
        }

        /**
         * @param next the next to set
         */
        public void setNext(Node<E> next) {
            this.next = next;
        }

    }
    public Node<E> Front() {
        return this.front;
    }

}
