/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package activity2;
/**
 * A program to carry on conversations with a human user.
 * This is the initial version that:  
 * <ul><li>
 *       Uses indexOf to find strings
 * </li><li>
 * 		    Handles responding to simple words and phrases 
 * </li></ul>
 * This version uses a nested if to handle default responses.
 * @author Carter Langbert for APCSA
 * @version December 2016
 */
public class Magpie2
{
	/**
	 * Get a default greeting 	
	 * @return a greeting
	 */
	public String getGreeting()
	{
		return "Hello! Let's talk.";
	}
	
	/**
	 * Gives a response to a user statement
	 * 
	 * @param statement
	 *            the user statement
	 * @return a response based on the rules given
	 */
	public String getResponse(String statement)
	{
		String response = "";
		if (statement.indexOf("no") >= 0)
		{
			response = "Why so negative?";
		}
		else if (statement.indexOf("mother") >= 0
				|| statement.indexOf("father") >= 0
				|| statement.indexOf("sister") >= 0
				|| statement.indexOf("brother") >= 0)
		{
			response = "Tell me more about your family.";
		}
                else if(statement.indexOf("Hello.") >= 0 || statement.indexOf("Hi.") >= 0 || statement.indexOf("Hey.") >= 0 || statement.indexOf("Hey") >= 0 || statement.indexOf("hey.") >= 0 || statement.indexOf("hey") >= 0 || statement.indexOf("Hello") >= 0 || statement.indexOf("hello") >= 0 || statement.indexOf("hello.") >= 0)
                {
                    response = "What's up?";
                }
                else if(statement.indexOf("dog") >= 0 || statement.indexOf("cat") >= 0 || statement.indexOf("hamster") >= 0)
                {
                    response = "You have a pet? Awesome!";
                }
                else if(statement.indexOf("Nothing much") >= 0 || statement.indexOf("nothing much") >= 0 || statement.indexOf("Nothing much.") >= 0)
                {
                    response = "That's too bad. There has to be something you can tell me!";
                }
		else
		{
			response = getRandomResponse();
		}
		return response;
	}

	/**
	 * Pick a default response to use if nothing else fits.
	 * @return a non-committal string
	 */
	private String getRandomResponse()
	{
		final int NUMBER_OF_RESPONSES = 1;
		double r = Math.random();
		int whichResponse = (int)(r * NUMBER_OF_RESPONSES);
		String response = "";
		
		if (whichResponse == 0)
		{
			response = "Interesting, tell me more.";
		}
		else if (whichResponse == 1)
		{
			response = "That's nice.";
		}
		else if (whichResponse == 2)
		{
			response = "Cool!";
		}
		else if (whichResponse == 3)
		{
			response = "Awesome!";
		}

		return response;
	}
}
