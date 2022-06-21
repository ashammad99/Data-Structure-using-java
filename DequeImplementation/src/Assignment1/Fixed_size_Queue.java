/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Assignment1;

import sun.font.EAttribute;

/**
 *
 * @author sami-
 */
public class Fixed_size_Queue<E> implements QueueInterface<E> {

    private E[] data;
    private int f = 0;
    private int sz = 0;
    private final int capacity = 10;

    public Fixed_size_Queue() {
        data = (E[]) new Object[capacity];
    }

    @Override
    public int size() {
        return sz;
    }

    @Override
    public boolean isEmpty() {
        return sz == 0;
    }

    @Override
    public E getFirst() {
        if (isEmpty()) {
            return null;
        }
        return data[f];
    }

    @Override
    public void enqueue(E e) throws IllegalStateException {
        if (sz == data.length) {
            throw new IllegalStateException("Queue is full");
        }
        int avail = (f + sz) % data.length;
        data[avail] = e;
        sz++;

    }

    @Override
    public E dequeue() {
        if (isEmpty()) {
            return null;
        }
        E answer = data[f];
        f = (f + 1) % data.length;
        sz--;
        return answer;
    }

}
