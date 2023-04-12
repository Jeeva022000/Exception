package com.onesoft.Exeptions;

import java.io.File;
import java.io.FileReader;

public class FileNot {
	public static void main(String[] args) {
		try {
			File f = new File("C:\\Users\\jeeva\\OneDrive\\Desktop\\jeeva.txt");
			try (FileReader fr = new FileReader(f)) {
				int temp =0;
				while((temp=fr.read())!=-1) {
					System.out.print((char)temp);
				}
			}
		}
		catch(Exception e) {
			System.out.println(e);
			
		}
	}

}
