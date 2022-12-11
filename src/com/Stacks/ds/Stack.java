package com.Stacks.ds;

/**
 * 
 * @author Kapil
 *
 */
public class Stack {
	
	LinkedList list = new LinkedList();  //declaring linked list
	
	//Add method
	public void push(Object data) {
		list.addLast(data);
	}
	//Display method
	public void display() {
		list.display();
	}

	public static void main(String[] args) {
		System.out.println("Welcome to Stack and Queue Data structure");
		Stack stack = new Stack();
		stack.push(56);
		stack.push(30);
		stack.push(70);
		stack.display();
	}
}