package org.sharem.search;

public class theLine {

	String Type = "";
	public String Serial = "";
	String Seson = "";
	String Episode = "";

	String pathToPic = "";
	String pathToVideo = "";


	public theLine(String line){
		splitIt(line);
	}

	void splitIt(String line){

		String[] splited = line.split("/");

		Type = splited[0];
		Serial = splited[1];
		Seson = splited[2];
		Episode = splited[3];

		pathToVideo = line;
		pathToPic = createPic(line);

	}

	String createPic(String theFile){

		String[] splited = theFile.split("/");

		String tmp = splited[3];

		String[] lastSpot = tmp.split("\\.");

		String complete = splited[0] + splited[1] + splited[2] + lastSpot[0] + ".jpg";

		return complete;

	}

}
