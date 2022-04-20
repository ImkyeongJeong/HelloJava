package co.edu.except;

import java.util.Scanner;

public class MultLineExam {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str = "";
		while(true) {
			String temp = sc.nextLine();
			if (temp.equals("")) {
				break;
			}
			str += temp + "\n";
		}
	}

}
