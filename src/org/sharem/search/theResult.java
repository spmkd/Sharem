package org.sharem.search;

import java.util.ArrayList;
import java.util.List;

public class theResult {

	OpenFile oF = new OpenFile();

	public List<theLine> lines = new ArrayList<theLine>();

	public theResult(){
		populateLines();
	}

	private void populateLines(){

		for (int i=0; i < oF.allLines.size(); i++){

			theLine sample = new theLine(oF.allLines.get(i));

			lines.add(sample);

		}

	}

}
