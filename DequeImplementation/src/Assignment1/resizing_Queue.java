/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Assignment1;

/**
 *
 * @author sami-
 */
public class resizing_Queue<E> implements QueueInterface<E>{
    private E[] data;
    private int f = 0;
    private int sz = 0;
    private final int capacity = 10;

    public resizing_Queue() {
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
    
    protected void resize(int cap) {
        E[] temp = (E[]) new Object[cap]; //Safe Cast
        for (int i = 0; i < sz; i++) {
            temp[i] = data[i];
        }
        data = temp; // Start using a new array
    }
    

    @Override
    public void enqueue(E e) throws IllegalStateException {
        if (sz == data.length) {
            //throw new IllegalStateException("Queue is full");
            resize(sz * 2);
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
