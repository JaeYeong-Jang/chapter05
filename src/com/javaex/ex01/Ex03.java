package com.javaex.ex01;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

public class Ex03 {

	public static void main(String[] args)throws IOException {
		
		InputStream in = new FileInputStream("/Users/jangjaeyeong/javaStudy/imgfile/img.jpg");
		BufferedInputStream bin = new BufferedInputStream(in); // --> 보조 스트림을 주 스트림에 연결(?) 해준다.

		OutputStream out = new FileOutputStream("/Users/jangjaeyeong/javaStudy/imgfile/bytebuffimg.jpg");
		BufferedOutputStream bout = new BufferedOutputStream(out);
		
		int data;
		System.out.println("복사시작");
		while(true) {
			
			data = bin.read();
			
			if(data == -1) {
				System.out.println("복사끝 : " + data);
				break;
			}
			bout.write(data);
		}
		
		in.close();
		out.close();
		
	}

}
