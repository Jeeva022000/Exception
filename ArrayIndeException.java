package com.onesoft.Exeptions;

public class ArrayIndeException {
	public static void main(String[] args) {
		try {
			int[] a = {1,2,3,5,6};
			for(int i=0;i<a.length;i++) {
				System.out.println(a[4]);
			}
		}
			catch(Exception e) {
				System.out.println(e);
			}
			finally {
			System.out.println("invalid data");
			}
	}
	}

