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
public class TestSinglyLink {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Deque<Integer> deque = new SinglyLink();
        
        deque.addFront(1);
        System.out.println(deque.toString());
        
        deque.addFront(2);
        System.out.println(deque.toString());
        
        deque.addRear(3);
        System.out.println(deque.toString());
        
        deque.removeFront();
        System.out.println(deque.toString());
        
        deque.removeRear();
        System.out.println(deque.toString());
    }
    
}
