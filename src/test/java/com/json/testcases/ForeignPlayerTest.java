package com.json.testcases;

import java.io.FileNotFoundException;

import java.io.IOException;


import org.json.simple.JSONObject;

import org.json.simple.parser.ParseException;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.json.fileRead.JsonRead;


// To Verify if we have maximum of 4 foreign players in the team
public class ForeignPlayerTest extends JsonRead{

	int count=0;

	@Test
	public void checkForeignPlayer() throws FileNotFoundException, IOException, ParseException
	{
		jsonFileReader();


		for(int i=0;i<jsonFileReader().size();i++)
		{
			JSONObject player= (JSONObject)jsonFileReader().get(i);
			String country = (String) player.get("country");
			if(!country.equalsIgnoreCase("India"))
			{
				count++;
			}

		}
		System.out.println("Total number of Foreign players is -> " +count);
		Assert.assertEquals(count, 4);// verifies the count of the foreign player
	}


}

