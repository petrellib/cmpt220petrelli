
import java.awt.Color;

import java.applet.AudioClip;
import javax.swing.JApplet;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.*;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

import java.awt.Color;
import javax.swing.JOptionPane;
import java.awt.Container;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.util.ArrayList;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;


public class Start extends JFrame //created by Robert Petrelli
{

	private JButton startJButton, helpJButton, sourceJButton;
	private JLabel   TitleJLabel;
	private static Base base;
	    
	    
	
	public static Base getBase() {
		return base;
	}
	
	    public Start()
		{
			createUserInterface();
		}

	    private void createUserInterface()
	    {
	        Container contentPane = getContentPane();
	        contentPane.setLayout(null);
	        
	        startJButton = new JButton("START");
	        startJButton.setBounds(250,300,50,50);
			contentPane.add(startJButton);
			startJButton.addActionListener(
				new ActionListener()
				{
					public void actionPerformed(ActionEvent event) {
						setVisible(false);
						base = new Base();					}
				}
			);
		
			helpJButton = new JButton("HELP");
			helpJButton.setBounds(200,300,50,50);
			contentPane.add(helpJButton);
			helpJButton.addActionListener(
				new ActionListener() {
					public void actionPerformed(ActionEvent event)
					{
						JOptionPane.showMessageDialog(null,"Welcome to the Alcohol Consumption Simulator. This program was designed to help people better understand the effects of alcohol on the human body  Press START to begin. ","Help",JOptionPane.PLAIN_MESSAGE);
					}
				}
			);
			
			sourceJButton = new JButton("LEARN MORE");
			sourceJButton.setBounds(200,350,100,50);
			contentPane.add(sourceJButton);
			sourceJButton.addActionListener(
				new ActionListener() {
					public void actionPerformed(ActionEvent event)
					{
						JOptionPane.showMessageDialog(null,"Listed below are some of the sources used to create this simulator as well as some external links for your enrichment.\nwww.alcoholhelpcenter.net \nhttps://auth.it.marist.edu/idp/profile/SAML2/Redirect/SSO?execution=e3s1 \nhttps://www.niaaa.nih.gov/publications/brochures-and-fact-sheets \nhttps://www.fda.gov/food/guidanceregulation/ucm166239.htm","Learn More",JOptionPane.PLAIN_MESSAGE);
					}
				}
			);
		
	      
	      TitleJLabel = new JLabel();
	      TitleJLabel.setText("Welcome to the Alcohol Consumption Simulator");
	      TitleJLabel.setSize(30, 30);
	      TitleJLabel.setBounds( -58, 5, 600, 60 );
	      TitleJLabel.setHorizontalAlignment( JLabel.CENTER );
	      contentPane.add( TitleJLabel );
	      setSize(500, 500);
	  	
	      setTitle("Welcome to the Alcohol Consumption Simulator");
	      contentPane.setBackground(Color.lightGray);
	      setLocationRelativeTo(null);
	      setVisible(true);
	      setResizable(false);
	    }
		    	
	
	
	}


