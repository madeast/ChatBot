package chat.controller;

import chat.model.Chatbot;
import chat.model.CtecTwitter;
import chat.view.ChatFrame;
import chat.view.ChatView;


/**
 * Application controller for the Chatbot project.
 * @author Easton Madsen
 * @version 1.0 10/21/15
 *
 */
public class ChatController
{

	private CtecTwitter chatTwitter;
	private Chatbot sampleBot;
	private ChatView myDisplay;
	private ChatFrame baseFrame;
	 
	
	/**
	 * Constructs all the variables.
	 */
	public ChatController()
	{
		myDisplay = new ChatView();
		//String userName = myDisplay.chatInput("What is your name?");
		sampleBot = new Chatbot("Name");
		baseFrame = new ChatFrame(this);
		chatTwitter = new CtecTwitter(this);
	}
	
	/**
	 * Starts the program and tells it what to do on startup.
	 */
	public void start()
	{
		//myDisplay.showResponse("Hello " + sampleBot.getUserName());
		chat("me");
	}
	
	/**
	 * Allows the chatbot to continue the conversation
	 */
	public String chat(String conversation)
	{
		conversation = sampleBot.processConversation(conversation);
		
		return conversation;
	}
	
	public String analyze(String userName)
	{
		String userAnalysis = "The Twitter user " + userName + "has many tweets. " + chatTwitter.topResults();
		
		return userAnalysis;
	}
	
	/**
	 * The Getters and Setters of the class.
	 * @return
	 */
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
		
	/**
	 * Shuts down the function with a friendly goodbye.
	 */
	private void shutDown()
	{
		myDisplay.chatInput("Goodbye, " + sampleBot.getUserName() + " it has been meowtastic talking to you!");
		//System.exit(0);
	}
	
	public void sendTweet(String  tweetText)
	{
	
		chatTwitter.sendTweet(tweetText);
	}
	
	public void handleErrors(String errorMessage)
	{
		myDisplay.showResponse(errorMessage);
	}
}
