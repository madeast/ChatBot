package chat.view;

import javax.swing.*;
public class ChatView
{
	private String windowMessage;
	private ImageIcon chatIcon;
	
	public ChatView()
	{
		windowMessage = "CatBot";
		chatIcon = new ImageIcon(getClass().getResource("images/chatImage.png"));		
	}
	
	public void showResponse(String wordsFromSomewhere)
	{
		JOptionPane.showMessageDialog(null, wordsFromSomewhere, windowMessage, JOptionPane.PLAIN_MESSAGE, chatIcon);
	}
	
	public String chatInput(String stuff)
	{
		String answer = "";
		answer = JOptionPane.showInputDialog(null, stuff, windowMessage, JOptionPane.PLAIN_MESSAGE, chatIcon, null, "Answer here:)").toString();
		return answer;
	}
}
