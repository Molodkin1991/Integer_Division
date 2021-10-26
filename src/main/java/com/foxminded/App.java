package com.foxminded;

import java.util.Scanner;

public class App {
	private static final String MESSAGE_FOR_INTEGER = "Write some integer: ";
	private static final String MESSAGE_FOR_DIVIDER = "Write divider: ";
	private static final String RESULT_MESSAGE = "Division result: ";

	public static void main(String[] args) {
		IntegerDivision integerDivision = new IntegerDivision();
		System.out.println(RESULT_MESSAGE + integerDivision.divide(validationInputInt(),validationDivider()));
	}
	public static String validationInputInt(){
		String inputInt = readInt();
		char[] intCharacters = inputInt.toCharArray();
		for(int i=0;intCharacters.length>i;i++){
			if(!Character.isAlphabetic(intCharacters[i])){
				i++;
			}
			else {
				System.err.println("Only Integer!!!");
				String intIn = readInt();
			}
		}
		return String.valueOf(intCharacters);
	}
	public static String validationDivider(){
		String inputInt = readDivider();
		char[] intCharacters = inputInt.toCharArray();
		for(int i=0;intCharacters.length>i;i++){
			if(!Character.isAlphabetic(intCharacters[i])){
				i++;
			}
			else {
				System.err.println("Only Integer!!!");
				String intDiv = readDivider();
			}
		}
		return String.valueOf(intCharacters);
	}
	public static String readInt() {
		Scanner in = new Scanner(System.in);
		System.out.println(MESSAGE_FOR_INTEGER );
		return in.nextLine();
	}

	public static String readDivider() {
		Scanner in = new Scanner(System.in);
		System.out.println(MESSAGE_FOR_DIVIDER);
		return in.nextLine();
	}
}
