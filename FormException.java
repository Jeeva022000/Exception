package com.onesoft.Exeptions;

public class FormException {
	public static void main(String[] args) {
		try {
			String a = "jeeva";
			int b = Integer.parseInt(a);
			System.out.println(b);
		}
		catch(Exception d) {
			System.out.println(d);
		}
		finally {
			System.out.println("Invalid data");
		}
	}

}
