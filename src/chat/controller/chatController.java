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
	private Chatbot 
	
	
	public ChatController()
	{
		myDisplay = new ChatView();
		String userName = myDisplay.chatInput("What is your name?");
		myBot = new Chatbot(userName);
	}
	
	public void start()
	{
		myDisplay.showResponse("Hello " + myBot.getUserName());
	}
}
