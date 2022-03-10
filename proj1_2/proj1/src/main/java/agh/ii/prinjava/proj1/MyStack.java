package agh.ii.prinjava.proj1;

import agh.ii.prinjava.proj1.impl.MyStackDLLBImpl;

public interface MyStack<E> {

    /** we can find an item from our arraylist E with the function pop **/
    E pop();

    /** remove and returns the item on the top of the list **/
    void push(E x);

    /** isEmpty allows to see if the list is empty or not **/
    default boolean isEmpty() {
        return numOfElems() == 0;
    }

    /** return the number of element in the list **/
    int numOfElems();

    /** return(only) the item on the top of the list **/
    E peek();

    /** Consider pros and cons of having a factory method in the interface */
    static <T> MyStack<T> create() {
        return new MyStackDLLBImpl<T>();
    }
}
