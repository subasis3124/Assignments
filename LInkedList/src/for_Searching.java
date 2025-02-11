/*Subasis Mishra
 *28
 *Section 3b1 
 */
import java.util.*;
class node {
    int info;
    node link;
}

public class for_Searching {
    static node head = null;
    Scanner sc = new Scanner(System.in);

    void create() {
        node p = new node();
        System.out.println("Enter info");
        p.info = sc.nextInt();
        p.link = null;
        head = p;

        System.out.println("Want to enter more nodes (y/n)? ");
        char ch = sc.next().charAt(0);
        while (ch != 'n') {
            node q = new node();
            System.out.println("Enter info");
            q.info = sc.nextInt();
            q.link = null;
            p.link = q;
            p = q;
            System.out.println("Want to add more nodes (y/n)? ");
            ch = sc.next().charAt(0);
        }
    }

    public static int search(int ele) {
        node temp = head;
        int pos = 0;
        while (temp != null) {
            pos++;
            if (temp.info == ele)
                return pos;
            temp = temp.link;
        }
        return -1;
    }

    public static void main(String[] args) {
        for_Searching ob = new for_Searching();
        Scanner sc = new Scanner(System.in);
        ob.create();
        System.out.println("Enter the element to search: ");
        int e = sc.nextInt();
        int res = search(e);
        if (res != -1) {
            System.out.println("Element found at position: " + res);
        } else {
            System.out.println("Element not found.");
        }
    }
}
