/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package stackdemo;

/**
 *
 * @author sami-
 */
public class ArrayStack<E> implements StackInterface<Object> {

    private int top = -1;
    public static final int capacity = 100;
    private E[] data;

    public ArrayStack() {
        this(capacity);
    }

    public ArrayStack(int capacity) {
        data = (E[]) new Object[capacity];
    }
    //لاحظ يوجد اثنين كونستركتور الاول لو انا ما حددت حجم الستاك يعتبر مائة 

    @Override
    public int size() {
        return top + 1;
    }

    @Override
    public boolean isEmpty() {
        if (top < 0) {
            return true;
        }
        return false;
    }

    @Override
    public Object top() {
        if (!isEmpty()) {
            return data[top];
        }
        return null;
    }

    @Override
    public Object pop() {
        if (!isEmpty()) {
            E element = data[top];
            data[top] = null;
            top--;
            return element;

        }
        return null;
    }

    /**
     *
     * @param e
     */
    public void push(Object e){
        if (size() == data.length)  {
            throw new IllegalStateException("Stack is Full");
        }
        data[++top] = (E) e;
    }

    @Override
    public boolean isFull() {
        return size() == data.length;
    }

    @Override
    public void BackwardDisplay() {
        int Current = top;
        for(int i = 0;i < data.length;i++) {
            System.out.println(data[Current--]);
            
        }
    }
    
}
