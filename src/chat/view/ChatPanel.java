package chat.view;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.ScrollPaneConstants;
import javax.swing.SpringLayout;

import chat.controller.ChatController;

/**
 * Allows me to control all the design features of the chatbot frame.
 * @author emad6932
 *
 */
public class ChatPanel extends JPanel
{
	private ChatController baseController;
	private JButton firstButton;
	private JButton tweetButton;
	private JButton saveButton;
	private JButton analyzeTwitterButton;
	private JButton loadButton;
	private JScrollPane textPane;
	private JTextField firstTextField;
	private SpringLayout baseLayout;
	private JTextArea firstTextArea;
	private JLabel firstLabel;
	
	
	
/**
 * This sets on the variables on the screen.
 * @param baseController
 */
	public ChatPanel(ChatController baseController)
	{
		this.baseController = baseController;	
		baseLayout = new SpringLayout();
		firstButton = new JButton("This Button is just a conversation starter, and a treat giver!");
		tweetButton = new JButton("This is for a tweet!");
		firstLabel = new JLabel("I Canz Haz Chatz");
		baseLayout.putConstraint(SpringLayout.NORTH, firstLabel, 6, SpringLayout.SOUTH, firstButton);
		baseLayout.putConstraint(SpringLayout.EAST, firstLabel, -170, SpringLayout.EAST, this);
		firstTextArea = new JTextArea(10, 15);
		saveButton = new JButton("This is for pausing the conversation!");
		loadButton = new JButton("This is for resuming the conversation!");
		analyzeTwitterButton = new JButton("Analytics");
		
		
	
		setupChatPane();
		setupPanel();
		setupLayout();
		setupListeners();
	}
	
	
	private void setupChatPane()
	{
		textPane = new JScrollPane(firstTextArea);
		
		firstTextArea.setLineWrap(true);
		firstTextArea.setWrapStyleWord(true);
		firstTextArea.setEditable(false);
		textPane.setVerticalScrollBarPolicy(ScrollPaneConstants.VERTICAL_SCROLLBAR_AS_NEEDED);
		textPane.setHorizontalScrollBarPolicy(ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
	}
	/**
	 * This makes sure everything that is set on the screen.
	 */
	private void setupPanel()
	{
		this.setLayout(baseLayout);
		this.setBackground(Color.GREEN);
		this.add(firstButton);
		this.add(tweetButton);
		this.add(analyzeTwitterButton);
		this.add(loadButton);
		this.add(firstLabel);
		this.add(textPane);
		firstTextField = new JTextField("Enter wordy things here.");
		firstTextArea = new JTextArea("");
		this.add(firstTextField);
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
		baseLayout.putConstraint(SpringLayout.NORTH, textPane, 20, SpringLayout.NORTH, this);
		baseLayout.putConstraint(SpringLayout.WEST, textPane, 100, SpringLayout.WEST, this);
		baseLayout.putConstraint(SpringLayout.SOUTH, textPane, 250, SpringLayout.NORTH, this);
		baseLayout.putConstraint(SpringLayout.EAST, textPane, -20, SpringLayout.EAST, this);
		baseLayout.putConstraint(SpringLayout.WEST, firstTextField, 138, SpringLayout.WEST, this);
		baseLayout.putConstraint(SpringLayout.SOUTH, firstTextField, -6, SpringLayout.NORTH, firstButton);
		baseLayout.putConstraint(SpringLayout.NORTH, firstTextArea, 10, SpringLayout.NORTH, this);
		baseLayout.putConstraint(SpringLayout.EAST, firstTextArea, -73, SpringLayout.EAST, this);
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
				firstTextArea.setText(baseController.chat(firstTextField.getText()));
			}
		});
		
		tweetButton.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent click)
			{
				baseController.sendTweet("No text to send! #MadEastRulez");
			}
		});
		
		analyzeTwitterButton.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent click)
			{
				String user = firstTextField.getText();
				String results = baseController.analyze(user);
				firstTextArea.setText(results);
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
