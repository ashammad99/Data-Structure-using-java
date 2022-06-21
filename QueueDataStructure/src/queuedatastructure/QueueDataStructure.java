/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package queuedatastructure;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;

/**
 *
 * @author sami-
 */
public class QueueDataStructure {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Queue<String> q1 = new LinkedList<String>();

        ArrayList<String> list = new ArrayList<String>();
        list.add(0, "Haneen");
        list.add(1, "Sara");
        list.add(2, "Huda");
        list.add(2, "Alaa");
        list.add(2, "Mona");
        list.set(1, "Rania");
        System.out.println("Element on index 1= " + list.get(1));
        for (String value : list) {
            System.out.print(value + " ");
        }

    }

}
