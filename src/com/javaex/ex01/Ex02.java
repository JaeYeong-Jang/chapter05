package com.javaex.ex01;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

public class Ex02 {

	public static void main(String[] args) throws IOException {
		
		InputStream in = new FileInputStream("/Users/jangjaeyeong/javaStudy/imgfile/img.jpg");
		
		OutputStream out = new FileOutputStream("/Users/jangjaeyeong/javaStudy/imgfile/byte2.jpg");
		
		byte[] buff = new byte[1024];
		
		int data;
		
		System.out.println("복사시작");
		
		while(true) {
			data = in.read(buff); //1024바이트 --> data
			if(data == -1) {
				System.out.println("복사끝 : " + data);
				break;
			}
			
			out.write(buff);
			
		}
		
		in.close();
		out.close();
		
	}

}
