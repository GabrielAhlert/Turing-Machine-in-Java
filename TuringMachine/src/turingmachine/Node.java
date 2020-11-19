/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package turingmachine;

/**
 *
 * @author gabri
 */
public class Node {
    String data = " ";
    Node prev,next;

    public Node(String data) {
        this.data = data;
    }

    public Node() {
    }
    
    public Node add(String data){
        return this.next = new Node(data);
    }
    
    public Node getNext(){
        if(this.next == null)
            return(this.next = new Node());
        else
            return (this.next);
    }
    
    public Node getPrev(){
        if(this.prev == null)
            return(this.prev = new Node());
        else
            return (this.prev);
    }

    
    
    
}
