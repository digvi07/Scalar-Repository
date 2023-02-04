package com.scalar.datastructure.all;

import java.util.Scanner;

public class Array {

	static int[] arr;
	static int A;
	static Scanner sc = new Scanner(System.in);

	public void add(int arr[]) {
		System.out.println("ADD METHOD");
		for (int i = 0; i < arr.length; i++) {
			System.out.println("Enter the value in Array");
			arr[i] = sc.nextInt();

		}
		display(arr);

	}

	public void delete(int arr[]) {

		System.out.println("Enter Index no. which you want to Delete");
		int c = sc.nextInt();
		c = c - 1;
		if (c < 0 | c > arr.length) {
			System.out.println("Invalid Index Position");
		} else {

			for (int i = c; i < arr.length - 1; i++) {
				arr[i] = arr[i + 1];
			}
			A--;
			System.out.println("Array after Deleting the Element");
			for (int i = 0; i < arr.length - 1; i++) {
				System.out.println(arr[i]);
			}
		}
	}

	public static void display(int arr[]) {
		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}

	}

	public static void insert(int arr[]) {

		System.out.println("Enter your Index no");
		int a = sc.nextInt();
		a = a - 1;
		System.out.println("Enter your Value");
		int b = sc.nextInt();

		for (int i = a; i < arr.length; i++) {
			if (i == a) {
				arr[i] = b;
				break;
			}
		}
		System.out.println("After insering the value");
		display(arr);

	}

	public void search(int arr[]) {

		System.out.println("Enter your Value");
		int a = sc.nextInt();
		boolean flag = false;

		for (int i = 0; i <= arr.length - 1; i++) {

			if (a == arr[i]) {
				System.out.println("value is Present at index " + i);
				flag = true;
			}
		}
		if (flag == false) {
			System.out.println("Value is Not present");
		}

	}

//	public static void main(String[] args) {
//		Array ar = new Array();
//		System.out.println("Enter your Array Size");
//		A = sc.nextInt();
//		arr = new int[A];
//		char choose;
//
//		do {
//			System.out.println("1");
//			System.out.println("Welcome To Array Data Structure");
//			System.out.println("\n1 Add value");
//			System.out.println("\n2 Display Array ");
//			System.out.println("\n3 Delete Array");
//			System.out.println("\n4 Search Array");
//			System.out.println("\n5 Insert Array");
//			System.out.println("\nEnter your Choice No");
//
//			int choice = sc.nextInt();
//			if (choice > 0 && choice <= 5) {
//
//				switch (choice) {
//				case 1:
//					ar.add();
//					break;
//				case 2:
//					ar.display();
//					break;
//				case 3:
//					ar.delete();
//					break;
//				case 4:
//					ar.search();
//					break;
//				case 5:
//					ar.insert();
//					break;
//				}
//
//			} else {
//				System.out.println("Invalid Input");
//			}
//			System.out.println("\nDo You Want to continue choose- (y/n) ");
//			choose = sc.next().charAt(0);
//		} while (choose == 'y');
//
//		System.out.println("Thank You");
//	}
}
