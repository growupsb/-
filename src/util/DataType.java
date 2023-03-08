package util;

import java.util.Scanner;

public class DataType {
	public static Scanner sc=new Scanner(System.in);
	public static int inputInt() {
		return sc.nextInt();
	}
	public static String inputString() {
		return sc.next();
	}
	public static String line() {
		return sc.nextLine();
	}
}
