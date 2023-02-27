package com.json.testcases;

import java.io.FileNotFoundException;
import java.io.IOException;

import org.json.simple.JSONObject;
import org.json.simple.parser.ParseException;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.json.fileRead.JsonRead;

public class WicketKeeperTest extends JsonRead{

	int c=0;

	@Test
	public void checkWicketKeeper() throws FileNotFoundException, IOException, ParseException
	{

		jsonFileReader();
		for(int i=0;i<jsonFileReader().size();i++)
		{
			JSONObject player= (JSONObject)jsonFileReader().get(i);
			String role = (String) player.get("role");

			if(role.equalsIgnoreCase("Wicket-keeper"))
			{
				c++;
			}
		}
		System.out.println("Wicket Keeper available in the team is -> "+c);
		Assert.assertTrue(c>=1, "There is atleast one Wicket-Keeper");



	}
}
