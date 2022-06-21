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
public class ArrayDeque<E> implements DequeInterface<E> {

    private static final int capacity = 10;
    private E data[]; // the array
    private int size, front, back;

    public ArrayDeque() {
        size = 0;
        front = -1;
        back = 0;
        data = (E[]) new Object[capacity];
    }

    @Override
    public int size() {
        return size;
    }

    @Override
    public boolean isEmpty() {
        return size == 0;
    }

    public boolean isFull() {
        return size == data.length;
    }

    @Override
    public E getFirst() {
        if (isEmpty()) {
            return null;
        }
        return data[front];
    }

    @Override
    public E getLast() {
        if (isEmpty()) {
            return null;
        }
        return data[back];
    }

    @Override
    public void addFirst(E e) {
        if (isFull()) {
            throw new IndexOutOfBoundsException("Queue is Full");
        }
        if (isEmpty()) {
            front = back;
            data[front] = e;
        }
        //is not Full()
        else  {
            front = (front - 1 + capacity) % capacity;
            data[front] = e;
        }
        size++;
    }

    @Override
    public void addLast(E e) {
        if (isFull()) {
            throw new IndexOutOfBoundsException("Queue is Full");
        }
        if (isEmpty()) {
            front = back = 0;
            data[back] = e;
        }
        else {
            back = (back + 1) % capacity;
            data[back] = e;
        }
        size++;
    }

    @Override
    public E removeFirst() {
        if (isEmpty()) {
            throw new IndexOutOfBoundsException("Queue is Empty");
        } else {
            E result = data[front];
            front = (front + 1) % capacity;
            size--;
            return result;
        }

    }

    @Override
    public E removeLast() {
        if (isEmpty()) {
            throw new IndexOutOfBoundsException("Queue is Empty");
        } else {
            E result = data[back];
            back = (back - 1 + capacity) % capacity;
            size--;
            return result;
        }
    }
    public int getFront() {
        return front;
    }
    public int getBack() {
        return back;
    }
    public void dispaly() {
        for(int i = front;i < size;i = i) {
            System.out.println("Index of (" + i +")" + " = " + data[i]);
        }
    }
}
