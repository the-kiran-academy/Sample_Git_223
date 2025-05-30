package com.tka;

public class Loop {
	
	public static void printTable() {
		for (int i = 1; i <= 10; i++) {
			System.out.println("2 * " + i + " = " + (2 * i));
		}
	}

	
	public static void printTableOfFour() {
		System.out.println("Table of four :");
		for (int i = 1; i <= 10; i++) {
			System.out.println("4 * " + i + " = " + (4 * i));
		}
	}
}
