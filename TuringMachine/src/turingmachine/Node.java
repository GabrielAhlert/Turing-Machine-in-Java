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
        
            Node temp =new Node(data);
            temp.prev = this;
            this.next = temp;
            return temp;



    }
    
    public Node getNext(){
        if(this.next == null){
            Node temp = new Node();
            this.next = temp;
            temp.prev = this;     
            return(temp);   
        }
        else
            return (this.next);
    }
    
    public Node getPrev(){
        if(this.prev == null){
            Node temp = new Node();
            temp.next = this;
            this.prev = temp;
            return(temp);
        }
        else
            return (this.prev);
    }

    
    
    
}
