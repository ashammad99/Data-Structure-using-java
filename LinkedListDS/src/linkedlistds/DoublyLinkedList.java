/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package linkedlistds;

/**
 *
 * @author sami-
 */
public class DoublyLinkedList<E> {

    public Node<E> header;
    public Node<E> tailer;
    public int size = 0;
    
    //Constructor
    public DoublyLinkedList() {
        header = new Node<>(null,null,null);
        tailer = new Node(null , header, null);
        header.setNext(tailer);
    }
    
    //Methods 
    //1- Get Size
        public int size() { return size;}
    
    //2- Check if list is empty
        public boolean isEmpty() { return size == 0;}
    
    //3- Get Value of first element
        public E getFirst() { if(isEmpty()) return null; return header.getNext().getElement();}
    
    //4- Get Value of last element
        public E getLast() {if(isEmpty()) return null; return tailer.getPrev().getElement();}
    
    //5- Get Elment value by index
        public E get(int index) {
        if (isEmpty()  || index < 0) {
            return null;
        }
        if (index < size) {
            int counter = 0;
            Node<E> currentNode = header.getNext();
            while (index != counter) {
                currentNode = currentNode.getNext();
                counter++;
            }
            return currentNode.getElement();
        }else
        return null;
    }
    //6- add Element at first 
        public void addFirst(E e) {
            addBetween(e, header, header.getNext());
        }
    //7- add Element at Last
        public void addLast(E e){
            addBetween(e, tailer.getPrev(), tailer);
        }
    //8- Add ELement between two selected Nodes
        public void addBetween(E e, Node<E> next, Node<E> prev) {
        Node<E> newest = new Node(e, next, prev);
        next.setNext(newest);
        prev.setPrev(newest);
        size++; 
    }
    //9- To Delete node in start or end 
        public E remove(Node<E> node) {
            Node<E> prevNode = node.getPrev();
            Node<E> nextNode = node.getNext();
            prevNode.setNext(nextNode);
            nextNode.setPrev(prevNode);
            size--;
            return node.getElement();
        }
    //10- To remove element at the first
        public E removeFirst() {
            if (isEmpty()) {
                return null;
            }
            Node<E> removedNode = header.getNext();
            Node<E> prevNode = header;
            Node<E> nextNode = removedNode.getNext();
            
            prevNode.setNext(nextNode);
            nextNode.setPrev(prevNode);
            size--;
            return removedNode.getElement();
            //we can use remove(Node) method instead of the code in the above in this method
            //return remove(header.getNext())
        }
    //11- To remove elment at the last
        public E removeLast(E e) {
            if (isEmpty()) {
                return null;
            }
            return remove(tailer.getPrev());
        }
    //12- inverse and print doubly linked list element
        public void loopBackword() {
            for(int x = size - 1; x < size && x >= 0;x--) {
                System.out.println("Index of:" + x + " = " + get(x));
            }
        }
    //13- Get index of specificed value in list
        public int indexOf(Object o) {
        int index = 0;
        for (Node<E> x = header.getNext(); x != null; x = x.getNext()) {
            if (o.equals(x.getElement())) {
                return index;
            }
            index++;
        }
        return -1;
    }
   //14- Check if Elment entered as parameter is exist in this list or not
        public boolean Contains(Object o) {
		Node<E> temp = header.getNext();
		while (temp != tailer.getPrev() && temp.getElement() != o) {
			temp = temp.getNext();
		}
                return o == temp.getElement();
        }
    //15- Display elemnts in list
        public void display() {
            for (int i = 0; i < size(); i++) {
                System.out.println("Index of:" + i + " = " + get(i));
            }
        }
    //16- Add by Index
	public void add(int index,E e) {
		if (index < 0 || index > size) {
			throw new IllegalArgumentException("Index is Invalid");
		} 
                if (index == 0) {
                    addFirst(e);
                    return;
            }
                
		
		Node<E> newNode = new Node<E>(e, null, null);
		Node<E> tempNode = header.getNext();
		Node<E> prevNode = null;
		for (int i = 0; i < index; i++) {
			if (tempNode.getNext() == null) {
				break;
			}
			prevNode = tempNode;
			tempNode = tempNode.getNext();
		}
		prevNode.setNext(newNode);
		newNode.setNext(tempNode);
		size++;
	}
    public static class Node<E> {

        private Node<E> next;
        private Node<E> prev;
        private E Element;

        public Node(E e, Node<E> n, Node<E> p) {
            Element = e;
            next = n;
            prev = p;
        }

        /**
         * @return the next
         */
        public Node<E> getNext() {
            return next;
        }

        /**
         * @param next the next to set
         */
        public void setNext(Node<E> next) {
            this.next = next;
        }

        /**
         * @return the prev
         */
        public Node<E> getPrev() {
            return prev;
        }

        /**
         * @param prev the prev to set
         */
        public void setPrev(Node<E> prev) {
            this.prev = prev;
        }

        /**
         * @return the Element
         */
        public E getElement() {
            return Element;
        }



    }

}
