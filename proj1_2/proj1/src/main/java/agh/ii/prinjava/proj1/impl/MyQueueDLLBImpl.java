package agh.ii.prinjava.proj1.impl;

import agh.ii.prinjava.proj1.MyQueue;

public class MyQueueDLLBImpl<E> implements MyQueue<E> {
    private DLinkList<E> elems;

    /** Enqueue the given item to the back of the queue */
    @Override
    public void enqueue(E x) {
        elems.addLast(x);
    }

    /** Remove and return the front item in the queue. */
    @Override
    public E dequeue(){
        return elems.removeLast();
    }

    /** Return the number of element in the list **/
    @Override
    public int numOfElems() {
        return elems.getSize();
    }

    /** Retrieves, but does not remove, the head of this queue, or returns null if this queue is empty. **/
    @Override
    public E peek() {
        E b;
        if (elems.getSize()!=0){
            b = elems.removeLast();
            elems.addLast(b);
            return b;
        }
        else {
            return null;
        }
    }
}
