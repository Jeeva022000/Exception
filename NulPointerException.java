package com.onesoft.Exeptions;

public class NulPointerException {
	public static void main(String[] args) {
	try {
		String a = null;
		int b = a.length();
		System.out.println(b);
	}
	catch(Exception r) {
		System.out.println(r);
	}
	finally {
		System.out.println("Invalid");
	}
	}
}
