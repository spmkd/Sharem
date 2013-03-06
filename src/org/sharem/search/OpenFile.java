package org.sharem.search;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.List;

public class OpenFile {

	BufferedReader reader;
	public List<String> allLines = new ArrayList<String>();

	public OpenFile(){

		try{
			reader = new BufferedReader(new FileReader("/home/stole/listOfFiles.txt"));
		}catch(Exception e){ e.printStackTrace(); }

		populateArray();

	}

	void populateArray(){

		String line;

		try{
			while((line = reader.readLine())!= null){
				allLines.add(line);
			}
		}catch(Exception e){ e.printStackTrace(); }
	}

}
