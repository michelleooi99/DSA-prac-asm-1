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
public class SinglyLink<T> implements Deque<T> {
    
    Node lastNode = null;
    Node firstNode = null;
    int size = 0;
    
    public void addFront(T item){
        Node newNode = new Node(item);
        newNode.data = item;
        if (isEmpty()) {
            lastNode = newNode;
            firstNode = newNode;
        } else {
            newNode.next = firstNode;
            firstNode = newNode;
        }
        
        size += 1;
    }
    
    public void addRear(T item){
        Node newNode = new Node(item);
        newNode.data = item;
        if (isEmpty()) {
            lastNode = newNode;
            firstNode = newNode;
        } else {
            lastNode.next = newNode;
            lastNode = newNode;
        }
        
        size += 1;
    }
    
    public T removeFront(){
        T item;
        item = firstNode.data;
        firstNode = firstNode.next;
        size -= 1;
        
        return item;
    }
    
    public T removeRear(){
        T item;
        item = lastNode.data;
        Node node = firstNode;
        
        while(node.next != lastNode){
            node = node.next;
        }
        
        lastNode = node;
        size -= 1;
        
        return item;
    }
    
    public boolean isEmpty(){
        if (lastNode == null) {
            return true;
        } else {
            return false;
        }
    }
    
    public int size(){
        return size;
    }
    
    public String toString(){
        String s = " ";
        Node node = firstNode;
        
        while(node != lastNode){
            s += node.data + " ";
            node = node.next;
        }
        
        s += node.data + " ";
        
        return s;
    }
    
    public class Node {

        T data;
        Node next;

        public Node(T data) {
            this.data = data;
        }
    }
    
}
