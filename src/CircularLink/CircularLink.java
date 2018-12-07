/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CircularLink;

/**
 *
 * @author Tarc
 */
public class CircularLink<T> implements Deque<T> {
    
    Node lastNode = null;
    int size = 0;
    
    public void addFront(T item){
        Node newNode = new Node(item);
        if (isEmpty()) {
            lastNode = newNode;
            lastNode.next = newNode;
        } else {
            newNode.next = lastNode.next;
            lastNode.next = newNode;
        }
        
        size += 1;
    }
    
    public void addRear(T item){
        Node newNode = new Node(item);
        if (isEmpty()) {
            lastNode = newNode;
            lastNode.next = newNode;
        } else {
            newNode.next = lastNode.next;
            lastNode.next = newNode;
            lastNode = newNode;
        }
        
        size += 1;
    }
    
    public T removeFront(){
        T item;
        item = lastNode.next.data;
        
        lastNode.next = lastNode.next.next;
        
        size -= 1;
        return item;
    }
    
    public T removeRear(){
        T item;
        item = lastNode.data;
        
        Node node = lastNode.next;
        
        while(node.next != lastNode){
            node = node.next;
        }
        
        node.next = lastNode.next;
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
        Node node = lastNode.next;
        
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
