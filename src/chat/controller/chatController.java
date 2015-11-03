package chat.controller;

import chat.view.ChatView;
import chat.model.Chatbot;


/**
 * Application controller for the Chatbot project.
 * @author Easton Madsen
 * @version 1.0 10/21/15
 *
 */
public class ChatController
{
	private Chatbot myBot;
	private ChatView myDisplay;
	 
	
	
	public ChatController()
	{
		myDisplay = new ChatView();
		String userName = myDisplay.chatInput("What is your name?");
		myBot = new Chatbot(userName);
	}
	
	public void start()
	{
		myDisplay.showResponse("Hello " + myBot.getUserName());
		chat();
	}
	
	private void chat()
	{
		String conversation = myDisplay.chatInput("What would you like to talk about today?");
		while(myBot.lengthChecker(conversation))
		{
			conversation = myBot.processConversation(conversation);
			conversation = myDisplay.chatInput(conversation);
			
			/*if(myBot.contentChecker(conversation))
			{
				myDisplay.chatInput("Wow, I had no idea you're interested in " + myBot.getContent() + ".") ;
			}
			else if(myBot.memeChecker(conversation))
			{
				myDisplay.chatInput("The dankest of memes.");
			}
			else if(myBot.politicalTopicChecker(conversation))
			{
				myDisplay.chatInput("What a political topic.");
			}
			else
			{
				myDisplay.chatInput("I've never heard of that topic before.");
			}
			
//			if(!myBot.quitChecker(conversation))
//			{
//				conversation = myBot.processInput(conversation);
//			}
//			else
//			{
//				shutDown();
//			}
			
			conversation = myDisplay.chatInput(conversation);*/
		}
		
	}
	
	private void shutDown()
	{
		
	}
}
