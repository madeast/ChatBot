package chat.view;

import chat.controller.ChatController;
import javax.swing.*;
import java.awt.event.*;
import java.awt.Color;

public class ChatPanel extends JPanel
{
	private ChatController baseController;
	private JButton firstButton;
	private JTextField firstTextField;
	private SpringLayout baseLayout;
	private JTextArea firstTextArea;
	private JLabel firstLabel;
	
	

	public ChatPanel(ChatController baseController)
	{
		this.baseController = baseController;	
		baseLayout = new SpringLayout();
		firstButton = new JButton("This Button is just a conversation starter, and a treat giver!");
		firstTextField = new JTextField("Enter wordy things here.");
		firstTextArea = new JTextArea(10, 20);
		firstLabel = new JLabel("I Canz Haz Chatz");
	
		
		setupPanel();
		setupLayout();
		setupListeners();
	}
	
	private void setupPanel()
	{
		this.setLayout(baseLayout);
		this.setBackground(Color.GREEN);
		this.add(firstTextField);
		this.add(firstButton);
		this.add(firstLabel);
		firstTextField.setToolTipText("Type here, and give me bell rubs");
		firstTextArea.setEnabled(false);
		//this.add(firstTextArea);
	}
	
	private void setupLayout()
	{
		baseLayout.putConstraint(SpringLayout.WEST, firstTextField, 138, SpringLayout.WEST, this);
		baseLayout.putConstraint(SpringLayout.SOUTH, firstTextField, -96, SpringLayout.SOUTH, this);
		baseLayout.putConstraint(SpringLayout.NORTH, firstButton, 6, SpringLayout.SOUTH, firstTextField);
		baseLayout.putConstraint(SpringLayout.WEST, firstLabel, 171, SpringLayout.WEST, this);
		baseLayout.putConstraint(SpringLayout.SOUTH, firstLabel, -6, SpringLayout.NORTH, firstTextField);
		baseLayout.putConstraint(SpringLayout.EAST, firstButton, -10, SpringLayout.EAST, this);
	}
	
	private void setupListeners()
	{
		
	}
	
	public ChatController getBaseController()
	{
		return baseController;
	}

	public void setBaseController(ChatController baseController)
	{
		this.baseController = baseController;
	}

	public JButton getFirstButton()
	{
		return firstButton;
	}

	public void setFirstButton(JButton firstButton)
	{
		this.firstButton = firstButton;
	}

	public JTextField getTextField()
	{
		return firstTextField;
	}

	public void setFirstTextField(JTextField firstTextField)
	{
		this.firstTextField = firstTextField;
	}

	public SpringLayout getBaseLayout()
	{
		return baseLayout;
	}

	public void setBaseLayout(SpringLayout baseLayout)
	{
		this.baseLayout = baseLayout;
	}

	public JTextArea getFirstTextArea()
	{
		return firstTextArea;
	}

	public void setFirstTextArea(JTextArea firstTextArea)
	{
		this.firstTextArea = firstTextArea;
	}
}
