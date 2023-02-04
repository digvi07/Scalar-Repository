package com.scalar.datastructure.all;

import java.util.Scanner;

public class Stack {

	Scanner sc = new Scanner(System.in);
	int top = -1;

	void push(int[] stack) {

		int data = 0;
		System.out.println("Enter your value");
		if (sc.hasNextInt()) {
			data = sc.nextInt();
		} else {
			System.out.println("Enter only Integer Value");
		}

		if (top == stack.length - 1) {
			System.out.println(" Stack Overflow ");
		} else {
			top++;
			stack[top] = data;
		}

	}

	void pop(int stack[]) {
		int value;
		if (top == -1) {
			System.out.println("empty");

		} else {
			value = stack[top];
			top--;
			System.out.println("element" + value);

		}

	}

	void peek(int stack[]) {
		if (top == -1) {
			System.out.println("stack is empty");
		} else {
			System.out.println("element is " + stack[top]);

		}
	}

	public void display(int[] stack) {

		System.out.println("stack Elements: ");
		for (int i = top; i >= 0; i--) {
			System.out.println(stack[i]);
		}
	}

}