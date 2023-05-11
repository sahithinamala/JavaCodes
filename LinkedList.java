import java.util.*;
class Node{
	Node next;
	int data;
	Node(int data){
		this.next = next;
		this.data = data;
	}
}
public class LinkedList {
	public Node head = null;
	public Node tail = null;
	public  void create(int data) {
		Node newNode = new Node(data);
		if(head == null) {
			head=newNode;
			tail=newNode;
			
		}
		else {
			tail.next = newNode;
			newNode.next = null;
			
		}
			}
    public void display() {  
        //Node current will point to head  
        Node current = head;  
          
        if(head == null) {  
            System.out.println("List is empty");  
            return;  
        }  
        System.out.println("Nodes of singly linked list: ");  
        while(current != null) {  
            //Prints each node by incrementing pointer  
            System.out.print(current.data + " ");  
            current = current.next;  
        }  
        System.out.println();  
    }  
	public static void main(String[]args) {
		LinkedList sList = new LinkedList();  
         
	        //Add nodes to the list  
	        sList.create(1);  
	        sList.create(2);  
	        sList.create(3);  
	        sList.create(4);  
	          
	        //Displays the nodes present in the list  
	        sList.display();  
	}
	
	
}
