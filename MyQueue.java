package com.scalar.datastructure.all;

import java.util.Scanner;

public class MyQueue {
	Scanner sc = new Scanner(System.in);
	int front = -1;
	int rear = -1;
	int[] MyQueue = new int[5];
	int data;

	void enqueue() { 
		System.out.println("Enter the data : ");
		if(sc.hasNextInt()) {
			data = sc.nextInt();
		}else {
			System.out.println("Enter Integer Value Only");
			sc.nextInt();
		}
		if (rear == MyQueue.length - 1) {
			System.out.println("Queue is full");

		} else {
			front =0; 
			rear++;
			MyQueue[rear] = data;
		}
	}

	void dequeue() {
		if (front == -1 && rear == -1) {
			System.out.println("The queue is empty ");
		} else if (front == rear) {
			front = rear = -1;
			System.out.println("Element removed : " + MyQueue[front]);

		} else {
			System.out.println("Element removed : " + MyQueue[front]);
		}
	}

	void display() {
		if (front == -1 && rear == -1) {
			System.out.println("The queue is empty");
		} else {
			System.out.println("The element is :  ");
			for (int i = front; i <= rear; i++) {
				System.out.println(MyQueue[i]);
			}
		}
	}

	void peek() {
		if (front == -1) {
			System.out.println("Queue is empty");
		} else {

			System.out.println("The front element is : " + MyQueue[front]);

		}
	}
}
