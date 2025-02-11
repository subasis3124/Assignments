//insertion at the begining
import java.util.*;

class node {
	int info;
	node link;
}
public class InserBegining {
	Scanner sc = new Scanner(System.in);
	node head = null;
	void create() {
		node p = new node();
		System.out.println("enter info");
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
			System.out.println("want to add more node (y/n) ");
			ch = sc.next().charAt(0);
		}
	}
	void insbeg() {
		    node newnode = new node();
		    System.out.println("Enter info for the new node:");
		    newnode.info = sc.nextInt();
		    newnode.link = head;
		    head = newnode;
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
		InserBegining obj = new InserBegining(); 
		obj.create();
		obj.insbeg();
		obj.display();
	}

}
