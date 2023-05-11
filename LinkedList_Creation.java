import java.util.*;
//class Node{
//	Node next;
//	int data;
//	Node(int data){
//		this.data = data;
//		this.next = next;
//	}
//}
public class LinkedList_Creation {
	public Node head = null;
	public void create(int data) {
		Node newNode = new Node(data);
		if(head==null)
			head = newNode;
		else {
			newNode.next = head;
			head.next = null;
			head = newNode;
		}
			
	}
	public void create_for(int data) {
		Node newNode = new Node(data);
		if(head == null)
			head = newNode;
		else {
			Node temp = head;
	        while (temp.next != null) {
	            temp = temp.next;
	        }
	        
	        temp.next = newNode;
			}
		
	}
	public int lengthSL() {
		int len = 1;
		Node temp = head;
        while (temp.next != null) {
            temp = temp.next;
            len++;
        }
        return len;
	}
	public void print() {
		Node temp = head;
		if(head == null)
			System.out.println("NO LL");
		else {
			while(temp!=null) {
				System.out.println(temp.data + " ");
				temp = temp.next;
			}
		}
	}
	public static void main(String[]args) {
		LinkedList_Creation lc = new LinkedList_Creation();
		lc.create_for(1);
		lc.create_for(2);
		lc.create_for(3);
		lc.print();
		System.out.println(lc.lengthSL());
		
		
	}
	

}
