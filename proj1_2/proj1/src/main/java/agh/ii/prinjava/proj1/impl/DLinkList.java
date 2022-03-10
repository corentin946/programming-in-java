package agh.ii.prinjava.proj1.impl;


public class DLinkList<E> {

    private Node<E> first;
    private Node<E> last;
    private int size = 0;

    private static class Node<T> {
        T elem;
        Node<T> next;
        Node<T> prev;


        public Node(T element,Node<T> next,Node<T> prev) {
            this.elem = element;
            this.next = next;
            this.prev = prev;
        }
    }
    /** Inserts the specified element at the beginning of this list. */
    public void addFirst(E e){
        Node<E> f = first;
        Node<E> newNode = new Node<>(e,f,null); /** We create a new Node as the first of the list if the previous is null */
        first = newNode;
        if (f == null) last = newNode; /** If the first Node is null we create a new last Node */
        else f.prev = first; /** else the previous become the first Node */
        size++;
    }
        /** Inserts the specified element at the end of this list. */
    public void addLast (E e) {
        Node<E> f = last;
        Node<E> newNode = new Node<> (e,null,f); /** we create a new Node as the last of the list if the next is null */
        last = newNode;
        if (f == null) first = newNode;  /** If the last Node is null we create a new first Node */
        else f.next = last;  /** else the next become the last */
        size++;
    }
    /**Removes and returns the first element from this list.*/
    public E removeFirst() {

        Node<E> f = first;
        E element = f.elem; /** we create an element for our first elemnt of the list */
        Node<E> next = f.next; /** we also get the next element */
        first = next;
        if (next == null) /** if our next element is null the last element of the Node is null too */
            last = null;
        else
            next.prev = null; /** else we remove the element and decrease the size of the list */
        size--;

        return element; /** we returning the element to store it at the end */

    }
    /**Removes and returns the last element from this list.*/
    public E removeLast(){
        Node<E> f = last;
        E element = f.elem; /** we create an element for our last element of the list */
        Node<E> prev = f.next; /** we also get the previous element */
        last = prev;
        if (prev == null) /** if our previous element is null the first element of the Node is null too */
            first = null;
        else
            prev.next = null; /** else we remove the element and decrease the size of the list */
        size--;

        return element; /** we returning the element to store it at the end */
    }

    public int getSize(){ /** get the size of the list */
        return size;
    }

    /**Returns a string representation of this collection.*/
    public String ToString(){
        return "element";
    }
}