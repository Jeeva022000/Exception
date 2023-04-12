package com.onesoft.Exeptions;

public class AriExpection {
	public static void main(String[] args) {
      try {
    	  int a=10;
    	  int b=0;
    	  int div = a/b;
    	  System.out.println(div);
      }
      catch(Exception e) {
    	  e.printStackTrace(); // identify the line where Execption is occurs.
      }
      finally {
    	  System.out.println("Invalid");
      }
	}

}
