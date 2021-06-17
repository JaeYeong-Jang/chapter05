package com.javaex.ex02;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;

public class Ex01 {

	public static void main(String[] args)throws IOException {
		
		Writer fw = new FileWriter("/Users/jangjaeyeong/javaStudy/imgfile/song.txt");
		BufferedWriter bw = new BufferedWriter(fw); // --> 파일의 위치 주소 전달
		
		bw.write("학교종이 땡땡떙");
		bw.newLine();
		bw.write("어서모이자");
		bw.newLine();
		bw.write("선생님이 우리를");
		bw.newLine();
		bw.write("기다리신다.");
		
		bw.close();
		
		
		
		
		/*
		Writer fw = new FileWriter("/Users/jangjaeyeong/javaStudy/imgfile/song.txt");
		
		String str = "학교종이 땡땡땡 어서모이자 선생님이 우리를 기다리신다.";
		
		fw.write(str);
		
		fw.close();
		*/
	}

}
