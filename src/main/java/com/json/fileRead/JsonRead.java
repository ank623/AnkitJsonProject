package com.json.fileRead;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

public class JsonRead {

	public static JSONArray jsonFileReader() throws FileNotFoundException, IOException, ParseException
	{
	int count=0;
	JSONParser jsonparser = new JSONParser();

	JSONObject obj = (JSONObject) jsonparser.parse(new FileReader(".\\JsonFile\\Data.Json"));

	JSONArray playerDetails= (JSONArray) obj.get("player");

	for(int i=0;i<playerDetails.size();i++)
	{
		JSONObject player= (JSONObject) playerDetails.get(i);
		String country = (String) player.get("country");
		if(!country.equalsIgnoreCase("India"))
		{
			count++;
		}
	}
	return playerDetails;
	}

}
