import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.Image;

import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class MyFrame {
	
	ImageIcon icon;

	JFrame frame;
	
	JPanel  leftPanel;
	JPanel  rightPanel;
	JPanel  emailPanel;
	JPanel  passwordPanel;
	
	JLabel emailAdressLabel;
	JLabel passwordLabel;
	JLabel welcomeBackLabel;
	JLabel label;
	
	JTextField emailTextField;
	JTextField passwordTextField;
	
	JCheckBox RememberMeCheckBox;
	
	JButton logInButton;
	
	MyFrame(){

		emailTextField = new JTextField();
		emailTextField.setMaximumSize(new Dimension(400,40));
		emailTextField.setBackground(Color.WHITE);
		emailTextField.setFont(new Font("Consolas",Font.ITALIC,20));
		emailTextField.setOpaque(true);
		
		emailAdressLabel = new JLabel("Email Adress");
		emailAdressLabel.setBackground(Color.LIGHT_GRAY);
		emailAdressLabel.setForeground(Color.BLACK);
		emailAdressLabel.setOpaque(true);
		emailAdressLabel.setFont(new Font("Verdana",Font.PLAIN,12));
		emailAdressLabel.setVerticalAlignment(JLabel.TOP);
		emailAdressLabel.setHorizontalAlignment(JLabel.LEFT);
		
		emailPanel = new JPanel();
		emailPanel.setLayout(new GridLayout(2,1));
		emailPanel.setBounds(50,150,400,65);
		emailPanel.setBackground(Color.LIGHT_GRAY);
		emailPanel.setOpaque(true);
		emailPanel.add(emailAdressLabel);
		emailPanel.add(emailTextField);
		
		RememberMeCheckBox = new JCheckBox("Remember Me");
		RememberMeCheckBox.setBounds(50,295,400,20);
		RememberMeCheckBox.setBackground(Color.LIGHT_GRAY);
		RememberMeCheckBox.setOpaque(true);
				
		passwordTextField = new JTextField();
		passwordTextField.setMaximumSize(new Dimension(400,40));
		passwordTextField.setBackground(Color.WHITE);
		passwordTextField.setFont(new Font("Consolas",Font.ITALIC,20));
		passwordTextField.setOpaque(true);
		
		passwordLabel = new JLabel("Password");
		passwordLabel.setBackground(Color.LIGHT_GRAY);
		passwordLabel.setForeground(Color.BLACK);
		passwordLabel.setOpaque(true);
		passwordLabel.setFont(new Font("Verdana",Font.PLAIN,12));
		passwordLabel.setVerticalAlignment(JLabel.TOP);
		passwordLabel.setHorizontalAlignment(JLabel.LEFT);
		
		passwordPanel = new JPanel();
		passwordPanel.setLayout(new GridLayout(2,1));
		passwordPanel.setBounds(50,225,400,65);
		passwordPanel.setBackground(Color.LIGHT_GRAY);
		passwordPanel.setOpaque(true);
		passwordPanel.add(passwordLabel);
		passwordPanel.add(passwordTextField);
		
		welcomeBackLabel = new JLabel("WELCOME BACK");
		welcomeBackLabel.setBounds(150,60,200,75);
		welcomeBackLabel.setFont(new Font("Verdana",Font.BOLD,20 ));
		
		logInButton = new JButton("LOG IN");
		logInButton.setFocusable(false);
		logInButton.setFont(new Font("Comic Sans",Font.BOLD,25));
		logInButton.setBounds(50,350,400,40);
		logInButton.setBorder(BorderFactory.createEtchedBorder());
		
		leftPanel = new JPanel();
		leftPanel.add(welcomeBackLabel);
		leftPanel.add(emailPanel);
		leftPanel.add(passwordPanel);
		leftPanel.add(RememberMeCheckBox);
		leftPanel.add(logInButton);
		leftPanel.setLayout(null);
		leftPanel.setBounds(0,0,500,600);
		leftPanel.setBackground(Color.LIGHT_GRAY);
		leftPanel.setOpaque(true);
		
		icon = new ImageIcon("coffee.jpg");
		Image resizedImage = icon.getImage().getScaledInstance(500, 600, Image.SCALE_DEFAULT);
        ImageIcon resizedImageIcon = new ImageIcon(resizedImage);
		
		label = new JLabel();
		label.setIcon(resizedImageIcon);
		label.setBounds(500,0,510,636);
		
		rightPanel = new JPanel();
		rightPanel.add(label);
		rightPanel.setBounds(500,0,500,600);
		rightPanel.setBackground(Color.lightGray);
		rightPanel.setOpaque(true);
		
		frame = new JFrame("Modern UI Design");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setBackground(Color.WHITE);
		frame.setLayout(null);
		frame.add(leftPanel);
		frame.add(rightPanel);
		frame.setSize(1010,636);
		frame.setResizable(false);
		frame.setVisible(true);
		
		
	}
	
}
