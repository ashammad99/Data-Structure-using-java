/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Assignment1;

import java.util.*;
import java.util.Stack;
import java.util.Iterator;
import static java.util.Spliterators.iterator;

/**
 *
 * @author sami-
 */
public class DequeImplementation {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        //A- Stack application Exercises:
        /*
        Stack<Integer> numberStack = new Stack<>();
        
        System.out.println("Stack is Empty or not before adding ? " + numberStack.empty());
        numberStack.push(1);
        numberStack.push(2);
        numberStack.push(3);
        numberStack.push(4);
        numberStack.push(5);
        System.out.println("Size of Stack after adding item : " + numberStack.size());
        System.out.println("Delete the top Item in the Stack and its value: " + numberStack.pop());
        System.out.println("Size of Stack after delete the top item : " + numberStack.size());
        System.out.println("top = " + numberStack.lastElement());
        Iterator iter =  numberStack.iterator();
        
        while (iter.hasNext()) {
            System.out.println(iter.next());
            
        }
         */
        //B-1
        /*
        Fixed_size_Queue<Integer> queue = new Fixed_size_Queue();
        System.out.println("Queue is Empty or not before adding ? " + queue.isEmpty());
        queue.enqueue(1);
        queue.enqueue(2);
        queue.enqueue(3);
        queue.enqueue(4);
        queue.enqueue(5);
        queue.enqueue(6);
        System.out.println("Queue is Empty or not after adding ? " + queue.isEmpty());
        System.out.println("Delete the firt Item in the queue and its value: " + queue.dequeue());
        System.out.println("Size if queue : " + queue.size());
        System.out.println("top = " + queue.getFirst());
        
        queue.dequeue();
         */
        //B-2
        
        /*
        resizing_Queue<Integer> queue = new resizing_Queue();
        System.out.println(queue.size());
        queue.enqueue(1);
        queue.enqueue(2);
        queue.enqueue(3);
        queue.enqueue(4);
        queue.enqueue(5);
        queue.enqueue(6);
        queue.enqueue(7);
        queue.enqueue(8);
        queue.enqueue(9);
        queue.enqueue(10);
        System.out.println(queue.size());
        queue.enqueue(11);
        */

        
        
        
        //C- Implements the Double Ended Queue (Deque) using the:
        //1- Circular array
        
        
        
        ArrayDeque<Integer> x = new ArrayDeque<>();
        System.out.println("Queue is Empty? " + x.isEmpty());
        x.addLast(7);
        x.addLast(6);
        x.addLast(9);
        x.addLast(1);
        x.addLast(3);
        x.addLast(4);
        x.addLast(5);
        x.addLast(8);
        x.addLast(10);
        x.addLast(2);
        
        
        x.removeFirst();
        x.removeFirst();
        x.removeFirst();
        x.removeFirst();
        x.removeFirst();

        
        x.addLast(6);
        x.addLast(3);
        x.addLast(7);
        x.removeLast();
        
        x.addLast(1);
        x.addLast(7);
        x.addLast(9);
        
        
        x.removeLast();
        x.removeLast();
        x.removeLast();
        x.removeLast();
        x.removeLast();
        x.removeLast();
        x.removeLast();
        x.removeLast();
        x.removeLast();
        x.removeLast();
         
 
        x.addLast(7);
        x.addLast(6);
        x.removeFirst();
        x.removeFirst();
        
        System.out.println(x.getFirst());
         System.out.println(x.getLast());
        
        System.out.println(x.getFront());
        System.out.println(x.getBack());
         
 
 
 
 
        //2-Double linked list. implement all the methods in the deque interface
        /*
        DoubleLinkedDeque<Integer> deq1 = new DoubleLinkedDeque<>();
        
        deq1.addFirst(1);
        deq1.addLast(2);
        deq1.addLast(3);
        deq1.addLast(4);
        deq1.addLast(5);
        
        
        System.out.println("First Item has been removed and its value: " + deq1.removeFirst());
        System.out.println("Last Item has been removed and its value: " + deq1.removeLast());
        System.out.println("is empty : " + deq1.isEmpty());
        System.out.println("Size : " + deq1.size());
        System.out.println("The Value of first item: " + deq1.getFirst());
        System.out.println("The Value of last item: " + deq1.getLast());
         */
    }

}
