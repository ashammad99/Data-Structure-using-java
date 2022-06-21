/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package singlelinkedlist;

/**
 *
 * @author sami-
 */
public class SingleLinkedList {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        SingleLinkedListClass<Integer> l1 = new SingleLinkedListClass();
        SingleLinkedListClass<Integer> l2 = new SingleLinkedListClass();
        l1.addFirst(1);
        l1.addLast(2);
        l1.addLast(3);
        l2.addFirst(4);
        l2.addLast(5);
        l2.addLast(6);
        
        
        l1.merge(l2);
        l1.display(l1);
        
    }

}
