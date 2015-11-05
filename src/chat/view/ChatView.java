package chat.view;

import javax.swing.JOptionPane;
import javax.swing.ImageIcon;

public class ChatView
{
	
	private String windowMessage;
	private ImageIcon chatIcon;
	
	public ChatView()
	{
		windowMessage= "Hello, I'm your friendly catBot.";
		chatIcon = new ImageIcon(getClass().getResource("Images/chatImage.png"));
	}
	
	public void showResponse(String wordsFromChat)
	{
		JOptionPane.showMessageDialog(null, wordsFromChat, windowMessage, JOptionPane.PLAIN_MESSAGE, chatIcon);
	}

	public String chatInput(String displayText)
	{
		String answer = "";
		answer = JOptionPane.showInputDialog(null, displayText, windowMessage, JOptionPane.PLAIN_MESSAGE, chatIcon, null, "Answer here:)").toString();
		return answer;
	}
}
