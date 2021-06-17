package com.javaex.ex01;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

public class Ex01 {

	public static void main(String[]args) throws IOException {
		
		InputStream in = new FileInputStream("/Users/jangjaeyeong/javaStudy/imgfile/img.jpg");
		
		OutputStream out = new FileOutputStream("/Users/jangjaeYeong/javaStudy/imgfile/byteimg.jpg");
		
		int data;
		System.out.println("복사시작");
		while(true) {
			data = in.read();
			if(data == -1) {
				System.out.println("복사끝 : " + data);
				break;
			}
			
			out.write(data);
			
		} //속도가 문제
		
		in.close();
		out.close();
		
	}
	
}
