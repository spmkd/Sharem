package org.sharem.mainpage;

import java.util.ArrayList;
import java.util.List;

import org.sharem.search.theResult;

public class MainPage {

	theResult allLists = new theResult("");

	public List<String> Serials = new ArrayList<String>();

	public MainPage(){
		populateSerials();
	}

	public void populateSerials(){

		//go through all the findings to find and add all diferent Serial names
		for(int i=0; i<allLists.lines.size(); i++){

			String serialName = allLists.lines.get(i).Serial;

			if( !Serials.contains(serialName) ){

				Serials.add(serialName);

			}

		}

	}

}