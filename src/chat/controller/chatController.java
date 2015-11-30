package chat.controller;

import chat.view.ChatView;
import chat.model.Chatbot;
import chat.view.ChatFrame;


/**
 * Application controller for the Chatbot project.
 * @author Easton Madsen
 * @version 1.0 10/21/15
 *
 */
public class ChatController
{
	private Chatbot sampleBot;
	private ChatView myDisplay;
		private ChatFrame baseFrame;
	 
	
	
	public ChatController()
	{
		myDisplay = new ChatView();
		String userName = myDisplay.chatInput("What is your name?");
		sampleBot = new Chatbot(userName);
		baseFrame = new ChatFrame(this);
	}
	
	public void start()
	{
		myDisplay.showResponse("Hello " + sampleBot.getUserName());
		chat();
	}
	
	private void chat()
	{
		String conversation = myDisplay.chatInput("What would you like to talk about today?");
		while(sampleBot.lengthChecker(conversation))
		{
			conversation = sampleBot.processConversation(conversation);
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
	
	public Chatbot getMyBot()
	{
		return sampleBot;
	}

	public void setMyBot(Chatbot myBot)
	{
		this.sampleBot = myBot;
	}

	public ChatView getMyDisplay()
	{
		return myDisplay;
	}

	public void setMyDisplay(ChatView myDisplay)
	{
		this.myDisplay = myDisplay;
	}

	public ChatFrame getBaseFrame()
	{
		return baseFrame;
	}

	public void setBaseFrame(ChatFrame baseFrame)
	{
		this.baseFrame = baseFrame;
	}
		
	private void shutDown()
	{
		myDisplay.chatInput("Goodbye, " + sampleBot.getUserName() + " it has been meowtastic talking to you!");
		System.exit(0);
	}
}
