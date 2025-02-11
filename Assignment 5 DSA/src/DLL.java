import java.util.*;
class Node {
	protected Node next;
	protected Node prev;
	protected int redg_no;
	protected float mark;
}
public class DLL {
	static Node head = null;
	static Node tail = null;
	
	void create() {
		Scanner sc = new Scanner(System.in);
	    Node p = new Node();
	    System.out.println("enter rgistration number");
	    p.redg_no = sc.nextInt();
	    System.out.println("enter mark");
	    p.mark = sc.nextFloat();
	    p.prev = p.next = null;
	    head = tail = p;
	    System.out.println("want to create more Nodes");
	    char ch = sc.next().charAt(0);
	    while(ch != 'n') {
	    	Node q = new Node();
	    	System.out.println("enter registation number");
	    	q.redg_no = sc.nextInt();
	    	System.out.println("enter marks");
	    	q.mark = sc.nextFloat();
	    	q.prev = q.next = null;
	    	p.next = q;
	    	q.prev = p;
	    	p = q;
	    	tail = q;
	    	System.out.println("want to create more");
	    	ch = sc.next().charAt(0);
	    }
	}
	void backwardispaly() {
		Node temp = head;
		while(temp != null) {
			System.out.println(temp.mark + "\t" + temp.redg_no + " -----> ");
			temp = temp.next;
		}
	}
	void forwarddisplay() {
		Node temp = head;
		while(temp != null) {
			System.out.println(temp.mark + "\t" + temp.redg_no + " -----> ");
			temp = temp.prev;
		}
	}
	void insbeg(int redg_no, float mark) {
		Node p = new Node();
		p.mark = mark;
		p.redg_no = redg_no;
		p.prev = null;
		p.next = head;
		
		if(head != null) {
			head.prev = p;
		}
		head = p;
		
		if(tail == null) {
			tail = p;
		}
		
	}
	void insend(int redg_no,float mark) {
		Node q = new Node();
		q.mark = mark;
		q.redg_no = redg_no;
		q.prev = tail;
		q.next = null;
		
		if(tail != null) {
			tail.next = q;
		}
		
		tail = q;
		
		if(head == null) {
			head = q;
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
