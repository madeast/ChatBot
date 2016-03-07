package chat.model;

import java.util.ArrayList;

import twitter4j.Status;
import twitter4j.Twitter;
import twitter4j.TwitterException;
import twitter4j.TwitterFactory;
import chat.controller.ChatController;

/**
 * 
 * @author Easton Madsen
 * @version .2
 * 
 *
 */

public class CtecTwitter
{
	//Declarations
	private ArrayList<Status> statusList;
	private ArrayList<String> wordList;
	private Twitter chatBotTwitter;
	private ChatController baseController;
	
	public CtecTwitter(ChatController baseController)
	{
		this.baseController = baseController;
		statusList = new ArrayList<Status>();
		wordList = new ArrayList<String>();
		chatBotTwitter = TwitterFactory.getSingleton();
	}
	
	public void sendTweet(String tweet)
	{
		try
		{
			chatBotTwitter.updateStatus("");
		}
		catch(TwitterException error)
		{
			baseController.handleErrors(error.getErrorMessage());
		}
	}
}
