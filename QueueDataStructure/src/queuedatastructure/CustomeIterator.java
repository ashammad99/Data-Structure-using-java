/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package queuedatastructure;

import java.util.Iterator;
import queuedatastructure.CustomeQueue.Node;

/**
 *
 * @author sami-
 */
public class CustomeIterator<E> implements Iterator<E>{
    private Node current;

    public CustomeIterator(CustomeIterator<E> customeQueue) {
        current = customeQueue.Front();
    }

    
    
    @Override
    public boolean hasNext() {
        return current != null;
    }

    @Override
    public E next() {
        E data = (E) current.getElement();
        current =  (Node) current.getElement();
        return data;    
     }

    private Node Front() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    
}
