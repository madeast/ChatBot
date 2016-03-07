package chat.model;

import twitter4j.*;
import java.util.ArrayList;

/**
 * 
 * @author Easton Madsen
 * @version .1
 * 
 *
 */

public class CtecTwitter
{
	//Declarations
	private ArrayList<Status> statusList;
	private ArrayList<String> wordList;
	private Twitter chatBotTwitter;
	
	public CtecTwitter()
	{
		statusList = new ArrayList<Status>();
		wordList = new ArrayList<String>();
	}
	
	public void sendTweet(String tweet)
	{
		
	}
}
