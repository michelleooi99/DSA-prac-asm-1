/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package SinglyLink;

/**
 *
 * @author Tarc
 */
public interface Deque<T> {
    public void addFront(T item);
    public void addRear(T item);
    public T removeFront();
    public T removeRear();
    public boolean isEmpty();
    public int size();
}
