/**
 * 
 */
package com.itcube.yesbank.login;

import java.io.File;
import java.util.Scanner;

/**
 * @author Sandeep.Virk
 *
 */
public class FirstProgram {
	public static void main(String args[]) throws Exception{
		System.out.println("Hello World");
		File file = new File("C:\\Program Files\\Notepad++\\readme.txt");
		Scanner scanner = new Scanner(file);
		System.out.println(scanner.nextLine());
	}

}
