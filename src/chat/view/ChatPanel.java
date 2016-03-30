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
import chat.controller.IOController;

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
		firstButton = new JButton("Conversation");
		tweetButton = new JButton("This is for a tweet!");
		firstLabel = new JLabel("I Canz Haz Chatz");
		saveButton = new JButton("Save");
		loadButton = new JButton("Load");
		analyzeTwitterButton = new JButton("Analytics");
		firstTextArea = new JTextArea();
	
		
	
		setupChatPane();
		setupPanel();
		setupLayout();
		setupListeners();
	}
	
	
	private void setupChatPane()
	{
		textPane = new JScrollPane();
		textPane.setVerticalScrollBarPolicy(ScrollPaneConstants.VERTICAL_SCROLLBAR_AS_NEEDED);
		textPane.setHorizontalScrollBarPolicy(ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
		firstTextArea.setLineWrap(true);
		firstTextArea.setWrapStyleWord(true);
		firstTextArea.setEditable(false);
		
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
		this.add(saveButton);
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
		baseLayout.putConstraint(SpringLayout.WEST, saveButton, 13, SpringLayout.EAST, loadButton);
		baseLayout.putConstraint(SpringLayout.NORTH, saveButton, 0, SpringLayout.NORTH, firstButton);
		baseLayout.putConstraint(SpringLayout.NORTH, firstButton, 6, SpringLayout.SOUTH, tweetButton);
		baseLayout.putConstraint(SpringLayout.EAST, firstButton, -10, SpringLayout.EAST, tweetButton);
		baseLayout.putConstraint(SpringLayout.EAST, tweetButton, -29, SpringLayout.EAST, this);
		baseLayout.putConstraint(SpringLayout.NORTH, firstTextField, 16, SpringLayout.SOUTH, textPane);
		baseLayout.putConstraint(SpringLayout.EAST, firstTextField, -110, SpringLayout.EAST, this);
		baseLayout.putConstraint(SpringLayout.NORTH, textPane, 10, SpringLayout.NORTH, this);
		baseLayout.putConstraint(SpringLayout.WEST, textPane, 56, SpringLayout.WEST, this);
		baseLayout.putConstraint(SpringLayout.SOUTH, textPane, 240, SpringLayout.NORTH, this);
		baseLayout.putConstraint(SpringLayout.EAST, textPane, -64, SpringLayout.EAST, this);
		baseLayout.putConstraint(SpringLayout.NORTH, loadButton, 6, SpringLayout.SOUTH, analyzeTwitterButton);
		baseLayout.putConstraint(SpringLayout.NORTH, tweetButton, 0, SpringLayout.NORTH, analyzeTwitterButton);
		baseLayout.putConstraint(SpringLayout.WEST, loadButton, 10, SpringLayout.WEST, analyzeTwitterButton);
		baseLayout.putConstraint(SpringLayout.WEST, analyzeTwitterButton, 10, SpringLayout.WEST, this);
		baseLayout.putConstraint(SpringLayout.SOUTH, analyzeTwitterButton, -61, SpringLayout.SOUTH, this);
		baseLayout.putConstraint(SpringLayout.SOUTH, firstLabel, -4, SpringLayout.SOUTH, this);
		baseLayout.putConstraint(SpringLayout.EAST, firstLabel, -170, SpringLayout.EAST, this);
		
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
				firstTextArea.setText(baseController.Investigate());
			}
		});
		
		saveButton.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent click)
			{
				String loadedText = IOController.saveFile(firstTextArea.getText());
				firstTextArea.setText(loadedText);
			}
		});
		
		loadButton.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent click)
			{
				String file = IOController.readTextFromFile(firstLabel.getText());
				firstLabel.setText(file);
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
}
