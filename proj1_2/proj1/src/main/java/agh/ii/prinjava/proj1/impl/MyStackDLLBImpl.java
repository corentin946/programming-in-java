package agh.ii.prinjava.proj1.impl;

import agh.ii.prinjava.proj1.MyStack;

public class MyStackDLLBImpl<E> implements MyStack<E> {
    private DLinkList<E> elems;

    /** Removes the object at the top of this stack and returns that object as the value of this function. **/
    @Override
    public E pop() {
        return elems.removeLast();
    }

    /** Pushes an item onto the top of this stack. **/
    @Override
    public void push(E x){
        elems.addFirst(x);
    }

    /** isEmpty allows to see if the list is empty or not **/
    @Override
    public int numOfElems() {
        return elems.getSize();
    }

    /** Looks at the object at the top of this stack without removing it from the stack **/
    @Override
    public E peek() {
        E a;
        if ( elems.getSize()!=0){
            a = elems.removeFirst();
            elems.addFirst(a);
            return a;
        }
        else {
            return null;
        }

    }
}
