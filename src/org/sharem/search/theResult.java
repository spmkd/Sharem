package org.sharem.search;

import java.util.ArrayList;
import java.util.List;

public class theResult {

	String searchPattern = "";

	OpenFile oF = new OpenFile();

	public List<theLine> lines = new ArrayList<theLine>();

	public theResult(String theSearch){
		searchPattern = theSearch;
		populateLines();
	}

	private void populateLines(){

		for (int i=0; i < oF.allLines.size(); i++){

			if (oF.allLines.get(i).contains(searchPattern)){
				theLine sample = new theLine(oF.allLines.get(i));
				lines.add(sample);
			}
		}

	}

}
