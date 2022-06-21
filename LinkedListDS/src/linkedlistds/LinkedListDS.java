/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package linkedlistds;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.NoSuchElementException;
import java.util.Stack;
import linkedlistds.DoublyLinkedList.Node;

/**
 *
 * @author sami-
 */
public class LinkedListDS {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        DoublyLinkedList<Integer> list = new DoublyLinkedList<Integer>();
        list.addLast(2);
        list.addLast(3);
        list.addLast(5);
        list.addLast(1);
        list.addLast(7);

        Node temp = new Node(6, list.header, list.header.getNext());
        Node temp1 = new Node(0, list.tailer.getPrev(), list.tailer);
        list.header.setNext(temp);
        temp.getNext().setPrev(temp);
        list.tailer.setPrev(temp1);
        temp1.getPrev().setNext(temp1);

    
}
}