/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package activity2;
import java.util.Scanner;

/**
 * A simple class to run the Magpie class.
 * @author Mr. T
 * @version Dec 2016
 */
public class MagpieRunner2
{

	/**
	 * Create a Magpie, give it user input, and print its replies.
	 */
	public static void main(String[] args)
	{
		Magpie2 maggie = new Magpie2();
		
		System.out.println (maggie.getGreeting());
		Scanner in = new Scanner (System.in);
		String statement = in.nextLine();
		
		while (!statement.equals("Bye") || !statement.equals("Bye.") || !statement.equals("Bye!") || !statement.equals("bye") || !statement.equals("bye.") || !statement.equals("bye!"))
		{
			System.out.println (maggie.getResponse(statement));
			statement = in.nextLine();
		}
	}

}
