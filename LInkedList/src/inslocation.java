import java.util.*;
class node {
	node link;
	int info;
}
public class inslocation {
	Scanner sc = new Scanner(System.in);
	node head = null;
	void create() {
		node p = new node();
		System.out.println("input info");
		p.info = sc.nextInt();
		p.link = head;
		head = p;
		
		System.out.println("want to enter more (y/n) ");
		char ch = sc.next().charAt(0);
		while(ch != 'n') {
			node q = new node();
			System.out.println("enter info");
			q.info = sc.nextInt();
			q.link = null;
			p = q;
			System.out.println("want to eneter more (y/n) ");
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
			System.out.print(temp.info + " ----> ");
			temp = temp.link;
		}
		System.out.println();
	}public int countnode() {
        int cnt = 0;
        node current = head;
        while (current != null) {
            cnt++;
            current = current.link;
        }
        return cnt;
    }
	void insloc() {
	System.out.println("enterr the node where you want to perform insertion");
	int loc = sc.nextInt();
	int c = countnode();
	if(loc < c + 1) {
		if(loc == 1) {
			insbeg();
		}else if (loc == c + 1) {
			insend();
		}else {
			node p = new node();
			System.out.println("enter the info part");
			p.info = sc.nextInt();
			node q = head;
		int c = 1;
		while(cnt < loc - 1) {
			
		}
		}
	}
	
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
