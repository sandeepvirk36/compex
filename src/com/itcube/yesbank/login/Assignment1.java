/**
 * 
 */
package com.itcube.yesbank.login;

import java.util.Scanner;

/**
 * @author Sandeep.Virk
 *
 */
public class Assignment1 {
	 static int a;
	static int b;
	

	public static int addition() {
		int sum;
		sum = a + b;
		return sum;
	}
  public static int multiplication() {
	  int sum;
	  sum = a * b;
		return sum;
  }
  public static int Subtraction() {
	  int sum;
	  sum = a - b;
		return sum;
  }
  public static double division() {
	  
	double  sum =(float) a / b;
		return sum;
  }
	@SuppressWarnings("resource")
	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the First Number");
		a = scanner.nextInt();

		System.out.println("Enter the Second Number");
		b = scanner.nextInt();
		addition();
		Subtraction();
		division();
		multiplication();
         
		System.out.println("Sum of two numbers is :" + addition());
		System.out.println("Sum of two numbers is :" + multiplication());
		System.out.println("Sum of two numbers is :" + Subtraction());
		System.out.println("Sum of two numbers is :" + division());

	}

}
