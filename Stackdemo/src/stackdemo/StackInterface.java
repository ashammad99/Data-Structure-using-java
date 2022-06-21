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
public interface StackInterface<E> {
    public int size();
    public boolean isEmpty();
    public E top();
    public E pop();
    public void push(E e);
    public boolean isFull();
    public void BackwardDisplay();
}
