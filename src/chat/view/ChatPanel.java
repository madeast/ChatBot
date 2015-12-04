package chat.view;

import chat.controller.ChatController;
import javax.swing.*;
import java.awt.event.*;
import java.awt.Color;

/**
 * Allows me to control all the design features of the chatbot frame.
 * @author emad6932
 *
 */
public class ChatPanel extends JPanel
{
	private ChatController baseController;
	private JButton firstButton;
	private JTextField firstTextField;
	private SpringLayout baseLayout;
	private JTextArea firstTextArea;
	private JLabel firstLabel;
	
	
/**
 * This sets on the varibles on the screen.
 * @param baseController
 */
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
	
	/**
	 * This makes sure everything that is set on the screen.
	 */
	private void setupPanel()
	{
		this.setLayout(baseLayout);
		this.setBackground(Color.GREEN);
		this.add(firstTextField);
		this.add(firstButton);
		this.add(firstLabel);
		this.add(firstTextArea);
		firstTextField.setToolTipText("Type here, and give me bell rubs");
		//this.add(firstTextArea);
	}
	
	/**
	 * This is where junk code goes.
	 */
	private void setupLayout()
	{
		baseLayout.putConstraint(SpringLayout.SOUTH, firstButton, -26, SpringLayout.SOUTH, this);
		baseLayout.putConstraint(SpringLayout.EAST, firstButton, -10, SpringLayout.EAST, this);
		baseLayout.putConstraint(SpringLayout.WEST, firstTextField, 138, SpringLayout.WEST, this);
		baseLayout.putConstraint(SpringLayout.SOUTH, firstTextField, -6, SpringLayout.NORTH, firstButton);
		baseLayout.putConstraint(SpringLayout.WEST, firstTextArea, 96, SpringLayout.WEST, this);
		baseLayout.putConstraint(SpringLayout.SOUTH, firstTextArea, -6, SpringLayout.NORTH, firstLabel);
		baseLayout.putConstraint(SpringLayout.WEST, firstLabel, 170, SpringLayout.WEST, this);
		baseLayout.putConstraint(SpringLayout.SOUTH, firstLabel, -6, SpringLayout.NORTH, firstTextField);
	}
	
	/**
	 * Controls the Buttons.
	 */
	private void setupListeners()
	{
		firstButton.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent click)
			{
				
			}
		});
			
	
	}
	
	/**
	 * Getters and Setters for the class.
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
