/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ds_stack;

/**
 *
 * @author sami-
 */
public class ArrayStack<E> {
    private E data[];
    private int top;

    public ArrayStack(int capacity) {
        data = (E[]) (E) new Object[capacity];
        top = -1;
    }
    public int size() {
        return top + 1;
    }
    public boolean isEmpty() {
        return top == -1;
    }
    public boolean isFull() {
        return size() == data.length;
    }
    public void push(E element) throws IllegalStateException{
        if (isFull()) {
            throw new IllegalStateException("Stack is Full!");
        }
        data[++top] = element;
    }
    public E pop() {
        if (isEmpty()) {
            return null;
        }
        E result = data[top];
        data[top] = null;
        top--;
        return result;
    }
    public E peek() {
        if (isEmpty()) {
            return null;
        }
        return data[top];
    }
    public int search(Object element) {
        if (isEmpty()) {
            return -1;
        }
        if (element.equals(data[top])) {
            return 0;
        }
        int result = 0;
        for (int i = top; i >=  0; i--) {
            if (data[i].equals(element)) {
                result = top - i + 1;
                break;
            }
        }
        return result;
    }
}
