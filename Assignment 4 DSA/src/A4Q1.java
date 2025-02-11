import java.util.*;
class Node {
    protected int regd_no;
    protected float mark;
    protected Node next;

   
}
public class A4Q1 {
	    Scanner sc = new Scanner(System.in);
	    static Node head = null;

	    

	    public void create() {
	    	Node p = new Node();
	        System.out.println("Enter your registration number and mark:");
	        p.mark = sc.nextFloat();
			p.regd_no = sc.nextInt();
			p.next = null;
			head = p;
			
			System.out.println("do you want to add more (y/n) ");
			char ch = sc.next().charAt(0);
			while(ch  != 'n') {
				Node q = new Node();
				System.out.println("enter your redgno. and mark ");
				q.regd_no = sc.nextInt();
				q.mark = sc.nextFloat();
				q.next = null;
				p.next = q;
				p = q;
				System.out.println("do you want to add more (y/n)");
				ch = sc.next().charAt(0);
			}
		}
	    void ins_beg() {
	    	Scanner sc = new Scanner(System.in);
	    	System.out.println("enter redgno. and mark");
	    	int redg_no = sc.nextInt();
	    	float mark = sc.nextFloat();
	    	Node newnode = new Node();
	    	newnode.regd_no = redg_no;
	    	newnode.mark = mark;
	    	newnode.next = head;
	    	head = newnode;
	    }
	    void ins_end() {
	    	Scanner sc = new Scanner(System.in);
	    	System.out.println("enter mark and redgno.");
	    	int regd_no = sc.nextInt();
	    	float mark = sc.nextFloat();
	    	Node p = new Node();
	    	p.regd_no = regd_no;
	    	p.mark = mark;
	    	p.next = null;
	    	if(head == null) {
	    		head = p;
	    	}else {
	    		Node q = head;
	    		while(q.next != null) {
	    			q = q.next;
	    			q.next = p;
	    		}
	    	}
	    }
	    int countnodes() {
	        int c = 0;
	        if (head == null) {
	            return c;
	        }
	        Node temp = head;
	        do {
	            c++;
	            temp = temp.next;
	        } while (temp != head);
	        return c;
	    }

	    void ins_loc() {
	        Scanner sc = new Scanner(System.in);
	        System.out.println("Enter the position to insert:");
	        int loc = sc.nextInt();

	        int nodeCount = countnodes();
	        if (loc < 1 || loc > nodeCount + 1) {
	            System.out.println("Position out of range");
	            return;
	        }

	        System.out.println("Enter registration number and mark:");
	        int regd_no = sc.nextInt();
	        float mark = sc.nextFloat();
	        Node newNode = new Node();

	        if (loc == 1) {
	            if (head == null) {
	                head = newNode;
	                newNode.next = newNode;
	            } else {
	                Node temp = head;
	                while (temp.next != head) {
	                    temp = temp.next;
	                }
	                newNode.next = head;
	                head = newNode;
	                temp.next = head;
	            }
	        } else {
	            Node p = head;
	            for (int i = 1; i < loc - 1; i++) {
	                p = p.next;
	            }
	            newNode.next = p.next;
	            p.next = newNode;
	        }
	    }

	    void delbeg() {
	    	if(head == null) {
	    		System.out.println("underflow");
	    		return;
	    	}
	    	head = head.next;
	    }
	    void delend() {
	    	if(head == null) {
	    		System.out.println("underflow");
	    		return;
	    	}else if(head.next == null) {
	    		delbeg();
	    	}else {
	    		Node temp = head;
	    		while(temp.next.next != null) {
	    			temp = temp.next;
	    			temp.next = null;
	    		}
	    	}
	    }
	    void delloc() {
	    	System.out.println("input the location of deletion");
	    	int loc = sc.nextInt();
	    	int c = countnodes();
	    	if(loc < c + 1) {
	    		if(head == null) {
	    			System.out.println("underflow");
	    			if(loc == 1) {
	    				delbeg();
	    			}else if (loc == c) {
	    				delend();
	    			}else {
	    				Node temp = head;
	    				int cnt = 1;
	    				while(loc < loc - 1) {
	    					cnt++;
	    					temp = temp.next;
	    				}
	    				temp.next = temp.next.next;
	    			}
	    		}
	    	}
	    }
	    
	    public static void search(int regd_no, float newMark) {
	        Node temp = head;
	        while (temp != null) {
	            if (temp.regd_no == regd_no) {
	                temp.mark = newMark;
	                System.out.println("Mark updated for registration number " + regd_no);
	                return;
	            }
	            temp = temp.next;
	        }
	        System.out.println("Node with registration number " + regd_no + " not found.");
	    }
	    void reverse() {
	    	Node temp = head;
	    	if(countnodes(temp) >= 2) {
	    		Node p = null, q = head, r = head.next;
	    		q.next = null;
	    		while(r != null) {
	    			p = q;
	    			q = r;
	    			r = r.next;
	    			q.next = p;
	    		}
	    		head = q;
	    	}
	    }
	    void sort() {
	    	 if (head == null || head.next == null) {
	             return;
	         }

	         Node current = head;
	         Node index = null;
	         int tempRegd;
	         float tempMark;

	         while (current != null) {
	             index = current.next;
	             while (index != null) {
	                 if (current.mark < index.mark) {
	                     // Swap the data
	                     tempMark = current.mark;
	                     current.mark = index.mark;
	                     index.mark = tempMark;

	                     tempRegd = current.regd_no;
	                     current.regd_no = index.regd_no;
	                     index.regd_no = tempRegd;
	                 }
	                 index = index.next;
	             }
	             current = current.next;
	         }
	     }
	    void display() {
	    	Node temp = null;
	    	while(temp != null) {
	    	System.out.print(temp.regd_no + "-----> ");
	    	temp = temp.next;
	    }
	    	System.out.println();
	  }
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		A4Q1 ob = new A4Q1();
		Scanner sc = new Scanner(System.in);
		while(true) {
			System.out.println("0 : EXIT");
			System.out.println("1 : CREATE");
			System.out.println("3 : INSERTION AT BEGGINING");
			System.out.println("4 : INSERTION AT END");
			System.out.println("5 : INSERTION AT LOCATION");
			System.out.println("6 : DELETE AT BEGINING");
			System.out.println("7 : DELETE AT END");
			System.out.println("8 : DELETE AT LOCATION");
			System.out.println("9 : DELETE BY REDG NUMBER");
			System.out.println("10 : SEARCH ");
			System.out.println("11 : COUNTNODES");
			System.out.println("12 : REVERSE");
			System.out.println("13 : SORT");
			System.out.println("WHAT TO SELECT... ?");
			int c = sc.nextInt();
			switch(c) {
			case 0: 
				System.exit(0);
			case 1:
				ob.create();
			case 2:
				ob.display();
			case 3:
				ob.ins_beg();
			case 4:
				ob.ins_end();
			case 5:
				ob.ins_loc();
			case 6:
				ob.delbeg();
			case 7:
				ob.delend();
			case 8:
				ob.delloc();
			/*case 9:
				ob.DelByRegdNo(c);*/
			case 9:
				 System.out.println("Enter registration number to search and update:");
                 regd_no = sc.nextInt();
                 System.out.println("Enter new mark:");
                 float newMark = sc.nextFloat();
                 search(regd_no, newMark);
                 break;
			case 10:
				ob.countnodes();
			case 11:
				ob.reverse();
			case 12:
				ob.sort();
			    break;
			default:
				System.out.println();
			}
		}

	}

}
