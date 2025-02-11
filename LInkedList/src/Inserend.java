//Insertion at the end of list
import java.util.*;
class node {
	node link;
	int info;
}
public class Inserend {
	Scanner sc = new Scanner(System.in);
	node head = null;
	void create() {
		node p = new node();
		System.out.println("input info");
		p.info = sc.nextInt();
		p.link = null;
		head = p;
		
		System.out.println("want to enter more node (y/n) ");
		char ch = sc.next().charAt(0);
		while(ch != 'n') {
			node q = new node();
			System.out.println("enter info");
			q.info = sc.nextInt();
			q.link = null;
			p.link = q;
			p = q;
			System.out.println("want to enter more (y/n) ");
			ch = sc.next().charAt(0);
		}
	}
	void insend() {
		node p = new node();
		System.out.println("input you want to add");
		p.info = sc.nextInt();
		p.link = null;
		if(head == null) {
			head = p;
		} else {
			node q = head;
			while(q.link != null) {
				q = q.link;
			}
			q.link = p;
		}
	}
	void display() {
		node temp = head;
		while(temp != null) {
			System.out.print(temp.info + "------> ");
			temp = temp.link;
		}
		System.out.println();
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Inserend obj = new Inserend();
		obj.create();
		obj.insend();
		obj.display();

	}

}
