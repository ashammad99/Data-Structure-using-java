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
public interface QueueInterface<E> {
     
	int size();
	boolean isEmpty();
	E getFirst();	
	void enqueue(E e);
	E dequeue();

}
