package com.pavitra.backTracking;
	class Node {
	    int data;
	    Node next;

	    public Node(int data) {
	        this.data = data;
	        this.next = null;
	    }
	}

	class CircularLL {
	    private Node head;

	    public CircularLL() {
	        this.head = null;
	    }

	    // Method to insert a node at the end of the circular linked list
	    public void insert(int data) {
	        Node newNode = new Node(data);

	        if (head == null) {
	            head = newNode;
	            head.next = head; // Point back to itself for the circular behavior
	        } else {
	            Node temp = head;
	            while (temp.next != head) {
	                temp = temp.next;
	            }
	            temp.next = newNode;
	            newNode.next = head;
	        }
	    }

	    // Method to display the elements of the circular linked list
	    public void display() {
	        if (head == null) {
	            System.out.println("Circular linked list is empty.");
	            return;
	        }

	        Node temp = head;
	        do {
	            System.out.print(temp.data + " ");
	            temp = temp.next;
	        } while (temp != head);
	        System.out.println();
	    }

	    public static void main(String[] args) {
	    	CircularLL cll = new CircularLL();
	        cll.insert(1);
	        cll.insert(2);
	        cll.insert(3);
	        cll.insert(4);

	        System.out.println("Circular Linked List:");
	        cll.display();
	    }
	}



