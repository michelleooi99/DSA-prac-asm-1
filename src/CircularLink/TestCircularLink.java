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
public class TestCircularLink {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Deque<Integer> deque = new CircularLink();
        
        deque.addFront(2);
        System.out.println(deque.toString());
        
        deque.addFront(3);
        System.out.println(deque.toString());
        
        deque.addFront(5);
        System.out.println(deque.toString());
        
        deque.addRear(4);
        System.out.println(deque.toString());
        
        deque.addRear(6);
        System.out.println(deque.toString());
        
        deque.removeFront();
        System.out.println(deque.toString());
        
        deque.removeRear();
        System.out.println(deque.toString());
    }
    
}
