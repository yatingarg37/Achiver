package assignments;

import java.util.Scanner;


public class rotate_ll {
	Node head;
	static class Node {
		int data;
		Node next;
		Node(int d) {
			data = d;
			next=null;
		}
	}
	public static rotate_ll insert(rotate_ll li,int d) {
		Node newNode = new Node(d);
		newNode.next = null;
		if (li.head == null) {
			li.head = newNode;
		} else {
			Node last = li.head;
			while (last.next != null) {
				last = last.next;

			}
			last.next = newNode;
		}
		return li;
	}
	public static void main(String arg[]) {
		rotate_ll li=new rotate_ll();
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the no. of elements");
		int n=sc.nextInt();
		System.out.println("Enter the Elements");
		for(int i=0;i<n;i++) {
			int d=sc.nextInt();
			insert(li,d);
		}
		System.out.println("Enter the value of k");
		int k=sc.nextInt();
		rotate(li,k);
		System.out.println("Linked List after Rotation");
		display(li);
	}
	private static void display(rotate_ll li) {
		Node temp=li.head;
		while(temp!=null) {
			System.out.print(temp.data+" ");
			temp=temp.next;
		}

	}
	public static rotate_ll rotate(rotate_ll li, int k) {
		while(k!=0) {
			Node temp=li.head;
			Node temp1=li.head;
			while(temp.next.next!=null) {
				temp=temp.next;
			}
			temp.next.next=li.head;
			li.head=temp.next;
			temp.next=null;
			k--;
		}
		return li;
	}
}
