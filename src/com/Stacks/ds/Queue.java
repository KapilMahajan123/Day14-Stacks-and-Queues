package com.Stacks.ds;

/**
 * 
 * @author Kapil
 *
 */
public class Queue {
	
	LinkedList list = new LinkedList(); //Declaring linked list

	public void enQueue(Object data) {
		list.addFirst(data);
	}
	//display method
	public void display() {
		list.display();
	}

	public static void main(String[] args) {
		System.out.println("Welcome to Stack and Queue Data structure");
		Queue queue = new Queue();
		queue.enQueue(70);
		queue.enQueue(30);
		queue.enQueue(56);
		queue.display();
	}

}
