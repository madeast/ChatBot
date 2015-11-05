
package chat.model;

import java.util.ArrayList;

/**
 * Base version of the 2015 Chatbot class. Only stub methods are provided. Students will complete methods as part
 * of the project.
 * @author Easton Madsen
 * @version 1.2 10/23/15 Completed the lengthChecker method. Fixed the Constructor and getter for userName.
 */
public class Chatbot
{
	private ArrayList<String> memesList;
	private ArrayList<String> politicalTopicList;
	private String userName;
	private String content;
	
	/**
	 * Creates an instance of the Chatbot with the supplied username.
	 * @param userName The username for the chatbot.
	 */
	public Chatbot(String userName)
	{
		this.userName = userName;
		this.content = "Computers";
		this.memesList = new ArrayList<String>();
		this.politicalTopicList = new ArrayList<String>();
		
		buildMemesList();
		buildPoliticalTopicsList();
	}
	
	private void buildMemesList()
	{
		this.memesList.add("Bad Luck Brian");
		this.memesList.add("Rare Pepe");
		this.memesList.add("Doge");
		this.memesList.add("Me Gusta");
		this.memesList.add("Cute Animals");
		this.memesList.add("Troll");
		this.memesList.add("Spoderman");
		this.memesList.add("What if I told You");
		this.memesList.add("Unhelpful High School Teacher");
		this.memesList.add("Aliens");
		
		
	}
	
	private void buildPoliticalTopicsList()
	{
		this.politicalTopicList.add("Putin");
		this.politicalTopicList.add("Obama");
		this.politicalTopicList.add("Syria");
		this.politicalTopicList.add("Stormcloaks");
		this.politicalTopicList.add("Empire");
		this.politicalTopicList.add("Proxy War");
		this.politicalTopicList.add("Unstable");
		this.politicalTopicList.add("Talos");
		
	}
	
	/**
	 * Checks the length of the supplied string. Returns false if the supplied String is empty or null,
	 * otherwise returns true. 
	 * @param currentInput
	 * @return A true or false based on the length of the supplied String.
	 */
	public boolean lengthChecker(String currentInput)
	{
		boolean hasLength = false;
		
		if(currentInput != null)
		{
			if(currentInput.length() >= 1)
			{
				hasLength = true;
			}
		}
		
		if(currentInput != null&& currentInput.length() > 0)
		{
			hasLength = true;
		}
		
		return hasLength;
	
	}
	
	/**
	 * Checks if the supplied String matches the content area for this Chatbot instance.
	 * @param currentInput The supplied String to be checked.
	 * @return Whether it matches the content area.
	 */
	public boolean contentChecker(String currentInput)
	{
		boolean hasContent = false;
		
		if(currentInput.toLowerCase().contains(content.toLowerCase()))
		{
			hasContent = true;
		}
			
		return hasContent;
	}
	
	/**
	 * Checks if supplied String matches ANY of the topics in the politicalTopicsList. Returns
	 * true if it does find a match and false if it does not match.
	 * @param currentInput The supplied String to be checked.
	 * @return Whether the String is contained in the ArrayList.
	 */
	public boolean politicalTopicChecker(String currentInput)
	{
		boolean hasPolitical = false;
		
		for(String currentPolitics: politicalTopicList)
		{
			if(currentInput.toLowerCase().contains(currentInput))
			{
				hasPolitical = true;
			}
		}
		return hasPolitical;
	}
	
	
	/**
	 * Checks to see that the supplied String value is in the current memesList variable.
	 * @param currentInput The supplied String to be checked.
	 * @return Whether the supplied String is a recognized meme.
	 */
	public boolean memeChecker(String currentInput)
	{
		boolean hasMemes = false;
		
		for(String currentMeme: memesList)
		{
			if(currentMeme.contains(currentInput))
			{
				hasMemes = true;
			}
		}
		return hasMemes;
	}
	
	public String processConversation(String currentInput)
	{
		String nextConversation = "What else would you like to talk about?";
		int randomTopic = (int) (Math.random() * 5); //Generates a random number between 0 and 4.
		
		switch (randomTopic)
		{
		case 0:
			if(memeChecker(currentInput))
			{
				nextConversation = "Well aren't we in the loop, " + "what do you think of pepe?";
			}
			break;
		case 1:
			if(politicalTopicChecker(currentInput))
			{
				nextConversation = "A very intellectual thing to say.";
			}
			break;
		case 2:
			if(contentChecker(currentInput))
			{
				nextConversation = "some words and a question";
			}
			break;
		case 3:
			if(currentInput.length() > 20)
			{
				nextConversation = "Well aren't we talkative.";
			}
			break;
		case 4:
			nextConversation = "some random words and a question";
			break;
		default:
			nextConversation = "The universe has ended, sad panda.";
			break;
		}
		return nextConversation;
	}
	
	/**
	 * Returns the username of this Chatbot instance.
	 * @return The username of the Chatbot.
	 */
	public String getUserName()
	{
		return userName;
	}
	
	/**
	 * Returns the content area for this Chatbot instance.
	 * @return The content area for this Chatbot instance.
	 */
	public String getContent()
	{
		return content;
	}
	
	/**
	 * Getter method for the memesList object.
	 * @return The reference to the meme list.
	 */
	public ArrayList<String> getMemesList()
	{
		return memesList;
	}
	
	/**
	 * Getter method for the politicalTopicList object.
	 * @return The reference to the political topic list.
	 */
	public ArrayList<String> getPoliticalTopicList()
	{
		return politicalTopicList;
	}
	
	/**
	 * Updates the content area for this Chatbot instance.
	 * @param content The updated value for the content area.
	 */
	public void setContent(String content)
	{
		
	}
}
