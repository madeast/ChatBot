package chat.view;

import javax.swing.JOptionPane;

public class ChatView 
{
	public class myDisplay
	{
		public void showResponse(String wordsFromChat)
		{
			JOptionPane.showMessageDialog(null, wordsFromChat);
		}
		
		public String chatInput(String displayText)
		{
			String answer = "";
			answer = JOptionPane.showInputDialog(null, displayText);
			return answer;		
		}
	}
}
