package com.scalar.datastructure.all;

import java.util.Scanner;

public class Main {
	static int[] stack;

	public static void main(String args[]) {

		Scanner sc = new Scanner(System.in);
		int choice;
		char str;
		do {
			System.out.println("\nChoose Your Data Structure");
			System.out.println("\n1. Stack");
			System.out.println("\n2. Queue");
			System.out.println("\n3. Array");
			System.out.println("\n4. Linked list");
			System.out.println("\n5. Exit");
			System.out.println("Enter your choice: ");
			choice = sc.nextInt();
			switch (choice) {
			case 1:
				System.out.println("Welcome in Stack");
				String str1;
				Stack s1 = new Stack();
				System.out.println("Enter your Stack Size");
				int A = sc.nextInt();
				stack = new int[A];
				do {
					System.out.println("\n1.push");
					System.out.println("\n2.pop");
					System.out.println("\n3.peek");
					System.out.println("\n4.Display");
					System.out.println("\n5.exit");
					System.out.println("\nenter your choice no");
					int choice2 = sc.nextInt();

					switch (choice2) {
					case 1:
						s1.push(stack);
						break;

					case 2:
						s1.pop(stack);
						break;

					case 3:
						s1.peek(stack);
						break;

					case 4:
						s1.display(stack);
						break;

					case 5:
						System.out.println("...Thank You...");
						break;

					default:
						System.out.println("Invalid input");
						break;
					}
					System.out.println("Stack Do you want to continue...Type - y/n ");
					str1 = sc.next();
				} while (str1.equalsIgnoreCase("y"));
				break;
			case 2:
				System.out.println("Welcome in Queue");
				MyQueue queue = new MyQueue();
				char str2;

				do {

					System.out.println("\n1.add");
					System.out.println("\n2.remove");
					System.out.println("\n3.display");
					System.out.println("\n4.peek");
					System.out.println("\n5.exit");
					System.out.println("\nEnter your choice no");

					int choice3 = sc.nextInt();
					switch (choice3) {
					case 1:
						try {
							queue.enqueue();
						} catch (Exception e) {
							System.out.println("This Queue is Designed only for Integer");
						}
						break;
					case 2:
						queue.dequeue();
						break;
					case 3:
						queue.display();
						break;
					case 4:
						queue.peek();
						break;

					case 5:
						System.out.println("...Thank You...");
						break;
					default:
					}

					System.out.println("Do you want to continue...Type - y/n ");
					str2 = sc.next().charAt(0);

				} while (str2 == 'y');

				break;

			case 3:
				System.out.println("Welcome in Array");
				char str3;
				Array array = new Array();

				System.out.println("Enter your Array Size");
				int B = sc.nextInt();
				int[] arr = new int[B];
				do {
					System.out.println("\n1.Add");
					System.out.println("\n2.Search");
					System.out.println("\n3.Insert");
					System.out.println("\n4.Delete");
					System.out.println("\n5.Display");

					System.out.println("\nEnter your choice no");
					int choice3 = sc.nextInt();
					switch (choice3) {
					case 1:
						array.add(arr);
						break;
					case 2:
						array.search(arr);
						break;
					case 3:
						array.insert(arr);
						break;
					case 4:
						array.delete(arr);
						break;
					case 5:
						array.display(arr);
						break;
					default:
					}
					System.out.println("Do you want to continue...Type - y/n ");
					str3 = sc.next().charAt(0);
				} while (str3 == 'y');

				break;
			case 4:
				MyLinkedlist ml = new MyLinkedlist();
				do {
					int data;
					int pos;
					System.out.println("\n1.isEmpty()");
					System.out.println("\n2.getCount()");
					System.out.println("\n3.insertAtLast");
					System.out.println("\n4.insertAtFirst");
					System.out.println("\n5.insertAtPosition");
					System.out.println("\n6.deleteAtPosition");
					System.out.println("\n7.deleteAtLast");
					System.out.println("\n8.deleteAtFirst");
					System.out.println("\n9.display");

					System.out.println("\nEnter your choice no");
					int choice3 = sc.nextInt();
					
					switch (choice3) {
					case 1:
						ml.isEmpty();
						break;
					case 2:
						ml.getCount();
						break;
					case 3:
						System.out.println("Enter your Value");
						data = sc.nextInt();
						ml.insertAtLast(data);
						break;
					case 4:
						System.out.println("Enter your Value");
						data = sc.nextInt();
						ml.insertAtFirst(data);
						break;
					case 5:
						System.out.println("Enter your Value");
						data = sc.nextInt();
						System.out.println("Enter your Position");
						pos = sc.nextInt();
						ml.insertAtPosition(data, pos);
						break;
					case 6:
						System.out.println("Enter your Position");
						pos = sc.nextInt();
						ml.deleteAtPosition(pos);
						break;
					case 7:
						ml.deleteAtLast();

						break;
					case 8:
						ml.deleteAtFirst();
						break;
					case 9:
						ml.display();
						break;
					default:
					}
					System.out.println("Do you want to continue...Type - y/n ");
					str3 = sc.next().charAt(0);
				} while (str3 == 'y');

				break;
			default:
				System.out.println("Invalid Input");
			}

			System.out.println("Ds Do you want to continue...Type - y/n ");
			str = sc.next().charAt(0);

		} while (str == 'y');

	}

	int data;

}