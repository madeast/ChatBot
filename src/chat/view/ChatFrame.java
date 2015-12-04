package chat.view;

import javax.swing.JFrame;
import chat.controller.ChatController;

/**
 * Actual Area where all objects are set for the chatbot
 * @author emad6932
 *
 */
public class ChatFrame extends JFrame
{
	private ChatController baseController;
	private ChatPanel basePanel;
	
	/**
	 * Sets all the variables in the class.
	 * @param baseController
	 */
	public ChatFrame(ChatController baseController)
	{
		this.baseController = baseController;
		basePanel = new ChatPanel(baseController);
		setupFrame();
	}
	
	/**
	 * Sets the frame up, and uses the panel as a reference.
	 */
	private void setupFrame()
	{
		this.setContentPane(basePanel);
		this.setSize(400,400);
		this.setTitle("This is CatBot");
		this.setResizable(false);
		this.setVisible(true);
	}
	
	/**
	 * Getters and Setters for the class
	 * @return
	 */
	public ChatController getBaseController()
	{
		return baseController;
	}

	public void setBaseController(ChatController baseController)
	{
		this.baseController = baseController;
	}

	public ChatPanel getBasePanel()
	{
		return basePanel;
	}

	public void setBasePanel(ChatPanel basePanel)
	{
		this.basePanel = basePanel;
	}
	
	public ChatController getbaseController()
	{
		return baseController;
	}
}
