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
	
	public ChatPanel(ChatController baseController)
	{
		this.baseController = baseController;
		
		baseLayout = new SpringLayout();
		firstButton = new JButton("This Button is just a conversation starter!");
		baseLayout.putConstraint(SpringLayout.SOUTH, firstButton, -61, SpringLayout.SOUTH, this);
		baseLayout.putConstraint(SpringLayout.EAST, firstButton, -72, SpringLayout.EAST, this);
		firstTextField = new JTextField("Enter wordy things here.");
		baseLayout.putConstraint(SpringLayout.WEST, firstTextField, 138, SpringLayout.WEST, this);
		baseLayout.putConstraint(SpringLayout.SOUTH, firstTextField, -6, SpringLayout.NORTH, firstButton);
		firstTextArea = new JTextArea(10, 20);
		
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
		//this.add(firstTextArea);
	}
	
	private void setupLayout()
	{
	}
	
	private void setupListeners()
	{
		
	}
}
