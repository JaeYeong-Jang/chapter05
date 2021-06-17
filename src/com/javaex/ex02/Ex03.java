package com.javaex.ex02;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

public class Ex03 {

	public static void main(String[]args) throws IOException{
		
		InputStream in = new FileInputStream("/Users/jangjaeyeong/javaStudy/imgfile/MS949.txt");
		
		InputStreamReader isr = new InputStreamReader(in,"MS949"); // -->어떤 포맷으로 작동할지 알려주어야 한다. (MS949)
		BufferedReader br = new BufferedReader(isr);
		
		String line = "";
		
		while(true) {
			line = br.readLine();
			if(line == null) {
				break;
			}
			System.out.println(line);
		}
		
		br.close();
		
	}
}
