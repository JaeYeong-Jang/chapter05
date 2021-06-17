package com.javaex.ex03;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Reader;
import java.io.Writer;
import java.util.ArrayList;
import java.util.List;

public class Phonedb {

	public static void main(String[]args) throws IOException {
		
		Reader pdb = new FileReader("/Users/jangjaeyeong/javaStudy/imgfile/PhoneDB.txt");
		BufferedReader br = new BufferedReader(pdb);
		
		List<Readdb> rList = new ArrayList<Readdb>();
		
		while(true) {
			String DB = br.readLine();
			if(DB == null) {
				break;
			}
			String[] DBArray = DB.split(",");
			
			Readdb readdb = new Readdb(DBArray[0], DBArray[1], DBArray[2]);
			
			rList.add(readdb);
			
		}
		
		for(Readdb readdb:rList) {
			readdb.showInfo();
		}
		
		String myInfo = "장재영,010-5284-5902,02-2212-6600";
		
		/*
		Writer wdb = new FileWriter("/Users/jangjaeyeong/javaStudy/imgfile/PhoneDB.txt");
		BufferedWriter bw = new BufferedWriter(wdb);
		
		bw.write(rList);
		*/
		br.close();
	}
	
}
