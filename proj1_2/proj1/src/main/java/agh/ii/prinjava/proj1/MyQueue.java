package agh.ii.prinjava.proj1;

import agh.ii.prinjava.proj1.impl.MyQueueDLLBImpl;

public interface MyQueue<E> {

    /** Enqueue the given item to the back of the queue */
    void enqueue(E x);

    /** Remove and return the front item in the queue. */
    E dequeue();

    /** Return whether or not this queue is empty. */
    default boolean isEmpty() {
        return numOfElems() == 0;
    }

    /** return the number of element in the list **/
    int numOfElems();

    /** return(only) the item on the top of the list **/
    E peek();

    /** Consider pros and cons of having a factory method in the interface */
    static <T> MyQueue<T> create() {
        return new MyQueueDLLBImpl<>();
    }
}
