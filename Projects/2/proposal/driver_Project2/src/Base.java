import java.awt.Container;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedWriter;


import java.io.FileWriter;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

import javax.swing.JOptionPane;

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

public class Base extends JFrame {

	int x = 0;
	int b = 0;
	
	private JButton drinkJButton, submitJButton, detailJButton, backJButton;
	public int beerNum, liquorNum, wineNum, drink, timeNum;
	private String maleString, femaleString, noFood, noWater, noSleep, drugString;
	public boolean food, water, sleep, drug = false;
	public boolean gender = true;
	
	JLabel MJLabel, WJLabel, beerJLabel,beerPicJLabel, liquorJLabel,liquorPicJLabel, wineJLabel, winePicJLabel, timeJLabel;
	JRadioButton maleJRadio, femaleJRadio;
	JCheckBox FoodJCheck, WaterJCheck, WellRestedJCheck, DrugJCheck;
	JFormattedTextField beerJText, liquorJText, wineJText, timeJText;

	
	
	
	public void endSim()
	{
		new Output();
	}
		
	public Base()
	{
		createUserInterface();
	}
	
	
	private void createUserInterface()
    {
	
		Container contentPane = getContentPane();
    	contentPane.setLayout(null);

    	maleJRadio = new JRadioButton("Male");
    	maleJRadio.setActionCommand(maleString);
		maleJRadio.setBounds(40,180,70,50);
		maleJRadio.setSelected(true);
		contentPane.add(maleJRadio);
		maleJRadio.addActionListener(
				new ActionListener() {
					public void actionPerformed(ActionEvent event)
					{
						gender = true;
					}
				}
			); 
		
		femaleJRadio = new JRadioButton("Female");
		femaleJRadio.setActionCommand(femaleString);
		femaleJRadio.setBounds(160,180,90,50);
		contentPane.add(femaleJRadio);
		femaleJRadio.addActionListener(
				new ActionListener() {
					public void actionPerformed(ActionEvent event)
					{
						gender = false;
					}
				}
			); 
		
		ButtonGroup Gender = new ButtonGroup();
		Gender.add(maleJRadio);
		Gender.add(femaleJRadio);
		
		MJLabel = new JLabel();
		MJLabel.setBounds( 40, 35, 72, 150 ) ;
		MJLabel.setIcon( new ImageIcon("male.jpg") );
		MJLabel.setHorizontalAlignment( JLabel.CENTER );
	    contentPane.add( MJLabel );
		
		WJLabel = new JLabel();
	    WJLabel.setBounds( 160, 35, 72, 149 ) ;
	    WJLabel.setIcon( new ImageIcon("female.jpg") );
	    WJLabel.setHorizontalAlignment( JLabel.CENTER );
	    contentPane.add( WJLabel );
	    
    	beerJLabel = new JLabel();
    	beerJLabel.setText("How many 'drinks' of beer did you consume: ");
    	beerJLabel.setForeground(Color.black);
		beerJLabel.setBounds(25,240,300,20);
		contentPane.add( beerJLabel );
    	
		beerJText = new JFormattedTextField();
		beerJText.setValue(new Integer(beerNum));
		beerJText.setColumns(10);
		beerJText.setBounds(350,240,50,20);
		contentPane.add( beerJText );
		
		beerPicJLabel = new JLabel();
		beerPicJLabel.setBounds( 400, 210, 36, 45 ) ;
		beerPicJLabel.setIcon( new ImageIcon("beer.jpg") );
		beerPicJLabel.setHorizontalAlignment( JLabel.CENTER );
	    contentPane.add( beerPicJLabel );
		
		wineJLabel = new JLabel();
		wineJLabel.setText("How many 'drinks' of wine did you consume: ");
		wineJLabel.setForeground(Color.black);
		wineJLabel.setBounds(25,280,300,20);
		contentPane.add( wineJLabel );
		
		wineJText= new JFormattedTextField();
		wineJText.setValue(new Integer(wineNum));
		wineJText.setColumns(10);
		wineJText.setBounds(350,280,50,20);
		contentPane.add( wineJText );
		
		winePicJLabel = new JLabel();
		winePicJLabel.setBounds( 434, 240, 36, 90 ) ;
		winePicJLabel.setIcon( new ImageIcon("wine.png") );
		winePicJLabel.setHorizontalAlignment( JLabel.CENTER );
	    contentPane.add( winePicJLabel );
		
		liquorJLabel = new JLabel();
		liquorJLabel.setText("How many 'drinks' of liquor did you consume: ");
    	liquorJLabel.setForeground(Color.black);
    	liquorJLabel.setBounds(25,320,300,20);
		contentPane.add( liquorJLabel );
		
		liquorJText = new JFormattedTextField();
		liquorJText.setValue(new Integer(liquorNum));
		liquorJText.setColumns(10);
		liquorJText.setBounds(350,320,50,20);
		contentPane.add( liquorJText );
		
		liquorPicJLabel = new JLabel();
		liquorPicJLabel.setBounds( 400, 300, 20, 42 ) ;
		liquorPicJLabel.setIcon( new ImageIcon("liquor.jpg") );
		liquorPicJLabel.setHorizontalAlignment( JLabel.CENTER );
	    contentPane.add( liquorPicJLabel );
		
	    timeJLabel = new JLabel();
	    timeJLabel.setText("Over how many hours did you consume these drinks: ");
	    timeJLabel.setForeground(Color.black);
	    timeJLabel.setBounds(25,360,350,20);
		contentPane.add( timeJLabel );
    	
		timeJText = new JFormattedTextField();
		timeJText.setValue(new Integer(timeNum));
		timeJText.setColumns(10);
		timeJText.setBounds(400,360,50,20);
		contentPane.add( timeJText );
		
		FoodJCheck = new JCheckBox("Ate Recently?");
		FoodJCheck.setBounds(50,400,200,20);
		contentPane.add(FoodJCheck);
		FoodJCheck.addActionListener(
				new ActionListener() {
					public void actionPerformed(ActionEvent event)
					{
						food = true;
					}
				}
			); 
		
		WaterJCheck = new JCheckBox("Drank Water recently?");
		WaterJCheck.setBounds(50,420,200,20);
		contentPane.add(WaterJCheck);
		WaterJCheck.addActionListener(
				new ActionListener() {
					public void actionPerformed(ActionEvent event)
					{
						water = true;
					}
				}
			); 
		
		WellRestedJCheck = new JCheckBox("Slept well?");
		WellRestedJCheck.setBounds(50,440,200,20);
		contentPane.add(WellRestedJCheck);
		WellRestedJCheck.addActionListener(
				new ActionListener() {
					public void actionPerformed(ActionEvent event)
					{
						sleep = true;
					}
				}
			);
	
		DrugJCheck = new JCheckBox("On any medication?");
		DrugJCheck.setBounds(50,460,200,20);
		contentPane.add(DrugJCheck);
		DrugJCheck.addActionListener(
				new ActionListener() {
					public void actionPerformed(ActionEvent event)
					{
						drug = true;
					}
				}
			);
		
		
		drinkJButton = new JButton("What is a 'Drink'?");
		drinkJButton.setBounds(50,600,200,50);
		contentPane.add(drinkJButton);
		drinkJButton.addActionListener(
			new ActionListener() {
				public void actionPerformed(ActionEvent event)
				{
					JOptionPane.showMessageDialog(null,"In the United States, one 'standard' drink contains roughly 14 grams of pure alcohol, which is found in:\n12 ounces of regular beer, which is usually about 5% alcohol \n5 ounces of wine, which is typically about 12% alcohol \n1.5 ounces of distilled spirits, which is about 40% alcohol."
							,"What is a 'Drink'?",JOptionPane.PLAIN_MESSAGE);
					
				}
			}
		); 
		
		detailJButton = new JButton("Details");
		detailJButton.setBounds(275,650,200,50);
		contentPane.add(detailJButton);
		detailJButton.addActionListener(
			new ActionListener() {
				public void actionPerformed(ActionEvent event)
				{
					JOptionPane.showMessageDialog(null,"For the purpose of this simulation, an average male is defined as an adult male weighing 200 lbs, and an average female is defined as an adult female weighing 170 lbs. \nThe BAC calculations and alcohol symptoms for this project were sourced from www.alcoholhelpcenter.net","Details",JOptionPane.PLAIN_MESSAGE);
					
				}
			}
		); 
		
		submitJButton = new JButton("Submit");
		submitJButton.setBounds(275,600,200,50);
		contentPane.add(submitJButton);
		submitJButton.addActionListener(
			new ActionListener() {
				public void actionPerformed(ActionEvent event) {

					int beerNum =Integer.parseInt(beerJText.getText());
					int wineNum =Integer.parseInt(wineJText.getText());
					int liquorNum =Integer.parseInt(liquorJText.getText());
					int timeNum =Integer.parseInt(timeJText.getText());
					drink = beerNum + wineNum + liquorNum;
					
					noFood = "\nLack of food could lead to faster alcohol processing, worsening of symptoms, and bodily damage.";
					noWater = "\nLack of water could lead to dehydration, worsening of symptoms, and bodily damage.";
					noSleep = ".\nLack of sleep could lower your tolerence and increase the severity of your inebriation. ";
					drugString = "\nWarning: consuming alcohol while on medication may lower your tolerance and possibly cause injury.";
					
					if (gender == true) { //male
						if (drink > 0) { //did you drink?
							if (food == true) { //food eaten
								if (water == true) { //drank water
									if (sleep == true) { //slept well
										if (drug == true) { //on medication
											switch (drink) {//yes food yes water yes sleep yes drug
												case 1: 
													JOptionPane.showMessageDialog(null,"After consuming " +drink+ " drinks over the period of "+timeNum+" hours, your BAC as an average male would be around 0.013 grams per milliliter of blood.\nYou are not really feeling the effects of alcohol and will return to sobriety shortly."+drugString,"Results",JOptionPane.PLAIN_MESSAGE);
													break;
												case 2:
													JOptionPane.showMessageDialog(null,"After consuming " +drink+ " drinks over the period of "+timeNum+" hours, your BAC as an average male would be around 0.034 grams per milliliter of blood.\nYou are feeling a little more relaxed while still maintaining your full coordination. \nYou will return to sobriety in a bit "+drugString,"Results",JOptionPane.PLAIN_MESSAGE);
													break;
												case 3:
													JOptionPane.showMessageDialog(null,"After consuming " +drink+ " drinks over the period of "+timeNum+" hours, your BAC as an average male would be around 0.047 grams per milliliter of blood.\nYou are feeling a bit more relaxed and might have a feeling of well being or euphoria. You will return to sobriety in about 3 hours. "+drugString,"Results",JOptionPane.PLAIN_MESSAGE);
													break;
												case 4:
													JOptionPane.showMessageDialog(null,"After consuming " +drink+ " drinks over the period of "+timeNum+" hours, your BAC as an average male would be around 0.069 grams per milliliter of blood.\nYou are feeling a bit more relaxed and might have a feeling of well being or euphoria. It is currently a poor idea to drive. \n You will return to sobriety in about 5 hours "+drugString,"Results",JOptionPane.PLAIN_MESSAGE);
													break;
												case 5:
													JOptionPane.showMessageDialog(null,"After consuming " +drink+ " drinks over the period of "+timeNum+" hours, your BAC as an average male would be around 0.090 grams per milliliter of blood.\nYou can definately tell that you are under the influence and your speech, motor skills, balance and judgement are affected. It is currently a poor idea to drive. \n You will return to sobriety in about 7 hours "+drugString,"Results",JOptionPane.PLAIN_MESSAGE);
													break;
												case 6: 
													JOptionPane.showMessageDialog(null,"After consuming " +drink+ " drinks over the period of "+timeNum+" hours, your BAC as an average male would be around 0.112 grams per milliliter of blood.\nYour speech will be slurred and your balance, vision, reactions time and hearing will be impaired. Your motor coordination will also be significantly impaired and you'll have a loss of good judgment. \nIt is currently a poor idea to drive. You will return to sobriety in about 8 hours "+drugString,"Results",JOptionPane.PLAIN_MESSAGE);
													break;
												case 7: 
													JOptionPane.showMessageDialog(null,"After consuming " +drink+ " drinks over the period of "+timeNum+" hours, your BAC as an average male would be around 0.133 grams per milliliter of blood.\nRight now, you'd be feeling gross motor impairment and a lack of physical control. It'd probably be hard for you to type on the keyboard and your monitor or mobile phone screen would appear blurry. \nYour judgment and perception of what’s going on would be severely impaired and any feeling of euphoria you had earlier will have turned to dysphoria. \nIt is currently a poor idea to drive. You will return to sobriety in about 10 hours "+drugString,"Results",JOptionPane.PLAIN_MESSAGE);
													break;
												case 8: 
													JOptionPane.showMessageDialog(null,"After consuming " +drink+ " drinks over the period of "+timeNum+" hours, your BAC as an average male would be around 0.155 grams per milliliter of blood. \nYou'll probably start to feel sick to your stomach. Any euphoria you had earlier will have turned to dysphoria. Right now you might look like a 'sloppy drunk'. \nConsuming this amount of alcohol in a short period of time is dangerous to your health. It is currently a poor idea to drive. You will return to sobriety in about 11 hours "+drugString,"Results",JOptionPane.PLAIN_MESSAGE);
													break;
												case 9:
													JOptionPane.showMessageDialog(null,"After consuming " +drink+ " drinks over the period of "+timeNum+" hours, your BAC as an average male would be around 0.176 grams per milliliter of blood. \nYou'll probably start to feel sick to your stomach. Any euphoria you had earlier will have turned to dysphoria. Right now you might look like a 'sloppy drunk'. \nConsuming this amount of alcohol in a short period of time is dangerous to your health. It is currently a poor idea to drive. You will return to sobriety in about 13 hours "+drugString,"Results",JOptionPane.PLAIN_MESSAGE);
													break;
												case 10:
													JOptionPane.showMessageDialog(null,"After consuming " +drink+ " drinks over the period of "+timeNum+" hours, your BAC as an average male would be around 0.198 grams per milliliter of blood. \nYou'll probably need help if you want to walk properly. If you fall down you probably won't feel a lot of pain – even if you hurt yourself. At this level of BAC, some people begin to vomit. At the very least, you'll feel dazed, confused and disoriented. \nConsuming this amount of alcohol in a short period of time is dangerous to your health. It is currently a poor idea to drive. You will return to sobriety in about 14 hours "+drugString,"Results",JOptionPane.PLAIN_MESSAGE);
													break;
												case 11:
													JOptionPane.showMessageDialog(null,"After consuming " +drink+ " drinks over the period of "+timeNum+" hours, your BAC as an average male would be around 0.219 grams per milliliter of blood. \nIf you were awake at this point you'd have very little comprehension as to where you were or what you were doing. You might pass out suddenly and it'd be hard to wake you up. \nConsuming this amount of alcohol in a short period of time is dangerous to your health. It is currently a poor idea to drive. You will return to sobriety in about 16 hours "+drugString,"Results",JOptionPane.PLAIN_MESSAGE);
													break;
												case 12:
													JOptionPane.showMessageDialog(null,"After consuming " +drink+ " drinks over the period of "+timeNum+" hours, your BAC as an average male would be around 0.240 grams per milliliter of blood. \nIf you were awake at this point you'd have very little comprehension as to where you were or what you were doing. You might pass out suddenly and it'd be hard to wake you up. \nConsuming this amount of alcohol in a short period of time is dangerous to your health. It is currently a poor idea to drive. You will return to sobriety in about 17 hours "+drugString,"Results",JOptionPane.PLAIN_MESSAGE);
													break;
												case 13:
													JOptionPane.showMessageDialog(null,"After consuming " +drink+ " drinks over the period of "+timeNum+" hours, your BAC as an average male would be around 0.262 grams per milliliter of blood. \nIf you were awake at this point you'd have very little comprehension as to where you were or what you were doing. You might pass out suddenly and it'd be hard to wake you up. \nConsuming this amount of alcohol in a short period of time is dangerous to your health. It is currently a poor idea to drive. You will return to sobriety in about 19 hours "+drugString,"Results",JOptionPane.PLAIN_MESSAGE);
													break;
												case 14:
													JOptionPane.showMessageDialog(null,"After consuming " +drink+ " drinks over the period of "+timeNum+" hours, your BAC as an average male would be around 0.283 grams per milliliter of blood. \nIf you were awake at this point you'd have very little comprehension as to where you were or what you were doing. You might pass out suddenly and it'd be hard to wake you up. \nConsuming this amount of alcohol in a short period of time is dangerous to your health. It is currently a poor idea to drive. You will return to sobriety in more than 20 hours "+drugString,"Results",JOptionPane.PLAIN_MESSAGE);
													break;
												case 15:
													JOptionPane.showMessageDialog(null,"After consuming " +drink+ " drinks over the period of "+timeNum+" hours, your BAC as an average male would be around 0.305 grams per milliliter of blood. \nIt's possible that you might fall into a coma. You might die due to the paralysis of your diaphragm, the collapse of your lungs, or heart attack (any form of respiratory arrest).  \nConsuming this amount of alcohol in a short period of time is dangerous to your health. It is currently a poor idea to drive. You will return to sobriety in more than 20 hours "+drugString,"Results",JOptionPane.PLAIN_MESSAGE);
													break;
												case 16:
													JOptionPane.showMessageDialog(null,"After consuming " +drink+ " drinks over the period of "+timeNum+" hours, your BAC as an average male would be around 0.326 grams per milliliter of blood. \nIt's possible that you might fall into a coma. You might die due to the paralysis of your diaphragm, the collapse of your lungs, or heart attack (any form of respiratory arrest).  \nConsuming this amount of alcohol in a short period of time is dangerous to your health. It is currently a poor idea to drive. You will return to sobriety in more than 20 hours "+drugString,"Results",JOptionPane.PLAIN_MESSAGE);
													break;
												case 17:
													JOptionPane.showMessageDialog(null,"After consuming " +drink+ " drinks over the period of "+timeNum+" hours, your BAC as an average male would be around 0.348 grams per milliliter of blood. \nIt's possible that you might fall into a coma. You might die due to the paralysis of your diaphragm, the collapse of your lungs, or heart attack (any form of respiratory arrest).  \nConsuming this amount of alcohol in a short period of time is dangerous to your health. It is currently a poor idea to drive. You will return to sobriety in more than 20 hours "+drugString,"Results",JOptionPane.PLAIN_MESSAGE);
													break;
												default:
													JOptionPane.showMessageDialog(null,"After consuming " +drink+ " drinks over the period of "+timeNum+" hours, your BAC as an average male would be above 0.30 grams per milliliter of blood. \nIt's possible that you might fall into a coma. You might die due to the paralysis of your diaphragm, the collapse of your lungs, or heart attack (any form of respiratory arrest).  \nConsuming this amount of alcohol in a short period of time is dangerous to your health. It is currently a poor idea to drive. You will return to sobriety in more than 20 hours "+drugString,"Results",JOptionPane.PLAIN_MESSAGE);							
													break;
											} 
										} else { //yes food yes water yes sleep no drug
											switch (drink) {
											case 1:
												JOptionPane.showMessageDialog(null,"After consuming " +drink+ " drinks over the period of "+timeNum+" hours, your BAC as an average male would be around 0.013 grams per milliliter of blood.\nYou are not really feeling the effects of alcohol and will return to sobriety shortly.","Results",JOptionPane.PLAIN_MESSAGE);
												break;
											case 2:
												JOptionPane.showMessageDialog(null,"After consuming " +drink+ " drinks over the period of "+timeNum+" hours, your BAC as an average male would be around 0.034 grams per milliliter of blood.\nYou are feeling a little more relaxed while still maintaining your full coordination. \nYou will return to sobriety in a bit.","Results",JOptionPane.PLAIN_MESSAGE);
												break;
											case 3:
												JOptionPane.showMessageDialog(null,"After consuming " +drink+ " drinks over the period of "+timeNum+" hours, your BAC as an average male would be around 0.047 grams per milliliter of blood.\nYou are feeling a bit more relaxed and might have a feeling of well being or euphoria. You will return to sobriety in about 3 hours.","Results",JOptionPane.PLAIN_MESSAGE);
												break;
											case 4:
												JOptionPane.showMessageDialog(null,"After consuming " +drink+ " drinks over the period of "+timeNum+" hours, your BAC as an average male would be around 0.069 grams per milliliter of blood.\nYou are feeling a bit more relaxed and might have a feeling of well being or euphoria. It is currently a poor idea to drive. \n You will return to sobriety in about 5 hours.","Results",JOptionPane.PLAIN_MESSAGE);
												break;
											case 5:
												JOptionPane.showMessageDialog(null,"After consuming " +drink+ " drinks over the period of "+timeNum+" hours, your BAC as an average male would be around 0.090 grams per milliliter of blood.\nYou can definately tell that you are under the influence and your speech, motor skills, balance and judgement are affected. It is currently a poor idea to drive. \n You will return to sobriety in about 7 hours.","Results",JOptionPane.PLAIN_MESSAGE);
												break;
											case 6: 
												JOptionPane.showMessageDialog(null,"After consuming " +drink+ " drinks over the period of "+timeNum+" hours, your BAC as an average male would be around 0.112 grams per milliliter of blood.\nYour speech will be slurred and your balance, vision, reactions time and hearing will be impaired. Your motor coordination will also be significantly impaired and you'll have a loss of good judgment. \nIt is currently a poor idea to drive. You will return to sobriety in about 8 hours.","Results",JOptionPane.PLAIN_MESSAGE);
												break;
											case 7: 
												JOptionPane.showMessageDialog(null,"After consuming " +drink+ " drinks over the period of "+timeNum+" hours, your BAC as an average male would be around 0.133 grams per milliliter of blood.\nRight now, you'd be feeling gross motor impairment and a lack of physical control. It'd probably be hard for you to type on the keyboard and your monitor or mobile phone screen would appear blurry. \nYour judgment and perception of what’s going on would be severely impaired and any feeling of euphoria you had earlier will have turned to dysphoria. \nIt is currently a poor idea to drive. You will return to sobriety in about 10 hours.","Results",JOptionPane.PLAIN_MESSAGE);
												break;
											case 8: 
												JOptionPane.showMessageDialog(null,"After consuming " +drink+ " drinks over the period of "+timeNum+" hours, your BAC as an average male would be around 0.155 grams per milliliter of blood. \nYou'll probably start to feel sick to your stomach. Any euphoria you had earlier will have turned to dysphoria. Right now you might look like a 'sloppy drunk'. \nConsuming this amount of alcohol in a short period of time is dangerous to your health. It is currently a poor idea to drive. You will return to sobriety in about 11 hours.","Results",JOptionPane.PLAIN_MESSAGE);
												break;
											case 9:
												JOptionPane.showMessageDialog(null,"After consuming " +drink+ " drinks over the period of "+timeNum+" hours, your BAC as an average male would be around 0.176 grams per milliliter of blood. \nYou'll probably start to feel sick to your stomach. Any euphoria you had earlier will have turned to dysphoria. Right now you might look like a 'sloppy drunk'. \nConsuming this amount of alcohol in a short period of time is dangerous to your health. It is currently a poor idea to drive. You will return to sobriety in about 13 hours.","Results",JOptionPane.PLAIN_MESSAGE);
												break;
											case 10:
												JOptionPane.showMessageDialog(null,"After consuming " +drink+ " drinks over the period of "+timeNum+" hours, your BAC as an average male would be around 0.198 grams per milliliter of blood. \nYou'll probably need help if you want to walk properly. If you fall down you probably won't feel a lot of pain – even if you hurt yourself. At this level of BAC, some people begin to vomit. At the very least, you'll feel dazed, confused and disoriented. \nConsuming this amount of alcohol in a short period of time is dangerous to your health. It is currently a poor idea to drive. You will return to sobriety in about 14 hours.","Results",JOptionPane.PLAIN_MESSAGE);
												break;
											case 11:
												JOptionPane.showMessageDialog(null,"After consuming " +drink+ " drinks over the period of "+timeNum+" hours, your BAC as an average male would be around 0.219 grams per milliliter of blood. \nIf you were awake at this point you'd have very little comprehension as to where you were or what you were doing. You might pass out suddenly and it'd be hard to wake you up. \nConsuming this amount of alcohol in a short period of time is dangerous to your health. It is currently a poor idea to drive. You will return to sobriety in about 16 hours.","Results",JOptionPane.PLAIN_MESSAGE);
												break;
											case 12:
												JOptionPane.showMessageDialog(null,"After consuming " +drink+ " drinks over the period of "+timeNum+" hours, your BAC as an average male would be around 0.240 grams per milliliter of blood. \nIf you were awake at this point you'd have very little comprehension as to where you were or what you were doing. You might pass out suddenly and it'd be hard to wake you up. \nConsuming this amount of alcohol in a short period of time is dangerous to your health. It is currently a poor idea to drive. You will return to sobriety in about 17 hours.","Results",JOptionPane.PLAIN_MESSAGE);
												break;
											case 13:
												JOptionPane.showMessageDialog(null,"After consuming " +drink+ " drinks over the period of "+timeNum+" hours, your BAC as an average male would be around 0.262 grams per milliliter of blood. \nIf you were awake at this point you'd have very little comprehension as to where you were or what you were doing. You might pass out suddenly and it'd be hard to wake you up. \nConsuming this amount of alcohol in a short period of time is dangerous to your health. It is currently a poor idea to drive.","Results",JOptionPane.PLAIN_MESSAGE);
												break;
											case 14:
												JOptionPane.showMessageDialog(null,"After consuming " +drink+ " drinks over the period of "+timeNum+" hours, your BAC as an average male would be around 0.283 grams per milliliter of blood. \nIf you were awake at this point you'd have very little comprehension as to where you were or what you were doing. You might pass out suddenly and it'd be hard to wake you up. \nConsuming this amount of alcohol in a short period of time is dangerous to your health. It is currently a poor idea to drive. You will return to sobriety in more than 20 hours.","Results",JOptionPane.PLAIN_MESSAGE);
												break;
											case 15:
												JOptionPane.showMessageDialog(null,"After consuming " +drink+ " drinks over the period of "+timeNum+" hours, your BAC as an average male would be around 0.305 grams per milliliter of blood. \nIt's possible that you might fall into a coma. You might die due to the paralysis of your diaphragm, the collapse of your lungs, or heart attack (any form of respiratory arrest).  \nConsuming this amount of alcohol in a short period of time is dangerous to your health. It is currently a poor idea to drive. You will return to sobriety in more than 20 hours.","Results",JOptionPane.PLAIN_MESSAGE);
												break;
											case 16:
												JOptionPane.showMessageDialog(null,"After consuming " +drink+ " drinks over the period of "+timeNum+" hours, your BAC as an average male would be around 0.326 grams per milliliter of blood. \nIt's possible that you might fall into a coma. You might die due to the paralysis of your diaphragm, the collapse of your lungs, or heart attack (any form of respiratory arrest).  \nConsuming this amount of alcohol in a short period of time is dangerous to your health. It is currently a poor idea to drive. You will return to sobriety in more than 20 hours.","Results",JOptionPane.PLAIN_MESSAGE);
												break;
											case 17:
												JOptionPane.showMessageDialog(null,"After consuming " +drink+ " drinks over the period of "+timeNum+" hours, your BAC as an average male would be around 0.348 grams per milliliter of blood. \nIt's possible that you might fall into a coma. You might die due to the paralysis of your diaphragm, the collapse of your lungs, or heart attack (any form of respiratory arrest).  \nConsuming this amount of alcohol in a short period of time is dangerous to your health. It is currently a poor idea to drive. You will return to sobriety in more than 20 hours.","Results",JOptionPane.PLAIN_MESSAGE);
												break;
											default:
												JOptionPane.showMessageDialog(null,"After consuming " +drink+ " drinks over the period of "+timeNum+" hours, your BAC as an average male would be above 0.30 grams per milliliter of blood. \nIt's possible that you might fall into a coma. You might die due to the paralysis of your diaphragm, the collapse of your lungs, or heart attack (any form of respiratory arrest).  \nConsuming this amount of alcohol in a short period of time is dangerous to your health. It is currently a poor idea to drive. You will return to sobriety in more than 20 hours.","Results",JOptionPane.PLAIN_MESSAGE);							
												break;
										}
										}
												
											} /*no sleep*/ else {
												if (drug == true) { //yes food yes water no sleep yes drug
													switch (drink) {
													case 1:
														JOptionPane.showMessageDialog(null,"After consuming " +drink+ " drinks over the period of "+timeNum+" hours, your BAC as an average male would be around 0.013 grams per milliliter of blood.\nYou are not really feeling the effects of alcohol and will return to sobriety shortly."+noSleep + drugString,"Results",JOptionPane.PLAIN_MESSAGE);
														break;
													case 2:
														JOptionPane.showMessageDialog(null,"After consuming " +drink+ " drinks over the period of "+timeNum+" hours, your BAC as an average male would be around 0.034 grams per milliliter of blood.\nYou are feeling a little more relaxed while still maintaining your full coordination. \nYou will return to sobriety in a bit."+noSleep+ drugString,"Results",JOptionPane.PLAIN_MESSAGE);
														break;
													case 3:
														JOptionPane.showMessageDialog(null,"After consuming " +drink+ " drinks over the period of "+timeNum+" hours, your BAC as an average male would be around 0.047 grams per milliliter of blood.\nYou are feeling a bit more relaxed and might have a feeling of well being or euphoria. You will return to sobriety in about 3 hours."+noSleep+ drugString,"Results",JOptionPane.PLAIN_MESSAGE);
														break;
													case 4:
														JOptionPane.showMessageDialog(null,"After consuming " +drink+ " drinks over the period of "+timeNum+" hours, your BAC as an average male would be around 0.069 grams per milliliter of blood.\nYou are feeling a bit more relaxed and might have a feeling of well being or euphoria. It is currently a poor idea to drive. \n You will return to sobriety in about 5 hours."+noSleep+ drugString,"Results",JOptionPane.PLAIN_MESSAGE);
														break;
													case 5:
														JOptionPane.showMessageDialog(null,"After consuming " +drink+ " drinks over the period of "+timeNum+" hours, your BAC as an average male would be around 0.090 grams per milliliter of blood.\nYou can definately tell that you are under the influence and your speech, motor skills, balance and judgement are affected. It is currently a poor idea to drive. \n You will return to sobriety in about 7 hours."+noSleep+ drugString,"Results",JOptionPane.PLAIN_MESSAGE);
														break;
													case 6: 
														JOptionPane.showMessageDialog(null,"After consuming " +drink+ " drinks over the period of "+timeNum+" hours, your BAC as an average male would be around 0.112 grams per milliliter of blood.\nYour speech will be slurred and your balance, vision, reactions time and hearing will be impaired. Your motor coordination will also be significantly impaired and you'll have a loss of good judgment. \nIt is currently a poor idea to drive. You will return to sobriety in about 8 hours."+noSleep+ drugString,"Results",JOptionPane.PLAIN_MESSAGE);
														break;
													case 7: 
														JOptionPane.showMessageDialog(null,"After consuming " +drink+ " drinks over the period of "+timeNum+" hours, your BAC as an average male would be around 0.133 grams per milliliter of blood.\nRight now, you'd be feeling gross motor impairment and a lack of physical control. It'd probably be hard for you to type on the keyboard and your monitor or mobile phone screen would appear blurry. \nYour judgment and perception of what’s going on would be severely impaired and any feeling of euphoria you had earlier will have turned to dysphoria. \nIt is currently a poor idea to drive. You will return to sobriety in about 10 hours."+noSleep+ drugString,"Results",JOptionPane.PLAIN_MESSAGE);
														break;
													case 8: 
														JOptionPane.showMessageDialog(null,"After consuming " +drink+ " drinks over the period of "+timeNum+" hours, your BAC as an average male would be around 0.155 grams per milliliter of blood. \nYou'll probably start to feel sick to your stomach. Any euphoria you had earlier will have turned to dysphoria. Right now you might look like a 'sloppy drunk'. \nConsuming this amount of alcohol in a short period of time is dangerous to your health. It is currently a poor idea to drive. You will return to sobriety in about 11 hours."+noSleep+ drugString,"Results",JOptionPane.PLAIN_MESSAGE);
														break;
													case 9:
														JOptionPane.showMessageDialog(null,"After consuming " +drink+ " drinks over the period of "+timeNum+" hours, your BAC as an average male would be around 0.176 grams per milliliter of blood. \nYou'll probably start to feel sick to your stomach. Any euphoria you had earlier will have turned to dysphoria. Right now you might look like a 'sloppy drunk'. \nConsuming this amount of alcohol in a short period of time is dangerous to your health. It is currently a poor idea to drive. You will return to sobriety in about 13 hours."+noSleep+ drugString,"Results",JOptionPane.PLAIN_MESSAGE);
														break;
													case 10:
														JOptionPane.showMessageDialog(null,"After consuming " +drink+ " drinks over the period of "+timeNum+" hours, your BAC as an average male would be around 0.198 grams per milliliter of blood. \nYou'll probably need help if you want to walk properly. If you fall down you probably won't feel a lot of pain – even if you hurt yourself. At this level of BAC, some people begin to vomit. At the very least, you'll feel dazed, confused and disoriented. \nConsuming this amount of alcohol in a short period of time is dangerous to your health. It is currently a poor idea to drive. You will return to sobriety in about 14 hours."+noSleep+ drugString,"Results",JOptionPane.PLAIN_MESSAGE);
														break;
													case 11:
														JOptionPane.showMessageDialog(null,"After consuming " +drink+ " drinks over the period of "+timeNum+" hours, your BAC as an average male would be around 0.219 grams per milliliter of blood. \nIf you were awake at this point you'd have very little comprehension as to where you were or what you were doing. You might pass out suddenly and it'd be hard to wake you up. \nConsuming this amount of alcohol in a short period of time is dangerous to your health. It is currently a poor idea to drive. You will return to sobriety in about 16 hours."+noSleep+ drugString,"Results",JOptionPane.PLAIN_MESSAGE);
														break;
													case 12:
														JOptionPane.showMessageDialog(null,"After consuming " +drink+ " drinks over the period of "+timeNum+" hours, your BAC as an average male would be around 0.240 grams per milliliter of blood. \nIf you were awake at this point you'd have very little comprehension as to where you were or what you were doing. You might pass out suddenly and it'd be hard to wake you up. \nConsuming this amount of alcohol in a short period of time is dangerous to your health. It is currently a poor idea to drive. You will return to sobriety in about 17 hours."+noSleep+ drugString,"Results",JOptionPane.PLAIN_MESSAGE);
														break;
													case 13:
														JOptionPane.showMessageDialog(null,"After consuming " +drink+ " drinks over the period of "+timeNum+" hours, your BAC as an average male would be around 0.262 grams per milliliter of blood. \nIf you were awake at this point you'd have very little comprehension as to where you were or what you were doing. You might pass out suddenly and it'd be hard to wake you up. \nConsuming this amount of alcohol in a short period of time is dangerous to your health. It is currently a poor idea to drive."+noSleep+ drugString,"Results",JOptionPane.PLAIN_MESSAGE);
														break;
													case 14:
														JOptionPane.showMessageDialog(null,"After consuming " +drink+ " drinks over the period of "+timeNum+" hours, your BAC as an average male would be around 0.283 grams per milliliter of blood. \nIf you were awake at this point you'd have very little comprehension as to where you were or what you were doing. You might pass out suddenly and it'd be hard to wake you up. \nConsuming this amount of alcohol in a short period of time is dangerous to your health. It is currently a poor idea to drive. You will return to sobriety in more than 20 hours."+noSleep+ drugString,"Results",JOptionPane.PLAIN_MESSAGE);
														break;
													case 15:
														JOptionPane.showMessageDialog(null,"After consuming " +drink+ " drinks over the period of "+timeNum+" hours, your BAC as an average male would be around 0.305 grams per milliliter of blood. \nIt's possible that you might fall into a coma. You might die due to the paralysis of your diaphragm, the collapse of your lungs, or heart attack (any form of respiratory arrest).  \nConsuming this amount of alcohol in a short period of time is dangerous to your health. It is currently a poor idea to drive. You will return to sobriety in more than 20 hours."+noSleep+ drugString,"Results",JOptionPane.PLAIN_MESSAGE);
														break;
													case 16:
														JOptionPane.showMessageDialog(null,"After consuming " +drink+ " drinks over the period of "+timeNum+" hours, your BAC as an average male would be around 0.326 grams per milliliter of blood. \nIt's possible that you might fall into a coma. You might die due to the paralysis of your diaphragm, the collapse of your lungs, or heart attack (any form of respiratory arrest).  \nConsuming this amount of alcohol in a short period of time is dangerous to your health. It is currently a poor idea to drive. You will return to sobriety in more than 20 hours."+noSleep+ drugString,"Results",JOptionPane.PLAIN_MESSAGE);
														break;
													case 17:
														JOptionPane.showMessageDialog(null,"After consuming " +drink+ " drinks over the period of "+timeNum+" hours, your BAC as an average male would be around 0.348 grams per milliliter of blood. \nIt's possible that you might fall into a coma. You might die due to the paralysis of your diaphragm, the collapse of your lungs, or heart attack (any form of respiratory arrest).  \nConsuming this amount of alcohol in a short period of time is dangerous to your health. It is currently a poor idea to drive. You will return to sobriety in more than 20 hours."+noSleep+ drugString,"Results",JOptionPane.PLAIN_MESSAGE);
														break;
													default:
														JOptionPane.showMessageDialog(null,"After consuming " +drink+ " drinks over the period of "+timeNum+" hours, your BAC as an average male would be above 0.30 grams per milliliter of blood. \nIt's possible that you might fall into a coma. You might die due to the paralysis of your diaphragm, the collapse of your lungs, or heart attack (any form of respiratory arrest).  \nConsuming this amount of alcohol in a short period of time is dangerous to your health. It is currently a poor idea to drive. You will return to sobriety in more than 20 hours."+noSleep+ drugString,"Results",JOptionPane.PLAIN_MESSAGE);							
														break;
													}
												} else { //yes food yes water no sleep no drug
												switch (drink) { 
												case 1:
													JOptionPane.showMessageDialog(null,"After consuming " +drink+ " drinks over the period of "+timeNum+" hours, your BAC as an average male would be around 0.013 grams per milliliter of blood.\nYou are not really feeling the effects of alcohol and will return to sobriety shortly."+noSleep,"Results",JOptionPane.PLAIN_MESSAGE);
													break;
												case 2:
													JOptionPane.showMessageDialog(null,"After consuming " +drink+ " drinks over the period of "+timeNum+" hours, your BAC as an average male would be around 0.034 grams per milliliter of blood.\nYou are feeling a little more relaxed while still maintaining your full coordination. \nYou will return to sobriety in a bit."+noSleep,"Results",JOptionPane.PLAIN_MESSAGE);
													break;
												case 3:
													JOptionPane.showMessageDialog(null,"After consuming " +drink+ " drinks over the period of "+timeNum+" hours, your BAC as an average male would be around 0.047 grams per milliliter of blood.\nYou are feeling a bit more relaxed and might have a feeling of well being or euphoria. You will return to sobriety in about 3 hours."+noSleep,"Results",JOptionPane.PLAIN_MESSAGE);
													break;
												case 4:
													JOptionPane.showMessageDialog(null,"After consuming " +drink+ " drinks over the period of "+timeNum+" hours, your BAC as an average male would be around 0.069 grams per milliliter of blood.\nYou are feeling a bit more relaxed and might have a feeling of well being or euphoria. It is currently a poor idea to drive. \n You will return to sobriety in about 5 hours."+noSleep,"Results",JOptionPane.PLAIN_MESSAGE);
													break;
												case 5:
													JOptionPane.showMessageDialog(null,"After consuming " +drink+ " drinks over the period of "+timeNum+" hours, your BAC as an average male would be around 0.090 grams per milliliter of blood.\nYou can definately tell that you are under the influence and your speech, motor skills, balance and judgement are affected. It is currently a poor idea to drive. \n You will return to sobriety in about 7 hours."+noSleep,"Results",JOptionPane.PLAIN_MESSAGE);
													break;
												case 6: 
													JOptionPane.showMessageDialog(null,"After consuming " +drink+ " drinks over the period of "+timeNum+" hours, your BAC as an average male would be around 0.112 grams per milliliter of blood.\nYour speech will be slurred and your balance, vision, reactions time and hearing will be impaired. Your motor coordination will also be significantly impaired and you'll have a loss of good judgment. \nIt is currently a poor idea to drive. You will return to sobriety in about 8 hours.","Results",JOptionPane.PLAIN_MESSAGE);
													break;
												case 7: 
													JOptionPane.showMessageDialog(null,"After consuming " +drink+ " drinks over the period of "+timeNum+" hours, your BAC as an average male would be around 0.133 grams per milliliter of blood.\nRight now, you'd be feeling gross motor impairment and a lack of physical control. It'd probably be hard for you to type on the keyboard and your monitor or mobile phone screen would appear blurry. \nYour judgment and perception of what’s going on would be severely impaired and any feeling of euphoria you had earlier will have turned to dysphoria. \nIt is currently a poor idea to drive. You will return to sobriety in about 10 hours."+noSleep,"Results",JOptionPane.PLAIN_MESSAGE);
													break;
												case 8: 
													JOptionPane.showMessageDialog(null,"After consuming " +drink+ " drinks over the period of "+timeNum+" hours, your BAC as an average male would be around 0.155 grams per milliliter of blood. \nYou'll probably start to feel sick to your stomach. Any euphoria you had earlier will have turned to dysphoria. Right now you might look like a 'sloppy drunk'. \nConsuming this amount of alcohol in a short period of time is dangerous to your health. It is currently a poor idea to drive. You will return to sobriety in about 11 hours."+noSleep,"Results",JOptionPane.PLAIN_MESSAGE);
													break;
												case 9:
													JOptionPane.showMessageDialog(null,"After consuming " +drink+ " drinks over the period of "+timeNum+" hours, your BAC as an average male would be around 0.176 grams per milliliter of blood. \nYou'll probably start to feel sick to your stomach. Any euphoria you had earlier will have turned to dysphoria. Right now you might look like a 'sloppy drunk'. \nConsuming this amount of alcohol in a short period of time is dangerous to your health. It is currently a poor idea to drive. You will return to sobriety in about 13 hours."+noSleep,"Results",JOptionPane.PLAIN_MESSAGE);
													break;
												case 10:
													JOptionPane.showMessageDialog(null,"After consuming " +drink+ " drinks over the period of "+timeNum+" hours, your BAC as an average male would be around 0.198 grams per milliliter of blood. \nYou'll probably need help if you want to walk properly. If you fall down you probably won't feel a lot of pain – even if you hurt yourself. At this level of BAC, some people begin to vomit. At the very least, you'll feel dazed, confused and disoriented. \nConsuming this amount of alcohol in a short period of time is dangerous to your health. It is currently a poor idea to drive. You will return to sobriety in about 14 hours."+noSleep,"Results",JOptionPane.PLAIN_MESSAGE);
													break;
												case 11:
													JOptionPane.showMessageDialog(null,"After consuming " +drink+ " drinks over the period of "+timeNum+" hours, your BAC as an average male would be around 0.219 grams per milliliter of blood. \nIf you were awake at this point you'd have very little comprehension as to where you were or what you were doing. You might pass out suddenly and it'd be hard to wake you up. \nConsuming this amount of alcohol in a short period of time is dangerous to your health. It is currently a poor idea to drive. You will return to sobriety in about 16 hours."+noSleep,"Results",JOptionPane.PLAIN_MESSAGE);
													break;
												case 12:
													JOptionPane.showMessageDialog(null,"After consuming " +drink+ " drinks over the period of "+timeNum+" hours, your BAC as an average male would be around 0.240 grams per milliliter of blood. \nIf you were awake at this point you'd have very little comprehension as to where you were or what you were doing. You might pass out suddenly and it'd be hard to wake you up. \nConsuming this amount of alcohol in a short period of time is dangerous to your health. It is currently a poor idea to drive. You will return to sobriety in about 17 hours."+noSleep,"Results",JOptionPane.PLAIN_MESSAGE);
													break;
												case 13:
													JOptionPane.showMessageDialog(null,"After consuming " +drink+ " drinks over the period of "+timeNum+" hours, your BAC as an average male would be around 0.262 grams per milliliter of blood. \nIf you were awake at this point you'd have very little comprehension as to where you were or what you were doing. You might pass out suddenly and it'd be hard to wake you up. \nConsuming this amount of alcohol in a short period of time is dangerous to your health. It is currently a poor idea to drive."+noSleep,"Results",JOptionPane.PLAIN_MESSAGE);
													break;
												case 14:
													JOptionPane.showMessageDialog(null,"After consuming " +drink+ " drinks over the period of "+timeNum+" hours, your BAC as an average male would be around 0.283 grams per milliliter of blood. \nIf you were awake at this point you'd have very little comprehension as to where you were or what you were doing. You might pass out suddenly and it'd be hard to wake you up. \nConsuming this amount of alcohol in a short period of time is dangerous to your health. It is currently a poor idea to drive. You will return to sobriety in more than 20 hours."+noSleep,"Results",JOptionPane.PLAIN_MESSAGE);
													break;
												case 15:
													JOptionPane.showMessageDialog(null,"After consuming " +drink+ " drinks over the period of "+timeNum+" hours, your BAC as an average male would be around 0.305 grams per milliliter of blood. \nIt's possible that you might fall into a coma. You might die due to the paralysis of your diaphragm, the collapse of your lungs, or heart attack (any form of respiratory arrest).  \nConsuming this amount of alcohol in a short period of time is dangerous to your health. It is currently a poor idea to drive. You will return to sobriety in more than 20 hours."+noSleep,"Results",JOptionPane.PLAIN_MESSAGE);
													break;
												case 16:
													JOptionPane.showMessageDialog(null,"After consuming " +drink+ " drinks over the period of "+timeNum+" hours, your BAC as an average male would be around 0.326 grams per milliliter of blood. \nIt's possible that you might fall into a coma. You might die due to the paralysis of your diaphragm, the collapse of your lungs, or heart attack (any form of respiratory arrest).  \nConsuming this amount of alcohol in a short period of time is dangerous to your health. It is currently a poor idea to drive. You will return to sobriety in more than 20 hours."+noSleep,"Results",JOptionPane.PLAIN_MESSAGE);
													break;
												case 17:
													JOptionPane.showMessageDialog(null,"After consuming " +drink+ " drinks over the period of "+timeNum+" hours, your BAC as an average male would be around 0.348 grams per milliliter of blood. \nIt's possible that you might fall into a coma. You might die due to the paralysis of your diaphragm, the collapse of your lungs, or heart attack (any form of respiratory arrest).  \nConsuming this amount of alcohol in a short period of time is dangerous to your health. It is currently a poor idea to drive. You will return to sobriety in more than 20 hours."+noSleep,"Results",JOptionPane.PLAIN_MESSAGE);
													break;
												default:
													JOptionPane.showMessageDialog(null,"After consuming " +drink+ " drinks over the period of "+timeNum+" hours, your BAC as an average male would be above 0.30 grams per milliliter of blood. \nIt's possible that you might fall into a coma. You might die due to the paralysis of your diaphragm, the collapse of your lungs, or heart attack (any form of respiratory arrest).  \nConsuming this amount of alcohol in a short period of time is dangerous to your health. It is currently a poor idea to drive. You will return to sobriety in more than 20 hours."+noSleep,"Results",JOptionPane.PLAIN_MESSAGE);							
													break;
											}
											} /*no sleep no drug*/
										} 
								}/* no water*/ else {
									if (sleep == true) { //slept well
										if (drug == true) { //on medication
											switch (drink) {//yes food no water yes sleep yes drug
												case 1: 
													JOptionPane.showMessageDialog(null,"After consuming " +drink+ " drinks over the period of "+timeNum+" hours, your BAC as an average male would be around 0.013 grams per milliliter of blood.\nYou are not really feeling the effects of alcohol and will return to sobriety shortly."+drugString+noWater,"Results",JOptionPane.PLAIN_MESSAGE);
													break;
												case 2:
													JOptionPane.showMessageDialog(null,"After consuming " +drink+ " drinks over the period of "+timeNum+" hours, your BAC as an average male would be around 0.034 grams per milliliter of blood.\nYou are feeling a little more relaxed while still maintaining your full coordination. \nYou will return to sobriety in a bit "+drugString+noWater,"Results",JOptionPane.PLAIN_MESSAGE);
													break;
												case 3:
													JOptionPane.showMessageDialog(null,"After consuming " +drink+ " drinks over the period of "+timeNum+" hours, your BAC as an average male would be around 0.047 grams per milliliter of blood.\nYou are feeling a bit more relaxed and might have a feeling of well being or euphoria. You will return to sobriety in about 3 hours. "+drugString+noWater,"Results",JOptionPane.PLAIN_MESSAGE);
													break;
												case 4:
													JOptionPane.showMessageDialog(null,"After consuming " +drink+ " drinks over the period of "+timeNum+" hours, your BAC as an average male would be around 0.069 grams per milliliter of blood.\nYou are feeling a bit more relaxed and might have a feeling of well being or euphoria. It is currently a poor idea to drive. \n You will return to sobriety in about 5 hours "+drugString+noWater,"Results",JOptionPane.PLAIN_MESSAGE);
													break;
												case 5:
													JOptionPane.showMessageDialog(null,"After consuming " +drink+ " drinks over the period of "+timeNum+" hours, your BAC as an average male would be around 0.090 grams per milliliter of blood.\nYou can definately tell that you are under the influence and your speech, motor skills, balance and judgement are affected. It is currently a poor idea to drive. \n You will return to sobriety in about 7 hours "+drugString+noWater,"Results",JOptionPane.PLAIN_MESSAGE);
													break;
												case 6: 
													JOptionPane.showMessageDialog(null,"After consuming " +drink+ " drinks over the period of "+timeNum+" hours, your BAC as an average male would be around 0.112 grams per milliliter of blood.\nYour speech will be slurred and your balance, vision, reactions time and hearing will be impaired. Your motor coordination will also be significantly impaired and you'll have a loss of good judgment. \nIt is currently a poor idea to drive. You will return to sobriety in about 8 hours "+drugString+noWater,"Results",JOptionPane.PLAIN_MESSAGE);
													break;
												case 7: 
													JOptionPane.showMessageDialog(null,"After consuming " +drink+ " drinks over the period of "+timeNum+" hours, your BAC as an average male would be around 0.133 grams per milliliter of blood.\nRight now, you'd be feeling gross motor impairment and a lack of physical control. It'd probably be hard for you to type on the keyboard and your monitor or mobile phone screen would appear blurry. \nYour judgment and perception of what’s going on would be severely impaired and any feeling of euphoria you had earlier will have turned to dysphoria. \nIt is currently a poor idea to drive. You will return to sobriety in about 10 hours "+drugString+noWater,"Results",JOptionPane.PLAIN_MESSAGE);
													break;
												case 8: 
													JOptionPane.showMessageDialog(null,"After consuming " +drink+ " drinks over the period of "+timeNum+" hours, your BAC as an average male would be around 0.155 grams per milliliter of blood. \nYou'll probably start to feel sick to your stomach. Any euphoria you had earlier will have turned to dysphoria. Right now you might look like a 'sloppy drunk'. \nConsuming this amount of alcohol in a short period of time is dangerous to your health. It is currently a poor idea to drive. You will return to sobriety in about 11 hours "+drugString+noWater,"Results",JOptionPane.PLAIN_MESSAGE);
													break;
												case 9:
													JOptionPane.showMessageDialog(null,"After consuming " +drink+ " drinks over the period of "+timeNum+" hours, your BAC as an average male would be around 0.176 grams per milliliter of blood. \nYou'll probably start to feel sick to your stomach. Any euphoria you had earlier will have turned to dysphoria. Right now you might look like a 'sloppy drunk'. \nConsuming this amount of alcohol in a short period of time is dangerous to your health. It is currently a poor idea to drive. You will return to sobriety in about 13 hours "+drugString+noWater,"Results",JOptionPane.PLAIN_MESSAGE);
													break;
												case 10:
													JOptionPane.showMessageDialog(null,"After consuming " +drink+ " drinks over the period of "+timeNum+" hours, your BAC as an average male would be around 0.198 grams per milliliter of blood. \nYou'll probably need help if you want to walk properly. If you fall down you probably won't feel a lot of pain – even if you hurt yourself. At this level of BAC, some people begin to vomit. At the very least, you'll feel dazed, confused and disoriented. \nConsuming this amount of alcohol in a short period of time is dangerous to your health. It is currently a poor idea to drive. You will return to sobriety in about 14 hours "+drugString+noWater,"Results",JOptionPane.PLAIN_MESSAGE);
													break;
												case 11:
													JOptionPane.showMessageDialog(null,"After consuming " +drink+ " drinks over the period of "+timeNum+" hours, your BAC as an average male would be around 0.219 grams per milliliter of blood. \nIf you were awake at this point you'd have very little comprehension as to where you were or what you were doing. You might pass out suddenly and it'd be hard to wake you up. \nConsuming this amount of alcohol in a short period of time is dangerous to your health. It is currently a poor idea to drive. You will return to sobriety in about 16 hours "+drugString+noWater,"Results",JOptionPane.PLAIN_MESSAGE);
													break;
												case 12:
													JOptionPane.showMessageDialog(null,"After consuming " +drink+ " drinks over the period of "+timeNum+" hours, your BAC as an average male would be around 0.240 grams per milliliter of blood. \nIf you were awake at this point you'd have very little comprehension as to where you were or what you were doing. You might pass out suddenly and it'd be hard to wake you up. \nConsuming this amount of alcohol in a short period of time is dangerous to your health. It is currently a poor idea to drive. You will return to sobriety in about 17 hours "+drugString+noWater,"Results",JOptionPane.PLAIN_MESSAGE);
													break;
												case 13:
													JOptionPane.showMessageDialog(null,"After consuming " +drink+ " drinks over the period of "+timeNum+" hours, your BAC as an average male would be around 0.262 grams per milliliter of blood. \nIf you were awake at this point you'd have very little comprehension as to where you were or what you were doing. You might pass out suddenly and it'd be hard to wake you up. \nConsuming this amount of alcohol in a short period of time is dangerous to your health. It is currently a poor idea to drive. You will return to sobriety in about 19 hours "+drugString+noWater,"Results",JOptionPane.PLAIN_MESSAGE);
													break;
												case 14:
													JOptionPane.showMessageDialog(null,"After consuming " +drink+ " drinks over the period of "+timeNum+" hours, your BAC as an average male would be around 0.283 grams per milliliter of blood. \nIf you were awake at this point you'd have very little comprehension as to where you were or what you were doing. You might pass out suddenly and it'd be hard to wake you up. \nConsuming this amount of alcohol in a short period of time is dangerous to your health. It is currently a poor idea to drive. You will return to sobriety in more than 20 hours "+drugString+noWater,"Results",JOptionPane.PLAIN_MESSAGE);
													break;
												case 15:
													JOptionPane.showMessageDialog(null,"After consuming " +drink+ " drinks over the period of "+timeNum+" hours, your BAC as an average male would be around 0.305 grams per milliliter of blood. \nIt's possible that you might fall into a coma. You might die due to the paralysis of your diaphragm, the collapse of your lungs, or heart attack (any form of respiratory arrest).  \nConsuming this amount of alcohol in a short period of time is dangerous to your health. It is currently a poor idea to drive. You will return to sobriety in more than 20 hours "+drugString+noWater,"Results",JOptionPane.PLAIN_MESSAGE);
													break;
												case 16:
													JOptionPane.showMessageDialog(null,"After consuming " +drink+ " drinks over the period of "+timeNum+" hours, your BAC as an average male would be around 0.326 grams per milliliter of blood. \nIt's possible that you might fall into a coma. You might die due to the paralysis of your diaphragm, the collapse of your lungs, or heart attack (any form of respiratory arrest).  \nConsuming this amount of alcohol in a short period of time is dangerous to your health. It is currently a poor idea to drive. You will return to sobriety in more than 20 hours "+drugString+noWater,"Results",JOptionPane.PLAIN_MESSAGE);
													break;
												case 17:
													JOptionPane.showMessageDialog(null,"After consuming " +drink+ " drinks over the period of "+timeNum+" hours, your BAC as an average male would be around 0.348 grams per milliliter of blood. \nIt's possible that you might fall into a coma. You might die due to the paralysis of your diaphragm, the collapse of your lungs, or heart attack (any form of respiratory arrest).  \nConsuming this amount of alcohol in a short period of time is dangerous to your health. It is currently a poor idea to drive. You will return to sobriety in more than 20 hours "+drugString+noWater,"Results",JOptionPane.PLAIN_MESSAGE);
													break;
												default:
													JOptionPane.showMessageDialog(null,"After consuming " +drink+ " drinks over the period of "+timeNum+" hours, your BAC as an average male would be above 0.30 grams per milliliter of blood. \nIt's possible that you might fall into a coma. You might die due to the paralysis of your diaphragm, the collapse of your lungs, or heart attack (any form of respiratory arrest).  \nConsuming this amount of alcohol in a short period of time is dangerous to your health. It is currently a poor idea to drive. You will return to sobriety in more than 20 hours "+drugString+noWater,"Results",JOptionPane.PLAIN_MESSAGE);							
													break;
											} 
										} else { //yes food no water yes sleep no drug
											switch (drink) {
											case 1:
												JOptionPane.showMessageDialog(null,"After consuming " +drink+ " drinks over the period of "+timeNum+" hours, your BAC as an average male would be around 0.013 grams per milliliter of blood.\nYou are not really feeling the effects of alcohol and will return to sobriety shortly."+noWater,"Results",JOptionPane.PLAIN_MESSAGE);
												break;
											case 2:
												JOptionPane.showMessageDialog(null,"After consuming " +drink+ " drinks over the period of "+timeNum+" hours, your BAC as an average male would be around 0.034 grams per milliliter of blood.\nYou are feeling a little more relaxed while still maintaining your full coordination. \nYou will return to sobriety in a bit."+noWater,"Results",JOptionPane.PLAIN_MESSAGE);
												break;
											case 3:
												JOptionPane.showMessageDialog(null,"After consuming " +drink+ " drinks over the period of "+timeNum+" hours, your BAC as an average male would be around 0.047 grams per milliliter of blood.\nYou are feeling a bit more relaxed and might have a feeling of well being or euphoria. You will return to sobriety in about 3 hours."+noWater,"Results",JOptionPane.PLAIN_MESSAGE);
												break;
											case 4:
												JOptionPane.showMessageDialog(null,"After consuming " +drink+ " drinks over the period of "+timeNum+" hours, your BAC as an average male would be around 0.069 grams per milliliter of blood.\nYou are feeling a bit more relaxed and might have a feeling of well being or euphoria. It is currently a poor idea to drive. \n You will return to sobriety in about 5 hours."+noWater,"Results",JOptionPane.PLAIN_MESSAGE);
												break;
											case 5:
												JOptionPane.showMessageDialog(null,"After consuming " +drink+ " drinks over the period of "+timeNum+" hours, your BAC as an average male would be around 0.090 grams per milliliter of blood.\nYou can definately tell that you are under the influence and your speech, motor skills, balance and judgement are affected. It is currently a poor idea to drive. \n You will return to sobriety in about 7 hours."+noWater,"Results",JOptionPane.PLAIN_MESSAGE);
												break;
											case 6: 
												JOptionPane.showMessageDialog(null,"After consuming " +drink+ " drinks over the period of "+timeNum+" hours, your BAC as an average male would be around 0.112 grams per milliliter of blood.\nYour speech will be slurred and your balance, vision, reactions time and hearing will be impaired. Your motor coordination will also be significantly impaired and you'll have a loss of good judgment. \nIt is currently a poor idea to drive. You will return to sobriety in about 8 hours."+noWater,"Results",JOptionPane.PLAIN_MESSAGE);
												break;
											case 7: 
												JOptionPane.showMessageDialog(null,"After consuming " +drink+ " drinks over the period of "+timeNum+" hours, your BAC as an average male would be around 0.133 grams per milliliter of blood.\nRight now, you'd be feeling gross motor impairment and a lack of physical control. It'd probably be hard for you to type on the keyboard and your monitor or mobile phone screen would appear blurry. \nYour judgment and perception of what’s going on would be severely impaired and any feeling of euphoria you had earlier will have turned to dysphoria. \nIt is currently a poor idea to drive. You will return to sobriety in about 10 hours."+noWater,"Results",JOptionPane.PLAIN_MESSAGE);
												break;
											case 8: 
												JOptionPane.showMessageDialog(null,"After consuming " +drink+ " drinks over the period of "+timeNum+" hours, your BAC as an average male would be around 0.155 grams per milliliter of blood. \nYou'll probably start to feel sick to your stomach. Any euphoria you had earlier will have turned to dysphoria. Right now you might look like a 'sloppy drunk'. \nConsuming this amount of alcohol in a short period of time is dangerous to your health. It is currently a poor idea to drive. You will return to sobriety in about 11 hours."+noWater,"Results",JOptionPane.PLAIN_MESSAGE);
												break;
											case 9:
												JOptionPane.showMessageDialog(null,"After consuming " +drink+ " drinks over the period of "+timeNum+" hours, your BAC as an average male would be around 0.176 grams per milliliter of blood. \nYou'll probably start to feel sick to your stomach. Any euphoria you had earlier will have turned to dysphoria. Right now you might look like a 'sloppy drunk'. \nConsuming this amount of alcohol in a short period of time is dangerous to your health. It is currently a poor idea to drive. You will return to sobriety in about 13 hours."+noWater,"Results",JOptionPane.PLAIN_MESSAGE);
												break;
											case 10:
												JOptionPane.showMessageDialog(null,"After consuming " +drink+ " drinks over the period of "+timeNum+" hours, your BAC as an average male would be around 0.198 grams per milliliter of blood. \nYou'll probably need help if you want to walk properly. If you fall down you probably won't feel a lot of pain – even if you hurt yourself. At this level of BAC, some people begin to vomit. At the very least, you'll feel dazed, confused and disoriented. \nConsuming this amount of alcohol in a short period of time is dangerous to your health. It is currently a poor idea to drive. You will return to sobriety in about 14 hours."+noWater,"Results",JOptionPane.PLAIN_MESSAGE);
												break;
											case 11:
												JOptionPane.showMessageDialog(null,"After consuming " +drink+ " drinks over the period of "+timeNum+" hours, your BAC as an average male would be around 0.219 grams per milliliter of blood. \nIf you were awake at this point you'd have very little comprehension as to where you were or what you were doing. You might pass out suddenly and it'd be hard to wake you up. \nConsuming this amount of alcohol in a short period of time is dangerous to your health. It is currently a poor idea to drive. You will return to sobriety in about 16 hours."+noWater,"Results",JOptionPane.PLAIN_MESSAGE);
												break;
											case 12:
												JOptionPane.showMessageDialog(null,"After consuming " +drink+ " drinks over the period of "+timeNum+" hours, your BAC as an average male would be around 0.240 grams per milliliter of blood. \nIf you were awake at this point you'd have very little comprehension as to where you were or what you were doing. You might pass out suddenly and it'd be hard to wake you up. \nConsuming this amount of alcohol in a short period of time is dangerous to your health. It is currently a poor idea to drive. You will return to sobriety in about 17 hours."+noWater,"Results",JOptionPane.PLAIN_MESSAGE);
												break;
											case 13:
												JOptionPane.showMessageDialog(null,"After consuming " +drink+ " drinks over the period of "+timeNum+" hours, your BAC as an average male would be around 0.262 grams per milliliter of blood. \nIf you were awake at this point you'd have very little comprehension as to where you were or what you were doing. You might pass out suddenly and it'd be hard to wake you up. \nConsuming this amount of alcohol in a short period of time is dangerous to your health. It is currently a poor idea to drive."+noWater,"Results",JOptionPane.PLAIN_MESSAGE);
												break;
											case 14:
												JOptionPane.showMessageDialog(null,"After consuming " +drink+ " drinks over the period of "+timeNum+" hours, your BAC as an average male would be around 0.283 grams per milliliter of blood. \nIf you were awake at this point you'd have very little comprehension as to where you were or what you were doing. You might pass out suddenly and it'd be hard to wake you up. \nConsuming this amount of alcohol in a short period of time is dangerous to your health. It is currently a poor idea to drive. You will return to sobriety in more than 20 hours."+noWater,"Results",JOptionPane.PLAIN_MESSAGE);
												break;
											case 15:
												JOptionPane.showMessageDialog(null,"After consuming " +drink+ " drinks over the period of "+timeNum+" hours, your BAC as an average male would be around 0.305 grams per milliliter of blood. \nIt's possible that you might fall into a coma. You might die due to the paralysis of your diaphragm, the collapse of your lungs, or heart attack (any form of respiratory arrest).  \nConsuming this amount of alcohol in a short period of time is dangerous to your health. It is currently a poor idea to drive. You will return to sobriety in more than 20 hours."+noWater,"Results",JOptionPane.PLAIN_MESSAGE);
												break;
											case 16:
												JOptionPane.showMessageDialog(null,"After consuming " +drink+ " drinks over the period of "+timeNum+" hours, your BAC as an average male would be around 0.326 grams per milliliter of blood. \nIt's possible that you might fall into a coma. You might die due to the paralysis of your diaphragm, the collapse of your lungs, or heart attack (any form of respiratory arrest).  \nConsuming this amount of alcohol in a short period of time is dangerous to your health. It is currently a poor idea to drive. You will return to sobriety in more than 20 hours."+noWater,"Results",JOptionPane.PLAIN_MESSAGE);
												break;
											case 17:
												JOptionPane.showMessageDialog(null,"After consuming " +drink+ " drinks over the period of "+timeNum+" hours, your BAC as an average male would be around 0.348 grams per milliliter of blood. \nIt's possible that you might fall into a coma. You might die due to the paralysis of your diaphragm, the collapse of your lungs, or heart attack (any form of respiratory arrest).  \nConsuming this amount of alcohol in a short period of time is dangerous to your health. It is currently a poor idea to drive. You will return to sobriety in more than 20 hours."+noWater,"Results",JOptionPane.PLAIN_MESSAGE);
												break;
											default:
												JOptionPane.showMessageDialog(null,"After consuming " +drink+ " drinks over the period of "+timeNum+" hours, your BAC as an average male would be above 0.30 grams per milliliter of blood. \nIt's possible that you might fall into a coma. You might die due to the paralysis of your diaphragm, the collapse of your lungs, or heart attack (any form of respiratory arrest).  \nConsuming this amount of alcohol in a short period of time is dangerous to your health. It is currently a poor idea to drive. You will return to sobriety in more than 20 hours."+noWater,"Results",JOptionPane.PLAIN_MESSAGE);							
												break;
										}
										}
												
											} /*no sleep*/ else {
												if (drug == true) { //yes food no water no sleep yes drug
													switch (drink) {
													case 1:
														JOptionPane.showMessageDialog(null,"After consuming " +drink+ " drinks over the period of "+timeNum+" hours, your BAC as an average male would be around 0.013 grams per milliliter of blood.\nYou are not really feeling the effects of alcohol and will return to sobriety shortly."+noSleep + drugString+noWater,"Results",JOptionPane.PLAIN_MESSAGE);
														break;
													case 2:
														JOptionPane.showMessageDialog(null,"After consuming " +drink+ " drinks over the period of "+timeNum+" hours, your BAC as an average male would be around 0.034 grams per milliliter of blood.\nYou are feeling a little more relaxed while still maintaining your full coordination. \nYou will return to sobriety in a bit."+noSleep+ drugString+noWater,"Results",JOptionPane.PLAIN_MESSAGE);
														break;
													case 3:
														JOptionPane.showMessageDialog(null,"After consuming " +drink+ " drinks over the period of "+timeNum+" hours, your BAC as an average male would be around 0.047 grams per milliliter of blood.\nYou are feeling a bit more relaxed and might have a feeling of well being or euphoria. You will return to sobriety in about 3 hours."+noSleep+ drugString+noWater,"Results",JOptionPane.PLAIN_MESSAGE);
														break;
													case 4:
														JOptionPane.showMessageDialog(null,"After consuming " +drink+ " drinks over the period of "+timeNum+" hours, your BAC as an average male would be around 0.069 grams per milliliter of blood.\nYou are feeling a bit more relaxed and might have a feeling of well being or euphoria. It is currently a poor idea to drive. \n You will return to sobriety in about 5 hours."+noSleep+ drugString+noWater,"Results",JOptionPane.PLAIN_MESSAGE);
														break;
													case 5:
														JOptionPane.showMessageDialog(null,"After consuming " +drink+ " drinks over the period of "+timeNum+" hours, your BAC as an average male would be around 0.090 grams per milliliter of blood.\nYou can definately tell that you are under the influence and your speech, motor skills, balance and judgement are affected. It is currently a poor idea to drive. \n You will return to sobriety in about 7 hours."+noSleep+ drugString+noWater,"Results",JOptionPane.PLAIN_MESSAGE);
														break;
													case 6: 
														JOptionPane.showMessageDialog(null,"After consuming " +drink+ " drinks over the period of "+timeNum+" hours, your BAC as an average male would be around 0.112 grams per milliliter of blood.\nYour speech will be slurred and your balance, vision, reactions time and hearing will be impaired. Your motor coordination will also be significantly impaired and you'll have a loss of good judgment. \nIt is currently a poor idea to drive. You will return to sobriety in about 8 hours."+noSleep+ drugString+noWater,"Results",JOptionPane.PLAIN_MESSAGE);
														break;
													case 7: 
														JOptionPane.showMessageDialog(null,"After consuming " +drink+ " drinks over the period of "+timeNum+" hours, your BAC as an average male would be around 0.133 grams per milliliter of blood.\nRight now, you'd be feeling gross motor impairment and a lack of physical control. It'd probably be hard for you to type on the keyboard and your monitor or mobile phone screen would appear blurry. \nYour judgment and perception of what’s going on would be severely impaired and any feeling of euphoria you had earlier will have turned to dysphoria. \nIt is currently a poor idea to drive. You will return to sobriety in about 10 hours."+noSleep+ drugString+noWater,"Results",JOptionPane.PLAIN_MESSAGE);
														break;
													case 8: 
														JOptionPane.showMessageDialog(null,"After consuming " +drink+ " drinks over the period of "+timeNum+" hours, your BAC as an average male would be around 0.155 grams per milliliter of blood. \nYou'll probably start to feel sick to your stomach. Any euphoria you had earlier will have turned to dysphoria. Right now you might look like a 'sloppy drunk'. \nConsuming this amount of alcohol in a short period of time is dangerous to your health. It is currently a poor idea to drive. You will return to sobriety in about 11 hours."+noSleep+ drugString+noWater,"Results",JOptionPane.PLAIN_MESSAGE);
														break;
													case 9:
														JOptionPane.showMessageDialog(null,"After consuming " +drink+ " drinks over the period of "+timeNum+" hours, your BAC as an average male would be around 0.176 grams per milliliter of blood. \nYou'll probably start to feel sick to your stomach. Any euphoria you had earlier will have turned to dysphoria. Right now you might look like a 'sloppy drunk'. \nConsuming this amount of alcohol in a short period of time is dangerous to your health. It is currently a poor idea to drive. You will return to sobriety in about 13 hours."+noSleep+ drugString+noWater,"Results",JOptionPane.PLAIN_MESSAGE);
														break;
													case 10:
														JOptionPane.showMessageDialog(null,"After consuming " +drink+ " drinks over the period of "+timeNum+" hours, your BAC as an average male would be around 0.198 grams per milliliter of blood. \nYou'll probably need help if you want to walk properly. If you fall down you probably won't feel a lot of pain – even if you hurt yourself. At this level of BAC, some people begin to vomit. At the very least, you'll feel dazed, confused and disoriented. \nConsuming this amount of alcohol in a short period of time is dangerous to your health. It is currently a poor idea to drive. You will return to sobriety in about 14 hours."+noSleep+ drugString+noWater,"Results",JOptionPane.PLAIN_MESSAGE);
														break;
													case 11:
														JOptionPane.showMessageDialog(null,"After consuming " +drink+ " drinks over the period of "+timeNum+" hours, your BAC as an average male would be around 0.219 grams per milliliter of blood. \nIf you were awake at this point you'd have very little comprehension as to where you were or what you were doing. You might pass out suddenly and it'd be hard to wake you up. \nConsuming this amount of alcohol in a short period of time is dangerous to your health. It is currently a poor idea to drive. You will return to sobriety in about 16 hours."+noSleep+ drugString+noWater,"Results",JOptionPane.PLAIN_MESSAGE);
														break;
													case 12:
														JOptionPane.showMessageDialog(null,"After consuming " +drink+ " drinks over the period of "+timeNum+" hours, your BAC as an average male would be around 0.240 grams per milliliter of blood. \nIf you were awake at this point you'd have very little comprehension as to where you were or what you were doing. You might pass out suddenly and it'd be hard to wake you up. \nConsuming this amount of alcohol in a short period of time is dangerous to your health. It is currently a poor idea to drive. You will return to sobriety in about 17 hours."+noSleep+ drugString+noWater,"Results",JOptionPane.PLAIN_MESSAGE);
														break;
													case 13:
														JOptionPane.showMessageDialog(null,"After consuming " +drink+ " drinks over the period of "+timeNum+" hours, your BAC as an average male would be around 0.262 grams per milliliter of blood. \nIf you were awake at this point you'd have very little comprehension as to where you were or what you were doing. You might pass out suddenly and it'd be hard to wake you up. \nConsuming this amount of alcohol in a short period of time is dangerous to your health. It is currently a poor idea to drive."+noSleep+ drugString+noWater,"Results",JOptionPane.PLAIN_MESSAGE);
														break;
													case 14:
														JOptionPane.showMessageDialog(null,"After consuming " +drink+ " drinks over the period of "+timeNum+" hours, your BAC as an average male would be around 0.283 grams per milliliter of blood. \nIf you were awake at this point you'd have very little comprehension as to where you were or what you were doing. You might pass out suddenly and it'd be hard to wake you up. \nConsuming this amount of alcohol in a short period of time is dangerous to your health. It is currently a poor idea to drive. You will return to sobriety in more than 20 hours."+noSleep+ drugString+noWater,"Results",JOptionPane.PLAIN_MESSAGE);
														break;
													case 15:
														JOptionPane.showMessageDialog(null,"After consuming " +drink+ " drinks over the period of "+timeNum+" hours, your BAC as an average male would be around 0.305 grams per milliliter of blood. \nIt's possible that you might fall into a coma. You might die due to the paralysis of your diaphragm, the collapse of your lungs, or heart attack (any form of respiratory arrest).  \nConsuming this amount of alcohol in a short period of time is dangerous to your health. It is currently a poor idea to drive. You will return to sobriety in more than 20 hours."+noSleep+ drugString+noWater,"Results",JOptionPane.PLAIN_MESSAGE);
														break;
													case 16:
														JOptionPane.showMessageDialog(null,"After consuming " +drink+ " drinks over the period of "+timeNum+" hours, your BAC as an average male would be around 0.326 grams per milliliter of blood. \nIt's possible that you might fall into a coma. You might die due to the paralysis of your diaphragm, the collapse of your lungs, or heart attack (any form of respiratory arrest).  \nConsuming this amount of alcohol in a short period of time is dangerous to your health. It is currently a poor idea to drive. You will return to sobriety in more than 20 hours."+noSleep+ drugString+noWater,"Results",JOptionPane.PLAIN_MESSAGE);
														break;
													case 17:
														JOptionPane.showMessageDialog(null,"After consuming " +drink+ " drinks over the period of "+timeNum+" hours, your BAC as an average male would be around 0.348 grams per milliliter of blood. \nIt's possible that you might fall into a coma. You might die due to the paralysis of your diaphragm, the collapse of your lungs, or heart attack (any form of respiratory arrest).  \nConsuming this amount of alcohol in a short period of time is dangerous to your health. It is currently a poor idea to drive. You will return to sobriety in more than 20 hours."+noSleep+ drugString+noWater,"Results",JOptionPane.PLAIN_MESSAGE);
														break;
													default:
														JOptionPane.showMessageDialog(null,"After consuming " +drink+ " drinks over the period of "+timeNum+" hours, your BAC as an average male would be above 0.30 grams per milliliter of blood. \nIt's possible that you might fall into a coma. You might die due to the paralysis of your diaphragm, the collapse of your lungs, or heart attack (any form of respiratory arrest).  \nConsuming this amount of alcohol in a short period of time is dangerous to your health. It is currently a poor idea to drive. You will return to sobriety in more than 20 hours."+noSleep+ drugString+noWater,"Results",JOptionPane.PLAIN_MESSAGE);							
														break;
													}
												} else { //yes food no water no sleep no drug
												switch (drink) { 
												case 1:
													JOptionPane.showMessageDialog(null,"After consuming " +drink+ " drinks over the period of "+timeNum+" hours, your BAC as an average male would be around 0.013 grams per milliliter of blood.\nYou are not really feeling the effects of alcohol and will return to sobriety shortly."+noSleep+noWater,"Results",JOptionPane.PLAIN_MESSAGE);
													break;
												case 2:
													JOptionPane.showMessageDialog(null,"After consuming " +drink+ " drinks over the period of "+timeNum+" hours, your BAC as an average male would be around 0.034 grams per milliliter of blood.\nYou are feeling a little more relaxed while still maintaining your full coordination. \nYou will return to sobriety in a bit."+noSleep+noWater,"Results",JOptionPane.PLAIN_MESSAGE);
													break;
												case 3:
													JOptionPane.showMessageDialog(null,"After consuming " +drink+ " drinks over the period of "+timeNum+" hours, your BAC as an average male would be around 0.047 grams per milliliter of blood.\nYou are feeling a bit more relaxed and might have a feeling of well being or euphoria. You will return to sobriety in about 3 hours."+noSleep+noWater,"Results",JOptionPane.PLAIN_MESSAGE);
													break;
												case 4:
													JOptionPane.showMessageDialog(null,"After consuming " +drink+ " drinks over the period of "+timeNum+" hours, your BAC as an average male would be around 0.069 grams per milliliter of blood.\nYou are feeling a bit more relaxed and might have a feeling of well being or euphoria. It is currently a poor idea to drive. \n You will return to sobriety in about 5 hours."+noSleep+noWater,"Results",JOptionPane.PLAIN_MESSAGE);
													break;
												case 5:
													JOptionPane.showMessageDialog(null,"After consuming " +drink+ " drinks over the period of "+timeNum+" hours, your BAC as an average male would be around 0.090 grams per milliliter of blood.\nYou can definately tell that you are under the influence and your speech, motor skills, balance and judgement are affected. It is currently a poor idea to drive. \n You will return to sobriety in about 7 hours."+noSleep+noWater,"Results",JOptionPane.PLAIN_MESSAGE);
													break;
												case 6: 
													JOptionPane.showMessageDialog(null,"After consuming " +drink+ " drinks over the period of "+timeNum+" hours, your BAC as an average male would be around 0.112 grams per milliliter of blood.\nYour speech will be slurred and your balance, vision, reactions time and hearing will be impaired. Your motor coordination will also be significantly impaired and you'll have a loss of good judgment. \nIt is currently a poor idea to drive. You will return to sobriety in about 8 hours."+noSleep+noWater,"Results",JOptionPane.PLAIN_MESSAGE);
													break;
												case 7: 
													JOptionPane.showMessageDialog(null,"After consuming " +drink+ " drinks over the period of "+timeNum+" hours, your BAC as an average male would be around 0.133 grams per milliliter of blood.\nRight now, you'd be feeling gross motor impairment and a lack of physical control. It'd probably be hard for you to type on the keyboard and your monitor or mobile phone screen would appear blurry. \nYour judgment and perception of what’s going on would be severely impaired and any feeling of euphoria you had earlier will have turned to dysphoria. \nIt is currently a poor idea to drive. You will return to sobriety in about 10 hours."+noSleep+noWater,"Results",JOptionPane.PLAIN_MESSAGE);
													break;
												case 8: 
													JOptionPane.showMessageDialog(null,"After consuming " +drink+ " drinks over the period of "+timeNum+" hours, your BAC as an average male would be around 0.155 grams per milliliter of blood. \nYou'll probably start to feel sick to your stomach. Any euphoria you had earlier will have turned to dysphoria. Right now you might look like a 'sloppy drunk'. \nConsuming this amount of alcohol in a short period of time is dangerous to your health. It is currently a poor idea to drive. You will return to sobriety in about 11 hours."+noSleep+noWater,"Results",JOptionPane.PLAIN_MESSAGE);
													break;
												case 9:
													JOptionPane.showMessageDialog(null,"After consuming " +drink+ " drinks over the period of "+timeNum+" hours, your BAC as an average male would be around 0.176 grams per milliliter of blood. \nYou'll probably start to feel sick to your stomach. Any euphoria you had earlier will have turned to dysphoria. Right now you might look like a 'sloppy drunk'. \nConsuming this amount of alcohol in a short period of time is dangerous to your health. It is currently a poor idea to drive. You will return to sobriety in about 13 hours."+noSleep+noWater,"Results",JOptionPane.PLAIN_MESSAGE);
													break;
												case 10:
													JOptionPane.showMessageDialog(null,"After consuming " +drink+ " drinks over the period of "+timeNum+" hours, your BAC as an average male would be around 0.198 grams per milliliter of blood. \nYou'll probably need help if you want to walk properly. If you fall down you probably won't feel a lot of pain – even if you hurt yourself. At this level of BAC, some people begin to vomit. At the very least, you'll feel dazed, confused and disoriented. \nConsuming this amount of alcohol in a short period of time is dangerous to your health. It is currently a poor idea to drive. You will return to sobriety in about 14 hours."+noSleep+noWater,"Results",JOptionPane.PLAIN_MESSAGE);
													break;
												case 11:
													JOptionPane.showMessageDialog(null,"After consuming " +drink+ " drinks over the period of "+timeNum+" hours, your BAC as an average male would be around 0.219 grams per milliliter of blood. \nIf you were awake at this point you'd have very little comprehension as to where you were or what you were doing. You might pass out suddenly and it'd be hard to wake you up. \nConsuming this amount of alcohol in a short period of time is dangerous to your health. It is currently a poor idea to drive. You will return to sobriety in about 16 hours."+noSleep+noWater,"Results",JOptionPane.PLAIN_MESSAGE);
													break;
												case 12:
													JOptionPane.showMessageDialog(null,"After consuming " +drink+ " drinks over the period of "+timeNum+" hours, your BAC as an average male would be around 0.240 grams per milliliter of blood. \nIf you were awake at this point you'd have very little comprehension as to where you were or what you were doing. You might pass out suddenly and it'd be hard to wake you up. \nConsuming this amount of alcohol in a short period of time is dangerous to your health. It is currently a poor idea to drive. You will return to sobriety in about 17 hours."+noSleep+noWater,"Results",JOptionPane.PLAIN_MESSAGE);
													break;
												case 13:
													JOptionPane.showMessageDialog(null,"After consuming " +drink+ " drinks over the period of "+timeNum+" hours, your BAC as an average male would be around 0.262 grams per milliliter of blood. \nIf you were awake at this point you'd have very little comprehension as to where you were or what you were doing. You might pass out suddenly and it'd be hard to wake you up. \nConsuming this amount of alcohol in a short period of time is dangerous to your health. It is currently a poor idea to drive."+noSleep+noWater,"Results",JOptionPane.PLAIN_MESSAGE);
													break;
												case 14:
													JOptionPane.showMessageDialog(null,"After consuming " +drink+ " drinks over the period of "+timeNum+" hours, your BAC as an average male would be around 0.283 grams per milliliter of blood. \nIf you were awake at this point you'd have very little comprehension as to where you were or what you were doing. You might pass out suddenly and it'd be hard to wake you up. \nConsuming this amount of alcohol in a short period of time is dangerous to your health. It is currently a poor idea to drive. You will return to sobriety in more than 20 hours."+noSleep+noWater,"Results",JOptionPane.PLAIN_MESSAGE);
													break;
												case 15:
													JOptionPane.showMessageDialog(null,"After consuming " +drink+ " drinks over the period of "+timeNum+" hours, your BAC as an average male would be around 0.305 grams per milliliter of blood. \nIt's possible that you might fall into a coma. You might die due to the paralysis of your diaphragm, the collapse of your lungs, or heart attack (any form of respiratory arrest).  \nConsuming this amount of alcohol in a short period of time is dangerous to your health. It is currently a poor idea to drive. You will return to sobriety in more than 20 hours."+noSleep+noWater,"Results",JOptionPane.PLAIN_MESSAGE);
													break;
												case 16:
													JOptionPane.showMessageDialog(null,"After consuming " +drink+ " drinks over the period of "+timeNum+" hours, your BAC as an average male would be around 0.326 grams per milliliter of blood. \nIt's possible that you might fall into a coma. You might die due to the paralysis of your diaphragm, the collapse of your lungs, or heart attack (any form of respiratory arrest).  \nConsuming this amount of alcohol in a short period of time is dangerous to your health. It is currently a poor idea to drive. You will return to sobriety in more than 20 hours."+noSleep+noWater,"Results",JOptionPane.PLAIN_MESSAGE);
													break;
												case 17:
													JOptionPane.showMessageDialog(null,"After consuming " +drink+ " drinks over the period of "+timeNum+" hours, your BAC as an average male would be around 0.348 grams per milliliter of blood. \nIt's possible that you might fall into a coma. You might die due to the paralysis of your diaphragm, the collapse of your lungs, or heart attack (any form of respiratory arrest).  \nConsuming this amount of alcohol in a short period of time is dangerous to your health. It is currently a poor idea to drive. You will return to sobriety in more than 20 hours."+noSleep+noWater,"Results",JOptionPane.PLAIN_MESSAGE);
													break;
												default:
													JOptionPane.showMessageDialog(null,"After consuming " +drink+ " drinks over the period of "+timeNum+" hours, your BAC as an average male would be above 0.30 grams per milliliter of blood. \nIt's possible that you might fall into a coma. You might die due to the paralysis of your diaphragm, the collapse of your lungs, or heart attack (any form of respiratory arrest).  \nConsuming this amount of alcohol in a short period of time is dangerous to your health. It is currently a poor idea to drive. You will return to sobriety in more than 20 hours."+noSleep+noWater,"Results",JOptionPane.PLAIN_MESSAGE);							
													break;
											}
											} 
										}
								}	 
							} /*no food yes water yes sleep yes drug*/ else {					
								if (water == true) { //drank water
									if (sleep == true) { //slept well
										if (drug == true) { //on medication
											switch (drink) {//no food yes water yes sleep yes drug
												case 1: 
													JOptionPane.showMessageDialog(null,"After consuming " +drink+ " drinks over the period of "+timeNum+" hours, your BAC as an average male would be around 0.013 grams per milliliter of blood.\nYou are not really feeling the effects of alcohol and will return to sobriety shortly."+drugString+noFood,"Results",JOptionPane.PLAIN_MESSAGE);
													break;
												case 2:
													JOptionPane.showMessageDialog(null,"After consuming " +drink+ " drinks over the period of "+timeNum+" hours, your BAC as an average male would be around 0.034 grams per milliliter of blood.\nYou are feeling a little more relaxed while still maintaining your full coordination. \nYou will return to sobriety in a bit "+drugString+noFood,"Results",JOptionPane.PLAIN_MESSAGE);
													break;
												case 3:
													JOptionPane.showMessageDialog(null,"After consuming " +drink+ " drinks over the period of "+timeNum+" hours, your BAC as an average male would be around 0.047 grams per milliliter of blood.\nYou are feeling a bit more relaxed and might have a feeling of well being or euphoria. You will return to sobriety in about 3 hours. "+drugString+noFood,"Results",JOptionPane.PLAIN_MESSAGE);
													break;
												case 4:
													JOptionPane.showMessageDialog(null,"After consuming " +drink+ " drinks over the period of "+timeNum+" hours, your BAC as an average male would be around 0.069 grams per milliliter of blood.\nYou are feeling a bit more relaxed and might have a feeling of well being or euphoria. It is currently a poor idea to drive. \n You will return to sobriety in about 5 hours "+drugString+noFood,"Results",JOptionPane.PLAIN_MESSAGE);
													break;
												case 5:
													JOptionPane.showMessageDialog(null,"After consuming " +drink+ " drinks over the period of "+timeNum+" hours, your BAC as an average male would be around 0.090 grams per milliliter of blood.\nYou can definately tell that you are under the influence and your speech, motor skills, balance and judgement are affected. It is currently a poor idea to drive. \n You will return to sobriety in about 7 hours "+drugString+noFood,"Results",JOptionPane.PLAIN_MESSAGE);
													break;
												case 6: 
													JOptionPane.showMessageDialog(null,"After consuming " +drink+ " drinks over the period of "+timeNum+" hours, your BAC as an average male would be around 0.112 grams per milliliter of blood.\nYour speech will be slurred and your balance, vision, reactions time and hearing will be impaired. Your motor coordination will also be significantly impaired and you'll have a loss of good judgment. \nIt is currently a poor idea to drive. You will return to sobriety in about 8 hours "+drugString+noFood,"Results",JOptionPane.PLAIN_MESSAGE);
													break;
												case 7: 
													JOptionPane.showMessageDialog(null,"After consuming " +drink+ " drinks over the period of "+timeNum+" hours, your BAC as an average male would be around 0.133 grams per milliliter of blood.\nRight now, you'd be feeling gross motor impairment and a lack of physical control. It'd probably be hard for you to type on the keyboard and your monitor or mobile phone screen would appear blurry. \nYour judgment and perception of what’s going on would be severely impaired and any feeling of euphoria you had earlier will have turned to dysphoria. \nIt is currently a poor idea to drive. You will return to sobriety in about 10 hours "+drugString+noFood,"Results",JOptionPane.PLAIN_MESSAGE);
													break;
												case 8: 
													JOptionPane.showMessageDialog(null,"After consuming " +drink+ " drinks over the period of "+timeNum+" hours, your BAC as an average male would be around 0.155 grams per milliliter of blood. \nYou'll probably start to feel sick to your stomach. Any euphoria you had earlier will have turned to dysphoria. Right now you might look like a 'sloppy drunk'. \nConsuming this amount of alcohol in a short period of time is dangerous to your health. It is currently a poor idea to drive. You will return to sobriety in about 11 hours "+drugString+noFood,"Results",JOptionPane.PLAIN_MESSAGE);
													break;
												case 9:
													JOptionPane.showMessageDialog(null,"After consuming " +drink+ " drinks over the period of "+timeNum+" hours, your BAC as an average male would be around 0.176 grams per milliliter of blood. \nYou'll probably start to feel sick to your stomach. Any euphoria you had earlier will have turned to dysphoria. Right now you might look like a 'sloppy drunk'. \nConsuming this amount of alcohol in a short period of time is dangerous to your health. It is currently a poor idea to drive. You will return to sobriety in about 13 hours "+drugString+noFood,"Results",JOptionPane.PLAIN_MESSAGE);
													break;
												case 10:
													JOptionPane.showMessageDialog(null,"After consuming " +drink+ " drinks over the period of "+timeNum+" hours, your BAC as an average male would be around 0.198 grams per milliliter of blood. \nYou'll probably need help if you want to walk properly. If you fall down you probably won't feel a lot of pain – even if you hurt yourself. At this level of BAC, some people begin to vomit. At the very least, you'll feel dazed, confused and disoriented. \nConsuming this amount of alcohol in a short period of time is dangerous to your health. It is currently a poor idea to drive. You will return to sobriety in about 14 hours "+drugString+noFood,"Results",JOptionPane.PLAIN_MESSAGE);
													break;
												case 11:
													JOptionPane.showMessageDialog(null,"After consuming " +drink+ " drinks over the period of "+timeNum+" hours, your BAC as an average male would be around 0.219 grams per milliliter of blood. \nIf you were awake at this point you'd have very little comprehension as to where you were or what you were doing. You might pass out suddenly and it'd be hard to wake you up. \nConsuming this amount of alcohol in a short period of time is dangerous to your health. It is currently a poor idea to drive. You will return to sobriety in about 16 hours "+drugString+noFood,"Results",JOptionPane.PLAIN_MESSAGE);
													break;
												case 12:
													JOptionPane.showMessageDialog(null,"After consuming " +drink+ " drinks over the period of "+timeNum+" hours, your BAC as an average male would be around 0.240 grams per milliliter of blood. \nIf you were awake at this point you'd have very little comprehension as to where you were or what you were doing. You might pass out suddenly and it'd be hard to wake you up. \nConsuming this amount of alcohol in a short period of time is dangerous to your health. It is currently a poor idea to drive. You will return to sobriety in about 17 hours "+drugString+noFood,"Results",JOptionPane.PLAIN_MESSAGE);
													break;
												case 13:
													JOptionPane.showMessageDialog(null,"After consuming " +drink+ " drinks over the period of "+timeNum+" hours, your BAC as an average male would be around 0.262 grams per milliliter of blood. \nIf you were awake at this point you'd have very little comprehension as to where you were or what you were doing. You might pass out suddenly and it'd be hard to wake you up. \nConsuming this amount of alcohol in a short period of time is dangerous to your health. It is currently a poor idea to drive. You will return to sobriety in about 19 hours "+drugString+noFood,"Results",JOptionPane.PLAIN_MESSAGE);
													break;
												case 14:
													JOptionPane.showMessageDialog(null,"After consuming " +drink+ " drinks over the period of "+timeNum+" hours, your BAC as an average male would be around 0.283 grams per milliliter of blood. \nIf you were awake at this point you'd have very little comprehension as to where you were or what you were doing. You might pass out suddenly and it'd be hard to wake you up. \nConsuming this amount of alcohol in a short period of time is dangerous to your health. It is currently a poor idea to drive. You will return to sobriety in more than 20 hours "+drugString+noFood,"Results",JOptionPane.PLAIN_MESSAGE);
													break;
												case 15:
													JOptionPane.showMessageDialog(null,"After consuming " +drink+ " drinks over the period of "+timeNum+" hours, your BAC as an average male would be around 0.305 grams per milliliter of blood. \nIt's possible that you might fall into a coma. You might die due to the paralysis of your diaphragm, the collapse of your lungs, or heart attack (any form of respiratory arrest).  \nConsuming this amount of alcohol in a short period of time is dangerous to your health. It is currently a poor idea to drive. You will return to sobriety in more than 20 hours "+drugString+noFood,"Results",JOptionPane.PLAIN_MESSAGE);
													break;
												case 16:
													JOptionPane.showMessageDialog(null,"After consuming " +drink+ " drinks over the period of "+timeNum+" hours, your BAC as an average male would be around 0.326 grams per milliliter of blood. \nIt's possible that you might fall into a coma. You might die due to the paralysis of your diaphragm, the collapse of your lungs, or heart attack (any form of respiratory arrest).  \nConsuming this amount of alcohol in a short period of time is dangerous to your health. It is currently a poor idea to drive. You will return to sobriety in more than 20 hours "+drugString+noFood,"Results",JOptionPane.PLAIN_MESSAGE);
													break;
												case 17:
													JOptionPane.showMessageDialog(null,"After consuming " +drink+ " drinks over the period of "+timeNum+" hours, your BAC as an average male would be around 0.348 grams per milliliter of blood. \nIt's possible that you might fall into a coma. You might die due to the paralysis of your diaphragm, the collapse of your lungs, or heart attack (any form of respiratory arrest).  \nConsuming this amount of alcohol in a short period of time is dangerous to your health. It is currently a poor idea to drive. You will return to sobriety in more than 20 hours "+drugString+noFood,"Results",JOptionPane.PLAIN_MESSAGE);
													break;
												default:
													JOptionPane.showMessageDialog(null,"After consuming " +drink+ " drinks over the period of "+timeNum+" hours, your BAC as an average male would be above 0.30 grams per milliliter of blood. \nIt's possible that you might fall into a coma. You might die due to the paralysis of your diaphragm, the collapse of your lungs, or heart attack (any form of respiratory arrest).  \nConsuming this amount of alcohol in a short period of time is dangerous to your health. It is currently a poor idea to drive. You will return to sobriety in more than 20 hours "+drugString+noFood,"Results",JOptionPane.PLAIN_MESSAGE);							
													break;
											} 
										} else { //no food yes water yes sleep no drug
											switch (drink) {
											case 1:
												JOptionPane.showMessageDialog(null,"After consuming " +drink+ " drinks over the period of "+timeNum+" hours, your BAC as an average male would be around 0.013 grams per milliliter of blood.\nYou are not really feeling the effects of alcohol and will return to sobriety shortly."+noFood,"Results",JOptionPane.PLAIN_MESSAGE);
												break;
											case 2:
												JOptionPane.showMessageDialog(null,"After consuming " +drink+ " drinks over the period of "+timeNum+" hours, your BAC as an average male would be around 0.034 grams per milliliter of blood.\nYou are feeling a little more relaxed while still maintaining your full coordination. \nYou will return to sobriety in a bit."+noFood,"Results",JOptionPane.PLAIN_MESSAGE);
												break;
											case 3:
												JOptionPane.showMessageDialog(null,"After consuming " +drink+ " drinks over the period of "+timeNum+" hours, your BAC as an average male would be around 0.047 grams per milliliter of blood.\nYou are feeling a bit more relaxed and might have a feeling of well being or euphoria. You will return to sobriety in about 3 hours.","Results",JOptionPane.PLAIN_MESSAGE);
												break;
											case 4:
												JOptionPane.showMessageDialog(null,"After consuming " +drink+ " drinks over the period of "+timeNum+" hours, your BAC as an average male would be around 0.069 grams per milliliter of blood.\nYou are feeling a bit more relaxed and might have a feeling of well being or euphoria. It is currently a poor idea to drive. \n You will return to sobriety in about 5 hours."+noFood,"Results",JOptionPane.PLAIN_MESSAGE);
												break;
											case 5:
												JOptionPane.showMessageDialog(null,"After consuming " +drink+ " drinks over the period of "+timeNum+" hours, your BAC as an average male would be around 0.090 grams per milliliter of blood.\nYou can definately tell that you are under the influence and your speech, motor skills, balance and judgement are affected. It is currently a poor idea to drive. \n You will return to sobriety in about 7 hours."+noFood,"Results",JOptionPane.PLAIN_MESSAGE);
												break;
											case 6: 
												JOptionPane.showMessageDialog(null,"After consuming " +drink+ " drinks over the period of "+timeNum+" hours, your BAC as an average male would be around 0.112 grams per milliliter of blood.\nYour speech will be slurred and your balance, vision, reactions time and hearing will be impaired. Your motor coordination will also be significantly impaired and you'll have a loss of good judgment. \nIt is currently a poor idea to drive. You will return to sobriety in about 8 hours."+noFood,"Results",JOptionPane.PLAIN_MESSAGE);
												break;
											case 7: 
												JOptionPane.showMessageDialog(null,"After consuming " +drink+ " drinks over the period of "+timeNum+" hours, your BAC as an average male would be around 0.133 grams per milliliter of blood.\nRight now, you'd be feeling gross motor impairment and a lack of physical control. It'd probably be hard for you to type on the keyboard and your monitor or mobile phone screen would appear blurry. \nYour judgment and perception of what’s going on would be severely impaired and any feeling of euphoria you had earlier will have turned to dysphoria. \nIt is currently a poor idea to drive. You will return to sobriety in about 10 hours."+noFood,"Results",JOptionPane.PLAIN_MESSAGE);
												break;
											case 8: 
												JOptionPane.showMessageDialog(null,"After consuming " +drink+ " drinks over the period of "+timeNum+" hours, your BAC as an average male would be around 0.155 grams per milliliter of blood. \nYou'll probably start to feel sick to your stomach. Any euphoria you had earlier will have turned to dysphoria. Right now you might look like a 'sloppy drunk'. \nConsuming this amount of alcohol in a short period of time is dangerous to your health. It is currently a poor idea to drive. You will return to sobriety in about 11 hours."+noFood,"Results",JOptionPane.PLAIN_MESSAGE);
												break;
											case 9:
												JOptionPane.showMessageDialog(null,"After consuming " +drink+ " drinks over the period of "+timeNum+" hours, your BAC as an average male would be around 0.176 grams per milliliter of blood. \nYou'll probably start to feel sick to your stomach. Any euphoria you had earlier will have turned to dysphoria. Right now you might look like a 'sloppy drunk'. \nConsuming this amount of alcohol in a short period of time is dangerous to your health. It is currently a poor idea to drive. You will return to sobriety in about 13 hours."+noFood,"Results",JOptionPane.PLAIN_MESSAGE);
												break;
											case 10:
												JOptionPane.showMessageDialog(null,"After consuming " +drink+ " drinks over the period of "+timeNum+" hours, your BAC as an average male would be around 0.198 grams per milliliter of blood. \nYou'll probably need help if you want to walk properly. If you fall down you probably won't feel a lot of pain – even if you hurt yourself. At this level of BAC, some people begin to vomit. At the very least, you'll feel dazed, confused and disoriented. \nConsuming this amount of alcohol in a short period of time is dangerous to your health. It is currently a poor idea to drive. You will return to sobriety in about 14 hours."+noFood,"Results",JOptionPane.PLAIN_MESSAGE);
												break;
											case 11:
												JOptionPane.showMessageDialog(null,"After consuming " +drink+ " drinks over the period of "+timeNum+" hours, your BAC as an average male would be around 0.219 grams per milliliter of blood. \nIf you were awake at this point you'd have very little comprehension as to where you were or what you were doing. You might pass out suddenly and it'd be hard to wake you up. \nConsuming this amount of alcohol in a short period of time is dangerous to your health. It is currently a poor idea to drive. You will return to sobriety in about 16 hours."+noFood,"Results",JOptionPane.PLAIN_MESSAGE);
												break;
											case 12:
												JOptionPane.showMessageDialog(null,"After consuming " +drink+ " drinks over the period of "+timeNum+" hours, your BAC as an average male would be around 0.240 grams per milliliter of blood. \nIf you were awake at this point you'd have very little comprehension as to where you were or what you were doing. You might pass out suddenly and it'd be hard to wake you up. \nConsuming this amount of alcohol in a short period of time is dangerous to your health. It is currently a poor idea to drive. You will return to sobriety in about 17 hours."+noFood,"Results",JOptionPane.PLAIN_MESSAGE);
												break;
											case 13:
												JOptionPane.showMessageDialog(null,"After consuming " +drink+ " drinks over the period of "+timeNum+" hours, your BAC as an average male would be around 0.262 grams per milliliter of blood. \nIf you were awake at this point you'd have very little comprehension as to where you were or what you were doing. You might pass out suddenly and it'd be hard to wake you up. \nConsuming this amount of alcohol in a short period of time is dangerous to your health. It is currently a poor idea to drive."+noFood,"Results",JOptionPane.PLAIN_MESSAGE);
												break;
											case 14:
												JOptionPane.showMessageDialog(null,"After consuming " +drink+ " drinks over the period of "+timeNum+" hours, your BAC as an average male would be around 0.283 grams per milliliter of blood. \nIf you were awake at this point you'd have very little comprehension as to where you were or what you were doing. You might pass out suddenly and it'd be hard to wake you up. \nConsuming this amount of alcohol in a short period of time is dangerous to your health. It is currently a poor idea to drive. You will return to sobriety in more than 20 hours."+noFood,"Results",JOptionPane.PLAIN_MESSAGE);
												break;
											case 15:
												JOptionPane.showMessageDialog(null,"After consuming " +drink+ " drinks over the period of "+timeNum+" hours, your BAC as an average male would be around 0.305 grams per milliliter of blood. \nIt's possible that you might fall into a coma. You might die due to the paralysis of your diaphragm, the collapse of your lungs, or heart attack (any form of respiratory arrest).  \nConsuming this amount of alcohol in a short period of time is dangerous to your health. It is currently a poor idea to drive. You will return to sobriety in more than 20 hours."+noFood,"Results",JOptionPane.PLAIN_MESSAGE);
												break;
											case 16:
												JOptionPane.showMessageDialog(null,"After consuming " +drink+ " drinks over the period of "+timeNum+" hours, your BAC as an average male would be around 0.326 grams per milliliter of blood. \nIt's possible that you might fall into a coma. You might die due to the paralysis of your diaphragm, the collapse of your lungs, or heart attack (any form of respiratory arrest).  \nConsuming this amount of alcohol in a short period of time is dangerous to your health. It is currently a poor idea to drive. You will return to sobriety in more than 20 hours."+noFood,"Results",JOptionPane.PLAIN_MESSAGE);
												break;
											case 17:
												JOptionPane.showMessageDialog(null,"After consuming " +drink+ " drinks over the period of "+timeNum+" hours, your BAC as an average male would be around 0.348 grams per milliliter of blood. \nIt's possible that you might fall into a coma. You might die due to the paralysis of your diaphragm, the collapse of your lungs, or heart attack (any form of respiratory arrest).  \nConsuming this amount of alcohol in a short period of time is dangerous to your health. It is currently a poor idea to drive. You will return to sobriety in more than 20 hours."+noFood,"Results",JOptionPane.PLAIN_MESSAGE);
												break;
											default:
												JOptionPane.showMessageDialog(null,"After consuming " +drink+ " drinks over the period of "+timeNum+" hours, your BAC as an average male would be above 0.30 grams per milliliter of blood. \nIt's possible that you might fall into a coma. You might die due to the paralysis of your diaphragm, the collapse of your lungs, or heart attack (any form of respiratory arrest).  \nConsuming this amount of alcohol in a short period of time is dangerous to your health. It is currently a poor idea to drive. You will return to sobriety in more than 20 hours."+noFood,"Results",JOptionPane.PLAIN_MESSAGE);							
												break;
										}
										}
												
											} /*no sleep*/ else {
												if (drug == true) { //no food yes water no sleep yes drug
													switch (drink) {
													case 1:
														JOptionPane.showMessageDialog(null,"After consuming " +drink+ " drinks over the period of "+timeNum+" hours, your BAC as an average male would be around 0.013 grams per milliliter of blood.\nYou are not really feeling the effects of alcohol and will return to sobriety shortly."+noSleep + drugString+noFood,"Results",JOptionPane.PLAIN_MESSAGE);
														break;
													case 2:
														JOptionPane.showMessageDialog(null,"After consuming " +drink+ " drinks over the period of "+timeNum+" hours, your BAC as an average male would be around 0.034 grams per milliliter of blood.\nYou are feeling a little more relaxed while still maintaining your full coordination. \nYou will return to sobriety in a bit."+noSleep+ drugString+noFood,"Results",JOptionPane.PLAIN_MESSAGE);
														break;
													case 3:
														JOptionPane.showMessageDialog(null,"After consuming " +drink+ " drinks over the period of "+timeNum+" hours, your BAC as an average male would be around 0.047 grams per milliliter of blood.\nYou are feeling a bit more relaxed and might have a feeling of well being or euphoria. You will return to sobriety in about 3 hours."+noSleep+ drugString+noFood,"Results",JOptionPane.PLAIN_MESSAGE);
														break;
													case 4:
														JOptionPane.showMessageDialog(null,"After consuming " +drink+ " drinks over the period of "+timeNum+" hours, your BAC as an average male would be around 0.069 grams per milliliter of blood.\nYou are feeling a bit more relaxed and might have a feeling of well being or euphoria. It is currently a poor idea to drive. \n You will return to sobriety in about 5 hours."+noSleep+ drugString+noFood,"Results",JOptionPane.PLAIN_MESSAGE);
														break;
													case 5:
														JOptionPane.showMessageDialog(null,"After consuming " +drink+ " drinks over the period of "+timeNum+" hours, your BAC as an average male would be around 0.090 grams per milliliter of blood.\nYou can definately tell that you are under the influence and your speech, motor skills, balance and judgement are affected. It is currently a poor idea to drive. \n You will return to sobriety in about 7 hours."+noSleep+ drugString+noFood,"Results",JOptionPane.PLAIN_MESSAGE);
														break;
													case 6: 
														JOptionPane.showMessageDialog(null,"After consuming " +drink+ " drinks over the period of "+timeNum+" hours, your BAC as an average male would be around 0.112 grams per milliliter of blood.\nYour speech will be slurred and your balance, vision, reactions time and hearing will be impaired. Your motor coordination will also be significantly impaired and you'll have a loss of good judgment. \nIt is currently a poor idea to drive. You will return to sobriety in about 8 hours."+noSleep+ drugString+noFood,"Results",JOptionPane.PLAIN_MESSAGE);
														break;
													case 7: 
														JOptionPane.showMessageDialog(null,"After consuming " +drink+ " drinks over the period of "+timeNum+" hours, your BAC as an average male would be around 0.133 grams per milliliter of blood.\nRight now, you'd be feeling gross motor impairment and a lack of physical control. It'd probably be hard for you to type on the keyboard and your monitor or mobile phone screen would appear blurry. \nYour judgment and perception of what’s going on would be severely impaired and any feeling of euphoria you had earlier will have turned to dysphoria. \nIt is currently a poor idea to drive. You will return to sobriety in about 10 hours."+noSleep+ drugString+noFood,"Results",JOptionPane.PLAIN_MESSAGE);
														break;
													case 8: 
														JOptionPane.showMessageDialog(null,"After consuming " +drink+ " drinks over the period of "+timeNum+" hours, your BAC as an average male would be around 0.155 grams per milliliter of blood. \nYou'll probably start to feel sick to your stomach. Any euphoria you had earlier will have turned to dysphoria. Right now you might look like a 'sloppy drunk'. \nConsuming this amount of alcohol in a short period of time is dangerous to your health. It is currently a poor idea to drive. You will return to sobriety in about 11 hours."+noSleep+ drugString+noFood,"Results",JOptionPane.PLAIN_MESSAGE);
														break;
													case 9:
														JOptionPane.showMessageDialog(null,"After consuming " +drink+ " drinks over the period of "+timeNum+" hours, your BAC as an average male would be around 0.176 grams per milliliter of blood. \nYou'll probably start to feel sick to your stomach. Any euphoria you had earlier will have turned to dysphoria. Right now you might look like a 'sloppy drunk'. \nConsuming this amount of alcohol in a short period of time is dangerous to your health. It is currently a poor idea to drive. You will return to sobriety in about 13 hours."+noSleep+ drugString+noFood,"Results",JOptionPane.PLAIN_MESSAGE);
														break;
													case 10:
														JOptionPane.showMessageDialog(null,"After consuming " +drink+ " drinks over the period of "+timeNum+" hours, your BAC as an average male would be around 0.198 grams per milliliter of blood. \nYou'll probably need help if you want to walk properly. If you fall down you probably won't feel a lot of pain – even if you hurt yourself. At this level of BAC, some people begin to vomit. At the very least, you'll feel dazed, confused and disoriented. \nConsuming this amount of alcohol in a short period of time is dangerous to your health. It is currently a poor idea to drive. You will return to sobriety in about 14 hours."+noSleep+ drugString+noFood,"Results",JOptionPane.PLAIN_MESSAGE);
														break;
													case 11:
														JOptionPane.showMessageDialog(null,"After consuming " +drink+ " drinks over the period of "+timeNum+" hours, your BAC as an average male would be around 0.219 grams per milliliter of blood. \nIf you were awake at this point you'd have very little comprehension as to where you were or what you were doing. You might pass out suddenly and it'd be hard to wake you up. \nConsuming this amount of alcohol in a short period of time is dangerous to your health. It is currently a poor idea to drive. You will return to sobriety in about 16 hours."+noSleep+ drugString+noFood,"Results",JOptionPane.PLAIN_MESSAGE);
														break;
													case 12:
														JOptionPane.showMessageDialog(null,"After consuming " +drink+ " drinks over the period of "+timeNum+" hours, your BAC as an average male would be around 0.240 grams per milliliter of blood. \nIf you were awake at this point you'd have very little comprehension as to where you were or what you were doing. You might pass out suddenly and it'd be hard to wake you up. \nConsuming this amount of alcohol in a short period of time is dangerous to your health. It is currently a poor idea to drive. You will return to sobriety in about 17 hours."+noSleep+ drugString+noFood,"Results",JOptionPane.PLAIN_MESSAGE);
														break;
													case 13:
														JOptionPane.showMessageDialog(null,"After consuming " +drink+ " drinks over the period of "+timeNum+" hours, your BAC as an average male would be around 0.262 grams per milliliter of blood. \nIf you were awake at this point you'd have very little comprehension as to where you were or what you were doing. You might pass out suddenly and it'd be hard to wake you up. \nConsuming this amount of alcohol in a short period of time is dangerous to your health. It is currently a poor idea to drive."+noSleep+ drugString+noFood,"Results",JOptionPane.PLAIN_MESSAGE);
														break;
													case 14:
														JOptionPane.showMessageDialog(null,"After consuming " +drink+ " drinks over the period of "+timeNum+" hours, your BAC as an average male would be around 0.283 grams per milliliter of blood. \nIf you were awake at this point you'd have very little comprehension as to where you were or what you were doing. You might pass out suddenly and it'd be hard to wake you up. \nConsuming this amount of alcohol in a short period of time is dangerous to your health. It is currently a poor idea to drive. You will return to sobriety in more than 20 hours."+noSleep+ drugString+noFood,"Results",JOptionPane.PLAIN_MESSAGE);
														break;
													case 15:
														JOptionPane.showMessageDialog(null,"After consuming " +drink+ " drinks over the period of "+timeNum+" hours, your BAC as an average male would be around 0.305 grams per milliliter of blood. \nIt's possible that you might fall into a coma. You might die due to the paralysis of your diaphragm, the collapse of your lungs, or heart attack (any form of respiratory arrest).  \nConsuming this amount of alcohol in a short period of time is dangerous to your health. It is currently a poor idea to drive. You will return to sobriety in more than 20 hours."+noSleep+ drugString+noFood,"Results",JOptionPane.PLAIN_MESSAGE);
														break;
													case 16:
														JOptionPane.showMessageDialog(null,"After consuming " +drink+ " drinks over the period of "+timeNum+" hours, your BAC as an average male would be around 0.326 grams per milliliter of blood. \nIt's possible that you might fall into a coma. You might die due to the paralysis of your diaphragm, the collapse of your lungs, or heart attack (any form of respiratory arrest).  \nConsuming this amount of alcohol in a short period of time is dangerous to your health. It is currently a poor idea to drive. You will return to sobriety in more than 20 hours."+noSleep+ drugString+noFood,"Results",JOptionPane.PLAIN_MESSAGE);
														break;
													case 17:
														JOptionPane.showMessageDialog(null,"After consuming " +drink+ " drinks over the period of "+timeNum+" hours, your BAC as an average male would be around 0.348 grams per milliliter of blood. \nIt's possible that you might fall into a coma. You might die due to the paralysis of your diaphragm, the collapse of your lungs, or heart attack (any form of respiratory arrest).  \nConsuming this amount of alcohol in a short period of time is dangerous to your health. It is currently a poor idea to drive. You will return to sobriety in more than 20 hours."+noSleep+ drugString+noFood,"Results",JOptionPane.PLAIN_MESSAGE);
														break;
													default:
														JOptionPane.showMessageDialog(null,"After consuming " +drink+ " drinks over the period of "+timeNum+" hours, your BAC as an average male would be above 0.30 grams per milliliter of blood. \nIt's possible that you might fall into a coma. You might die due to the paralysis of your diaphragm, the collapse of your lungs, or heart attack (any form of respiratory arrest).  \nConsuming this amount of alcohol in a short period of time is dangerous to your health. It is currently a poor idea to drive. You will return to sobriety in more than 20 hours."+noSleep+ drugString+noFood,"Results",JOptionPane.PLAIN_MESSAGE);							
														break;
													}
												} else { //no food yes water no sleep no drug
												switch (drink) { 
												case 1:
													JOptionPane.showMessageDialog(null,"After consuming " +drink+ " drinks over the period of "+timeNum+" hours, your BAC as an average male would be around 0.013 grams per milliliter of blood.\nYou are not really feeling the effects of alcohol and will return to sobriety shortly."+noSleep+noFood,"Results",JOptionPane.PLAIN_MESSAGE);
													break;
												case 2:
													JOptionPane.showMessageDialog(null,"After consuming " +drink+ " drinks over the period of "+timeNum+" hours, your BAC as an average male would be around 0.034 grams per milliliter of blood.\nYou are feeling a little more relaxed while still maintaining your full coordination. \nYou will return to sobriety in a bit."+noSleep+noFood,"Results",JOptionPane.PLAIN_MESSAGE);
													break;
												case 3:
													JOptionPane.showMessageDialog(null,"After consuming " +drink+ " drinks over the period of "+timeNum+" hours, your BAC as an average male would be around 0.047 grams per milliliter of blood.\nYou are feeling a bit more relaxed and might have a feeling of well being or euphoria. You will return to sobriety in about 3 hours."+noSleep+noFood,"Results",JOptionPane.PLAIN_MESSAGE);
													break;
												case 4:
													JOptionPane.showMessageDialog(null,"After consuming " +drink+ " drinks over the period of "+timeNum+" hours, your BAC as an average male would be around 0.069 grams per milliliter of blood.\nYou are feeling a bit more relaxed and might have a feeling of well being or euphoria. It is currently a poor idea to drive. \n You will return to sobriety in about 5 hours."+noSleep+noFood,"Results",JOptionPane.PLAIN_MESSAGE);
													break;
												case 5:
													JOptionPane.showMessageDialog(null,"After consuming " +drink+ " drinks over the period of "+timeNum+" hours, your BAC as an average male would be around 0.090 grams per milliliter of blood.\nYou can definately tell that you are under the influence and your speech, motor skills, balance and judgement are affected. It is currently a poor idea to drive. \n You will return to sobriety in about 7 hours."+noSleep+noFood,"Results",JOptionPane.PLAIN_MESSAGE);
													break;
												case 6: 
													JOptionPane.showMessageDialog(null,"After consuming " +drink+ " drinks over the period of "+timeNum+" hours, your BAC as an average male would be around 0.112 grams per milliliter of blood.\nYour speech will be slurred and your balance, vision, reactions time and hearing will be impaired. Your motor coordination will also be significantly impaired and you'll have a loss of good judgment. \nIt is currently a poor idea to drive. You will return to sobriety in about 8 hours."+noSleep+noFood,"Results",JOptionPane.PLAIN_MESSAGE);
													break;
												case 7: 
													JOptionPane.showMessageDialog(null,"After consuming " +drink+ " drinks over the period of "+timeNum+" hours, your BAC as an average male would be around 0.133 grams per milliliter of blood.\nRight now, you'd be feeling gross motor impairment and a lack of physical control. It'd probably be hard for you to type on the keyboard and your monitor or mobile phone screen would appear blurry. \nYour judgment and perception of what’s going on would be severely impaired and any feeling of euphoria you had earlier will have turned to dysphoria. \nIt is currently a poor idea to drive. You will return to sobriety in about 10 hours."+noSleep+noFood,"Results",JOptionPane.PLAIN_MESSAGE);
													break;
												case 8: 
													JOptionPane.showMessageDialog(null,"After consuming " +drink+ " drinks over the period of "+timeNum+" hours, your BAC as an average male would be around 0.155 grams per milliliter of blood. \nYou'll probably start to feel sick to your stomach. Any euphoria you had earlier will have turned to dysphoria. Right now you might look like a 'sloppy drunk'. \nConsuming this amount of alcohol in a short period of time is dangerous to your health. It is currently a poor idea to drive. You will return to sobriety in about 11 hours."+noSleep+noFood,"Results",JOptionPane.PLAIN_MESSAGE);
													break;
												case 9:
													JOptionPane.showMessageDialog(null,"After consuming " +drink+ " drinks over the period of "+timeNum+" hours, your BAC as an average male would be around 0.176 grams per milliliter of blood. \nYou'll probably start to feel sick to your stomach. Any euphoria you had earlier will have turned to dysphoria. Right now you might look like a 'sloppy drunk'. \nConsuming this amount of alcohol in a short period of time is dangerous to your health. It is currently a poor idea to drive. You will return to sobriety in about 13 hours."+noSleep+noFood,"Results",JOptionPane.PLAIN_MESSAGE);
													break;
												case 10:
													JOptionPane.showMessageDialog(null,"After consuming " +drink+ " drinks over the period of "+timeNum+" hours, your BAC as an average male would be around 0.198 grams per milliliter of blood. \nYou'll probably need help if you want to walk properly. If you fall down you probably won't feel a lot of pain – even if you hurt yourself. At this level of BAC, some people begin to vomit. At the very least, you'll feel dazed, confused and disoriented. \nConsuming this amount of alcohol in a short period of time is dangerous to your health. It is currently a poor idea to drive. You will return to sobriety in about 14 hours."+noSleep+noFood,"Results",JOptionPane.PLAIN_MESSAGE);
													break;
												case 11:
													JOptionPane.showMessageDialog(null,"After consuming " +drink+ " drinks over the period of "+timeNum+" hours, your BAC as an average male would be around 0.219 grams per milliliter of blood. \nIf you were awake at this point you'd have very little comprehension as to where you were or what you were doing. You might pass out suddenly and it'd be hard to wake you up. \nConsuming this amount of alcohol in a short period of time is dangerous to your health. It is currently a poor idea to drive. You will return to sobriety in about 16 hours."+noSleep+noFood,"Results",JOptionPane.PLAIN_MESSAGE);
													break;
												case 12:
													JOptionPane.showMessageDialog(null,"After consuming " +drink+ " drinks over the period of "+timeNum+" hours, your BAC as an average male would be around 0.240 grams per milliliter of blood. \nIf you were awake at this point you'd have very little comprehension as to where you were or what you were doing. You might pass out suddenly and it'd be hard to wake you up. \nConsuming this amount of alcohol in a short period of time is dangerous to your health. It is currently a poor idea to drive. You will return to sobriety in about 17 hours."+noSleep+noFood,"Results",JOptionPane.PLAIN_MESSAGE);
													break;
												case 13:
													JOptionPane.showMessageDialog(null,"After consuming " +drink+ " drinks over the period of "+timeNum+" hours, your BAC as an average male would be around 0.262 grams per milliliter of blood. \nIf you were awake at this point you'd have very little comprehension as to where you were or what you were doing. You might pass out suddenly and it'd be hard to wake you up. \nConsuming this amount of alcohol in a short period of time is dangerous to your health. It is currently a poor idea to drive."+noSleep+noFood,"Results",JOptionPane.PLAIN_MESSAGE);
													break;
												case 14:
													JOptionPane.showMessageDialog(null,"After consuming " +drink+ " drinks over the period of "+timeNum+" hours, your BAC as an average male would be around 0.283 grams per milliliter of blood. \nIf you were awake at this point you'd have very little comprehension as to where you were or what you were doing. You might pass out suddenly and it'd be hard to wake you up. \nConsuming this amount of alcohol in a short period of time is dangerous to your health. It is currently a poor idea to drive. You will return to sobriety in more than 20 hours."+noSleep+noFood,"Results",JOptionPane.PLAIN_MESSAGE);
													break;
												case 15:
													JOptionPane.showMessageDialog(null,"After consuming " +drink+ " drinks over the period of "+timeNum+" hours, your BAC as an average male would be around 0.305 grams per milliliter of blood. \nIt's possible that you might fall into a coma. You might die due to the paralysis of your diaphragm, the collapse of your lungs, or heart attack (any form of respiratory arrest).  \nConsuming this amount of alcohol in a short period of time is dangerous to your health. It is currently a poor idea to drive. You will return to sobriety in more than 20 hours."+noSleep+noFood,"Results",JOptionPane.PLAIN_MESSAGE);
													break;
												case 16:
													JOptionPane.showMessageDialog(null,"After consuming " +drink+ " drinks over the period of "+timeNum+" hours, your BAC as an average male would be around 0.326 grams per milliliter of blood. \nIt's possible that you might fall into a coma. You might die due to the paralysis of your diaphragm, the collapse of your lungs, or heart attack (any form of respiratory arrest).  \nConsuming this amount of alcohol in a short period of time is dangerous to your health. It is currently a poor idea to drive. You will return to sobriety in more than 20 hours."+noSleep+noFood,"Results",JOptionPane.PLAIN_MESSAGE);
													break;
												case 17:
													JOptionPane.showMessageDialog(null,"After consuming " +drink+ " drinks over the period of "+timeNum+" hours, your BAC as an average male would be around 0.348 grams per milliliter of blood. \nIt's possible that you might fall into a coma. You might die due to the paralysis of your diaphragm, the collapse of your lungs, or heart attack (any form of respiratory arrest).  \nConsuming this amount of alcohol in a short period of time is dangerous to your health. It is currently a poor idea to drive. You will return to sobriety in more than 20 hours."+noSleep+noFood,"Results",JOptionPane.PLAIN_MESSAGE);
													break;
												default:
													JOptionPane.showMessageDialog(null,"After consuming " +drink+ " drinks over the period of "+timeNum+" hours, your BAC as an average male would be above 0.30 grams per milliliter of blood. \nIt's possible that you might fall into a coma. You might die due to the paralysis of your diaphragm, the collapse of your lungs, or heart attack (any form of respiratory arrest).  \nConsuming this amount of alcohol in a short period of time is dangerous to your health. It is currently a poor idea to drive. You will return to sobriety in more than 20 hours."+noSleep+noFood,"Results",JOptionPane.PLAIN_MESSAGE);							
													break;
											}
											} /*no sleep no drug*/
										} 
								}/* no water*/ else {
									if (sleep == true) { //slept well
										if (drug == true) { //on medication
											switch (drink) {//no food no water yes sleep yes drug
												case 1: 
													JOptionPane.showMessageDialog(null,"After consuming " +drink+ " drinks over the period of "+timeNum+" hours, your BAC as an average male would be around 0.013 grams per milliliter of blood.\nYou are not really feeling the effects of alcohol and will return to sobriety shortly."+drugString+noWater+noFood,"Results",JOptionPane.PLAIN_MESSAGE);
													break;
												case 2:
													JOptionPane.showMessageDialog(null,"After consuming " +drink+ " drinks over the period of "+timeNum+" hours, your BAC as an average male would be around 0.034 grams per milliliter of blood.\nYou are feeling a little more relaxed while still maintaining your full coordination. \nYou will return to sobriety in a bit "+drugString+noWater+noFood,"Results",JOptionPane.PLAIN_MESSAGE);
													break;
												case 3:
													JOptionPane.showMessageDialog(null,"After consuming " +drink+ " drinks over the period of "+timeNum+" hours, your BAC as an average male would be around 0.047 grams per milliliter of blood.\nYou are feeling a bit more relaxed and might have a feeling of well being or euphoria. You will return to sobriety in about 3 hours. "+drugString+noWater+noFood,"Results",JOptionPane.PLAIN_MESSAGE);
													break;
												case 4:
													JOptionPane.showMessageDialog(null,"After consuming " +drink+ " drinks over the period of "+timeNum+" hours, your BAC as an average male would be around 0.069 grams per milliliter of blood.\nYou are feeling a bit more relaxed and might have a feeling of well being or euphoria. It is currently a poor idea to drive. \n You will return to sobriety in about 5 hours "+drugString+noWater+noFood,"Results",JOptionPane.PLAIN_MESSAGE);
													break;
												case 5:
													JOptionPane.showMessageDialog(null,"After consuming " +drink+ " drinks over the period of "+timeNum+" hours, your BAC as an average male would be around 0.090 grams per milliliter of blood.\nYou can definately tell that you are under the influence and your speech, motor skills, balance and judgement are affected. It is currently a poor idea to drive. \n You will return to sobriety in about 7 hours "+drugString+noWater+noFood,"Results",JOptionPane.PLAIN_MESSAGE);
													break;
												case 6: 
													JOptionPane.showMessageDialog(null,"After consuming " +drink+ " drinks over the period of "+timeNum+" hours, your BAC as an average male would be around 0.112 grams per milliliter of blood.\nYour speech will be slurred and your balance, vision, reactions time and hearing will be impaired. Your motor coordination will also be significantly impaired and you'll have a loss of good judgment. \nIt is currently a poor idea to drive. You will return to sobriety in about 8 hours "+drugString+noWater+noFood,"Results",JOptionPane.PLAIN_MESSAGE);
													break;
												case 7: 
													JOptionPane.showMessageDialog(null,"After consuming " +drink+ " drinks over the period of "+timeNum+" hours, your BAC as an average male would be around 0.133 grams per milliliter of blood.\nRight now, you'd be feeling gross motor impairment and a lack of physical control. It'd probably be hard for you to type on the keyboard and your monitor or mobile phone screen would appear blurry. \nYour judgment and perception of what’s going on would be severely impaired and any feeling of euphoria you had earlier will have turned to dysphoria. \nIt is currently a poor idea to drive. You will return to sobriety in about 10 hours "+drugString+noWater+noFood,"Results",JOptionPane.PLAIN_MESSAGE);
													break;
												case 8: 
													JOptionPane.showMessageDialog(null,"After consuming " +drink+ " drinks over the period of "+timeNum+" hours, your BAC as an average male would be around 0.155 grams per milliliter of blood. \nYou'll probably start to feel sick to your stomach. Any euphoria you had earlier will have turned to dysphoria. Right now you might look like a 'sloppy drunk'. \nConsuming this amount of alcohol in a short period of time is dangerous to your health. It is currently a poor idea to drive. You will return to sobriety in about 11 hours "+drugString+noWater+noFood,"Results",JOptionPane.PLAIN_MESSAGE);
													break;
												case 9:
													JOptionPane.showMessageDialog(null,"After consuming " +drink+ " drinks over the period of "+timeNum+" hours, your BAC as an average male would be around 0.176 grams per milliliter of blood. \nYou'll probably start to feel sick to your stomach. Any euphoria you had earlier will have turned to dysphoria. Right now you might look like a 'sloppy drunk'. \nConsuming this amount of alcohol in a short period of time is dangerous to your health. It is currently a poor idea to drive. You will return to sobriety in about 13 hours "+drugString+noWater+noFood,"Results",JOptionPane.PLAIN_MESSAGE);
													break;
												case 10:
													JOptionPane.showMessageDialog(null,"After consuming " +drink+ " drinks over the period of "+timeNum+" hours, your BAC as an average male would be around 0.198 grams per milliliter of blood. \nYou'll probably need help if you want to walk properly. If you fall down you probably won't feel a lot of pain – even if you hurt yourself. At this level of BAC, some people begin to vomit. At the very least, you'll feel dazed, confused and disoriented. \nConsuming this amount of alcohol in a short period of time is dangerous to your health. It is currently a poor idea to drive. You will return to sobriety in about 14 hours "+drugString+noWater+noFood,"Results",JOptionPane.PLAIN_MESSAGE);
													break;
												case 11:
													JOptionPane.showMessageDialog(null,"After consuming " +drink+ " drinks over the period of "+timeNum+" hours, your BAC as an average male would be around 0.219 grams per milliliter of blood. \nIf you were awake at this point you'd have very little comprehension as to where you were or what you were doing. You might pass out suddenly and it'd be hard to wake you up. \nConsuming this amount of alcohol in a short period of time is dangerous to your health. It is currently a poor idea to drive. You will return to sobriety in about 16 hours "+drugString+noWater+noFood,"Results",JOptionPane.PLAIN_MESSAGE);
													break;
												case 12:
													JOptionPane.showMessageDialog(null,"After consuming " +drink+ " drinks over the period of "+timeNum+" hours, your BAC as an average male would be around 0.240 grams per milliliter of blood. \nIf you were awake at this point you'd have very little comprehension as to where you were or what you were doing. You might pass out suddenly and it'd be hard to wake you up. \nConsuming this amount of alcohol in a short period of time is dangerous to your health. It is currently a poor idea to drive. You will return to sobriety in about 17 hours "+drugString+noWater+noFood,"Results",JOptionPane.PLAIN_MESSAGE);
													break;
												case 13:
													JOptionPane.showMessageDialog(null,"After consuming " +drink+ " drinks over the period of "+timeNum+" hours, your BAC as an average male would be around 0.262 grams per milliliter of blood. \nIf you were awake at this point you'd have very little comprehension as to where you were or what you were doing. You might pass out suddenly and it'd be hard to wake you up. \nConsuming this amount of alcohol in a short period of time is dangerous to your health. It is currently a poor idea to drive. You will return to sobriety in about 19 hours "+drugString+noWater+noFood,"Results",JOptionPane.PLAIN_MESSAGE);
													break;
												case 14:
													JOptionPane.showMessageDialog(null,"After consuming " +drink+ " drinks over the period of "+timeNum+" hours, your BAC as an average male would be around 0.283 grams per milliliter of blood. \nIf you were awake at this point you'd have very little comprehension as to where you were or what you were doing. You might pass out suddenly and it'd be hard to wake you up. \nConsuming this amount of alcohol in a short period of time is dangerous to your health. It is currently a poor idea to drive. You will return to sobriety in more than 20 hours "+drugString+noWater+noFood,"Results",JOptionPane.PLAIN_MESSAGE);
													break;
												case 15:
													JOptionPane.showMessageDialog(null,"After consuming " +drink+ " drinks over the period of "+timeNum+" hours, your BAC as an average male would be around 0.305 grams per milliliter of blood. \nIt's possible that you might fall into a coma. You might die due to the paralysis of your diaphragm, the collapse of your lungs, or heart attack (any form of respiratory arrest).  \nConsuming this amount of alcohol in a short period of time is dangerous to your health. It is currently a poor idea to drive. You will return to sobriety in more than 20 hours "+drugString+noWater+noFood,"Results",JOptionPane.PLAIN_MESSAGE);
													break;
												case 16:
													JOptionPane.showMessageDialog(null,"After consuming " +drink+ " drinks over the period of "+timeNum+" hours, your BAC as an average male would be around 0.326 grams per milliliter of blood. \nIt's possible that you might fall into a coma. You might die due to the paralysis of your diaphragm, the collapse of your lungs, or heart attack (any form of respiratory arrest).  \nConsuming this amount of alcohol in a short period of time is dangerous to your health. It is currently a poor idea to drive. You will return to sobriety in more than 20 hours "+drugString+noWater+noFood,"Results",JOptionPane.PLAIN_MESSAGE);
													break;
												case 17:
													JOptionPane.showMessageDialog(null,"After consuming " +drink+ " drinks over the period of "+timeNum+" hours, your BAC as an average male would be around 0.348 grams per milliliter of blood. \nIt's possible that you might fall into a coma. You might die due to the paralysis of your diaphragm, the collapse of your lungs, or heart attack (any form of respiratory arrest).  \nConsuming this amount of alcohol in a short period of time is dangerous to your health. It is currently a poor idea to drive. You will return to sobriety in more than 20 hours "+drugString+noWater+noFood,"Results",JOptionPane.PLAIN_MESSAGE);
													break;
												default:
													JOptionPane.showMessageDialog(null,"After consuming " +drink+ " drinks over the period of "+timeNum+" hours, your BAC as an average male would be above 0.30 grams per milliliter of blood. \nIt's possible that you might fall into a coma. You might die due to the paralysis of your diaphragm, the collapse of your lungs, or heart attack (any form of respiratory arrest).  \nConsuming this amount of alcohol in a short period of time is dangerous to your health. It is currently a poor idea to drive. You will return to sobriety in more than 20 hours "+drugString+noWater+noFood,"Results",JOptionPane.PLAIN_MESSAGE);							
													break;
											} 
										} else { //no food no water yes sleep no drug
											switch (drink) {
											case 1:
												JOptionPane.showMessageDialog(null,"After consuming " +drink+ " drinks over the period of "+timeNum+" hours, your BAC as an average male would be around 0.013 grams per milliliter of blood.\nYou are not really feeling the effects of alcohol and will return to sobriety shortly."+noWater+noFood,"Results",JOptionPane.PLAIN_MESSAGE);
												break;
											case 2:
												JOptionPane.showMessageDialog(null,"After consuming " +drink+ " drinks over the period of "+timeNum+" hours, your BAC as an average male would be around 0.034 grams per milliliter of blood.\nYou are feeling a little more relaxed while still maintaining your full coordination. \nYou will return to sobriety in a bit."+noWater+noFood,"Results",JOptionPane.PLAIN_MESSAGE);
												break;
											case 3:
												JOptionPane.showMessageDialog(null,"After consuming " +drink+ " drinks over the period of "+timeNum+" hours, your BAC as an average male would be around 0.047 grams per milliliter of blood.\nYou are feeling a bit more relaxed and might have a feeling of well being or euphoria. You will return to sobriety in about 3 hours."+noWater+noFood,"Results",JOptionPane.PLAIN_MESSAGE);
												break;
											case 4:
												JOptionPane.showMessageDialog(null,"After consuming " +drink+ " drinks over the period of "+timeNum+" hours, your BAC as an average male would be around 0.069 grams per milliliter of blood.\nYou are feeling a bit more relaxed and might have a feeling of well being or euphoria. It is currently a poor idea to drive. \n You will return to sobriety in about 5 hours."+noWater+noFood,"Results",JOptionPane.PLAIN_MESSAGE);
												break;
											case 5:
												JOptionPane.showMessageDialog(null,"After consuming " +drink+ " drinks over the period of "+timeNum+" hours, your BAC as an average male would be around 0.090 grams per milliliter of blood.\nYou can definately tell that you are under the influence and your speech, motor skills, balance and judgement are affected. It is currently a poor idea to drive. \n You will return to sobriety in about 7 hours."+noWater+noFood,"Results",JOptionPane.PLAIN_MESSAGE);
												break;
											case 6: 
												JOptionPane.showMessageDialog(null,"After consuming " +drink+ " drinks over the period of "+timeNum+" hours, your BAC as an average male would be around 0.112 grams per milliliter of blood.\nYour speech will be slurred and your balance, vision, reactions time and hearing will be impaired. Your motor coordination will also be significantly impaired and you'll have a loss of good judgment. \nIt is currently a poor idea to drive. You will return to sobriety in about 8 hours."+noWater+noFood,"Results",JOptionPane.PLAIN_MESSAGE);
												break;
											case 7: 
												JOptionPane.showMessageDialog(null,"After consuming " +drink+ " drinks over the period of "+timeNum+" hours, your BAC as an average male would be around 0.133 grams per milliliter of blood.\nRight now, you'd be feeling gross motor impairment and a lack of physical control. It'd probably be hard for you to type on the keyboard and your monitor or mobile phone screen would appear blurry. \nYour judgment and perception of what’s going on would be severely impaired and any feeling of euphoria you had earlier will have turned to dysphoria. \nIt is currently a poor idea to drive. You will return to sobriety in about 10 hours."+noWater+noFood,"Results",JOptionPane.PLAIN_MESSAGE);
												break;
											case 8: 
												JOptionPane.showMessageDialog(null,"After consuming " +drink+ " drinks over the period of "+timeNum+" hours, your BAC as an average male would be around 0.155 grams per milliliter of blood. \nYou'll probably start to feel sick to your stomach. Any euphoria you had earlier will have turned to dysphoria. Right now you might look like a 'sloppy drunk'. \nConsuming this amount of alcohol in a short period of time is dangerous to your health. It is currently a poor idea to drive. You will return to sobriety in about 11 hours."+noWater+noFood,"Results",JOptionPane.PLAIN_MESSAGE);
												break;
											case 9:
												JOptionPane.showMessageDialog(null,"After consuming " +drink+ " drinks over the period of "+timeNum+" hours, your BAC as an average male would be around 0.176 grams per milliliter of blood. \nYou'll probably start to feel sick to your stomach. Any euphoria you had earlier will have turned to dysphoria. Right now you might look like a 'sloppy drunk'. \nConsuming this amount of alcohol in a short period of time is dangerous to your health. It is currently a poor idea to drive. You will return to sobriety in about 13 hours."+noWater+noFood,"Results",JOptionPane.PLAIN_MESSAGE);
												break;
											case 10:
												JOptionPane.showMessageDialog(null,"After consuming " +drink+ " drinks over the period of "+timeNum+" hours, your BAC as an average male would be around 0.198 grams per milliliter of blood. \nYou'll probably need help if you want to walk properly. If you fall down you probably won't feel a lot of pain – even if you hurt yourself. At this level of BAC, some people begin to vomit. At the very least, you'll feel dazed, confused and disoriented. \nConsuming this amount of alcohol in a short period of time is dangerous to your health. It is currently a poor idea to drive. You will return to sobriety in about 14 hours."+noWater+noFood,"Results",JOptionPane.PLAIN_MESSAGE);
												break;
											case 11:
												JOptionPane.showMessageDialog(null,"After consuming " +drink+ " drinks over the period of "+timeNum+" hours, your BAC as an average male would be around 0.219 grams per milliliter of blood. \nIf you were awake at this point you'd have very little comprehension as to where you were or what you were doing. You might pass out suddenly and it'd be hard to wake you up. \nConsuming this amount of alcohol in a short period of time is dangerous to your health. It is currently a poor idea to drive. You will return to sobriety in about 16 hours."+noWater+noFood,"Results",JOptionPane.PLAIN_MESSAGE);
												break;
											case 12:
												JOptionPane.showMessageDialog(null,"After consuming " +drink+ " drinks over the period of "+timeNum+" hours, your BAC as an average male would be around 0.240 grams per milliliter of blood. \nIf you were awake at this point you'd have very little comprehension as to where you were or what you were doing. You might pass out suddenly and it'd be hard to wake you up. \nConsuming this amount of alcohol in a short period of time is dangerous to your health. It is currently a poor idea to drive. You will return to sobriety in about 17 hours."+noWater+noFood,"Results",JOptionPane.PLAIN_MESSAGE);
												break;
											case 13:
												JOptionPane.showMessageDialog(null,"After consuming " +drink+ " drinks over the period of "+timeNum+" hours, your BAC as an average male would be around 0.262 grams per milliliter of blood. \nIf you were awake at this point you'd have very little comprehension as to where you were or what you were doing. You might pass out suddenly and it'd be hard to wake you up. \nConsuming this amount of alcohol in a short period of time is dangerous to your health. It is currently a poor idea to drive."+noWater+noFood,"Results",JOptionPane.PLAIN_MESSAGE);
												break;
											case 14:
												JOptionPane.showMessageDialog(null,"After consuming " +drink+ " drinks over the period of "+timeNum+" hours, your BAC as an average male would be around 0.283 grams per milliliter of blood. \nIf you were awake at this point you'd have very little comprehension as to where you were or what you were doing. You might pass out suddenly and it'd be hard to wake you up. \nConsuming this amount of alcohol in a short period of time is dangerous to your health. It is currently a poor idea to drive. You will return to sobriety in more than 20 hours."+noWater+noFood,"Results",JOptionPane.PLAIN_MESSAGE);
												break;
											case 15:
												JOptionPane.showMessageDialog(null,"After consuming " +drink+ " drinks over the period of "+timeNum+" hours, your BAC as an average male would be around 0.305 grams per milliliter of blood. \nIt's possible that you might fall into a coma. You might die due to the paralysis of your diaphragm, the collapse of your lungs, or heart attack (any form of respiratory arrest).  \nConsuming this amount of alcohol in a short period of time is dangerous to your health. It is currently a poor idea to drive. You will return to sobriety in more than 20 hours."+noWater+noFood,"Results",JOptionPane.PLAIN_MESSAGE);
												break;
											case 16:
												JOptionPane.showMessageDialog(null,"After consuming " +drink+ " drinks over the period of "+timeNum+" hours, your BAC as an average male would be around 0.326 grams per milliliter of blood. \nIt's possible that you might fall into a coma. You might die due to the paralysis of your diaphragm, the collapse of your lungs, or heart attack (any form of respiratory arrest).  \nConsuming this amount of alcohol in a short period of time is dangerous to your health. It is currently a poor idea to drive. You will return to sobriety in more than 20 hours."+noWater+noFood,"Results",JOptionPane.PLAIN_MESSAGE);
												break;
											case 17:
												JOptionPane.showMessageDialog(null,"After consuming " +drink+ " drinks over the period of "+timeNum+" hours, your BAC as an average male would be around 0.348 grams per milliliter of blood. \nIt's possible that you might fall into a coma. You might die due to the paralysis of your diaphragm, the collapse of your lungs, or heart attack (any form of respiratory arrest).  \nConsuming this amount of alcohol in a short period of time is dangerous to your health. It is currently a poor idea to drive. You will return to sobriety in more than 20 hours."+noWater+noFood,"Results",JOptionPane.PLAIN_MESSAGE);
												break;
											default:
												JOptionPane.showMessageDialog(null,"After consuming " +drink+ " drinks over the period of "+timeNum+" hours, your BAC as an average male would be above 0.30 grams per milliliter of blood. \nIt's possible that you might fall into a coma. You might die due to the paralysis of your diaphragm, the collapse of your lungs, or heart attack (any form of respiratory arrest).  \nConsuming this amount of alcohol in a short period of time is dangerous to your health. It is currently a poor idea to drive. You will return to sobriety in more than 20 hours."+noWater+noFood,"Results",JOptionPane.PLAIN_MESSAGE);							
												break;
										}
										}
												
											} /*no sleep*/ else {
												if (drug == true) { //no food no water no sleep yes drug
													switch (drink) {
													case 1:
														JOptionPane.showMessageDialog(null,"After consuming " +drink+ " drinks over the period of "+timeNum+" hours, your BAC as an average male would be around 0.013 grams per milliliter of blood.\nYou are not really feeling the effects of alcohol and will return to sobriety shortly."+noSleep + drugString+noWater+noFood,"Results",JOptionPane.PLAIN_MESSAGE);
														break;
													case 2:
														JOptionPane.showMessageDialog(null,"After consuming " +drink+ " drinks over the period of "+timeNum+" hours, your BAC as an average male would be around 0.034 grams per milliliter of blood.\nYou are feeling a little more relaxed while still maintaining your full coordination. \nYou will return to sobriety in a bit."+noSleep+ drugString+noWater+noFood,"Results",JOptionPane.PLAIN_MESSAGE);
														break;
													case 3:
														JOptionPane.showMessageDialog(null,"After consuming " +drink+ " drinks over the period of "+timeNum+" hours, your BAC as an average male would be around 0.047 grams per milliliter of blood.\nYou are feeling a bit more relaxed and might have a feeling of well being or euphoria. You will return to sobriety in about 3 hours."+noSleep+ drugString+noWater+noFood,"Results",JOptionPane.PLAIN_MESSAGE);
														break;
													case 4:
														JOptionPane.showMessageDialog(null,"After consuming " +drink+ " drinks over the period of "+timeNum+" hours, your BAC as an average male would be around 0.069 grams per milliliter of blood.\nYou are feeling a bit more relaxed and might have a feeling of well being or euphoria. It is currently a poor idea to drive. \n You will return to sobriety in about 5 hours."+noSleep+ drugString+noWater+noFood,"Results",JOptionPane.PLAIN_MESSAGE);
														break;
													case 5:
														JOptionPane.showMessageDialog(null,"After consuming " +drink+ " drinks over the period of "+timeNum+" hours, your BAC as an average male would be around 0.090 grams per milliliter of blood.\nYou can definately tell that you are under the influence and your speech, motor skills, balance and judgement are affected. It is currently a poor idea to drive. \n You will return to sobriety in about 7 hours."+noSleep+ drugString+noWater+noFood,"Results",JOptionPane.PLAIN_MESSAGE);
														break;
													case 6: 
														JOptionPane.showMessageDialog(null,"After consuming " +drink+ " drinks over the period of "+timeNum+" hours, your BAC as an average male would be around 0.112 grams per milliliter of blood.\nYour speech will be slurred and your balance, vision, reactions time and hearing will be impaired. Your motor coordination will also be significantly impaired and you'll have a loss of good judgment. \nIt is currently a poor idea to drive. You will return to sobriety in about 8 hours."+noSleep+ drugString+noWater+noFood,"Results",JOptionPane.PLAIN_MESSAGE);
														break;
													case 7: 
														JOptionPane.showMessageDialog(null,"After consuming " +drink+ " drinks over the period of "+timeNum+" hours, your BAC as an average male would be around 0.133 grams per milliliter of blood.\nRight now, you'd be feeling gross motor impairment and a lack of physical control. It'd probably be hard for you to type on the keyboard and your monitor or mobile phone screen would appear blurry. \nYour judgment and perception of what’s going on would be severely impaired and any feeling of euphoria you had earlier will have turned to dysphoria. \nIt is currently a poor idea to drive. You will return to sobriety in about 10 hours."+noSleep+ drugString+noWater+noFood,"Results",JOptionPane.PLAIN_MESSAGE);
														break;
													case 8: 
														JOptionPane.showMessageDialog(null,"After consuming " +drink+ " drinks over the period of "+timeNum+" hours, your BAC as an average male would be around 0.155 grams per milliliter of blood. \nYou'll probably start to feel sick to your stomach. Any euphoria you had earlier will have turned to dysphoria. Right now you might look like a 'sloppy drunk'. \nConsuming this amount of alcohol in a short period of time is dangerous to your health. It is currently a poor idea to drive. You will return to sobriety in about 11 hours."+noSleep+ drugString+noWater+noFood,"Results",JOptionPane.PLAIN_MESSAGE);
														break;
													case 9:
														JOptionPane.showMessageDialog(null,"After consuming " +drink+ " drinks over the period of "+timeNum+" hours, your BAC as an average male would be around 0.176 grams per milliliter of blood. \nYou'll probably start to feel sick to your stomach. Any euphoria you had earlier will have turned to dysphoria. Right now you might look like a 'sloppy drunk'. \nConsuming this amount of alcohol in a short period of time is dangerous to your health. It is currently a poor idea to drive. You will return to sobriety in about 13 hours."+noSleep+ drugString+noWater+noFood,"Results",JOptionPane.PLAIN_MESSAGE);
														break;
													case 10:
														JOptionPane.showMessageDialog(null,"After consuming " +drink+ " drinks over the period of "+timeNum+" hours, your BAC as an average male would be around 0.198 grams per milliliter of blood. \nYou'll probably need help if you want to walk properly. If you fall down you probably won't feel a lot of pain – even if you hurt yourself. At this level of BAC, some people begin to vomit. At the very least, you'll feel dazed, confused and disoriented. \nConsuming this amount of alcohol in a short period of time is dangerous to your health. It is currently a poor idea to drive. You will return to sobriety in about 14 hours."+noSleep+ drugString+noWater+noFood,"Results",JOptionPane.PLAIN_MESSAGE);
														break;
													case 11:
														JOptionPane.showMessageDialog(null,"After consuming " +drink+ " drinks over the period of "+timeNum+" hours, your BAC as an average male would be around 0.219 grams per milliliter of blood. \nIf you were awake at this point you'd have very little comprehension as to where you were or what you were doing. You might pass out suddenly and it'd be hard to wake you up. \nConsuming this amount of alcohol in a short period of time is dangerous to your health. It is currently a poor idea to drive. You will return to sobriety in about 16 hours."+noSleep+ drugString+noWater+noFood,"Results",JOptionPane.PLAIN_MESSAGE);
														break;
													case 12:
														JOptionPane.showMessageDialog(null,"After consuming " +drink+ " drinks over the period of "+timeNum+" hours, your BAC as an average male would be around 0.240 grams per milliliter of blood. \nIf you were awake at this point you'd have very little comprehension as to where you were or what you were doing. You might pass out suddenly and it'd be hard to wake you up. \nConsuming this amount of alcohol in a short period of time is dangerous to your health. It is currently a poor idea to drive. You will return to sobriety in about 17 hours."+noSleep+ drugString+noWater+noFood,"Results",JOptionPane.PLAIN_MESSAGE);
														break;
													case 13:
														JOptionPane.showMessageDialog(null,"After consuming " +drink+ " drinks over the period of "+timeNum+" hours, your BAC as an average male would be around 0.262 grams per milliliter of blood. \nIf you were awake at this point you'd have very little comprehension as to where you were or what you were doing. You might pass out suddenly and it'd be hard to wake you up. \nConsuming this amount of alcohol in a short period of time is dangerous to your health. It is currently a poor idea to drive."+noSleep+ drugString+noWater+noFood,"Results",JOptionPane.PLAIN_MESSAGE);
														break;
													case 14:
														JOptionPane.showMessageDialog(null,"After consuming " +drink+ " drinks over the period of "+timeNum+" hours, your BAC as an average male would be around 0.283 grams per milliliter of blood. \nIf you were awake at this point you'd have very little comprehension as to where you were or what you were doing. You might pass out suddenly and it'd be hard to wake you up. \nConsuming this amount of alcohol in a short period of time is dangerous to your health. It is currently a poor idea to drive. You will return to sobriety in more than 20 hours."+noSleep+ drugString+noWater+noFood,"Results",JOptionPane.PLAIN_MESSAGE);
														break;
													case 15:
														JOptionPane.showMessageDialog(null,"After consuming " +drink+ " drinks over the period of "+timeNum+" hours, your BAC as an average male would be around 0.305 grams per milliliter of blood. \nIt's possible that you might fall into a coma. You might die due to the paralysis of your diaphragm, the collapse of your lungs, or heart attack (any form of respiratory arrest).  \nConsuming this amount of alcohol in a short period of time is dangerous to your health. It is currently a poor idea to drive. You will return to sobriety in more than 20 hours."+noSleep+ drugString+noWater+noFood,"Results",JOptionPane.PLAIN_MESSAGE);
														break;
													case 16:
														JOptionPane.showMessageDialog(null,"After consuming " +drink+ " drinks over the period of "+timeNum+" hours, your BAC as an average male would be around 0.326 grams per milliliter of blood. \nIt's possible that you might fall into a coma. You might die due to the paralysis of your diaphragm, the collapse of your lungs, or heart attack (any form of respiratory arrest).  \nConsuming this amount of alcohol in a short period of time is dangerous to your health. It is currently a poor idea to drive. You will return to sobriety in more than 20 hours."+noSleep+ drugString+noWater+noFood,"Results",JOptionPane.PLAIN_MESSAGE);
														break;
													case 17:
														JOptionPane.showMessageDialog(null,"After consuming " +drink+ " drinks over the period of "+timeNum+" hours, your BAC as an average male would be around 0.348 grams per milliliter of blood. \nIt's possible that you might fall into a coma. You might die due to the paralysis of your diaphragm, the collapse of your lungs, or heart attack (any form of respiratory arrest).  \nConsuming this amount of alcohol in a short period of time is dangerous to your health. It is currently a poor idea to drive. You will return to sobriety in more than 20 hours."+noSleep+ drugString+noWater+noFood,"Results",JOptionPane.PLAIN_MESSAGE);
														break;
													default:
														JOptionPane.showMessageDialog(null,"After consuming " +drink+ " drinks over the period of "+timeNum+" hours, your BAC as an average male would be above 0.30 grams per milliliter of blood. \nIt's possible that you might fall into a coma. You might die due to the paralysis of your diaphragm, the collapse of your lungs, or heart attack (any form of respiratory arrest).  \nConsuming this amount of alcohol in a short period of time is dangerous to your health. It is currently a poor idea to drive. You will return to sobriety in more than 20 hours."+noSleep+ drugString+noWater+noFood,"Results",JOptionPane.PLAIN_MESSAGE);							
														break;
													}
												} else { //no food no water no sleep no drug
												switch (drink) { 
												case 1:
													JOptionPane.showMessageDialog(null,"After consuming " +drink+ " drinks over the period of "+timeNum+" hours, your BAC as an average male would be around 0.013 grams per milliliter of blood.\nYou are not really feeling the effects of alcohol and will return to sobriety shortly."+noSleep+noWater+noFood,"Results",JOptionPane.PLAIN_MESSAGE);
													break;
												case 2:
													JOptionPane.showMessageDialog(null,"After consuming " +drink+ " drinks over the period of "+timeNum+" hours, your BAC as an average male would be around 0.034 grams per milliliter of blood.\nYou are feeling a little more relaxed while still maintaining your full coordination. \nYou will return to sobriety in a bit."+noSleep+noWater+noFood,"Results",JOptionPane.PLAIN_MESSAGE);
													break;
												case 3:
													JOptionPane.showMessageDialog(null,"After consuming " +drink+ " drinks over the period of "+timeNum+" hours, your BAC as an average male would be around 0.047 grams per milliliter of blood.\nYou are feeling a bit more relaxed and might have a feeling of well being or euphoria. You will return to sobriety in about 3 hours."+noSleep+noWater+noFood,"Results",JOptionPane.PLAIN_MESSAGE);
													break;
												case 4:
													JOptionPane.showMessageDialog(null,"After consuming " +drink+ " drinks over the period of "+timeNum+" hours, your BAC as an average male would be around 0.069 grams per milliliter of blood.\nYou are feeling a bit more relaxed and might have a feeling of well being or euphoria. It is currently a poor idea to drive. \n You will return to sobriety in about 5 hours."+noSleep+noWater+noFood,"Results",JOptionPane.PLAIN_MESSAGE);
													break;
												case 5:
													JOptionPane.showMessageDialog(null,"After consuming " +drink+ " drinks over the period of "+timeNum+" hours, your BAC as an average male would be around 0.090 grams per milliliter of blood.\nYou can definately tell that you are under the influence and your speech, motor skills, balance and judgement are affected. It is currently a poor idea to drive. \n You will return to sobriety in about 7 hours."+noSleep+noWater+noFood,"Results",JOptionPane.PLAIN_MESSAGE);
													break;
												case 6: 
													JOptionPane.showMessageDialog(null,"After consuming " +drink+ " drinks over the period of "+timeNum+" hours, your BAC as an average male would be around 0.112 grams per milliliter of blood.\nYour speech will be slurred and your balance, vision, reactions time and hearing will be impaired. Your motor coordination will also be significantly impaired and you'll have a loss of good judgment. \nIt is currently a poor idea to drive. You will return to sobriety in about 8 hours."+noSleep+noWater+noFood,"Results",JOptionPane.PLAIN_MESSAGE);
													break;
												case 7: 
													JOptionPane.showMessageDialog(null,"After consuming " +drink+ " drinks over the period of "+timeNum+" hours, your BAC as an average male would be around 0.133 grams per milliliter of blood.\nRight now, you'd be feeling gross motor impairment and a lack of physical control. It'd probably be hard for you to type on the keyboard and your monitor or mobile phone screen would appear blurry. \nYour judgment and perception of what’s going on would be severely impaired and any feeling of euphoria you had earlier will have turned to dysphoria. \nIt is currently a poor idea to drive. You will return to sobriety in about 10 hours."+noSleep+noWater+noFood,"Results",JOptionPane.PLAIN_MESSAGE);
													break;
												case 8: 
													JOptionPane.showMessageDialog(null,"After consuming " +drink+ " drinks over the period of "+timeNum+" hours, your BAC as an average male would be around 0.155 grams per milliliter of blood. \nYou'll probably start to feel sick to your stomach. Any euphoria you had earlier will have turned to dysphoria. Right now you might look like a 'sloppy drunk'. \nConsuming this amount of alcohol in a short period of time is dangerous to your health. It is currently a poor idea to drive. You will return to sobriety in about 11 hours."+noSleep+noWater+noFood,"Results",JOptionPane.PLAIN_MESSAGE);
													break;
												case 9:
													JOptionPane.showMessageDialog(null,"After consuming " +drink+ " drinks over the period of "+timeNum+" hours, your BAC as an average male would be around 0.176 grams per milliliter of blood. \nYou'll probably start to feel sick to your stomach. Any euphoria you had earlier will have turned to dysphoria. Right now you might look like a 'sloppy drunk'. \nConsuming this amount of alcohol in a short period of time is dangerous to your health. It is currently a poor idea to drive. You will return to sobriety in about 13 hours."+noSleep+noWater+noFood,"Results",JOptionPane.PLAIN_MESSAGE);
													break;
												case 10:
													JOptionPane.showMessageDialog(null,"After consuming " +drink+ " drinks over the period of "+timeNum+" hours, your BAC as an average male would be around 0.198 grams per milliliter of blood. \nYou'll probably need help if you want to walk properly. If you fall down you probably won't feel a lot of pain – even if you hurt yourself. At this level of BAC, some people begin to vomit. At the very least, you'll feel dazed, confused and disoriented. \nConsuming this amount of alcohol in a short period of time is dangerous to your health. It is currently a poor idea to drive. You will return to sobriety in about 14 hours."+noSleep+noWater+noFood,"Results",JOptionPane.PLAIN_MESSAGE);
													break;
												case 11:
													JOptionPane.showMessageDialog(null,"After consuming " +drink+ " drinks over the period of "+timeNum+" hours, your BAC as an average male would be around 0.219 grams per milliliter of blood. \nIf you were awake at this point you'd have very little comprehension as to where you were or what you were doing. You might pass out suddenly and it'd be hard to wake you up. \nConsuming this amount of alcohol in a short period of time is dangerous to your health. It is currently a poor idea to drive. You will return to sobriety in about 16 hours."+noSleep+noWater+noFood,"Results",JOptionPane.PLAIN_MESSAGE);
													break;
												case 12:
													JOptionPane.showMessageDialog(null,"After consuming " +drink+ " drinks over the period of "+timeNum+" hours, your BAC as an average male would be around 0.240 grams per milliliter of blood. \nIf you were awake at this point you'd have very little comprehension as to where you were or what you were doing. You might pass out suddenly and it'd be hard to wake you up. \nConsuming this amount of alcohol in a short period of time is dangerous to your health. It is currently a poor idea to drive. You will return to sobriety in about 17 hours."+noSleep+noWater+noFood,"Results",JOptionPane.PLAIN_MESSAGE);
													break;
												case 13:
													JOptionPane.showMessageDialog(null,"After consuming " +drink+ " drinks over the period of "+timeNum+" hours, your BAC as an average male would be around 0.262 grams per milliliter of blood. \nIf you were awake at this point you'd have very little comprehension as to where you were or what you were doing. You might pass out suddenly and it'd be hard to wake you up. \nConsuming this amount of alcohol in a short period of time is dangerous to your health. It is currently a poor idea to drive."+noSleep+noWater+noFood,"Results",JOptionPane.PLAIN_MESSAGE);
													break;
												case 14:
													JOptionPane.showMessageDialog(null,"After consuming " +drink+ " drinks over the period of "+timeNum+" hours, your BAC as an average male would be around 0.283 grams per milliliter of blood. \nIf you were awake at this point you'd have very little comprehension as to where you were or what you were doing. You might pass out suddenly and it'd be hard to wake you up. \nConsuming this amount of alcohol in a short period of time is dangerous to your health. It is currently a poor idea to drive. You will return to sobriety in more than 20 hours."+noSleep+noWater+noFood,"Results",JOptionPane.PLAIN_MESSAGE);
													break;
												case 15:
													JOptionPane.showMessageDialog(null,"After consuming " +drink+ " drinks over the period of "+timeNum+" hours, your BAC as an average male would be around 0.305 grams per milliliter of blood. \nIt's possible that you might fall into a coma. You might die due to the paralysis of your diaphragm, the collapse of your lungs, or heart attack (any form of respiratory arrest).  \nConsuming this amount of alcohol in a short period of time is dangerous to your health. It is currently a poor idea to drive. You will return to sobriety in more than 20 hours."+noSleep+noWater+noFood,"Results",JOptionPane.PLAIN_MESSAGE);
													break;
												case 16:
													JOptionPane.showMessageDialog(null,"After consuming " +drink+ " drinks over the period of "+timeNum+" hours, your BAC as an average male would be around 0.326 grams per milliliter of blood. \nIt's possible that you might fall into a coma. You might die due to the paralysis of your diaphragm, the collapse of your lungs, or heart attack (any form of respiratory arrest).  \nConsuming this amount of alcohol in a short period of time is dangerous to your health. It is currently a poor idea to drive. You will return to sobriety in more than 20 hours."+noSleep+noWater+noFood,"Results",JOptionPane.PLAIN_MESSAGE);
													break;
												case 17:
													JOptionPane.showMessageDialog(null,"After consuming " +drink+ " drinks over the period of "+timeNum+" hours, your BAC as an average male would be around 0.348 grams per milliliter of blood. \nIt's possible that you might fall into a coma. You might die due to the paralysis of your diaphragm, the collapse of your lungs, or heart attack (any form of respiratory arrest).  \nConsuming this amount of alcohol in a short period of time is dangerous to your health. It is currently a poor idea to drive. You will return to sobriety in more than 20 hours."+noSleep+noWater+noFood,"Results",JOptionPane.PLAIN_MESSAGE);
													break;
												default:
													JOptionPane.showMessageDialog(null,"After consuming " +drink+ " drinks over the period of "+timeNum+" hours, your BAC as an average male would be above 0.30 grams per milliliter of blood. \nIt's possible that you might fall into a coma. You might die due to the paralysis of your diaphragm, the collapse of your lungs, or heart attack (any form of respiratory arrest).  \nConsuming this amount of alcohol in a short period of time is dangerous to your health. It is currently a poor idea to drive. You will return to sobriety in more than 20 hours."+noSleep+noWater+noFood,"Results",JOptionPane.PLAIN_MESSAGE);							
													break;
											}
											} 
										}
								}	
								
							}
							
							
							
							} else { //drink<0
								JOptionPane.showMessageDialog(null,"After consuming " +drink+ " drinks over the period of "+timeNum+" hours, your BAC as an average male should be 0.00 grams per milliliter of blood. \nYou should feel completely normal with no adverse affects","Results",JOptionPane.PLAIN_MESSAGE);							
							}
					} else if (gender == false) { //female
						//170 lb female
				        if (drink > 0) { //did you drink?
							if (food == true) { //food eaten
								if (water == true) { //drank water
									if (sleep == true) { //slept well
										if (drug == true) { //on medication
											switch (drink) {//yes food yes water yes sleep yes drug
												case 1: 
													JOptionPane.showMessageDialog(null,"After consuming " +drink+ " drinks over the period of "+timeNum+" hours, your BAC as an average female would be around 0.021 grams per milliliter of blood.\nYou are feeling a little more relaxed while still maintaining your full coordination. \nYou will return to sobriety in about an hour"+drugString,"Results",JOptionPane.PLAIN_MESSAGE);
													break;
												case 2:
													JOptionPane.showMessageDialog(null,"After consuming " +drink+ " drinks over the period of "+timeNum+" hours, your BAC as an average female would be around 0.051 grams per milliliter of blood.\nYou are feeling a bit more relaxed and might have a feeling of well being or euphoria. \nYou will return to sobriety in about 3 hours "+drugString,"Results",JOptionPane.PLAIN_MESSAGE);
													break;
												case 3:
													JOptionPane.showMessageDialog(null,"After consuming " +drink+ " drinks over the period of "+timeNum+" hours, your BAC as an average female would be around 0.081 grams per milliliter of blood.\nYou can definately tell that you are under the influence and your speech, motor skills, balance and judgement are affected. It is currently a poor idea to drive. \nYou will return to sobriety in about 5 hours. "+drugString,"Results",JOptionPane.PLAIN_MESSAGE);
													break;
												case 4:
													JOptionPane.showMessageDialog(null,"After consuming " +drink+ " drinks over the period of "+timeNum+" hours, your BAC as an average female would be around 0.111 grams per milliliter of blood.\nYour speech will be slurred and your balance, vision, reactions time and hearing will be impaired. Your motor coordination will also be significantly impaired and you'll have a loss of good judgment. \nIt is currently a poor idea to drive. You will return to sobriety in about 7 hours "+drugString,"Results",JOptionPane.PLAIN_MESSAGE);
													break;
												case 5:
													JOptionPane.showMessageDialog(null,"After consuming " +drink+ " drinks over the period of "+timeNum+" hours, your BAC as an average female would be around 0.141 grams per milliliter of blood.\nRight now, you'd be feeling gross motor impairment and a lack of physical control. It'd probably be hard for you to type on the keyboard and your monitor or mobile phone screen would appear blurry. \nYour judgment and perception of what’s going on would be severely impaired and any feeling of euphoria you had earlier will have turned to dysphoria. \nIt is currently a poor idea to drive. You will return to sobriety in about 8 hours "+drugString,"Results",JOptionPane.PLAIN_MESSAGE);
													break;
												case 6: 
													JOptionPane.showMessageDialog(null,"After consuming " +drink+ " drinks over the period of "+timeNum+" hours, your BAC as an average female would be around 0.171 grams per milliliter of blood.\nYou'll probably start to feel sick to your stomach. Any euphoria you had earlier will have turned to dysphoria. Right now you might look like a 'sloppy drunk'. \nConsuming this amount of alcohol in a short period of time is dangerous to your health. \nIt is currently a poor idea to drive. You will return to sobriety in about 10 hours "+drugString,"Results",JOptionPane.PLAIN_MESSAGE);
													break;
												case 7: 
													JOptionPane.showMessageDialog(null,"After consuming " +drink+ " drinks over the period of "+timeNum+" hours, your BAC as an average female would be around 0.201 grams per milliliter of blood.\nYou'll probably need help if you want to walk properly. If you fall down you probably won't feel a lot of pain – even if you hurt yourself. At this level of BAC, some people begin to vomit. At the very least, you'll feel dazed, confused and disoriented. \nConsuming this amount of alcohol in a short period of time is dangerous to your health. \nIt is currently a poor idea to drive. You will return to sobriety in about 12 hours "+drugString,"Results",JOptionPane.PLAIN_MESSAGE);
													break;
												case 8: 
													JOptionPane.showMessageDialog(null,"After consuming " +drink+ " drinks over the period of "+timeNum+" hours, your BAC as an average female would be around 0.23 grams per milliliter of blood. \nIf you were awake at this point you'd have very little comprehension as to where you were or what you were doing. You might pass out suddenly and it'd be hard to wake you up. \nConsuming this amount of alcohol in a short period of time is dangerous to your health. It is currently a poor idea to drive. You will return to sobriety in about 14 hours "+drugString,"Results",JOptionPane.PLAIN_MESSAGE);
													break;
												case 9:
													JOptionPane.showMessageDialog(null,"After consuming " +drink+ " drinks over the period of "+timeNum+" hours, your BAC as an average female would be around 0.26 grams per milliliter of blood. nIf you were awake at this point you'd have very little comprehension as to where you were or what you were doing. You might pass out suddenly and it'd be hard to wake you up. \nConsuming this amount of alcohol in a short period of time is dangerous to your health. It is currently a poor idea to drive. You will return to sobriety in about 16 hours "+drugString,"Results",JOptionPane.PLAIN_MESSAGE);
													break;
												case 10:
													JOptionPane.showMessageDialog(null,"After consuming " +drink+ " drinks over the period of "+timeNum+" hours, your BAC as an average female would be around 0.29 grams per milliliter of blood. nIf you were awake at this point you'd have very little comprehension as to where you were or what you were doing. You might pass out suddenly and it'd be hard to wake you up. \nConsuming this amount of alcohol in a short period of time is dangerous to your health. It is currently a poor idea to drive. You will return to sobriety in about 17 hours "+drugString,"Results",JOptionPane.PLAIN_MESSAGE);
													break;
												case 11:
													JOptionPane.showMessageDialog(null,"After consuming " +drink+ " drinks over the period of "+timeNum+" hours, your BAC as an average female would be around 0.32 grams per milliliter of blood. \nIt's possible that you might fall into a coma. You might die due to the paralysis of your diaphragm, the collapse of your lungs, or heart attack (any form of respiratory arrest). \nConsuming this amount of alcohol in a short period of time is dangerous to your health. It is currently a poor idea to drive. You will return to sobriety in about 19 hours "+drugString,"Results",JOptionPane.PLAIN_MESSAGE);
													break;
												case 12:
													JOptionPane.showMessageDialog(null,"After consuming " +drink+ " drinks over the period of "+timeNum+" hours, your BAC as an average female would be around 0.35 grams per milliliter of blood. \nIt's possible that you might fall into a coma. You might die due to the paralysis of your diaphragm, the collapse of your lungs, or heart attack (any form of respiratory arrest). \nConsuming this amount of alcohol in a short period of time is dangerous to your health. It is currently a poor idea to drive. You will return to sobriety in more than 20 hours "+drugString,"Results",JOptionPane.PLAIN_MESSAGE);
													break;
												case 13:
													JOptionPane.showMessageDialog(null,"After consuming " +drink+ " drinks over the period of "+timeNum+" hours, your BAC as an average female would be around 0.38 grams per milliliter of blood. \nIt's possible that you might fall into a coma. You might die due to the paralysis of your diaphragm, the collapse of your lungs, or heart attack (any form of respiratory arrest). \nConsuming this amount of alcohol in a short period of time is dangerous to your health. It is currently a poor idea to drive. You will return to sobriety in more than 20 hours "+drugString,"Results",JOptionPane.PLAIN_MESSAGE);
													break;
												case 14:
													JOptionPane.showMessageDialog(null,"After consuming " +drink+ " drinks over the period of "+timeNum+" hours, your BAC as an average female would be around 0.41 grams per milliliter of blood. \nIt's possible that you might fall into a coma. You might die due to the paralysis of your diaphragm, the collapse of your lungs, or heart attack (any form of respiratory arrest). \nConsuming this amount of alcohol in a short period of time is dangerous to your health. It is currently a poor idea to drive. You will return to sobriety in more than 20 hours "+drugString,"Results",JOptionPane.PLAIN_MESSAGE);
													break;
												case 15:
													JOptionPane.showMessageDialog(null,"After consuming " +drink+ " drinks over the period of "+timeNum+" hours, your BAC as an average female would be around 0.44 grams per milliliter of blood. \nIt's possible that you might fall into a coma. You might die due to the paralysis of your diaphragm, the collapse of your lungs, or heart attack (any form of respiratory arrest).  \nConsuming this amount of alcohol in a short period of time is dangerous to your health. It is currently a poor idea to drive. You will return to sobriety in more than 20 hours "+drugString,"Results",JOptionPane.PLAIN_MESSAGE);
													break;
												case 16:
													JOptionPane.showMessageDialog(null,"After consuming " +drink+ " drinks over the period of "+timeNum+" hours, your BAC as an average female would be around 0.469 grams per milliliter of blood. \nIt's possible that you might fall into a coma. You might die due to the paralysis of your diaphragm, the collapse of your lungs, or heart attack (any form of respiratory arrest).  \nConsuming this amount of alcohol in a short period of time is dangerous to your health. It is currently a poor idea to drive. You will return to sobriety in more than 20 hours "+drugString,"Results",JOptionPane.PLAIN_MESSAGE);
													break;
												case 17:
													JOptionPane.showMessageDialog(null,"After consuming " +drink+ " drinks over the period of "+timeNum+" hours, your BAC as an average male would be around 0.499 grams per milliliter of blood. \nIt's possible that you might fall into a coma. You might die due to the paralysis of your diaphragm, the collapse of your lungs, or heart attack (any form of respiratory arrest).  \nConsuming this amount of alcohol in a short period of time is dangerous to your health. It is currently a poor idea to drive. You will return to sobriety in more than 20 hours "+drugString,"Results",JOptionPane.PLAIN_MESSAGE);
													break;
												default:
													JOptionPane.showMessageDialog(null,"After consuming " +drink+ " drinks over the period of "+timeNum+" hours, your BAC as an average male would be above 0.50 grams per milliliter of blood. \nIt's possible that you might fall into a coma. You might die due to the paralysis of your diaphragm, the collapse of your lungs, or heart attack (any form of respiratory arrest).  \nConsuming this amount of alcohol in a short period of time is dangerous to your health. It is currently a poor idea to drive. You will return to sobriety in more than 20 hours "+drugString,"Results",JOptionPane.PLAIN_MESSAGE);							
													break;
											} 
										} else { //yes food yes water yes sleep no drug
											switch (drink) {
											case 1:
												JOptionPane.showMessageDialog(null,"After consuming " +drink+ " drinks over the period of "+timeNum+" hours, your BAC as an average female would be around 0.021 grams per milliliter of blood.\nYou are feeling a little more relaxed while still maintaining your full coordination. \nYou will return to sobriety in about an hour ","Results",JOptionPane.PLAIN_MESSAGE);
												break;
											case 2:
												JOptionPane.showMessageDialog(null,"After consuming " +drink+ " drinks over the period of "+timeNum+" hours, your BAC as an average female would be around 0.051 grams per milliliter of blood.\nYou are feeling a bit more relaxed and might have a feeling of well being or euphoria. \nYou will return to sobriety in about 3 hours ","Results",JOptionPane.PLAIN_MESSAGE);
												break;
											case 3:
												JOptionPane.showMessageDialog(null,"After consuming " +drink+ " drinks over the period of "+timeNum+" hours, your BAC as an average female would be around 0.081 grams per milliliter of blood.\nYou can definately tell that you are under the influence and your speech, motor skills, balance and judgement are affected. It is currently a poor idea to drive. \nYou will return to sobriety in about 5 hours. ","Results",JOptionPane.PLAIN_MESSAGE);
												break;
											case 4:
												JOptionPane.showMessageDialog(null,"After consuming " +drink+ " drinks over the period of "+timeNum+" hours, your BAC as an average female would be around 0.111 grams per milliliter of blood.\nYour speech will be slurred and your balance, vision, reactions time and hearing will be impaired. Your motor coordination will also be significantly impaired and you'll have a loss of good judgment. \nIt is currently a poor idea to drive. You will return to sobriety in about 7 hours ","Results",JOptionPane.PLAIN_MESSAGE);
												break;
											case 5:
												JOptionPane.showMessageDialog(null,"After consuming " +drink+ " drinks over the period of "+timeNum+" hours, your BAC as an average female would be around 0.141 grams per milliliter of blood.\nRight now, you'd be feeling gross motor impairment and a lack of physical control. It'd probably be hard for you to type on the keyboard and your monitor or mobile phone screen would appear blurry. \nYour judgment and perception of what’s going on would be severely impaired and any feeling of euphoria you had earlier will have turned to dysphoria. \nIt is currently a poor idea to drive. You will return to sobriety in about 8 hours ","Results",JOptionPane.PLAIN_MESSAGE);
												break;
											case 6: 
												JOptionPane.showMessageDialog(null,"After consuming " +drink+ " drinks over the period of "+timeNum+" hours, your BAC as an average female would be around 0.171 grams per milliliter of blood.\nYou'll probably start to feel sick to your stomach. Any euphoria you had earlier will have turned to dysphoria. Right now you might look like a 'sloppy drunk'. \nConsuming this amount of alcohol in a short period of time is dangerous to your health. \nIt is currently a poor idea to drive. You will return to sobriety in about 10 hours ","Results",JOptionPane.PLAIN_MESSAGE);
												break;
											case 7: 
												JOptionPane.showMessageDialog(null,"After consuming " +drink+ " drinks over the period of "+timeNum+" hours, your BAC as an average female would be around 0.201 grams per milliliter of blood.\nYou'll probably need help if you want to walk properly. If you fall down you probably won't feel a lot of pain – even if you hurt yourself. At this level of BAC, some people begin to vomit. At the very least, you'll feel dazed, confused and disoriented. \nConsuming this amount of alcohol in a short period of time is dangerous to your health. \nIt is currently a poor idea to drive. You will return to sobriety in about 12 hours ","Results",JOptionPane.PLAIN_MESSAGE);
												break;
											case 8: 
												JOptionPane.showMessageDialog(null,"After consuming " +drink+ " drinks over the period of "+timeNum+" hours, your BAC as an average female would be around 0.23 grams per milliliter of blood. \nIf you were awake at this point you'd have very little comprehension as to where you were or what you were doing. You might pass out suddenly and it'd be hard to wake you up. \nConsuming this amount of alcohol in a short period of time is dangerous to your health. It is currently a poor idea to drive. You will return to sobriety in about 14 hours ","Results",JOptionPane.PLAIN_MESSAGE);
												break;
											case 9:
												JOptionPane.showMessageDialog(null,"After consuming " +drink+ " drinks over the period of "+timeNum+" hours, your BAC as an average female would be around 0.26 grams per milliliter of blood. \nIf you were awake at this point you'd have very little comprehension as to where you were or what you were doing. You might pass out suddenly and it'd be hard to wake you up. \nConsuming this amount of alcohol in a short period of time is dangerous to your health. It is currently a poor idea to drive. You will return to sobriety in about 16 hours ","Results",JOptionPane.PLAIN_MESSAGE);
												break;
											case 10:
												JOptionPane.showMessageDialog(null,"After consuming " +drink+ " drinks over the period of "+timeNum+" hours, your BAC as an average female would be around 0.29 grams per milliliter of blood. \nIf you were awake at this point you'd have very little comprehension as to where you were or what you were doing. You might pass out suddenly and it'd be hard to wake you up. \nConsuming this amount of alcohol in a short period of time is dangerous to your health. It is currently a poor idea to drive. You will return to sobriety in about 17 hours ","Results",JOptionPane.PLAIN_MESSAGE);
												break;
											case 11:
												JOptionPane.showMessageDialog(null,"After consuming " +drink+ " drinks over the period of "+timeNum+" hours, your BAC as an average female would be around 0.32 grams per milliliter of blood. \nIt's possible that you might fall into a coma. You might die due to the paralysis of your diaphragm, the collapse of your lungs, or heart attack (any form of respiratory arrest). \nConsuming this amount of alcohol in a short period of time is dangerous to your health. It is currently a poor idea to drive. You will return to sobriety in about 19 hours ","Results",JOptionPane.PLAIN_MESSAGE);
												break;
											case 12:
												JOptionPane.showMessageDialog(null,"After consuming " +drink+ " drinks over the period of "+timeNum+" hours, your BAC as an average female would be around 0.35 grams per milliliter of blood. \nIt's possible that you might fall into a coma. You might die due to the paralysis of your diaphragm, the collapse of your lungs, or heart attack (any form of respiratory arrest). \nConsuming this amount of alcohol in a short period of time is dangerous to your health. It is currently a poor idea to drive. You will return to sobriety in more than 20 hours ","Results",JOptionPane.PLAIN_MESSAGE);
												break;
											case 13:
												JOptionPane.showMessageDialog(null,"After consuming " +drink+ " drinks over the period of "+timeNum+" hours, your BAC as an average female would be around 0.38 grams per milliliter of blood. \nIt's possible that you might fall into a coma. You might die due to the paralysis of your diaphragm, the collapse of your lungs, or heart attack (any form of respiratory arrest). \nConsuming this amount of alcohol in a short period of time is dangerous to your health. It is currently a poor idea to drive. You will return to sobriety in more than 20 hours ","Results",JOptionPane.PLAIN_MESSAGE);
												break;
											case 14:
												JOptionPane.showMessageDialog(null,"After consuming " +drink+ " drinks over the period of "+timeNum+" hours, your BAC as an average female would be around 0.41 grams per milliliter of blood. \nIt's possible that you might fall into a coma. You might die due to the paralysis of your diaphragm, the collapse of your lungs, or heart attack (any form of respiratory arrest). \nConsuming this amount of alcohol in a short period of time is dangerous to your health. It is currently a poor idea to drive. You will return to sobriety in more than 20 hours ","Results",JOptionPane.PLAIN_MESSAGE);
												break;
											case 15:
												JOptionPane.showMessageDialog(null,"After consuming " +drink+ " drinks over the period of "+timeNum+" hours, your BAC as an average female would be around 0.44 grams per milliliter of blood. \nIt's possible that you might fall into a coma. You might die due to the paralysis of your diaphragm, the collapse of your lungs, or heart attack (any form of respiratory arrest).  \nConsuming this amount of alcohol in a short period of time is dangerous to your health. It is currently a poor idea to drive. You will return to sobriety in more than 20 hours ","Results",JOptionPane.PLAIN_MESSAGE);
												break;
											case 16:
												JOptionPane.showMessageDialog(null,"After consuming " +drink+ " drinks over the period of "+timeNum+" hours, your BAC as an average female would be around 0.469 grams per milliliter of blood. \nIt's possible that you might fall into a coma. You might die due to the paralysis of your diaphragm, the collapse of your lungs, or heart attack (any form of respiratory arrest).  \nConsuming this amount of alcohol in a short period of time is dangerous to your health. It is currently a poor idea to drive. You will return to sobriety in more than 20 hours ","Results",JOptionPane.PLAIN_MESSAGE);
												break;
											case 17:
												JOptionPane.showMessageDialog(null,"After consuming " +drink+ " drinks over the period of "+timeNum+" hours, your BAC as an average female would be around 0.499 grams per milliliter of blood. \nIt's possible that you might fall into a coma. You might die due to the paralysis of your diaphragm, the collapse of your lungs, or heart attack (any form of respiratory arrest).  \nConsuming this amount of alcohol in a short period of time is dangerous to your health. It is currently a poor idea to drive. You will return to sobriety in more than 20 hours ","Results",JOptionPane.PLAIN_MESSAGE);
												break;
											default:
												JOptionPane.showMessageDialog(null,"After consuming " +drink+ " drinks over the period of "+timeNum+" hours, your BAC as an average female would be above 0.50 grams per milliliter of blood. \nIt's possible that you might fall into a coma. You might die due to the paralysis of your diaphragm, the collapse of your lungs, or heart attack (any form of respiratory arrest).  \nConsuming this amount of alcohol in a short period of time is dangerous to your health. It is currently a poor idea to drive. You will return to sobriety in more than 20 hours ","Results",JOptionPane.PLAIN_MESSAGE);							
												break;
										}
										}
												
											} /*no sleep*/ else {
												if (drug == true) { //yes food yes water no sleep yes drug
													switch (drink) {
													case 1:
														JOptionPane.showMessageDialog(null,"After consuming " +drink+ " drinks over the period of "+timeNum+" hours, your BAC as an average female would be around 0.021 grams per milliliter of blood.\nYou are feeling a little more relaxed while still maintaining your full coordination. \nYou will return to sobriety in about an hour "+noSleep + drugString,"Results",JOptionPane.PLAIN_MESSAGE);
														break;
													case 2:
														JOptionPane.showMessageDialog(null,"After consuming " +drink+ " drinks over the period of "+timeNum+" hours, your BAC as an average female would be around 0.051 grams per milliliter of blood.\nYou are feeling a bit more relaxed and might have a feeling of well being or euphoria. \nYou will return to sobriety in about 3 hours "+noSleep+ drugString,"Results",JOptionPane.PLAIN_MESSAGE);
														break;
													case 3:
														JOptionPane.showMessageDialog(null,"After consuming " +drink+ " drinks over the period of "+timeNum+" hours, your BAC as an average female would be around 0.081 grams per milliliter of blood.\nYou can definately tell that you are under the influence and your speech, motor skills, balance and judgement are affected. It is currently a poor idea to drive. \nYou will return to sobriety in about 5 hours. "+noSleep+ drugString,"Results",JOptionPane.PLAIN_MESSAGE);
														break;
													case 4:
														JOptionPane.showMessageDialog(null,"After consuming " +drink+ " drinks over the period of "+timeNum+" hours, your BAC as an average female would be around 0.111 grams per milliliter of blood.\nYour speech will be slurred and your balance, vision, reactions time and hearing will be impaired. Your motor coordination will also be significantly impaired and you'll have a loss of good judgment. \nIt is currently a poor idea to drive. You will return to sobriety in about 7 hours "+noSleep+ drugString,"Results",JOptionPane.PLAIN_MESSAGE);
														break;
													case 5:
														JOptionPane.showMessageDialog(null,"After consuming " +drink+ " drinks over the period of "+timeNum+" hours, your BAC as an average female would be around 0.141 grams per milliliter of blood.\nRight now, you'd be feeling gross motor impairment and a lack of physical control. It'd probably be hard for you to type on the keyboard and your monitor or mobile phone screen would appear blurry. \nYour judgment and perception of what’s going on would be severely impaired and any feeling of euphoria you had earlier will have turned to dysphoria. \nIt is currently a poor idea to drive. You will return to sobriety in about 8 hours "+noSleep+ drugString,"Results",JOptionPane.PLAIN_MESSAGE);
														break;
													case 6: 
														JOptionPane.showMessageDialog(null,"After consuming " +drink+ " drinks over the period of "+timeNum+" hours, your BAC as an average female would be around 0.171 grams per milliliter of blood.\nYou'll probably start to feel sick to your stomach. Any euphoria you had earlier will have turned to dysphoria. Right now you might look like a 'sloppy drunk'. \nConsuming this amount of alcohol in a short period of time is dangerous to your health. \nIt is currently a poor idea to drive. You will return to sobriety in about 10 hours "+noSleep+ drugString,"Results",JOptionPane.PLAIN_MESSAGE);
														break;
													case 7: 
														JOptionPane.showMessageDialog(null,"After consuming " +drink+ " drinks over the period of "+timeNum+" hours, your BAC as an average female would be around 0.201 grams per milliliter of blood.\nYou'll probably need help if you want to walk properly. If you fall down you probably won't feel a lot of pain – even if you hurt yourself. At this level of BAC, some people begin to vomit. At the very least, you'll feel dazed, confused and disoriented. \nConsuming this amount of alcohol in a short period of time is dangerous to your health. \nIt is currently a poor idea to drive. You will return to sobriety in about 12 hours "+noSleep+ drugString,"Results",JOptionPane.PLAIN_MESSAGE);
														break;
													case 8: 
														JOptionPane.showMessageDialog(null,"After consuming " +drink+ " drinks over the period of "+timeNum+" hours, your BAC as an average female would be around 0.23 grams per milliliter of blood. \nIf you were awake at this point you'd have very little comprehension as to where you were or what you were doing. You might pass out suddenly and it'd be hard to wake you up. \nConsuming this amount of alcohol in a short period of time is dangerous to your health. It is currently a poor idea to drive. You will return to sobriety in about 14 hours "+noSleep+ drugString,"Results",JOptionPane.PLAIN_MESSAGE);
														break;
													case 9:
														JOptionPane.showMessageDialog(null,"After consuming " +drink+ " drinks over the period of "+timeNum+" hours, your BAC as an average female would be around 0.26 grams per milliliter of blood. \nIf you were awake at this point you'd have very little comprehension as to where you were or what you were doing. You might pass out suddenly and it'd be hard to wake you up. \nConsuming this amount of alcohol in a short period of time is dangerous to your health. It is currently a poor idea to drive. You will return to sobriety in about 16 hours "+noSleep+ drugString,"Results",JOptionPane.PLAIN_MESSAGE);
														break;
													case 10:
														JOptionPane.showMessageDialog(null,"After consuming " +drink+ " drinks over the period of "+timeNum+" hours, your BAC as an average female would be around 0.29 grams per milliliter of blood. \nIf you were awake at this point you'd have very little comprehension as to where you were or what you were doing. You might pass out suddenly and it'd be hard to wake you up. \nConsuming this amount of alcohol in a short period of time is dangerous to your health. It is currently a poor idea to drive. You will return to sobriety in about 17 hours "+noSleep+ drugString,"Results",JOptionPane.PLAIN_MESSAGE);
														break;
													case 11:
														JOptionPane.showMessageDialog(null,"After consuming " +drink+ " drinks over the period of "+timeNum+" hours, your BAC as an average female would be around 0.32 grams per milliliter of blood. \nIt's possible that you might fall into a coma. You might die due to the paralysis of your diaphragm, the collapse of your lungs, or heart attack (any form of respiratory arrest). \nConsuming this amount of alcohol in a short period of time is dangerous to your health. It is currently a poor idea to drive. You will return to sobriety in about 19 hours "+noSleep+ drugString,"Results",JOptionPane.PLAIN_MESSAGE);
														break;
													case 12:
														JOptionPane.showMessageDialog(null,"After consuming " +drink+ " drinks over the period of "+timeNum+" hours, your BAC as an average female would be around 0.35 grams per milliliter of blood. \nIt's possible that you might fall into a coma. You might die due to the paralysis of your diaphragm, the collapse of your lungs, or heart attack (any form of respiratory arrest). \nConsuming this amount of alcohol in a short period of time is dangerous to your health. It is currently a poor idea to drive. You will return to sobriety in more than 20 hours "+noSleep+ drugString,"Results",JOptionPane.PLAIN_MESSAGE);
														break;
													case 13:
														JOptionPane.showMessageDialog(null,"After consuming " +drink+ " drinks over the period of "+timeNum+" hours, your BAC as an average female would be around 0.38 grams per milliliter of blood. \nIt's possible that you might fall into a coma. You might die due to the paralysis of your diaphragm, the collapse of your lungs, or heart attack (any form of respiratory arrest). \nConsuming this amount of alcohol in a short period of time is dangerous to your health. It is currently a poor idea to drive. You will return to sobriety in more than 20 hours "+noSleep+ drugString,"Results",JOptionPane.PLAIN_MESSAGE);
														break;
													case 14:
														JOptionPane.showMessageDialog(null,"After consuming " +drink+ " drinks over the period of "+timeNum+" hours, your BAC as an average female would be around 0.41 grams per milliliter of blood. \nIt's possible that you might fall into a coma. You might die due to the paralysis of your diaphragm, the collapse of your lungs, or heart attack (any form of respiratory arrest). \nConsuming this amount of alcohol in a short period of time is dangerous to your health. It is currently a poor idea to drive. You will return to sobriety in more than 20 hours "+noSleep+ drugString,"Results",JOptionPane.PLAIN_MESSAGE);
														break;
													case 15:
														JOptionPane.showMessageDialog(null,"After consuming " +drink+ " drinks over the period of "+timeNum+" hours, your BAC as an average female would be around 0.44 grams per milliliter of blood. \nIt's possible that you might fall into a coma. You might die due to the paralysis of your diaphragm, the collapse of your lungs, or heart attack (any form of respiratory arrest).  \nConsuming this amount of alcohol in a short period of time is dangerous to your health. It is currently a poor idea to drive. You will return to sobriety in more than 20 hours "+noSleep+ drugString,"Results",JOptionPane.PLAIN_MESSAGE);
														break;
													case 16:
														JOptionPane.showMessageDialog(null,"After consuming " +drink+ " drinks over the period of "+timeNum+" hours, your BAC as an average female would be around 0.469 grams per milliliter of blood. \nIt's possible that you might fall into a coma. You might die due to the paralysis of your diaphragm, the collapse of your lungs, or heart attack (any form of respiratory arrest).  \nConsuming this amount of alcohol in a short period of time is dangerous to your health. It is currently a poor idea to drive. You will return to sobriety in more than 20 hours "+noSleep+ drugString,"Results",JOptionPane.PLAIN_MESSAGE);
														break;
													case 17:
														JOptionPane.showMessageDialog(null,"After consuming " +drink+ " drinks over the period of "+timeNum+" hours, your BAC as an average female would be around 0.499 grams per milliliter of blood. \nIt's possible that you might fall into a coma. You might die due to the paralysis of your diaphragm, the collapse of your lungs, or heart attack (any form of respiratory arrest).  \nConsuming this amount of alcohol in a short period of time is dangerous to your health. It is currently a poor idea to drive. You will return to sobriety in more than 20 hours "+noSleep+ drugString,"Results",JOptionPane.PLAIN_MESSAGE);
														break;
													default:
														JOptionPane.showMessageDialog(null,"After consuming " +drink+ " drinks over the period of "+timeNum+" hours, your BAC as an average female would be above 0.50 grams per milliliter of blood. \nIt's possible that you might fall into a coma. You might die due to the paralysis of your diaphragm, the collapse of your lungs, or heart attack (any form of respiratory arrest).  \nConsuming this amount of alcohol in a short period of time is dangerous to your health. It is currently a poor idea to drive. You will return to sobriety in more than 20 hours "+noSleep+ drugString,"Results",JOptionPane.PLAIN_MESSAGE);							
														break;
													}
												} else { //yes food yes water no sleep no drug
												switch (drink) { 
												case 1:
													JOptionPane.showMessageDialog(null,"After consuming " +drink+ " drinks over the period of "+timeNum+" hours, your BAC as an average female would be around 0.021 grams per milliliter of blood.\nYou are feeling a little more relaxed while still maintaining your full coordination. \nYou will return to sobriety in about an hour "+noSleep,"Results",JOptionPane.PLAIN_MESSAGE);
													break;
												case 2:
													JOptionPane.showMessageDialog(null,"After consuming " +drink+ " drinks over the period of "+timeNum+" hours, your BAC as an average female would be around 0.051 grams per milliliter of blood.\nYou are feeling a bit more relaxed and might have a feeling of well being or euphoria. \nYou will return to sobriety in about 3 hours "+noSleep,"Results",JOptionPane.PLAIN_MESSAGE);
													break;
												case 3:
													JOptionPane.showMessageDialog(null,"After consuming " +drink+ " drinks over the period of "+timeNum+" hours, your BAC as an average female would be around 0.081 grams per milliliter of blood.\nYou can definately tell that you are under the influence and your speech, motor skills, balance and judgement are affected. It is currently a poor idea to drive. \nYou will return to sobriety in about 5 hours. "+noSleep,"Results",JOptionPane.PLAIN_MESSAGE);
													break;
												case 4:
													JOptionPane.showMessageDialog(null,"After consuming " +drink+ " drinks over the period of "+timeNum+" hours, your BAC as an average female would be around 0.111 grams per milliliter of blood.\nYour speech will be slurred and your balance, vision, reactions time and hearing will be impaired. Your motor coordination will also be significantly impaired and you'll have a loss of good judgment. \nIt is currently a poor idea to drive. You will return to sobriety in about 7 hours "+noSleep,"Results",JOptionPane.PLAIN_MESSAGE);
													break;
												case 5:
													JOptionPane.showMessageDialog(null,"After consuming " +drink+ " drinks over the period of "+timeNum+" hours, your BAC as an average female would be around 0.141 grams per milliliter of blood.\nRight now, you'd be feeling gross motor impairment and a lack of physical control. It'd probably be hard for you to type on the keyboard and your monitor or mobile phone screen would appear blurry. \nYour judgment and perception of what’s going on would be severely impaired and any feeling of euphoria you had earlier will have turned to dysphoria. \nIt is currently a poor idea to drive. You will return to sobriety in about 8 hours "+noSleep,"Results",JOptionPane.PLAIN_MESSAGE);
													break;
												case 6: 
													JOptionPane.showMessageDialog(null,"After consuming " +drink+ " drinks over the period of "+timeNum+" hours, your BAC as an average female would be around 0.171 grams per milliliter of blood.\nYou'll probably start to feel sick to your stomach. Any euphoria you had earlier will have turned to dysphoria. Right now you might look like a 'sloppy drunk'. \nConsuming this amount of alcohol in a short period of time is dangerous to your health. \nIt is currently a poor idea to drive. You will return to sobriety in about 10 hours ","Results",JOptionPane.PLAIN_MESSAGE);
													break;
												case 7: 
													JOptionPane.showMessageDialog(null,"After consuming " +drink+ " drinks over the period of "+timeNum+" hours, your BAC as an average female would be around 0.201 grams per milliliter of blood.\nYou'll probably need help if you want to walk properly. If you fall down you probably won't feel a lot of pain – even if you hurt yourself. At this level of BAC, some people begin to vomit. At the very least, you'll feel dazed, confused and disoriented. \nConsuming this amount of alcohol in a short period of time is dangerous to your health. \nIt is currently a poor idea to drive. You will return to sobriety in about 12 hours "+noSleep,"Results",JOptionPane.PLAIN_MESSAGE);
													break;
												case 8: 
													JOptionPane.showMessageDialog(null,"After consuming " +drink+ " drinks over the period of "+timeNum+" hours, your BAC as an average female would be around 0.23 grams per milliliter of blood. \nIf you were awake at this point you'd have very little comprehension as to where you were or what you were doing. You might pass out suddenly and it'd be hard to wake you up. \nConsuming this amount of alcohol in a short period of time is dangerous to your health. It is currently a poor idea to drive. You will return to sobriety in about 14 hours "+noSleep,"Results",JOptionPane.PLAIN_MESSAGE);
													break;
												case 9:
													JOptionPane.showMessageDialog(null,"After consuming " +drink+ " drinks over the period of "+timeNum+" hours, your BAC as an average female would be around 0.26 grams per milliliter of blood. \nIf you were awake at this point you'd have very little comprehension as to where you were or what you were doing. You might pass out suddenly and it'd be hard to wake you up. \nConsuming this amount of alcohol in a short period of time is dangerous to your health. It is currently a poor idea to drive. You will return to sobriety in about 16 hours "+noSleep,"Results",JOptionPane.PLAIN_MESSAGE);
													break;
												case 10:
													JOptionPane.showMessageDialog(null,"After consuming " +drink+ " drinks over the period of "+timeNum+" hours, your BAC as an average female would be around 0.29 grams per milliliter of blood. \nIf you were awake at this point you'd have very little comprehension as to where you were or what you were doing. You might pass out suddenly and it'd be hard to wake you up. \nConsuming this amount of alcohol in a short period of time is dangerous to your health. It is currently a poor idea to drive. You will return to sobriety in about 17 hours "+noSleep,"Results",JOptionPane.PLAIN_MESSAGE);
													break;
												case 11:
													JOptionPane.showMessageDialog(null,"After consuming " +drink+ " drinks over the period of "+timeNum+" hours, your BAC as an average female would be around 0.32 grams per milliliter of blood. \nIt's possible that you might fall into a coma. You might die due to the paralysis of your diaphragm, the collapse of your lungs, or heart attack (any form of respiratory arrest). \nConsuming this amount of alcohol in a short period of time is dangerous to your health. It is currently a poor idea to drive. You will return to sobriety in about 19 hours "+noSleep,"Results",JOptionPane.PLAIN_MESSAGE);
													break;
												case 12:
													JOptionPane.showMessageDialog(null,"After consuming " +drink+ " drinks over the period of "+timeNum+" hours, your BAC as an average female would be around 0.35 grams per milliliter of blood. \nIt's possible that you might fall into a coma. You might die due to the paralysis of your diaphragm, the collapse of your lungs, or heart attack (any form of respiratory arrest). \nConsuming this amount of alcohol in a short period of time is dangerous to your health. It is currently a poor idea to drive. You will return to sobriety in more than 20 hours "+noSleep,"Results",JOptionPane.PLAIN_MESSAGE);
													break;
												case 13:
													JOptionPane.showMessageDialog(null,"After consuming " +drink+ " drinks over the period of "+timeNum+" hours, your BAC as an average female would be around 0.38 grams per milliliter of blood. \nIt's possible that you might fall into a coma. You might die due to the paralysis of your diaphragm, the collapse of your lungs, or heart attack (any form of respiratory arrest). \nConsuming this amount of alcohol in a short period of time is dangerous to your health. It is currently a poor idea to drive. You will return to sobriety in more than 20 hours "+noSleep,"Results",JOptionPane.PLAIN_MESSAGE);
													break;
												case 14:
													JOptionPane.showMessageDialog(null,"After consuming " +drink+ " drinks over the period of "+timeNum+" hours, your BAC as an average female would be around 0.41 grams per milliliter of blood. \nIt's possible that you might fall into a coma. You might die due to the paralysis of your diaphragm, the collapse of your lungs, or heart attack (any form of respiratory arrest). \nConsuming this amount of alcohol in a short period of time is dangerous to your health. It is currently a poor idea to drive. You will return to sobriety in more than 20 hours "+noSleep,"Results",JOptionPane.PLAIN_MESSAGE);
													break;
												case 15:
													JOptionPane.showMessageDialog(null,"After consuming " +drink+ " drinks over the period of "+timeNum+" hours, your BAC as an average female would be around 0.44 grams per milliliter of blood. \nIt's possible that you might fall into a coma. You might die due to the paralysis of your diaphragm, the collapse of your lungs, or heart attack (any form of respiratory arrest).  \nConsuming this amount of alcohol in a short period of time is dangerous to your health. It is currently a poor idea to drive. You will return to sobriety in more than 20 hours "+noSleep,"Results",JOptionPane.PLAIN_MESSAGE);
													break;
												case 16:
													JOptionPane.showMessageDialog(null,"After consuming " +drink+ " drinks over the period of "+timeNum+" hours, your BAC as an average female would be around 0.469 grams per milliliter of blood. \nIt's possible that you might fall into a coma. You might die due to the paralysis of your diaphragm, the collapse of your lungs, or heart attack (any form of respiratory arrest).  \nConsuming this amount of alcohol in a short period of time is dangerous to your health. It is currently a poor idea to drive. You will return to sobriety in more than 20 hours "+noSleep,"Results",JOptionPane.PLAIN_MESSAGE);
													break;
												case 17:
													JOptionPane.showMessageDialog(null,"After consuming " +drink+ " drinks over the period of "+timeNum+" hours, your BAC as an average female would be around 0.499 grams per milliliter of blood. \nIt's possible that you might fall into a coma. You might die due to the paralysis of your diaphragm, the collapse of your lungs, or heart attack (any form of respiratory arrest).  \nConsuming this amount of alcohol in a short period of time is dangerous to your health. It is currently a poor idea to drive. You will return to sobriety in more than 20 hours "+noSleep,"Results",JOptionPane.PLAIN_MESSAGE);
													break;
												default:
													JOptionPane.showMessageDialog(null,"After consuming " +drink+ " drinks over the period of "+timeNum+" hours, your BAC as an average female would be above 0.50 grams per milliliter of blood. \nIt's possible that you might fall into a coma. You might die due to the paralysis of your diaphragm, the collapse of your lungs, or heart attack (any form of respiratory arrest).  \nConsuming this amount of alcohol in a short period of time is dangerous to your health. It is currently a poor idea to drive. You will return to sobriety in more than 20 hours "+noSleep,"Results",JOptionPane.PLAIN_MESSAGE);							
													break;
											}
											} /*no sleep no drug*/
										} 
								}/* no water*/ else {
									if (sleep == true) { //slept well
										if (drug == true) { //on medication
											switch (drink) {//yes food no water yes sleep yes drug
												case 1: 
													JOptionPane.showMessageDialog(null,"After consuming " +drink+ " drinks over the period of "+timeNum+" hours, your BAC as an average female would be around 0.021 grams per milliliter of blood.\nYou are feeling a little more relaxed while still maintaining your full coordination. \nYou will return to sobriety in about an hour "+drugString+noWater,"Results",JOptionPane.PLAIN_MESSAGE);
													break;
												case 2:
													JOptionPane.showMessageDialog(null,"After consuming " +drink+ " drinks over the period of "+timeNum+" hours, your BAC as an average male would be around 0.034 grams per milliliter of blood.\nYou are feeling a little more relaxed while still maintaining your full coordination. \nYou will return to sobriety in a bit "+drugString+noWater,"Results",JOptionPane.PLAIN_MESSAGE);
													break;
												case 3:
													JOptionPane.showMessageDialog(null,"After consuming " +drink+ " drinks over the period of "+timeNum+" hours, your BAC as an average female would be around 0.081 grams per milliliter of blood.\nYou can definately tell that you are under the influence and your speech, motor skills, balance and judgement are affected. It is currently a poor idea to drive. \nYou will return to sobriety in about 5 hours.  "+drugString+noWater,"Results",JOptionPane.PLAIN_MESSAGE);
													break;
												case 4:
													JOptionPane.showMessageDialog(null,"After consuming " +drink+ " drinks over the period of "+timeNum+" hours, your BAC as an average male would be around 0.069 grams per milliliter of blood.\nYou are feeling a bit more relaxed and might have a feeling of well being or euphoria. It is currently a poor idea to drive. \n You will return to sobriety in about 5 hours "+drugString+noWater,"Results",JOptionPane.PLAIN_MESSAGE);
													break;
												case 5:
													JOptionPane.showMessageDialog(null,"After consuming " +drink+ " drinks over the period of "+timeNum+" hours, your BAC as an average male would be around 0.090 grams per milliliter of blood.\nYou can definately tell that you are under the influence and your speech, motor skills, balance and judgement are affected. It is currently a poor idea to drive. \n You will return to sobriety in about 7 hours "+drugString+noWater,"Results",JOptionPane.PLAIN_MESSAGE);
													break;
												case 6: 
													JOptionPane.showMessageDialog(null,"After consuming " +drink+ " drinks over the period of "+timeNum+" hours, your BAC as an average male would be around 0.112 grams per milliliter of blood.\nYour speech will be slurred and your balance, vision, reactions time and hearing will be impaired. Your motor coordination will also be significantly impaired and you'll have a loss of good judgment. \nIt is currently a poor idea to drive. You will return to sobriety in about 8 hours "+drugString+noWater,"Results",JOptionPane.PLAIN_MESSAGE);
													break;
												case 7: 
													JOptionPane.showMessageDialog(null,"After consuming " +drink+ " drinks over the period of "+timeNum+" hours, your BAC as an average male would be around 0.133 grams per milliliter of blood.\nRight now, you'd be feeling gross motor impairment and a lack of physical control. It'd probably be hard for you to type on the keyboard and your monitor or mobile phone screen would appear blurry. \nYour judgment and perception of what’s going on would be severely impaired and any feeling of euphoria you had earlier will have turned to dysphoria. \nIt is currently a poor idea to drive. You will return to sobriety in about 10 hours "+drugString+noWater,"Results",JOptionPane.PLAIN_MESSAGE);
													break;
												case 8: 
													JOptionPane.showMessageDialog(null,"After consuming " +drink+ " drinks over the period of "+timeNum+" hours, your BAC as an average male would be around 0.155 grams per milliliter of blood. \nYou'll probably start to feel sick to your stomach. Any euphoria you had earlier will have turned to dysphoria. Right now you might look like a 'sloppy drunk'. \nConsuming this amount of alcohol in a short period of time is dangerous to your health. It is currently a poor idea to drive. You will return to sobriety in about 11 hours "+drugString+noWater,"Results",JOptionPane.PLAIN_MESSAGE);
													break;
												case 9:
													JOptionPane.showMessageDialog(null,"After consuming " +drink+ " drinks over the period of "+timeNum+" hours, your BAC as an average male would be around 0.176 grams per milliliter of blood. \nYou'll probably start to feel sick to your stomach. Any euphoria you had earlier will have turned to dysphoria. Right now you might look like a 'sloppy drunk'. \nConsuming this amount of alcohol in a short period of time is dangerous to your health. It is currently a poor idea to drive. You will return to sobriety in about 13 hours "+drugString+noWater,"Results",JOptionPane.PLAIN_MESSAGE);
													break;
												case 10:
													JOptionPane.showMessageDialog(null,"After consuming " +drink+ " drinks over the period of "+timeNum+" hours, your BAC as an average male would be around 0.198 grams per milliliter of blood. \nYou'll probably need help if you want to walk properly. If you fall down you probably won't feel a lot of pain – even if you hurt yourself. At this level of BAC, some people begin to vomit. At the very least, you'll feel dazed, confused and disoriented. \nConsuming this amount of alcohol in a short period of time is dangerous to your health. It is currently a poor idea to drive. You will return to sobriety in about 14 hours "+drugString+noWater,"Results",JOptionPane.PLAIN_MESSAGE);
													break;
												case 11:
													JOptionPane.showMessageDialog(null,"After consuming " +drink+ " drinks over the period of "+timeNum+" hours, your BAC as an average male would be around 0.219 grams per milliliter of blood. \nIf you were awake at this point you'd have very little comprehension as to where you were or what you were doing. You might pass out suddenly and it'd be hard to wake you up. \nConsuming this amount of alcohol in a short period of time is dangerous to your health. It is currently a poor idea to drive. You will return to sobriety in about 16 hours "+drugString+noWater,"Results",JOptionPane.PLAIN_MESSAGE);
													break;
												case 12:
													JOptionPane.showMessageDialog(null,"After consuming " +drink+ " drinks over the period of "+timeNum+" hours, your BAC as an average male would be around 0.240 grams per milliliter of blood. \nIf you were awake at this point you'd have very little comprehension as to where you were or what you were doing. You might pass out suddenly and it'd be hard to wake you up. \nConsuming this amount of alcohol in a short period of time is dangerous to your health. It is currently a poor idea to drive. You will return to sobriety in about 17 hours "+drugString+noWater,"Results",JOptionPane.PLAIN_MESSAGE);
													break;
												case 13:
													JOptionPane.showMessageDialog(null,"After consuming " +drink+ " drinks over the period of "+timeNum+" hours, your BAC as an average female would be around 0.38 grams per milliliter of blood. \nIt's possible that you might fall into a coma. You might die due to the paralysis of your diaphragm, the collapse of your lungs, or heart attack (any form of respiratory arrest). \nConsuming this amount of alcohol in a short period of time is dangerous to your health. It is currently a poor idea to drive. You will return to sobriety in more than 20 hours  You will return to sobriety in about 19 hours "+drugString+noWater,"Results",JOptionPane.PLAIN_MESSAGE);
													break;
												case 14:
													JOptionPane.showMessageDialog(null,"After consuming " +drink+ " drinks over the period of "+timeNum+" hours, your BAC as an average male would be around 0.283 grams per milliliter of blood. \nIf you were awake at this point you'd have very little comprehension as to where you were or what you were doing. You might pass out suddenly and it'd be hard to wake you up. \nConsuming this amount of alcohol in a short period of time is dangerous to your health. It is currently a poor idea to drive. You will return to sobriety in more than 20 hours "+drugString+noWater,"Results",JOptionPane.PLAIN_MESSAGE);
													break;
												case 15:
													JOptionPane.showMessageDialog(null,"After consuming " +drink+ " drinks over the period of "+timeNum+" hours, your BAC as an average male would be around 0.305 grams per milliliter of blood. \nIt's possible that you might fall into a coma. You might die due to the paralysis of your diaphragm, the collapse of your lungs, or heart attack (any form of respiratory arrest).  \nConsuming this amount of alcohol in a short period of time is dangerous to your health. It is currently a poor idea to drive. You will return to sobriety in more than 20 hours "+drugString+noWater,"Results",JOptionPane.PLAIN_MESSAGE);
													break;
												case 16:
													JOptionPane.showMessageDialog(null,"After consuming " +drink+ " drinks over the period of "+timeNum+" hours, your BAC as an average male would be around 0.326 grams per milliliter of blood. \nIt's possible that you might fall into a coma. You might die due to the paralysis of your diaphragm, the collapse of your lungs, or heart attack (any form of respiratory arrest).  \nConsuming this amount of alcohol in a short period of time is dangerous to your health. It is currently a poor idea to drive. You will return to sobriety in more than 20 hours "+drugString+noWater,"Results",JOptionPane.PLAIN_MESSAGE);
													break;
												case 17:
													JOptionPane.showMessageDialog(null,"After consuming " +drink+ " drinks over the period of "+timeNum+" hours, your BAC as an average male would be around 0.348 grams per milliliter of blood. \nIt's possible that you might fall into a coma. You might die due to the paralysis of your diaphragm, the collapse of your lungs, or heart attack (any form of respiratory arrest).  \nConsuming this amount of alcohol in a short period of time is dangerous to your health. It is currently a poor idea to drive. You will return to sobriety in more than 20 hours "+drugString+noWater,"Results",JOptionPane.PLAIN_MESSAGE);
													break;
												default:
													JOptionPane.showMessageDialog(null,"After consuming " +drink+ " drinks over the period of "+timeNum+" hours, your BAC as an average male would be above 0.30 grams per milliliter of blood. \nIt's possible that you might fall into a coma. You might die due to the paralysis of your diaphragm, the collapse of your lungs, or heart attack (any form of respiratory arrest).  \nConsuming this amount of alcohol in a short period of time is dangerous to your health. It is currently a poor idea to drive. You will return to sobriety in more than 20 hours "+drugString+noWater,"Results",JOptionPane.PLAIN_MESSAGE);							
													break;
											} 
										} else { //yes food no water yes sleep no drug
											switch (drink) {
											case 1:
												JOptionPane.showMessageDialog(null,"After consuming " +drink+ " drinks over the period of "+timeNum+" hours, your BAC as an average female would be around 0.021 grams per milliliter of blood.\nYou are feeling a little more relaxed while still maintaining your full coordination. \nYou will return to sobriety in about an hour "+noWater,"Results",JOptionPane.PLAIN_MESSAGE);
												break;
											case 2:
												JOptionPane.showMessageDialog(null,"After consuming " +drink+ " drinks over the period of "+timeNum+" hours, your BAC as an average female would be around 0.051 grams per milliliter of blood.\nYou are feeling a bit more relaxed and might have a feeling of well being or euphoria. \nYou will return to sobriety in about 3 hours "+noWater,"Results",JOptionPane.PLAIN_MESSAGE);
												break;
											case 3:
												JOptionPane.showMessageDialog(null,"After consuming " +drink+ " drinks over the period of "+timeNum+" hours, your BAC as an average female would be around 0.081 grams per milliliter of blood.\nYou can definately tell that you are under the influence and your speech, motor skills, balance and judgement are affected. It is currently a poor idea to drive. \nYou will return to sobriety in about 5 hours. "+noWater,"Results",JOptionPane.PLAIN_MESSAGE);
												break;
											case 4:
												JOptionPane.showMessageDialog(null,"After consuming " +drink+ " drinks over the period of "+timeNum+" hours, your BAC as an average female would be around 0.111 grams per milliliter of blood.\nYour speech will be slurred and your balance, vision, reactions time and hearing will be impaired. Your motor coordination will also be significantly impaired and you'll have a loss of good judgment. \nIt is currently a poor idea to drive. You will return to sobriety in about 7 hours "+noWater,"Results",JOptionPane.PLAIN_MESSAGE);
												break;
											case 5:
												JOptionPane.showMessageDialog(null,"After consuming " +drink+ " drinks over the period of "+timeNum+" hours, your BAC as an average female would be around 0.141 grams per milliliter of blood.\nRight now, you'd be feeling gross motor impairment and a lack of physical control. It'd probably be hard for you to type on the keyboard and your monitor or mobile phone screen would appear blurry. \nYour judgment and perception of what’s going on would be severely impaired and any feeling of euphoria you had earlier will have turned to dysphoria. \nIt is currently a poor idea to drive. You will return to sobriety in about 8 hours "+noWater,"Results",JOptionPane.PLAIN_MESSAGE);
												break;
											case 6: 
												JOptionPane.showMessageDialog(null,"After consuming " +drink+ " drinks over the period of "+timeNum+" hours, your BAC as an average female would be around 0.171 grams per milliliter of blood.\nYou'll probably start to feel sick to your stomach. Any euphoria you had earlier will have turned to dysphoria. Right now you might look like a 'sloppy drunk'. \nConsuming this amount of alcohol in a short period of time is dangerous to your health. \nIt is currently a poor idea to drive. You will return to sobriety in about 10 hours "+noWater,"Results",JOptionPane.PLAIN_MESSAGE);
												break;
											case 7: 
												JOptionPane.showMessageDialog(null,"After consuming " +drink+ " drinks over the period of "+timeNum+" hours, your BAC as an average female would be around 0.201 grams per milliliter of blood.\nYou'll probably need help if you want to walk properly. If you fall down you probably won't feel a lot of pain – even if you hurt yourself. At this level of BAC, some people begin to vomit. At the very least, you'll feel dazed, confused and disoriented. \nConsuming this amount of alcohol in a short period of time is dangerous to your health. \nIt is currently a poor idea to drive. You will return to sobriety in about 12 hours "+noWater,"Results",JOptionPane.PLAIN_MESSAGE);
												break;
											case 8: 
												JOptionPane.showMessageDialog(null,"After consuming " +drink+ " drinks over the period of "+timeNum+" hours, your BAC as an average female would be around 0.23 grams per milliliter of blood. \nIf you were awake at this point you'd have very little comprehension as to where you were or what you were doing. You might pass out suddenly and it'd be hard to wake you up. \nConsuming this amount of alcohol in a short period of time is dangerous to your health. It is currently a poor idea to drive. You will return to sobriety in about 14 hours "+noWater,"Results",JOptionPane.PLAIN_MESSAGE);
												break;
											case 9:
												JOptionPane.showMessageDialog(null,"After consuming " +drink+ " drinks over the period of "+timeNum+" hours, your BAC as an average female would be around 0.26 grams per milliliter of blood. \nIf you were awake at this point you'd have very little comprehension as to where you were or what you were doing. You might pass out suddenly and it'd be hard to wake you up. \nConsuming this amount of alcohol in a short period of time is dangerous to your health. It is currently a poor idea to drive. You will return to sobriety in about 16 hours "+noWater,"Results",JOptionPane.PLAIN_MESSAGE);
												break;
											case 10:
												JOptionPane.showMessageDialog(null,"After consuming " +drink+ " drinks over the period of "+timeNum+" hours, your BAC as an average female would be around 0.29 grams per milliliter of blood. \nIf you were awake at this point you'd have very little comprehension as to where you were or what you were doing. You might pass out suddenly and it'd be hard to wake you up. \nConsuming this amount of alcohol in a short period of time is dangerous to your health. It is currently a poor idea to drive. You will return to sobriety in about 17 hours "+noWater,"Results",JOptionPane.PLAIN_MESSAGE);
												break;
											case 11:
												JOptionPane.showMessageDialog(null,"After consuming " +drink+ " drinks over the period of "+timeNum+" hours, your BAC as an average female would be around 0.32 grams per milliliter of blood. \nIt's possible that you might fall into a coma. You might die due to the paralysis of your diaphragm, the collapse of your lungs, or heart attack (any form of respiratory arrest). \nConsuming this amount of alcohol in a short period of time is dangerous to your health. It is currently a poor idea to drive. You will return to sobriety in about 19 hours "+noWater,"Results",JOptionPane.PLAIN_MESSAGE);
												break;
											case 12:
												JOptionPane.showMessageDialog(null,"After consuming " +drink+ " drinks over the period of "+timeNum+" hours, your BAC as an average female would be around 0.35 grams per milliliter of blood. \nIt's possible that you might fall into a coma. You might die due to the paralysis of your diaphragm, the collapse of your lungs, or heart attack (any form of respiratory arrest). \nConsuming this amount of alcohol in a short period of time is dangerous to your health. It is currently a poor idea to drive. You will return to sobriety in more than 20 hours "+noWater,"Results",JOptionPane.PLAIN_MESSAGE);
												break;
											case 13:
												JOptionPane.showMessageDialog(null,"After consuming " +drink+ " drinks over the period of "+timeNum+" hours, your BAC as an average female would be around 0.38 grams per milliliter of blood. \nIt's possible that you might fall into a coma. You might die due to the paralysis of your diaphragm, the collapse of your lungs, or heart attack (any form of respiratory arrest). \nConsuming this amount of alcohol in a short period of time is dangerous to your health. It is currently a poor idea to drive. You will return to sobriety in more than 20 hours "+noWater,"Results",JOptionPane.PLAIN_MESSAGE);
												break;
											case 14:
												JOptionPane.showMessageDialog(null,"After consuming " +drink+ " drinks over the period of "+timeNum+" hours, your BAC as an average female would be around 0.41 grams per milliliter of blood. \nIt's possible that you might fall into a coma. You might die due to the paralysis of your diaphragm, the collapse of your lungs, or heart attack (any form of respiratory arrest). \nConsuming this amount of alcohol in a short period of time is dangerous to your health. It is currently a poor idea to drive. You will return to sobriety in more than 20 hours "+noWater,"Results",JOptionPane.PLAIN_MESSAGE);
												break;
											case 15:
												JOptionPane.showMessageDialog(null,"After consuming " +drink+ " drinks over the period of "+timeNum+" hours, your BAC as an average female would be around 0.44 grams per milliliter of blood. \nIt's possible that you might fall into a coma. You might die due to the paralysis of your diaphragm, the collapse of your lungs, or heart attack (any form of respiratory arrest).  \nConsuming this amount of alcohol in a short period of time is dangerous to your health. It is currently a poor idea to drive. You will return to sobriety in more than 20 hours "+noWater,"Results",JOptionPane.PLAIN_MESSAGE);
												break;
											case 16:
												JOptionPane.showMessageDialog(null,"After consuming " +drink+ " drinks over the period of "+timeNum+" hours, your BAC as an average female would be around 0.469 grams per milliliter of blood. \nIt's possible that you might fall into a coma. You might die due to the paralysis of your diaphragm, the collapse of your lungs, or heart attack (any form of respiratory arrest).  \nConsuming this amount of alcohol in a short period of time is dangerous to your health. It is currently a poor idea to drive. You will return to sobriety in more than 20 hours "+noWater,"Results",JOptionPane.PLAIN_MESSAGE);
												break;
											case 17:
												JOptionPane.showMessageDialog(null,"After consuming " +drink+ " drinks over the period of "+timeNum+" hours, your BAC as an average female would be around 0.499 grams per milliliter of blood. \nIt's possible that you might fall into a coma. You might die due to the paralysis of your diaphragm, the collapse of your lungs, or heart attack (any form of respiratory arrest).  \nConsuming this amount of alcohol in a short period of time is dangerous to your health. It is currently a poor idea to drive. You will return to sobriety in more than 20 hours "+noWater,"Results",JOptionPane.PLAIN_MESSAGE);
												break;
											default:
												JOptionPane.showMessageDialog(null,"After consuming " +drink+ " drinks over the period of "+timeNum+" hours, your BAC as an average female would be above 0.50 grams per milliliter of blood. \nIt's possible that you might fall into a coma. You might die due to the paralysis of your diaphragm, the collapse of your lungs, or heart attack (any form of respiratory arrest).  \nConsuming this amount of alcohol in a short period of time is dangerous to your health. It is currently a poor idea to drive. You will return to sobriety in more than 20 hours "+noWater,"Results",JOptionPane.PLAIN_MESSAGE);							
												break;
										}
										}
												
											} /*no sleep*/ else {
												if (drug == true) { //yes food no water no sleep yes drug
													switch (drink) {
													case 1:
														JOptionPane.showMessageDialog(null,"After consuming " +drink+ " drinks over the period of "+timeNum+" hours, your BAC as an average female would be around 0.021 grams per milliliter of blood.\nYou are feeling a little more relaxed while still maintaining your full coordination. \nYou will return to sobriety in about an hour "+noSleep + drugString+noWater,"Results",JOptionPane.PLAIN_MESSAGE);
														break;
													case 2:
														JOptionPane.showMessageDialog(null,"After consuming " +drink+ " drinks over the period of "+timeNum+" hours, your BAC as an average female would be around 0.051 grams per milliliter of blood.\nYou are feeling a bit more relaxed and might have a feeling of well being or euphoria. \nYou will return to sobriety in about 3 hours "+noSleep+ drugString+noWater,"Results",JOptionPane.PLAIN_MESSAGE);
														break;
													case 3:
														JOptionPane.showMessageDialog(null,"After consuming " +drink+ " drinks over the period of "+timeNum+" hours, your BAC as an average female would be around 0.081 grams per milliliter of blood.\nYou can definately tell that you are under the influence and your speech, motor skills, balance and judgement are affected. It is currently a poor idea to drive. \nYou will return to sobriety in about 5 hours. "+noSleep+ drugString+noWater,"Results",JOptionPane.PLAIN_MESSAGE);
														break;
													case 4:
														JOptionPane.showMessageDialog(null,"After consuming " +drink+ " drinks over the period of "+timeNum+" hours, your BAC as an average female would be around 0.111 grams per milliliter of blood.\nYour speech will be slurred and your balance, vision, reactions time and hearing will be impaired. Your motor coordination will also be significantly impaired and you'll have a loss of good judgment. \nIt is currently a poor idea to drive. You will return to sobriety in about 7 hours "+noSleep+ drugString+noWater,"Results",JOptionPane.PLAIN_MESSAGE);
														break;
													case 5:
														JOptionPane.showMessageDialog(null,"After consuming " +drink+ " drinks over the period of "+timeNum+" hours, your BAC as an average female would be around 0.141 grams per milliliter of blood.\nRight now, you'd be feeling gross motor impairment and a lack of physical control. It'd probably be hard for you to type on the keyboard and your monitor or mobile phone screen would appear blurry. \nYour judgment and perception of what’s going on would be severely impaired and any feeling of euphoria you had earlier will have turned to dysphoria. \nIt is currently a poor idea to drive. You will return to sobriety in about 8 hours "+noSleep+ drugString+noWater,"Results",JOptionPane.PLAIN_MESSAGE);
														break;
													case 6: 
														JOptionPane.showMessageDialog(null,"After consuming " +drink+ " drinks over the period of "+timeNum+" hours, your BAC as an average female would be around 0.171 grams per milliliter of blood.\nYou'll probably start to feel sick to your stomach. Any euphoria you had earlier will have turned to dysphoria. Right now you might look like a 'sloppy drunk'. \nConsuming this amount of alcohol in a short period of time is dangerous to your health. \nIt is currently a poor idea to drive. You will return to sobriety in about 10 hours "+noSleep+ drugString+noWater,"Results",JOptionPane.PLAIN_MESSAGE);
														break;
													case 7: 
														JOptionPane.showMessageDialog(null,"After consuming " +drink+ " drinks over the period of "+timeNum+" hours, your BAC as an average female would be around 0.201 grams per milliliter of blood.\nYou'll probably need help if you want to walk properly. If you fall down you probably won't feel a lot of pain – even if you hurt yourself. At this level of BAC, some people begin to vomit. At the very least, you'll feel dazed, confused and disoriented. \nConsuming this amount of alcohol in a short period of time is dangerous to your health. \nIt is currently a poor idea to drive. You will return to sobriety in about 12 hours "+noSleep+ drugString+noWater,"Results",JOptionPane.PLAIN_MESSAGE);
														break;
													case 8: 
														JOptionPane.showMessageDialog(null,"After consuming " +drink+ " drinks over the period of "+timeNum+" hours, your BAC as an average female would be around 0.23 grams per milliliter of blood. \nIf you were awake at this point you'd have very little comprehension as to where you were or what you were doing. You might pass out suddenly and it'd be hard to wake you up. \nConsuming this amount of alcohol in a short period of time is dangerous to your health. It is currently a poor idea to drive. You will return to sobriety in about 14 hours "+noSleep+ drugString+noWater,"Results",JOptionPane.PLAIN_MESSAGE);
														break;
													case 9:
														JOptionPane.showMessageDialog(null,"After consuming " +drink+ " drinks over the period of "+timeNum+" hours, your BAC as an average female would be around 0.26 grams per milliliter of blood. \nIf you were awake at this point you'd have very little comprehension as to where you were or what you were doing. You might pass out suddenly and it'd be hard to wake you up. \nConsuming this amount of alcohol in a short period of time is dangerous to your health. It is currently a poor idea to drive. You will return to sobriety in about 16 hours "+noSleep+ drugString+noWater,"Results",JOptionPane.PLAIN_MESSAGE);
														break;
													case 10:
														JOptionPane.showMessageDialog(null,"After consuming " +drink+ " drinks over the period of "+timeNum+" hours, your BAC as an average female would be around 0.29 grams per milliliter of blood. \nIf you were awake at this point you'd have very little comprehension as to where you were or what you were doing. You might pass out suddenly and it'd be hard to wake you up. \nConsuming this amount of alcohol in a short period of time is dangerous to your health. It is currently a poor idea to drive. You will return to sobriety in about 17 hours "+noSleep+ drugString+noWater,"Results",JOptionPane.PLAIN_MESSAGE);
														break;
													case 11:
														JOptionPane.showMessageDialog(null,"After consuming " +drink+ " drinks over the period of "+timeNum+" hours, your BAC as an average female would be around 0.32 grams per milliliter of blood. \nIt's possible that you might fall into a coma. You might die due to the paralysis of your diaphragm, the collapse of your lungs, or heart attack (any form of respiratory arrest). \nConsuming this amount of alcohol in a short period of time is dangerous to your health. It is currently a poor idea to drive. You will return to sobriety in about 19 hours "+noSleep+ drugString+noWater,"Results",JOptionPane.PLAIN_MESSAGE);
														break;
													case 12:
														JOptionPane.showMessageDialog(null,"After consuming " +drink+ " drinks over the period of "+timeNum+" hours, your BAC as an average female would be around 0.35 grams per milliliter of blood. \nIt's possible that you might fall into a coma. You might die due to the paralysis of your diaphragm, the collapse of your lungs, or heart attack (any form of respiratory arrest). \nConsuming this amount of alcohol in a short period of time is dangerous to your health. It is currently a poor idea to drive. You will return to sobriety in more than 20 hours "+noSleep+ drugString+noWater,"Results",JOptionPane.PLAIN_MESSAGE);
														break;
													case 13:
														JOptionPane.showMessageDialog(null,"After consuming " +drink+ " drinks over the period of "+timeNum+" hours, your BAC as an average female would be around 0.38 grams per milliliter of blood. \nIt's possible that you might fall into a coma. You might die due to the paralysis of your diaphragm, the collapse of your lungs, or heart attack (any form of respiratory arrest). \nConsuming this amount of alcohol in a short period of time is dangerous to your health. It is currently a poor idea to drive. You will return to sobriety in more than 20 hours "+noSleep+ drugString+noWater,"Results",JOptionPane.PLAIN_MESSAGE);
														break;
													case 14:
														JOptionPane.showMessageDialog(null,"After consuming " +drink+ " drinks over the period of "+timeNum+" hours, your BAC as an average female would be around 0.41 grams per milliliter of blood. \nIt's possible that you might fall into a coma. You might die due to the paralysis of your diaphragm, the collapse of your lungs, or heart attack (any form of respiratory arrest). \nConsuming this amount of alcohol in a short period of time is dangerous to your health. It is currently a poor idea to drive. You will return to sobriety in more than 20 hours "+noSleep+ drugString+noWater,"Results",JOptionPane.PLAIN_MESSAGE);
														break;
													case 15:
														JOptionPane.showMessageDialog(null,"After consuming " +drink+ " drinks over the period of "+timeNum+" hours, your BAC as an average female would be around 0.44 grams per milliliter of blood. \nIt's possible that you might fall into a coma. You might die due to the paralysis of your diaphragm, the collapse of your lungs, or heart attack (any form of respiratory arrest).  \nConsuming this amount of alcohol in a short period of time is dangerous to your health. It is currently a poor idea to drive. You will return to sobriety in more than 20 hours "+noSleep+ drugString+noWater,"Results",JOptionPane.PLAIN_MESSAGE);
														break;
													case 16:
														JOptionPane.showMessageDialog(null,"After consuming " +drink+ " drinks over the period of "+timeNum+" hours, your BAC as an average female would be around 0.469 grams per milliliter of blood. \nIt's possible that you might fall into a coma. You might die due to the paralysis of your diaphragm, the collapse of your lungs, or heart attack (any form of respiratory arrest).  \nConsuming this amount of alcohol in a short period of time is dangerous to your health. It is currently a poor idea to drive. You will return to sobriety in more than 20 hours "+noSleep+ drugString+noWater,"Results",JOptionPane.PLAIN_MESSAGE);
														break;
													case 17:
														JOptionPane.showMessageDialog(null,"After consuming " +drink+ " drinks over the period of "+timeNum+" hours, your BAC as an average female would be around 0.499 grams per milliliter of blood. \nIt's possible that you might fall into a coma. You might die due to the paralysis of your diaphragm, the collapse of your lungs, or heart attack (any form of respiratory arrest).  \nConsuming this amount of alcohol in a short period of time is dangerous to your health. It is currently a poor idea to drive. You will return to sobriety in more than 20 hours "+noSleep+ drugString+noWater,"Results",JOptionPane.PLAIN_MESSAGE);
														break;
													default:
														JOptionPane.showMessageDialog(null,"After consuming " +drink+ " drinks over the period of "+timeNum+" hours, your BAC as an average female would be above 0.50 grams per milliliter of blood. \nIt's possible that you might fall into a coma. You might die due to the paralysis of your diaphragm, the collapse of your lungs, or heart attack (any form of respiratory arrest).  \nConsuming this amount of alcohol in a short period of time is dangerous to your health. It is currently a poor idea to drive. You will return to sobriety in more than 20 hours "+noSleep+ drugString+noWater,"Results",JOptionPane.PLAIN_MESSAGE);							
														break;
													}
												} else { //yes food no water no sleep no drug
												switch (drink) { 
												case 1:
													JOptionPane.showMessageDialog(null,"After consuming " +drink+ " drinks over the period of "+timeNum+" hours, your BAC as an average female would be around 0.021 grams per milliliter of blood.\nYou are feeling a little more relaxed while still maintaining your full coordination. \nYou will return to sobriety in about an hour "+noSleep+noWater,"Results",JOptionPane.PLAIN_MESSAGE);
													break;
												case 2:
													JOptionPane.showMessageDialog(null,"After consuming " +drink+ " drinks over the period of "+timeNum+" hours, your BAC as an average female would be around 0.051 grams per milliliter of blood.\nYou are feeling a bit more relaxed and might have a feeling of well being or euphoria. \nYou will return to sobriety in about 3 hours "+noSleep+noWater,"Results",JOptionPane.PLAIN_MESSAGE);
													break;
												case 3:
													JOptionPane.showMessageDialog(null,"After consuming " +drink+ " drinks over the period of "+timeNum+" hours, your BAC as an average female would be around 0.081 grams per milliliter of blood.\nYou can definately tell that you are under the influence and your speech, motor skills, balance and judgement are affected. It is currently a poor idea to drive. \nYou will return to sobriety in about 5 hours. "+noSleep+noWater,"Results",JOptionPane.PLAIN_MESSAGE);
													break;
												case 4:
													JOptionPane.showMessageDialog(null,"After consuming " +drink+ " drinks over the period of "+timeNum+" hours, your BAC as an average female would be around 0.111 grams per milliliter of blood.\nYour speech will be slurred and your balance, vision, reactions time and hearing will be impaired. Your motor coordination will also be significantly impaired and you'll have a loss of good judgment. \nIt is currently a poor idea to drive. You will return to sobriety in about 7 hours "+noSleep+noWater,"Results",JOptionPane.PLAIN_MESSAGE);
													break;
												case 5:
													JOptionPane.showMessageDialog(null,"After consuming " +drink+ " drinks over the period of "+timeNum+" hours, your BAC as an average female would be around 0.141 grams per milliliter of blood.\nRight now, you'd be feeling gross motor impairment and a lack of physical control. It'd probably be hard for you to type on the keyboard and your monitor or mobile phone screen would appear blurry. \nYour judgment and perception of what’s going on would be severely impaired and any feeling of euphoria you had earlier will have turned to dysphoria. \nIt is currently a poor idea to drive. You will return to sobriety in about 8 hours "+noSleep+noWater,"Results",JOptionPane.PLAIN_MESSAGE);
													break;
												case 6: 
													JOptionPane.showMessageDialog(null,"After consuming " +drink+ " drinks over the period of "+timeNum+" hours, your BAC as an average female would be around 0.171 grams per milliliter of blood.\nYou'll probably start to feel sick to your stomach. Any euphoria you had earlier will have turned to dysphoria. Right now you might look like a 'sloppy drunk'. \nConsuming this amount of alcohol in a short period of time is dangerous to your health. \nIt is currently a poor idea to drive. You will return to sobriety in about 10 hours "+noSleep+noWater,"Results",JOptionPane.PLAIN_MESSAGE);
													break;
												case 7: 
													JOptionPane.showMessageDialog(null,"After consuming " +drink+ " drinks over the period of "+timeNum+" hours, your BAC as an average female would be around 0.201 grams per milliliter of blood.\nYou'll probably need help if you want to walk properly. If you fall down you probably won't feel a lot of pain – even if you hurt yourself. At this level of BAC, some people begin to vomit. At the very least, you'll feel dazed, confused and disoriented. \nConsuming this amount of alcohol in a short period of time is dangerous to your health. \nIt is currently a poor idea to drive. You will return to sobriety in about 12 hours "+noSleep+noWater,"Results",JOptionPane.PLAIN_MESSAGE);
													break;
												case 8: 
													JOptionPane.showMessageDialog(null,"After consuming " +drink+ " drinks over the period of "+timeNum+" hours, your BAC as an average female would be around 0.23 grams per milliliter of blood. \nIf you were awake at this point you'd have very little comprehension as to where you were or what you were doing. You might pass out suddenly and it'd be hard to wake you up. \nConsuming this amount of alcohol in a short period of time is dangerous to your health. It is currently a poor idea to drive. You will return to sobriety in about 14 hours "+noSleep+noWater,"Results",JOptionPane.PLAIN_MESSAGE);
													break;
												case 9:
													JOptionPane.showMessageDialog(null,"After consuming " +drink+ " drinks over the period of "+timeNum+" hours, your BAC as an average female would be around 0.26 grams per milliliter of blood. \nIf you were awake at this point you'd have very little comprehension as to where you were or what you were doing. You might pass out suddenly and it'd be hard to wake you up. \nConsuming this amount of alcohol in a short period of time is dangerous to your health. It is currently a poor idea to drive. You will return to sobriety in about 16 hours "+noSleep+noWater,"Results",JOptionPane.PLAIN_MESSAGE);
													break;
												case 10:
													JOptionPane.showMessageDialog(null,"After consuming " +drink+ " drinks over the period of "+timeNum+" hours, your BAC as an average female would be around 0.29 grams per milliliter of blood. \nIf you were awake at this point you'd have very little comprehension as to where you were or what you were doing. You might pass out suddenly and it'd be hard to wake you up. \nConsuming this amount of alcohol in a short period of time is dangerous to your health. It is currently a poor idea to drive. You will return to sobriety in about 17 hours "+noSleep+noWater,"Results",JOptionPane.PLAIN_MESSAGE);
													break;
												case 11:
													JOptionPane.showMessageDialog(null,"After consuming " +drink+ " drinks over the period of "+timeNum+" hours, your BAC as an average female would be around 0.32 grams per milliliter of blood. \nIt's possible that you might fall into a coma. You might die due to the paralysis of your diaphragm, the collapse of your lungs, or heart attack (any form of respiratory arrest). \nConsuming this amount of alcohol in a short period of time is dangerous to your health. It is currently a poor idea to drive. You will return to sobriety in about 19 hours "+noSleep+noWater,"Results",JOptionPane.PLAIN_MESSAGE);
													break;
												case 12:
													JOptionPane.showMessageDialog(null,"After consuming " +drink+ " drinks over the period of "+timeNum+" hours, your BAC as an average female would be around 0.35 grams per milliliter of blood. \nIt's possible that you might fall into a coma. You might die due to the paralysis of your diaphragm, the collapse of your lungs, or heart attack (any form of respiratory arrest). \nConsuming this amount of alcohol in a short period of time is dangerous to your health. It is currently a poor idea to drive. You will return to sobriety in more than 20 hours "+noSleep+noWater,"Results",JOptionPane.PLAIN_MESSAGE);
													break;
												case 13:
													JOptionPane.showMessageDialog(null,"After consuming " +drink+ " drinks over the period of "+timeNum+" hours, your BAC as an average female would be around 0.38 grams per milliliter of blood. \nIt's possible that you might fall into a coma. You might die due to the paralysis of your diaphragm, the collapse of your lungs, or heart attack (any form of respiratory arrest). \nConsuming this amount of alcohol in a short period of time is dangerous to your health. It is currently a poor idea to drive. You will return to sobriety in more than 20 hours "+noSleep+noWater,"Results",JOptionPane.PLAIN_MESSAGE);
													break;
												case 14:
													JOptionPane.showMessageDialog(null,"After consuming " +drink+ " drinks over the period of "+timeNum+" hours, your BAC as an average female would be around 0.41 grams per milliliter of blood. \nIt's possible that you might fall into a coma. You might die due to the paralysis of your diaphragm, the collapse of your lungs, or heart attack (any form of respiratory arrest). \nConsuming this amount of alcohol in a short period of time is dangerous to your health. It is currently a poor idea to drive. You will return to sobriety in more than 20 hours "+noSleep+noWater,"Results",JOptionPane.PLAIN_MESSAGE);
													break;
												case 15:
													JOptionPane.showMessageDialog(null,"After consuming " +drink+ " drinks over the period of "+timeNum+" hours, your BAC as an average female would be around 0.44 grams per milliliter of blood. \nIt's possible that you might fall into a coma. You might die due to the paralysis of your diaphragm, the collapse of your lungs, or heart attack (any form of respiratory arrest).  \nConsuming this amount of alcohol in a short period of time is dangerous to your health. It is currently a poor idea to drive. You will return to sobriety in more than 20 hours "+noSleep+noWater,"Results",JOptionPane.PLAIN_MESSAGE);
													break;
												case 16:
													JOptionPane.showMessageDialog(null,"After consuming " +drink+ " drinks over the period of "+timeNum+" hours, your BAC as an average female would be around 0.469 grams per milliliter of blood. \nIt's possible that you might fall into a coma. You might die due to the paralysis of your diaphragm, the collapse of your lungs, or heart attack (any form of respiratory arrest).  \nConsuming this amount of alcohol in a short period of time is dangerous to your health. It is currently a poor idea to drive. You will return to sobriety in more than 20 hours "+noSleep+noWater,"Results",JOptionPane.PLAIN_MESSAGE);
													break;
												case 17:
													JOptionPane.showMessageDialog(null,"After consuming " +drink+ " drinks over the period of "+timeNum+" hours, your BAC as an average female would be around 0.499 grams per milliliter of blood. \nIt's possible that you might fall into a coma. You might die due to the paralysis of your diaphragm, the collapse of your lungs, or heart attack (any form of respiratory arrest).  \nConsuming this amount of alcohol in a short period of time is dangerous to your health. It is currently a poor idea to drive. You will return to sobriety in more than 20 hours "+noSleep+noWater,"Results",JOptionPane.PLAIN_MESSAGE);
													break;
												default:
													JOptionPane.showMessageDialog(null,"After consuming " +drink+ " drinks over the period of "+timeNum+" hours, your BAC as an average female would be above 0.50 grams per milliliter of blood. \nIt's possible that you might fall into a coma. You might die due to the paralysis of your diaphragm, the collapse of your lungs, or heart attack (any form of respiratory arrest).  \nConsuming this amount of alcohol in a short period of time is dangerous to your health. It is currently a poor idea to drive. You will return to sobriety in more than 20 hours "+noSleep+noWater,"Results",JOptionPane.PLAIN_MESSAGE);							
													break;
											}
											} 
										}
								}	 
							} /*no food yes water yes sleep yes drug*/ else {					
								if (water == true) { //drank water
									if (sleep == true) { //slept well
										if (drug == true) { //on medication
											switch (drink) {//no food yes water yes sleep yes drug
												case 1: 
													JOptionPane.showMessageDialog(null,"After consuming " +drink+ " drinks over the period of "+timeNum+" hours, your BAC as an average female would be around 0.021 grams per milliliter of blood.\nYou are feeling a little more relaxed while still maintaining your full coordination. \nYou will return to sobriety in about an hour "+drugString+noFood,"Results",JOptionPane.PLAIN_MESSAGE);
													break;
												case 2:
													JOptionPane.showMessageDialog(null,"After consuming " +drink+ " drinks over the period of "+timeNum+" hours, your BAC as an average male would be around 0.034 grams per milliliter of blood.\nYou are feeling a little more relaxed while still maintaining your full coordination. \nYou will return to sobriety in a bit "+drugString+noFood,"Results",JOptionPane.PLAIN_MESSAGE);
													break;
												case 3:
													JOptionPane.showMessageDialog(null,"After consuming " +drink+ " drinks over the period of "+timeNum+" hours, your BAC as an average female would be around 0.081 grams per milliliter of blood.\nYou can definately tell that you are under the influence and your speech, motor skills, balance and judgement are affected. It is currently a poor idea to drive. \nYou will return to sobriety in about 5 hours.  "+drugString+noFood,"Results",JOptionPane.PLAIN_MESSAGE);
													break;
												case 4:
													JOptionPane.showMessageDialog(null,"After consuming " +drink+ " drinks over the period of "+timeNum+" hours, your BAC as an average male would be around 0.069 grams per milliliter of blood.\nYou are feeling a bit more relaxed and might have a feeling of well being or euphoria. It is currently a poor idea to drive. \n You will return to sobriety in about 5 hours "+drugString+noFood,"Results",JOptionPane.PLAIN_MESSAGE);
													break;
												case 5:
													JOptionPane.showMessageDialog(null,"After consuming " +drink+ " drinks over the period of "+timeNum+" hours, your BAC as an average male would be around 0.090 grams per milliliter of blood.\nYou can definately tell that you are under the influence and your speech, motor skills, balance and judgement are affected. It is currently a poor idea to drive. \n You will return to sobriety in about 7 hours "+drugString+noFood,"Results",JOptionPane.PLAIN_MESSAGE);
													break;
												case 6: 
													JOptionPane.showMessageDialog(null,"After consuming " +drink+ " drinks over the period of "+timeNum+" hours, your BAC as an average male would be around 0.112 grams per milliliter of blood.\nYour speech will be slurred and your balance, vision, reactions time and hearing will be impaired. Your motor coordination will also be significantly impaired and you'll have a loss of good judgment. \nIt is currently a poor idea to drive. You will return to sobriety in about 8 hours "+drugString+noFood,"Results",JOptionPane.PLAIN_MESSAGE);
													break;
												case 7: 
													JOptionPane.showMessageDialog(null,"After consuming " +drink+ " drinks over the period of "+timeNum+" hours, your BAC as an average male would be around 0.133 grams per milliliter of blood.\nRight now, you'd be feeling gross motor impairment and a lack of physical control. It'd probably be hard for you to type on the keyboard and your monitor or mobile phone screen would appear blurry. \nYour judgment and perception of what’s going on would be severely impaired and any feeling of euphoria you had earlier will have turned to dysphoria. \nIt is currently a poor idea to drive. You will return to sobriety in about 10 hours "+drugString+noFood,"Results",JOptionPane.PLAIN_MESSAGE);
													break;
												case 8: 
													JOptionPane.showMessageDialog(null,"After consuming " +drink+ " drinks over the period of "+timeNum+" hours, your BAC as an average male would be around 0.155 grams per milliliter of blood. \nYou'll probably start to feel sick to your stomach. Any euphoria you had earlier will have turned to dysphoria. Right now you might look like a 'sloppy drunk'. \nConsuming this amount of alcohol in a short period of time is dangerous to your health. It is currently a poor idea to drive. You will return to sobriety in about 11 hours "+drugString+noFood,"Results",JOptionPane.PLAIN_MESSAGE);
													break;
												case 9:
													JOptionPane.showMessageDialog(null,"After consuming " +drink+ " drinks over the period of "+timeNum+" hours, your BAC as an average male would be around 0.176 grams per milliliter of blood. \nYou'll probably start to feel sick to your stomach. Any euphoria you had earlier will have turned to dysphoria. Right now you might look like a 'sloppy drunk'. \nConsuming this amount of alcohol in a short period of time is dangerous to your health. It is currently a poor idea to drive. You will return to sobriety in about 13 hours "+drugString+noFood,"Results",JOptionPane.PLAIN_MESSAGE);
													break;
												case 10:
													JOptionPane.showMessageDialog(null,"After consuming " +drink+ " drinks over the period of "+timeNum+" hours, your BAC as an average male would be around 0.198 grams per milliliter of blood. \nYou'll probably need help if you want to walk properly. If you fall down you probably won't feel a lot of pain – even if you hurt yourself. At this level of BAC, some people begin to vomit. At the very least, you'll feel dazed, confused and disoriented. \nConsuming this amount of alcohol in a short period of time is dangerous to your health. It is currently a poor idea to drive. You will return to sobriety in about 14 hours "+drugString+noFood,"Results",JOptionPane.PLAIN_MESSAGE);
													break;
												case 11:
													JOptionPane.showMessageDialog(null,"After consuming " +drink+ " drinks over the period of "+timeNum+" hours, your BAC as an average male would be around 0.219 grams per milliliter of blood. \nIf you were awake at this point you'd have very little comprehension as to where you were or what you were doing. You might pass out suddenly and it'd be hard to wake you up. \nConsuming this amount of alcohol in a short period of time is dangerous to your health. It is currently a poor idea to drive. You will return to sobriety in about 16 hours "+drugString+noFood,"Results",JOptionPane.PLAIN_MESSAGE);
													break;
												case 12:
													JOptionPane.showMessageDialog(null,"After consuming " +drink+ " drinks over the period of "+timeNum+" hours, your BAC as an average male would be around 0.240 grams per milliliter of blood. \nIf you were awake at this point you'd have very little comprehension as to where you were or what you were doing. You might pass out suddenly and it'd be hard to wake you up. \nConsuming this amount of alcohol in a short period of time is dangerous to your health. It is currently a poor idea to drive. You will return to sobriety in about 17 hours "+drugString+noFood,"Results",JOptionPane.PLAIN_MESSAGE);
													break;
												case 13:
													JOptionPane.showMessageDialog(null,"After consuming " +drink+ " drinks over the period of "+timeNum+" hours, your BAC as an average female would be around 0.38 grams per milliliter of blood. \nIt's possible that you might fall into a coma. You might die due to the paralysis of your diaphragm, the collapse of your lungs, or heart attack (any form of respiratory arrest). \nConsuming this amount of alcohol in a short period of time is dangerous to your health. It is currently a poor idea to drive. You will return to sobriety in more than 20 hours  You will return to sobriety in about 19 hours "+drugString+noFood,"Results",JOptionPane.PLAIN_MESSAGE);
													break;
												case 14:
													JOptionPane.showMessageDialog(null,"After consuming " +drink+ " drinks over the period of "+timeNum+" hours, your BAC as an average male would be around 0.283 grams per milliliter of blood. \nIf you were awake at this point you'd have very little comprehension as to where you were or what you were doing. You might pass out suddenly and it'd be hard to wake you up. \nConsuming this amount of alcohol in a short period of time is dangerous to your health. It is currently a poor idea to drive. You will return to sobriety in more than 20 hours "+drugString+noFood,"Results",JOptionPane.PLAIN_MESSAGE);
													break;
												case 15:
													JOptionPane.showMessageDialog(null,"After consuming " +drink+ " drinks over the period of "+timeNum+" hours, your BAC as an average male would be around 0.305 grams per milliliter of blood. \nIt's possible that you might fall into a coma. You might die due to the paralysis of your diaphragm, the collapse of your lungs, or heart attack (any form of respiratory arrest).  \nConsuming this amount of alcohol in a short period of time is dangerous to your health. It is currently a poor idea to drive. You will return to sobriety in more than 20 hours "+drugString+noFood,"Results",JOptionPane.PLAIN_MESSAGE);
													break;
												case 16:
													JOptionPane.showMessageDialog(null,"After consuming " +drink+ " drinks over the period of "+timeNum+" hours, your BAC as an average male would be around 0.326 grams per milliliter of blood. \nIt's possible that you might fall into a coma. You might die due to the paralysis of your diaphragm, the collapse of your lungs, or heart attack (any form of respiratory arrest).  \nConsuming this amount of alcohol in a short period of time is dangerous to your health. It is currently a poor idea to drive. You will return to sobriety in more than 20 hours "+drugString+noFood,"Results",JOptionPane.PLAIN_MESSAGE);
													break;
												case 17:
													JOptionPane.showMessageDialog(null,"After consuming " +drink+ " drinks over the period of "+timeNum+" hours, your BAC as an average male would be around 0.348 grams per milliliter of blood. \nIt's possible that you might fall into a coma. You might die due to the paralysis of your diaphragm, the collapse of your lungs, or heart attack (any form of respiratory arrest).  \nConsuming this amount of alcohol in a short period of time is dangerous to your health. It is currently a poor idea to drive. You will return to sobriety in more than 20 hours "+drugString+noFood,"Results",JOptionPane.PLAIN_MESSAGE);
													break;
												default:
													JOptionPane.showMessageDialog(null,"After consuming " +drink+ " drinks over the period of "+timeNum+" hours, your BAC as an average male would be above 0.30 grams per milliliter of blood. \nIt's possible that you might fall into a coma. You might die due to the paralysis of your diaphragm, the collapse of your lungs, or heart attack (any form of respiratory arrest).  \nConsuming this amount of alcohol in a short period of time is dangerous to your health. It is currently a poor idea to drive. You will return to sobriety in more than 20 hours "+drugString+noFood,"Results",JOptionPane.PLAIN_MESSAGE);							
													break;
											} 
										} else { //no food yes water yes sleep no drug
											switch (drink) {
											case 1:
												JOptionPane.showMessageDialog(null,"After consuming " +drink+ " drinks over the period of "+timeNum+" hours, your BAC as an average female would be around 0.021 grams per milliliter of blood.\nYou are feeling a little more relaxed while still maintaining your full coordination. \nYou will return to sobriety in about an hour "+noFood,"Results",JOptionPane.PLAIN_MESSAGE);
												break;
											case 2:
												JOptionPane.showMessageDialog(null,"After consuming " +drink+ " drinks over the period of "+timeNum+" hours, your BAC as an average female would be around 0.051 grams per milliliter of blood.\nYou are feeling a bit more relaxed and might have a feeling of well being or euphoria. \nYou will return to sobriety in about 3 hours "+noFood,"Results",JOptionPane.PLAIN_MESSAGE);
												break;
											case 3:
												JOptionPane.showMessageDialog(null,"After consuming " +drink+ " drinks over the period of "+timeNum+" hours, your BAC as an average female would be around 0.081 grams per milliliter of blood.\nYou can definately tell that you are under the influence and your speech, motor skills, balance and judgement are affected. It is currently a poor idea to drive. \nYou will return to sobriety in about 5 hours. ","Results",JOptionPane.PLAIN_MESSAGE);
												break;
											case 4:
												JOptionPane.showMessageDialog(null,"After consuming " +drink+ " drinks over the period of "+timeNum+" hours, your BAC as an average female would be around 0.111 grams per milliliter of blood.\nYour speech will be slurred and your balance, vision, reactions time and hearing will be impaired. Your motor coordination will also be significantly impaired and you'll have a loss of good judgment. \nIt is currently a poor idea to drive. You will return to sobriety in about 7 hours "+noFood,"Results",JOptionPane.PLAIN_MESSAGE);
												break;
											case 5:
												JOptionPane.showMessageDialog(null,"After consuming " +drink+ " drinks over the period of "+timeNum+" hours, your BAC as an average female would be around 0.141 grams per milliliter of blood.\nRight now, you'd be feeling gross motor impairment and a lack of physical control. It'd probably be hard for you to type on the keyboard and your monitor or mobile phone screen would appear blurry. \nYour judgment and perception of what’s going on would be severely impaired and any feeling of euphoria you had earlier will have turned to dysphoria. \nIt is currently a poor idea to drive. You will return to sobriety in about 8 hours "+noFood,"Results",JOptionPane.PLAIN_MESSAGE);
												break;
											case 6: 
												JOptionPane.showMessageDialog(null,"After consuming " +drink+ " drinks over the period of "+timeNum+" hours, your BAC as an average female would be around 0.171 grams per milliliter of blood.\nYou'll probably start to feel sick to your stomach. Any euphoria you had earlier will have turned to dysphoria. Right now you might look like a 'sloppy drunk'. \nConsuming this amount of alcohol in a short period of time is dangerous to your health. \nIt is currently a poor idea to drive. You will return to sobriety in about 10 hours "+noFood,"Results",JOptionPane.PLAIN_MESSAGE);
												break;
											case 7: 
												JOptionPane.showMessageDialog(null,"After consuming " +drink+ " drinks over the period of "+timeNum+" hours, your BAC as an average female would be around 0.201 grams per milliliter of blood.\nYou'll probably need help if you want to walk properly. If you fall down you probably won't feel a lot of pain – even if you hurt yourself. At this level of BAC, some people begin to vomit. At the very least, you'll feel dazed, confused and disoriented. \nConsuming this amount of alcohol in a short period of time is dangerous to your health. \nIt is currently a poor idea to drive. You will return to sobriety in about 12 hours "+noFood,"Results",JOptionPane.PLAIN_MESSAGE);
												break;
											case 8: 
												JOptionPane.showMessageDialog(null,"After consuming " +drink+ " drinks over the period of "+timeNum+" hours, your BAC as an average female would be around 0.23 grams per milliliter of blood. \nIf you were awake at this point you'd have very little comprehension as to where you were or what you were doing. You might pass out suddenly and it'd be hard to wake you up. \nConsuming this amount of alcohol in a short period of time is dangerous to your health. It is currently a poor idea to drive. You will return to sobriety in about 14 hours "+noFood,"Results",JOptionPane.PLAIN_MESSAGE);
												break;
											case 9:
												JOptionPane.showMessageDialog(null,"After consuming " +drink+ " drinks over the period of "+timeNum+" hours, your BAC as an average female would be around 0.26 grams per milliliter of blood. \nIf you were awake at this point you'd have very little comprehension as to where you were or what you were doing. You might pass out suddenly and it'd be hard to wake you up. \nConsuming this amount of alcohol in a short period of time is dangerous to your health. It is currently a poor idea to drive. You will return to sobriety in about 16 hours "+noFood,"Results",JOptionPane.PLAIN_MESSAGE);
												break;
											case 10:
												JOptionPane.showMessageDialog(null,"After consuming " +drink+ " drinks over the period of "+timeNum+" hours, your BAC as an average female would be around 0.29 grams per milliliter of blood. \nIf you were awake at this point you'd have very little comprehension as to where you were or what you were doing. You might pass out suddenly and it'd be hard to wake you up. \nConsuming this amount of alcohol in a short period of time is dangerous to your health. It is currently a poor idea to drive. You will return to sobriety in about 17 hours "+noFood,"Results",JOptionPane.PLAIN_MESSAGE);
												break;
											case 11:
												JOptionPane.showMessageDialog(null,"After consuming " +drink+ " drinks over the period of "+timeNum+" hours, your BAC as an average female would be around 0.32 grams per milliliter of blood. \nIt's possible that you might fall into a coma. You might die due to the paralysis of your diaphragm, the collapse of your lungs, or heart attack (any form of respiratory arrest). \nConsuming this amount of alcohol in a short period of time is dangerous to your health. It is currently a poor idea to drive. You will return to sobriety in about 19 hours "+noFood,"Results",JOptionPane.PLAIN_MESSAGE);
												break;
											case 12:
												JOptionPane.showMessageDialog(null,"After consuming " +drink+ " drinks over the period of "+timeNum+" hours, your BAC as an average female would be around 0.35 grams per milliliter of blood. \nIt's possible that you might fall into a coma. You might die due to the paralysis of your diaphragm, the collapse of your lungs, or heart attack (any form of respiratory arrest). \nConsuming this amount of alcohol in a short period of time is dangerous to your health. It is currently a poor idea to drive. You will return to sobriety in more than 20 hours "+noFood,"Results",JOptionPane.PLAIN_MESSAGE);
												break;
											case 13:
												JOptionPane.showMessageDialog(null,"After consuming " +drink+ " drinks over the period of "+timeNum+" hours, your BAC as an average female would be around 0.38 grams per milliliter of blood. \nIt's possible that you might fall into a coma. You might die due to the paralysis of your diaphragm, the collapse of your lungs, or heart attack (any form of respiratory arrest). \nConsuming this amount of alcohol in a short period of time is dangerous to your health. It is currently a poor idea to drive. You will return to sobriety in more than 20 hours "+noFood,"Results",JOptionPane.PLAIN_MESSAGE);
												break;
											case 14:
												JOptionPane.showMessageDialog(null,"After consuming " +drink+ " drinks over the period of "+timeNum+" hours, your BAC as an average female would be around 0.41 grams per milliliter of blood. \nIt's possible that you might fall into a coma. You might die due to the paralysis of your diaphragm, the collapse of your lungs, or heart attack (any form of respiratory arrest). \nConsuming this amount of alcohol in a short period of time is dangerous to your health. It is currently a poor idea to drive. You will return to sobriety in more than 20 hours "+noFood,"Results",JOptionPane.PLAIN_MESSAGE);
												break;
											case 15:
												JOptionPane.showMessageDialog(null,"After consuming " +drink+ " drinks over the period of "+timeNum+" hours, your BAC as an average female would be around 0.44 grams per milliliter of blood. \nIt's possible that you might fall into a coma. You might die due to the paralysis of your diaphragm, the collapse of your lungs, or heart attack (any form of respiratory arrest).  \nConsuming this amount of alcohol in a short period of time is dangerous to your health. It is currently a poor idea to drive. You will return to sobriety in more than 20 hours "+noFood,"Results",JOptionPane.PLAIN_MESSAGE);
												break;
											case 16:
												JOptionPane.showMessageDialog(null,"After consuming " +drink+ " drinks over the period of "+timeNum+" hours, your BAC as an average female would be around 0.469 grams per milliliter of blood. \nIt's possible that you might fall into a coma. You might die due to the paralysis of your diaphragm, the collapse of your lungs, or heart attack (any form of respiratory arrest).  \nConsuming this amount of alcohol in a short period of time is dangerous to your health. It is currently a poor idea to drive. You will return to sobriety in more than 20 hours "+noFood,"Results",JOptionPane.PLAIN_MESSAGE);
												break;
											case 17:
												JOptionPane.showMessageDialog(null,"After consuming " +drink+ " drinks over the period of "+timeNum+" hours, your BAC as an average female would be around 0.499 grams per milliliter of blood. \nIt's possible that you might fall into a coma. You might die due to the paralysis of your diaphragm, the collapse of your lungs, or heart attack (any form of respiratory arrest).  \nConsuming this amount of alcohol in a short period of time is dangerous to your health. It is currently a poor idea to drive. You will return to sobriety in more than 20 hours "+noFood,"Results",JOptionPane.PLAIN_MESSAGE);
												break;
											default:
												JOptionPane.showMessageDialog(null,"After consuming " +drink+ " drinks over the period of "+timeNum+" hours, your BAC as an average female would be above 0.50 grams per milliliter of blood. \nIt's possible that you might fall into a coma. You might die due to the paralysis of your diaphragm, the collapse of your lungs, or heart attack (any form of respiratory arrest).  \nConsuming this amount of alcohol in a short period of time is dangerous to your health. It is currently a poor idea to drive. You will return to sobriety in more than 20 hours "+noFood,"Results",JOptionPane.PLAIN_MESSAGE);							
												break;
										}
										}
												
											} /*no sleep*/ else {
												if (drug == true) { //no food yes water no sleep yes drug
													switch (drink) {
													case 1:
														JOptionPane.showMessageDialog(null,"After consuming " +drink+ " drinks over the period of "+timeNum+" hours, your BAC as an average female would be around 0.021 grams per milliliter of blood.\nYou are feeling a little more relaxed while still maintaining your full coordination. \nYou will return to sobriety in about an hour "+noSleep + drugString+noFood,"Results",JOptionPane.PLAIN_MESSAGE);
														break;
													case 2:
														JOptionPane.showMessageDialog(null,"After consuming " +drink+ " drinks over the period of "+timeNum+" hours, your BAC as an average female would be around 0.051 grams per milliliter of blood.\nYou are feeling a bit more relaxed and might have a feeling of well being or euphoria. \nYou will return to sobriety in about 3 hours "+noSleep+ drugString+noFood,"Results",JOptionPane.PLAIN_MESSAGE);
														break;
													case 3:
														JOptionPane.showMessageDialog(null,"After consuming " +drink+ " drinks over the period of "+timeNum+" hours, your BAC as an average female would be around 0.081 grams per milliliter of blood.\nYou can definately tell that you are under the influence and your speech, motor skills, balance and judgement are affected. It is currently a poor idea to drive. \nYou will return to sobriety in about 5 hours. "+noSleep+ drugString+noFood,"Results",JOptionPane.PLAIN_MESSAGE);
														break;
													case 4:
														JOptionPane.showMessageDialog(null,"After consuming " +drink+ " drinks over the period of "+timeNum+" hours, your BAC as an average female would be around 0.111 grams per milliliter of blood.\nYour speech will be slurred and your balance, vision, reactions time and hearing will be impaired. Your motor coordination will also be significantly impaired and you'll have a loss of good judgment. \nIt is currently a poor idea to drive. You will return to sobriety in about 7 hours "+noSleep+ drugString+noFood,"Results",JOptionPane.PLAIN_MESSAGE);
														break;
													case 5:
														JOptionPane.showMessageDialog(null,"After consuming " +drink+ " drinks over the period of "+timeNum+" hours, your BAC as an average female would be around 0.141 grams per milliliter of blood.\nRight now, you'd be feeling gross motor impairment and a lack of physical control. It'd probably be hard for you to type on the keyboard and your monitor or mobile phone screen would appear blurry. \nYour judgment and perception of what’s going on would be severely impaired and any feeling of euphoria you had earlier will have turned to dysphoria. \nIt is currently a poor idea to drive. You will return to sobriety in about 8 hours "+noSleep+ drugString+noFood,"Results",JOptionPane.PLAIN_MESSAGE);
														break;
													case 6: 
														JOptionPane.showMessageDialog(null,"After consuming " +drink+ " drinks over the period of "+timeNum+" hours, your BAC as an average female would be around 0.171 grams per milliliter of blood.\nYou'll probably start to feel sick to your stomach. Any euphoria you had earlier will have turned to dysphoria. Right now you might look like a 'sloppy drunk'. \nConsuming this amount of alcohol in a short period of time is dangerous to your health. \nIt is currently a poor idea to drive. You will return to sobriety in about 10 hours "+noSleep+ drugString+noFood,"Results",JOptionPane.PLAIN_MESSAGE);
														break;
													case 7: 
														JOptionPane.showMessageDialog(null,"After consuming " +drink+ " drinks over the period of "+timeNum+" hours, your BAC as an average female would be around 0.201 grams per milliliter of blood.\nYou'll probably need help if you want to walk properly. If you fall down you probably won't feel a lot of pain – even if you hurt yourself. At this level of BAC, some people begin to vomit. At the very least, you'll feel dazed, confused and disoriented. \nConsuming this amount of alcohol in a short period of time is dangerous to your health. \nIt is currently a poor idea to drive. You will return to sobriety in about 12 hours "+noSleep+ drugString+noFood,"Results",JOptionPane.PLAIN_MESSAGE);
														break;
													case 8: 
														JOptionPane.showMessageDialog(null,"After consuming " +drink+ " drinks over the period of "+timeNum+" hours, your BAC as an average female would be around 0.23 grams per milliliter of blood. \nIf you were awake at this point you'd have very little comprehension as to where you were or what you were doing. You might pass out suddenly and it'd be hard to wake you up. \nConsuming this amount of alcohol in a short period of time is dangerous to your health. It is currently a poor idea to drive. You will return to sobriety in about 14 hours "+noSleep+ drugString+noFood,"Results",JOptionPane.PLAIN_MESSAGE);
														break;
													case 9:
														JOptionPane.showMessageDialog(null,"After consuming " +drink+ " drinks over the period of "+timeNum+" hours, your BAC as an average female would be around 0.26 grams per milliliter of blood. \nIf you were awake at this point you'd have very little comprehension as to where you were or what you were doing. You might pass out suddenly and it'd be hard to wake you up. \nConsuming this amount of alcohol in a short period of time is dangerous to your health. It is currently a poor idea to drive. You will return to sobriety in about 16 hours "+noSleep+ drugString+noFood,"Results",JOptionPane.PLAIN_MESSAGE);
														break;
													case 10:
														JOptionPane.showMessageDialog(null,"After consuming " +drink+ " drinks over the period of "+timeNum+" hours, your BAC as an average female would be around 0.29 grams per milliliter of blood. \nIf you were awake at this point you'd have very little comprehension as to where you were or what you were doing. You might pass out suddenly and it'd be hard to wake you up. \nConsuming this amount of alcohol in a short period of time is dangerous to your health. It is currently a poor idea to drive. You will return to sobriety in about 17 hours "+noSleep+ drugString+noFood,"Results",JOptionPane.PLAIN_MESSAGE);
														break;
													case 11:
														JOptionPane.showMessageDialog(null,"After consuming " +drink+ " drinks over the period of "+timeNum+" hours, your BAC as an average female would be around 0.32 grams per milliliter of blood. \nIt's possible that you might fall into a coma. You might die due to the paralysis of your diaphragm, the collapse of your lungs, or heart attack (any form of respiratory arrest). \nConsuming this amount of alcohol in a short period of time is dangerous to your health. It is currently a poor idea to drive. You will return to sobriety in about 19 hours "+noSleep+ drugString+noFood,"Results",JOptionPane.PLAIN_MESSAGE);
														break;
													case 12:
														JOptionPane.showMessageDialog(null,"After consuming " +drink+ " drinks over the period of "+timeNum+" hours, your BAC as an average female would be around 0.35 grams per milliliter of blood. \nIt's possible that you might fall into a coma. You might die due to the paralysis of your diaphragm, the collapse of your lungs, or heart attack (any form of respiratory arrest). \nConsuming this amount of alcohol in a short period of time is dangerous to your health. It is currently a poor idea to drive. You will return to sobriety in more than 20 hours "+noSleep+ drugString+noFood,"Results",JOptionPane.PLAIN_MESSAGE);
														break;
													case 13:
														JOptionPane.showMessageDialog(null,"After consuming " +drink+ " drinks over the period of "+timeNum+" hours, your BAC as an average female would be around 0.38 grams per milliliter of blood. \nIt's possible that you might fall into a coma. You might die due to the paralysis of your diaphragm, the collapse of your lungs, or heart attack (any form of respiratory arrest). \nConsuming this amount of alcohol in a short period of time is dangerous to your health. It is currently a poor idea to drive. You will return to sobriety in more than 20 hours "+noSleep+ drugString+noFood,"Results",JOptionPane.PLAIN_MESSAGE);
														break;
													case 14:
														JOptionPane.showMessageDialog(null,"After consuming " +drink+ " drinks over the period of "+timeNum+" hours, your BAC as an average female would be around 0.41 grams per milliliter of blood. \nIt's possible that you might fall into a coma. You might die due to the paralysis of your diaphragm, the collapse of your lungs, or heart attack (any form of respiratory arrest). \nConsuming this amount of alcohol in a short period of time is dangerous to your health. It is currently a poor idea to drive. You will return to sobriety in more than 20 hours "+noSleep+ drugString+noFood,"Results",JOptionPane.PLAIN_MESSAGE);
														break;
													case 15:
														JOptionPane.showMessageDialog(null,"After consuming " +drink+ " drinks over the period of "+timeNum+" hours, your BAC as an average female would be around 0.44 grams per milliliter of blood. \nIt's possible that you might fall into a coma. You might die due to the paralysis of your diaphragm, the collapse of your lungs, or heart attack (any form of respiratory arrest).  \nConsuming this amount of alcohol in a short period of time is dangerous to your health. It is currently a poor idea to drive. You will return to sobriety in more than 20 hours "+noSleep+ drugString+noFood,"Results",JOptionPane.PLAIN_MESSAGE);
														break;
													case 16:
														JOptionPane.showMessageDialog(null,"After consuming " +drink+ " drinks over the period of "+timeNum+" hours, your BAC as an average female would be around 0.469 grams per milliliter of blood. \nIt's possible that you might fall into a coma. You might die due to the paralysis of your diaphragm, the collapse of your lungs, or heart attack (any form of respiratory arrest).  \nConsuming this amount of alcohol in a short period of time is dangerous to your health. It is currently a poor idea to drive. You will return to sobriety in more than 20 hours "+noSleep+ drugString+noFood,"Results",JOptionPane.PLAIN_MESSAGE);
														break;
													case 17:
														JOptionPane.showMessageDialog(null,"After consuming " +drink+ " drinks over the period of "+timeNum+" hours, your BAC as an average female would be around 0.499 grams per milliliter of blood. \nIt's possible that you might fall into a coma. You might die due to the paralysis of your diaphragm, the collapse of your lungs, or heart attack (any form of respiratory arrest).  \nConsuming this amount of alcohol in a short period of time is dangerous to your health. It is currently a poor idea to drive. You will return to sobriety in more than 20 hours "+noSleep+ drugString+noFood,"Results",JOptionPane.PLAIN_MESSAGE);
														break;
													default:
														JOptionPane.showMessageDialog(null,"After consuming " +drink+ " drinks over the period of "+timeNum+" hours, your BAC as an average female would be above 0.50 grams per milliliter of blood. \nIt's possible that you might fall into a coma. You might die due to the paralysis of your diaphragm, the collapse of your lungs, or heart attack (any form of respiratory arrest).  \nConsuming this amount of alcohol in a short period of time is dangerous to your health. It is currently a poor idea to drive. You will return to sobriety in more than 20 hours "+noSleep+ drugString+noFood,"Results",JOptionPane.PLAIN_MESSAGE);							
														break;
													}
												} else { //no food yes water no sleep no drug
												switch (drink) { 
												case 1:
													JOptionPane.showMessageDialog(null,"After consuming " +drink+ " drinks over the period of "+timeNum+" hours, your BAC as an average female would be around 0.021 grams per milliliter of blood.\nYou are feeling a little more relaxed while still maintaining your full coordination. \nYou will return to sobriety in about an hour "+noSleep+noFood,"Results",JOptionPane.PLAIN_MESSAGE);
													break;
												case 2:
													JOptionPane.showMessageDialog(null,"After consuming " +drink+ " drinks over the period of "+timeNum+" hours, your BAC as an average female would be around 0.051 grams per milliliter of blood.\nYou are feeling a bit more relaxed and might have a feeling of well being or euphoria. \nYou will return to sobriety in about 3 hours "+noSleep+noFood,"Results",JOptionPane.PLAIN_MESSAGE);
													break;
												case 3:
													JOptionPane.showMessageDialog(null,"After consuming " +drink+ " drinks over the period of "+timeNum+" hours, your BAC as an average female would be around 0.081 grams per milliliter of blood.\nYou can definately tell that you are under the influence and your speech, motor skills, balance and judgement are affected. It is currently a poor idea to drive. \nYou will return to sobriety in about 5 hours. "+noSleep+noFood,"Results",JOptionPane.PLAIN_MESSAGE);
													break;
												case 4:
													JOptionPane.showMessageDialog(null,"After consuming " +drink+ " drinks over the period of "+timeNum+" hours, your BAC as an average female would be around 0.111 grams per milliliter of blood.\nYour speech will be slurred and your balance, vision, reactions time and hearing will be impaired. Your motor coordination will also be significantly impaired and you'll have a loss of good judgment. \nIt is currently a poor idea to drive. You will return to sobriety in about 7 hours "+noSleep+noFood,"Results",JOptionPane.PLAIN_MESSAGE);
													break;
												case 5:
													JOptionPane.showMessageDialog(null,"After consuming " +drink+ " drinks over the period of "+timeNum+" hours, your BAC as an average female would be around 0.141 grams per milliliter of blood.\nRight now, you'd be feeling gross motor impairment and a lack of physical control. It'd probably be hard for you to type on the keyboard and your monitor or mobile phone screen would appear blurry. \nYour judgment and perception of what’s going on would be severely impaired and any feeling of euphoria you had earlier will have turned to dysphoria. \nIt is currently a poor idea to drive. You will return to sobriety in about 8 hours "+noSleep+noFood,"Results",JOptionPane.PLAIN_MESSAGE);
													break;
												case 6: 
													JOptionPane.showMessageDialog(null,"After consuming " +drink+ " drinks over the period of "+timeNum+" hours, your BAC as an average female would be around 0.171 grams per milliliter of blood.\nYou'll probably start to feel sick to your stomach. Any euphoria you had earlier will have turned to dysphoria. Right now you might look like a 'sloppy drunk'. \nConsuming this amount of alcohol in a short period of time is dangerous to your health. \nIt is currently a poor idea to drive. You will return to sobriety in about 10 hours "+noSleep+noFood,"Results",JOptionPane.PLAIN_MESSAGE);
													break;
												case 7: 
													JOptionPane.showMessageDialog(null,"After consuming " +drink+ " drinks over the period of "+timeNum+" hours, your BAC as an average female would be around 0.201 grams per milliliter of blood.\nYou'll probably need help if you want to walk properly. If you fall down you probably won't feel a lot of pain – even if you hurt yourself. At this level of BAC, some people begin to vomit. At the very least, you'll feel dazed, confused and disoriented. \nConsuming this amount of alcohol in a short period of time is dangerous to your health. \nIt is currently a poor idea to drive. You will return to sobriety in about 12 hours "+noSleep+noFood,"Results",JOptionPane.PLAIN_MESSAGE);
													break;
												case 8: 
													JOptionPane.showMessageDialog(null,"After consuming " +drink+ " drinks over the period of "+timeNum+" hours, your BAC as an average female would be around 0.23 grams per milliliter of blood. \nIf you were awake at this point you'd have very little comprehension as to where you were or what you were doing. You might pass out suddenly and it'd be hard to wake you up. \nConsuming this amount of alcohol in a short period of time is dangerous to your health. It is currently a poor idea to drive. You will return to sobriety in about 14 hours "+noSleep+noFood,"Results",JOptionPane.PLAIN_MESSAGE);
													break;
												case 9:
													JOptionPane.showMessageDialog(null,"After consuming " +drink+ " drinks over the period of "+timeNum+" hours, your BAC as an average female would be around 0.26 grams per milliliter of blood. \nIf you were awake at this point you'd have very little comprehension as to where you were or what you were doing. You might pass out suddenly and it'd be hard to wake you up. \nConsuming this amount of alcohol in a short period of time is dangerous to your health. It is currently a poor idea to drive. You will return to sobriety in about 16 hours "+noSleep+noFood,"Results",JOptionPane.PLAIN_MESSAGE);
													break;
												case 10:
													JOptionPane.showMessageDialog(null,"After consuming " +drink+ " drinks over the period of "+timeNum+" hours, your BAC as an average female would be around 0.29 grams per milliliter of blood. \nIf you were awake at this point you'd have very little comprehension as to where you were or what you were doing. You might pass out suddenly and it'd be hard to wake you up. \nConsuming this amount of alcohol in a short period of time is dangerous to your health. It is currently a poor idea to drive. You will return to sobriety in about 17 hours "+noSleep+noFood,"Results",JOptionPane.PLAIN_MESSAGE);
													break;
												case 11:
													JOptionPane.showMessageDialog(null,"After consuming " +drink+ " drinks over the period of "+timeNum+" hours, your BAC as an average female would be around 0.32 grams per milliliter of blood. \nIt's possible that you might fall into a coma. You might die due to the paralysis of your diaphragm, the collapse of your lungs, or heart attack (any form of respiratory arrest). \nConsuming this amount of alcohol in a short period of time is dangerous to your health. It is currently a poor idea to drive. You will return to sobriety in about 19 hours "+noSleep+noFood,"Results",JOptionPane.PLAIN_MESSAGE);
													break;
												case 12:
													JOptionPane.showMessageDialog(null,"After consuming " +drink+ " drinks over the period of "+timeNum+" hours, your BAC as an average female would be around 0.35 grams per milliliter of blood. \nIt's possible that you might fall into a coma. You might die due to the paralysis of your diaphragm, the collapse of your lungs, or heart attack (any form of respiratory arrest). \nConsuming this amount of alcohol in a short period of time is dangerous to your health. It is currently a poor idea to drive. You will return to sobriety in more than 20 hours "+noSleep+noFood,"Results",JOptionPane.PLAIN_MESSAGE);
													break;
												case 13:
													JOptionPane.showMessageDialog(null,"After consuming " +drink+ " drinks over the period of "+timeNum+" hours, your BAC as an average female would be around 0.38 grams per milliliter of blood. \nIt's possible that you might fall into a coma. You might die due to the paralysis of your diaphragm, the collapse of your lungs, or heart attack (any form of respiratory arrest). \nConsuming this amount of alcohol in a short period of time is dangerous to your health. It is currently a poor idea to drive. You will return to sobriety in more than 20 hours "+noSleep+noFood,"Results",JOptionPane.PLAIN_MESSAGE);
													break;
												case 14:
													JOptionPane.showMessageDialog(null,"After consuming " +drink+ " drinks over the period of "+timeNum+" hours, your BAC as an average female would be around 0.41 grams per milliliter of blood. \nIt's possible that you might fall into a coma. You might die due to the paralysis of your diaphragm, the collapse of your lungs, or heart attack (any form of respiratory arrest). \nConsuming this amount of alcohol in a short period of time is dangerous to your health. It is currently a poor idea to drive. You will return to sobriety in more than 20 hours "+noSleep+noFood,"Results",JOptionPane.PLAIN_MESSAGE);
													break;
												case 15:
													JOptionPane.showMessageDialog(null,"After consuming " +drink+ " drinks over the period of "+timeNum+" hours, your BAC as an average female would be around 0.44 grams per milliliter of blood. \nIt's possible that you might fall into a coma. You might die due to the paralysis of your diaphragm, the collapse of your lungs, or heart attack (any form of respiratory arrest).  \nConsuming this amount of alcohol in a short period of time is dangerous to your health. It is currently a poor idea to drive. You will return to sobriety in more than 20 hours "+noSleep+noFood,"Results",JOptionPane.PLAIN_MESSAGE);
													break;
												case 16:
													JOptionPane.showMessageDialog(null,"After consuming " +drink+ " drinks over the period of "+timeNum+" hours, your BAC as an average female would be around 0.469 grams per milliliter of blood. \nIt's possible that you might fall into a coma. You might die due to the paralysis of your diaphragm, the collapse of your lungs, or heart attack (any form of respiratory arrest).  \nConsuming this amount of alcohol in a short period of time is dangerous to your health. It is currently a poor idea to drive. You will return to sobriety in more than 20 hours "+noSleep+noFood,"Results",JOptionPane.PLAIN_MESSAGE);
													break;
												case 17:
													JOptionPane.showMessageDialog(null,"After consuming " +drink+ " drinks over the period of "+timeNum+" hours, your BAC as an average female would be around 0.499 grams per milliliter of blood. \nIt's possible that you might fall into a coma. You might die due to the paralysis of your diaphragm, the collapse of your lungs, or heart attack (any form of respiratory arrest).  \nConsuming this amount of alcohol in a short period of time is dangerous to your health. It is currently a poor idea to drive. You will return to sobriety in more than 20 hours "+noSleep+noFood,"Results",JOptionPane.PLAIN_MESSAGE);
													break;
												default:
													JOptionPane.showMessageDialog(null,"After consuming " +drink+ " drinks over the period of "+timeNum+" hours, your BAC as an average female would be above 0.50 grams per milliliter of blood. \nIt's possible that you might fall into a coma. You might die due to the paralysis of your diaphragm, the collapse of your lungs, or heart attack (any form of respiratory arrest).  \nConsuming this amount of alcohol in a short period of time is dangerous to your health. It is currently a poor idea to drive. You will return to sobriety in more than 20 hours "+noSleep+noFood,"Results",JOptionPane.PLAIN_MESSAGE);							
													break;
											}
											} /*no sleep no drug*/
										} 
								}/* no water*/ else {
									if (sleep == true) { //slept well
										if (drug == true) { //on medication
											switch (drink) {//no food no water yes sleep yes drug
												case 1: 
													JOptionPane.showMessageDialog(null,"After consuming " +drink+ " drinks over the period of "+timeNum+" hours, your BAC as an average female would be around 0.021 grams per milliliter of blood.\nYou are feeling a little more relaxed while still maintaining your full coordination. \nYou will return to sobriety in about an hour "+drugString+noWater+noFood,"Results",JOptionPane.PLAIN_MESSAGE);
													break;
												case 2:
													JOptionPane.showMessageDialog(null,"After consuming " +drink+ " drinks over the period of "+timeNum+" hours, your BAC as an average male would be around 0.034 grams per milliliter of blood.\nYou are feeling a little more relaxed while still maintaining your full coordination. \nYou will return to sobriety in a bit "+drugString+noWater+noFood,"Results",JOptionPane.PLAIN_MESSAGE);
													break;
												case 3:
													JOptionPane.showMessageDialog(null,"After consuming " +drink+ " drinks over the period of "+timeNum+" hours, your BAC as an average female would be around 0.081 grams per milliliter of blood.\nYou can definately tell that you are under the influence and your speech, motor skills, balance and judgement are affected. It is currently a poor idea to drive. \nYou will return to sobriety in about 5 hours.  "+drugString+noWater+noFood,"Results",JOptionPane.PLAIN_MESSAGE);
													break;
												case 4:
													JOptionPane.showMessageDialog(null,"After consuming " +drink+ " drinks over the period of "+timeNum+" hours, your BAC as an average male would be around 0.069 grams per milliliter of blood.\nYou are feeling a bit more relaxed and might have a feeling of well being or euphoria. It is currently a poor idea to drive. \n You will return to sobriety in about 5 hours "+drugString+noWater+noFood,"Results",JOptionPane.PLAIN_MESSAGE);
													break;
												case 5:
													JOptionPane.showMessageDialog(null,"After consuming " +drink+ " drinks over the period of "+timeNum+" hours, your BAC as an average male would be around 0.090 grams per milliliter of blood.\nYou can definately tell that you are under the influence and your speech, motor skills, balance and judgement are affected. It is currently a poor idea to drive. \n You will return to sobriety in about 7 hours "+drugString+noWater+noFood,"Results",JOptionPane.PLAIN_MESSAGE);
													break;
												case 6: 
													JOptionPane.showMessageDialog(null,"After consuming " +drink+ " drinks over the period of "+timeNum+" hours, your BAC as an average male would be around 0.112 grams per milliliter of blood.\nYour speech will be slurred and your balance, vision, reactions time and hearing will be impaired. Your motor coordination will also be significantly impaired and you'll have a loss of good judgment. \nIt is currently a poor idea to drive. You will return to sobriety in about 8 hours "+drugString+noWater+noFood,"Results",JOptionPane.PLAIN_MESSAGE);
													break;
												case 7: 
													JOptionPane.showMessageDialog(null,"After consuming " +drink+ " drinks over the period of "+timeNum+" hours, your BAC as an average male would be around 0.133 grams per milliliter of blood.\nRight now, you'd be feeling gross motor impairment and a lack of physical control. It'd probably be hard for you to type on the keyboard and your monitor or mobile phone screen would appear blurry. \nYour judgment and perception of what’s going on would be severely impaired and any feeling of euphoria you had earlier will have turned to dysphoria. \nIt is currently a poor idea to drive. You will return to sobriety in about 10 hours "+drugString+noWater+noFood,"Results",JOptionPane.PLAIN_MESSAGE);
													break;
												case 8: 
													JOptionPane.showMessageDialog(null,"After consuming " +drink+ " drinks over the period of "+timeNum+" hours, your BAC as an average male would be around 0.155 grams per milliliter of blood. \nYou'll probably start to feel sick to your stomach. Any euphoria you had earlier will have turned to dysphoria. Right now you might look like a 'sloppy drunk'. \nConsuming this amount of alcohol in a short period of time is dangerous to your health. It is currently a poor idea to drive. You will return to sobriety in about 11 hours "+drugString+noWater+noFood,"Results",JOptionPane.PLAIN_MESSAGE);
													break;
												case 9:
													JOptionPane.showMessageDialog(null,"After consuming " +drink+ " drinks over the period of "+timeNum+" hours, your BAC as an average male would be around 0.176 grams per milliliter of blood. \nYou'll probably start to feel sick to your stomach. Any euphoria you had earlier will have turned to dysphoria. Right now you might look like a 'sloppy drunk'. \nConsuming this amount of alcohol in a short period of time is dangerous to your health. It is currently a poor idea to drive. You will return to sobriety in about 13 hours "+drugString+noWater+noFood,"Results",JOptionPane.PLAIN_MESSAGE);
													break;
												case 10:
													JOptionPane.showMessageDialog(null,"After consuming " +drink+ " drinks over the period of "+timeNum+" hours, your BAC as an average male would be around 0.198 grams per milliliter of blood. \nYou'll probably need help if you want to walk properly. If you fall down you probably won't feel a lot of pain – even if you hurt yourself. At this level of BAC, some people begin to vomit. At the very least, you'll feel dazed, confused and disoriented. \nConsuming this amount of alcohol in a short period of time is dangerous to your health. It is currently a poor idea to drive. You will return to sobriety in about 14 hours "+drugString+noWater+noFood,"Results",JOptionPane.PLAIN_MESSAGE);
													break;
												case 11:
													JOptionPane.showMessageDialog(null,"After consuming " +drink+ " drinks over the period of "+timeNum+" hours, your BAC as an average male would be around 0.219 grams per milliliter of blood. \nIf you were awake at this point you'd have very little comprehension as to where you were or what you were doing. You might pass out suddenly and it'd be hard to wake you up. \nConsuming this amount of alcohol in a short period of time is dangerous to your health. It is currently a poor idea to drive. You will return to sobriety in about 16 hours "+drugString+noWater+noFood,"Results",JOptionPane.PLAIN_MESSAGE);
													break;
												case 12:
													JOptionPane.showMessageDialog(null,"After consuming " +drink+ " drinks over the period of "+timeNum+" hours, your BAC as an average male would be around 0.240 grams per milliliter of blood. \nIf you were awake at this point you'd have very little comprehension as to where you were or what you were doing. You might pass out suddenly and it'd be hard to wake you up. \nConsuming this amount of alcohol in a short period of time is dangerous to your health. It is currently a poor idea to drive. You will return to sobriety in about 17 hours "+drugString+noWater+noFood,"Results",JOptionPane.PLAIN_MESSAGE);
													break;
												case 13:
													JOptionPane.showMessageDialog(null,"After consuming " +drink+ " drinks over the period of "+timeNum+" hours, your BAC as an average female would be around 0.38 grams per milliliter of blood. \nIt's possible that you might fall into a coma. You might die due to the paralysis of your diaphragm, the collapse of your lungs, or heart attack (any form of respiratory arrest). \nConsuming this amount of alcohol in a short period of time is dangerous to your health. It is currently a poor idea to drive. You will return to sobriety in more than 20 hours  You will return to sobriety in about 19 hours "+drugString+noWater+noFood,"Results",JOptionPane.PLAIN_MESSAGE);
													break;
												case 14:
													JOptionPane.showMessageDialog(null,"After consuming " +drink+ " drinks over the period of "+timeNum+" hours, your BAC as an average male would be around 0.283 grams per milliliter of blood. \nIf you were awake at this point you'd have very little comprehension as to where you were or what you were doing. You might pass out suddenly and it'd be hard to wake you up. \nConsuming this amount of alcohol in a short period of time is dangerous to your health. It is currently a poor idea to drive. You will return to sobriety in more than 20 hours "+drugString+noWater+noFood,"Results",JOptionPane.PLAIN_MESSAGE);
													break;
												case 15:
													JOptionPane.showMessageDialog(null,"After consuming " +drink+ " drinks over the period of "+timeNum+" hours, your BAC as an average male would be around 0.305 grams per milliliter of blood. \nIt's possible that you might fall into a coma. You might die due to the paralysis of your diaphragm, the collapse of your lungs, or heart attack (any form of respiratory arrest).  \nConsuming this amount of alcohol in a short period of time is dangerous to your health. It is currently a poor idea to drive. You will return to sobriety in more than 20 hours "+drugString+noWater+noFood,"Results",JOptionPane.PLAIN_MESSAGE);
													break;
												case 16:
													JOptionPane.showMessageDialog(null,"After consuming " +drink+ " drinks over the period of "+timeNum+" hours, your BAC as an average male would be around 0.326 grams per milliliter of blood. \nIt's possible that you might fall into a coma. You might die due to the paralysis of your diaphragm, the collapse of your lungs, or heart attack (any form of respiratory arrest).  \nConsuming this amount of alcohol in a short period of time is dangerous to your health. It is currently a poor idea to drive. You will return to sobriety in more than 20 hours "+drugString+noWater+noFood,"Results",JOptionPane.PLAIN_MESSAGE);
													break;
												case 17:
													JOptionPane.showMessageDialog(null,"After consuming " +drink+ " drinks over the period of "+timeNum+" hours, your BAC as an average male would be around 0.348 grams per milliliter of blood. \nIt's possible that you might fall into a coma. You might die due to the paralysis of your diaphragm, the collapse of your lungs, or heart attack (any form of respiratory arrest).  \nConsuming this amount of alcohol in a short period of time is dangerous to your health. It is currently a poor idea to drive. You will return to sobriety in more than 20 hours "+drugString+noWater+noFood,"Results",JOptionPane.PLAIN_MESSAGE);
													break;
												default:
													JOptionPane.showMessageDialog(null,"After consuming " +drink+ " drinks over the period of "+timeNum+" hours, your BAC as an average male would be above 0.30 grams per milliliter of blood. \nIt's possible that you might fall into a coma. You might die due to the paralysis of your diaphragm, the collapse of your lungs, or heart attack (any form of respiratory arrest).  \nConsuming this amount of alcohol in a short period of time is dangerous to your health. It is currently a poor idea to drive. You will return to sobriety in more than 20 hours "+drugString+noWater+noFood,"Results",JOptionPane.PLAIN_MESSAGE);							
													break;
											} 
										} else { //no food no water yes sleep no drug
											switch (drink) {
											case 1:
												JOptionPane.showMessageDialog(null,"After consuming " +drink+ " drinks over the period of "+timeNum+" hours, your BAC as an average female would be around 0.021 grams per milliliter of blood.\nYou are feeling a little more relaxed while still maintaining your full coordination. \nYou will return to sobriety in about an hour "+noWater+noFood,"Results",JOptionPane.PLAIN_MESSAGE);
												break;
											case 2:
												JOptionPane.showMessageDialog(null,"After consuming " +drink+ " drinks over the period of "+timeNum+" hours, your BAC as an average female would be around 0.051 grams per milliliter of blood.\nYou are feeling a bit more relaxed and might have a feeling of well being or euphoria. \nYou will return to sobriety in about 3 hours "+noWater+noFood,"Results",JOptionPane.PLAIN_MESSAGE);
												break;
											case 3:
												JOptionPane.showMessageDialog(null,"After consuming " +drink+ " drinks over the period of "+timeNum+" hours, your BAC as an average female would be around 0.081 grams per milliliter of blood.\nYou can definately tell that you are under the influence and your speech, motor skills, balance and judgement are affected. It is currently a poor idea to drive. \nYou will return to sobriety in about 5 hours. "+noWater+noFood,"Results",JOptionPane.PLAIN_MESSAGE);
												break;
											case 4:
												JOptionPane.showMessageDialog(null,"After consuming " +drink+ " drinks over the period of "+timeNum+" hours, your BAC as an average female would be around 0.111 grams per milliliter of blood.\nYour speech will be slurred and your balance, vision, reactions time and hearing will be impaired. Your motor coordination will also be significantly impaired and you'll have a loss of good judgment. \nIt is currently a poor idea to drive. You will return to sobriety in about 7 hours "+noWater+noFood,"Results",JOptionPane.PLAIN_MESSAGE);
												break;
											case 5:
												JOptionPane.showMessageDialog(null,"After consuming " +drink+ " drinks over the period of "+timeNum+" hours, your BAC as an average female would be around 0.141 grams per milliliter of blood.\nRight now, you'd be feeling gross motor impairment and a lack of physical control. It'd probably be hard for you to type on the keyboard and your monitor or mobile phone screen would appear blurry. \nYour judgment and perception of what’s going on would be severely impaired and any feeling of euphoria you had earlier will have turned to dysphoria. \nIt is currently a poor idea to drive. You will return to sobriety in about 8 hours "+noWater+noFood,"Results",JOptionPane.PLAIN_MESSAGE);
												break;
											case 6: 
												JOptionPane.showMessageDialog(null,"After consuming " +drink+ " drinks over the period of "+timeNum+" hours, your BAC as an average female would be around 0.171 grams per milliliter of blood.\nYou'll probably start to feel sick to your stomach. Any euphoria you had earlier will have turned to dysphoria. Right now you might look like a 'sloppy drunk'. \nConsuming this amount of alcohol in a short period of time is dangerous to your health. \nIt is currently a poor idea to drive. You will return to sobriety in about 10 hours "+noWater+noFood,"Results",JOptionPane.PLAIN_MESSAGE);
												break;
											case 7: 
												JOptionPane.showMessageDialog(null,"After consuming " +drink+ " drinks over the period of "+timeNum+" hours, your BAC as an average female would be around 0.201 grams per milliliter of blood.\nYou'll probably need help if you want to walk properly. If you fall down you probably won't feel a lot of pain – even if you hurt yourself. At this level of BAC, some people begin to vomit. At the very least, you'll feel dazed, confused and disoriented. \nConsuming this amount of alcohol in a short period of time is dangerous to your health. \nIt is currently a poor idea to drive. You will return to sobriety in about 12 hours "+noWater+noFood,"Results",JOptionPane.PLAIN_MESSAGE);
												break;
											case 8: 
												JOptionPane.showMessageDialog(null,"After consuming " +drink+ " drinks over the period of "+timeNum+" hours, your BAC as an average female would be around 0.23 grams per milliliter of blood. \nIf you were awake at this point you'd have very little comprehension as to where you were or what you were doing. You might pass out suddenly and it'd be hard to wake you up. \nConsuming this amount of alcohol in a short period of time is dangerous to your health. It is currently a poor idea to drive. You will return to sobriety in about 14 hours "+noWater+noFood,"Results",JOptionPane.PLAIN_MESSAGE);
												break;
											case 9:
												JOptionPane.showMessageDialog(null,"After consuming " +drink+ " drinks over the period of "+timeNum+" hours, your BAC as an average female would be around 0.26 grams per milliliter of blood. \nIf you were awake at this point you'd have very little comprehension as to where you were or what you were doing. You might pass out suddenly and it'd be hard to wake you up. \nConsuming this amount of alcohol in a short period of time is dangerous to your health. It is currently a poor idea to drive. You will return to sobriety in about 16 hours "+noWater+noFood,"Results",JOptionPane.PLAIN_MESSAGE);
												break;
											case 10:
												JOptionPane.showMessageDialog(null,"After consuming " +drink+ " drinks over the period of "+timeNum+" hours, your BAC as an average female would be around 0.29 grams per milliliter of blood. \nIf you were awake at this point you'd have very little comprehension as to where you were or what you were doing. You might pass out suddenly and it'd be hard to wake you up. \nConsuming this amount of alcohol in a short period of time is dangerous to your health. It is currently a poor idea to drive. You will return to sobriety in about 17 hours "+noWater+noFood,"Results",JOptionPane.PLAIN_MESSAGE);
												break;
											case 11:
												JOptionPane.showMessageDialog(null,"After consuming " +drink+ " drinks over the period of "+timeNum+" hours, your BAC as an average female would be around 0.32 grams per milliliter of blood. \nIt's possible that you might fall into a coma. You might die due to the paralysis of your diaphragm, the collapse of your lungs, or heart attack (any form of respiratory arrest). \nConsuming this amount of alcohol in a short period of time is dangerous to your health. It is currently a poor idea to drive. You will return to sobriety in about 19 hours "+noWater+noFood,"Results",JOptionPane.PLAIN_MESSAGE);
												break;
											case 12:
												JOptionPane.showMessageDialog(null,"After consuming " +drink+ " drinks over the period of "+timeNum+" hours, your BAC as an average female would be around 0.35 grams per milliliter of blood. \nIt's possible that you might fall into a coma. You might die due to the paralysis of your diaphragm, the collapse of your lungs, or heart attack (any form of respiratory arrest). \nConsuming this amount of alcohol in a short period of time is dangerous to your health. It is currently a poor idea to drive. You will return to sobriety in more than 20 hours "+noWater+noFood,"Results",JOptionPane.PLAIN_MESSAGE);
												break;
											case 13:
												JOptionPane.showMessageDialog(null,"After consuming " +drink+ " drinks over the period of "+timeNum+" hours, your BAC as an average female would be around 0.38 grams per milliliter of blood. \nIt's possible that you might fall into a coma. You might die due to the paralysis of your diaphragm, the collapse of your lungs, or heart attack (any form of respiratory arrest). \nConsuming this amount of alcohol in a short period of time is dangerous to your health. It is currently a poor idea to drive. You will return to sobriety in more than 20 hours "+noWater+noFood,"Results",JOptionPane.PLAIN_MESSAGE);
												break;
											case 14:
												JOptionPane.showMessageDialog(null,"After consuming " +drink+ " drinks over the period of "+timeNum+" hours, your BAC as an average female would be around 0.41 grams per milliliter of blood. \nIt's possible that you might fall into a coma. You might die due to the paralysis of your diaphragm, the collapse of your lungs, or heart attack (any form of respiratory arrest). \nConsuming this amount of alcohol in a short period of time is dangerous to your health. It is currently a poor idea to drive. You will return to sobriety in more than 20 hours "+noWater+noFood,"Results",JOptionPane.PLAIN_MESSAGE);
												break;
											case 15:
												JOptionPane.showMessageDialog(null,"After consuming " +drink+ " drinks over the period of "+timeNum+" hours, your BAC as an average female would be around 0.44 grams per milliliter of blood. \nIt's possible that you might fall into a coma. You might die due to the paralysis of your diaphragm, the collapse of your lungs, or heart attack (any form of respiratory arrest).  \nConsuming this amount of alcohol in a short period of time is dangerous to your health. It is currently a poor idea to drive. You will return to sobriety in more than 20 hours "+noWater+noFood,"Results",JOptionPane.PLAIN_MESSAGE);
												break;
											case 16:
												JOptionPane.showMessageDialog(null,"After consuming " +drink+ " drinks over the period of "+timeNum+" hours, your BAC as an average female would be around 0.469 grams per milliliter of blood. \nIt's possible that you might fall into a coma. You might die due to the paralysis of your diaphragm, the collapse of your lungs, or heart attack (any form of respiratory arrest).  \nConsuming this amount of alcohol in a short period of time is dangerous to your health. It is currently a poor idea to drive. You will return to sobriety in more than 20 hours "+noWater+noFood,"Results",JOptionPane.PLAIN_MESSAGE);
												break;
											case 17:
												JOptionPane.showMessageDialog(null,"After consuming " +drink+ " drinks over the period of "+timeNum+" hours, your BAC as an average female would be around 0.499 grams per milliliter of blood. \nIt's possible that you might fall into a coma. You might die due to the paralysis of your diaphragm, the collapse of your lungs, or heart attack (any form of respiratory arrest).  \nConsuming this amount of alcohol in a short period of time is dangerous to your health. It is currently a poor idea to drive. You will return to sobriety in more than 20 hours "+noWater+noFood,"Results",JOptionPane.PLAIN_MESSAGE);
												break;
											default:
												JOptionPane.showMessageDialog(null,"After consuming " +drink+ " drinks over the period of "+timeNum+" hours, your BAC as an average female would be above 0.50 grams per milliliter of blood. \nIt's possible that you might fall into a coma. You might die due to the paralysis of your diaphragm, the collapse of your lungs, or heart attack (any form of respiratory arrest).  \nConsuming this amount of alcohol in a short period of time is dangerous to your health. It is currently a poor idea to drive. You will return to sobriety in more than 20 hours "+noWater+noFood,"Results",JOptionPane.PLAIN_MESSAGE);							
												break;
										}
										}
												
											} /*no sleep*/ else {
												if (drug == true) { //no food no water no sleep yes drug
													switch (drink) {
													case 1:
														JOptionPane.showMessageDialog(null,"After consuming " +drink+ " drinks over the period of "+timeNum+" hours, your BAC as an average female would be around 0.021 grams per milliliter of blood.\nYou are feeling a little more relaxed while still maintaining your full coordination. \nYou will return to sobriety in about an hour "+noSleep + drugString+noWater+noFood,"Results",JOptionPane.PLAIN_MESSAGE);
														break;
													case 2:
														JOptionPane.showMessageDialog(null,"After consuming " +drink+ " drinks over the period of "+timeNum+" hours, your BAC as an average female would be around 0.051 grams per milliliter of blood.\nYou are feeling a bit more relaxed and might have a feeling of well being or euphoria. \nYou will return to sobriety in about 3 hours "+noSleep+ drugString+noWater+noFood,"Results",JOptionPane.PLAIN_MESSAGE);
														break;
													case 3:
														JOptionPane.showMessageDialog(null,"After consuming " +drink+ " drinks over the period of "+timeNum+" hours, your BAC as an average female would be around 0.081 grams per milliliter of blood.\nYou can definately tell that you are under the influence and your speech, motor skills, balance and judgement are affected. It is currently a poor idea to drive. \nYou will return to sobriety in about 5 hours. "+noSleep+ drugString+noWater+noFood,"Results",JOptionPane.PLAIN_MESSAGE);
														break;
													case 4:
														JOptionPane.showMessageDialog(null,"After consuming " +drink+ " drinks over the period of "+timeNum+" hours, your BAC as an average female would be around 0.111 grams per milliliter of blood.\nYour speech will be slurred and your balance, vision, reactions time and hearing will be impaired. Your motor coordination will also be significantly impaired and you'll have a loss of good judgment. \nIt is currently a poor idea to drive. You will return to sobriety in about 7 hours "+noSleep+ drugString+noWater+noFood,"Results",JOptionPane.PLAIN_MESSAGE);
														break;
													case 5:
														JOptionPane.showMessageDialog(null,"After consuming " +drink+ " drinks over the period of "+timeNum+" hours, your BAC as an average female would be around 0.141 grams per milliliter of blood.\nRight now, you'd be feeling gross motor impairment and a lack of physical control. It'd probably be hard for you to type on the keyboard and your monitor or mobile phone screen would appear blurry. \nYour judgment and perception of what’s going on would be severely impaired and any feeling of euphoria you had earlier will have turned to dysphoria. \nIt is currently a poor idea to drive. You will return to sobriety in about 8 hours "+noSleep+ drugString+noWater+noFood,"Results",JOptionPane.PLAIN_MESSAGE);
														break;
													case 6: 
														JOptionPane.showMessageDialog(null,"After consuming " +drink+ " drinks over the period of "+timeNum+" hours, your BAC as an average female would be around 0.171 grams per milliliter of blood.\nYou'll probably start to feel sick to your stomach. Any euphoria you had earlier will have turned to dysphoria. Right now you might look like a 'sloppy drunk'. \nConsuming this amount of alcohol in a short period of time is dangerous to your health. \nIt is currently a poor idea to drive. You will return to sobriety in about 10 hours "+noSleep+ drugString+noWater+noFood,"Results",JOptionPane.PLAIN_MESSAGE);
														break;
													case 7: 
														JOptionPane.showMessageDialog(null,"After consuming " +drink+ " drinks over the period of "+timeNum+" hours, your BAC as an average female would be around 0.201 grams per milliliter of blood.\nYou'll probably need help if you want to walk properly. If you fall down you probably won't feel a lot of pain – even if you hurt yourself. At this level of BAC, some people begin to vomit. At the very least, you'll feel dazed, confused and disoriented. \nConsuming this amount of alcohol in a short period of time is dangerous to your health. \nIt is currently a poor idea to drive. You will return to sobriety in about 12 hours "+noSleep+ drugString+noWater+noFood,"Results",JOptionPane.PLAIN_MESSAGE);
														break;
													case 8: 
														JOptionPane.showMessageDialog(null,"After consuming " +drink+ " drinks over the period of "+timeNum+" hours, your BAC as an average female would be around 0.23 grams per milliliter of blood. \nIf you were awake at this point you'd have very little comprehension as to where you were or what you were doing. You might pass out suddenly and it'd be hard to wake you up. \nConsuming this amount of alcohol in a short period of time is dangerous to your health. It is currently a poor idea to drive. You will return to sobriety in about 14 hours "+noSleep+ drugString+noWater+noFood,"Results",JOptionPane.PLAIN_MESSAGE);
														break;
													case 9:
														JOptionPane.showMessageDialog(null,"After consuming " +drink+ " drinks over the period of "+timeNum+" hours, your BAC as an average female would be around 0.26 grams per milliliter of blood. \nIf you were awake at this point you'd have very little comprehension as to where you were or what you were doing. You might pass out suddenly and it'd be hard to wake you up. \nConsuming this amount of alcohol in a short period of time is dangerous to your health. It is currently a poor idea to drive. You will return to sobriety in about 16 hours "+noSleep+ drugString+noWater+noFood,"Results",JOptionPane.PLAIN_MESSAGE);
														break;
													case 10:
														JOptionPane.showMessageDialog(null,"After consuming " +drink+ " drinks over the period of "+timeNum+" hours, your BAC as an average female would be around 0.29 grams per milliliter of blood. \nIf you were awake at this point you'd have very little comprehension as to where you were or what you were doing. You might pass out suddenly and it'd be hard to wake you up. \nConsuming this amount of alcohol in a short period of time is dangerous to your health. It is currently a poor idea to drive. You will return to sobriety in about 17 hours "+noSleep+ drugString+noWater+noFood,"Results",JOptionPane.PLAIN_MESSAGE);
														break;
													case 11:
														JOptionPane.showMessageDialog(null,"After consuming " +drink+ " drinks over the period of "+timeNum+" hours, your BAC as an average female would be around 0.32 grams per milliliter of blood. \nIt's possible that you might fall into a coma. You might die due to the paralysis of your diaphragm, the collapse of your lungs, or heart attack (any form of respiratory arrest). \nConsuming this amount of alcohol in a short period of time is dangerous to your health. It is currently a poor idea to drive. You will return to sobriety in about 19 hours "+noSleep+ drugString+noWater+noFood,"Results",JOptionPane.PLAIN_MESSAGE);
														break;
													case 12:
														JOptionPane.showMessageDialog(null,"After consuming " +drink+ " drinks over the period of "+timeNum+" hours, your BAC as an average female would be around 0.35 grams per milliliter of blood. \nIt's possible that you might fall into a coma. You might die due to the paralysis of your diaphragm, the collapse of your lungs, or heart attack (any form of respiratory arrest). \nConsuming this amount of alcohol in a short period of time is dangerous to your health. It is currently a poor idea to drive. You will return to sobriety in more than 20 hours "+noSleep+ drugString+noWater+noFood,"Results",JOptionPane.PLAIN_MESSAGE);
														break;
													case 13:
														JOptionPane.showMessageDialog(null,"After consuming " +drink+ " drinks over the period of "+timeNum+" hours, your BAC as an average female would be around 0.38 grams per milliliter of blood. \nIt's possible that you might fall into a coma. You might die due to the paralysis of your diaphragm, the collapse of your lungs, or heart attack (any form of respiratory arrest). \nConsuming this amount of alcohol in a short period of time is dangerous to your health. It is currently a poor idea to drive. You will return to sobriety in more than 20 hours "+noSleep+ drugString+noWater+noFood,"Results",JOptionPane.PLAIN_MESSAGE);
														break;
													case 14:
														JOptionPane.showMessageDialog(null,"After consuming " +drink+ " drinks over the period of "+timeNum+" hours, your BAC as an average female would be around 0.41 grams per milliliter of blood. \nIt's possible that you might fall into a coma. You might die due to the paralysis of your diaphragm, the collapse of your lungs, or heart attack (any form of respiratory arrest). \nConsuming this amount of alcohol in a short period of time is dangerous to your health. It is currently a poor idea to drive. You will return to sobriety in more than 20 hours "+noSleep+ drugString+noWater+noFood,"Results",JOptionPane.PLAIN_MESSAGE);
														break;
													case 15:
														JOptionPane.showMessageDialog(null,"After consuming " +drink+ " drinks over the period of "+timeNum+" hours, your BAC as an average female would be around 0.44 grams per milliliter of blood. \nIt's possible that you might fall into a coma. You might die due to the paralysis of your diaphragm, the collapse of your lungs, or heart attack (any form of respiratory arrest).  \nConsuming this amount of alcohol in a short period of time is dangerous to your health. It is currently a poor idea to drive. You will return to sobriety in more than 20 hours "+noSleep+ drugString+noWater+noFood,"Results",JOptionPane.PLAIN_MESSAGE);
														break;
													case 16:
														JOptionPane.showMessageDialog(null,"After consuming " +drink+ " drinks over the period of "+timeNum+" hours, your BAC as an average female would be around 0.469 grams per milliliter of blood. \nIt's possible that you might fall into a coma. You might die due to the paralysis of your diaphragm, the collapse of your lungs, or heart attack (any form of respiratory arrest).  \nConsuming this amount of alcohol in a short period of time is dangerous to your health. It is currently a poor idea to drive. You will return to sobriety in more than 20 hours "+noSleep+ drugString+noWater+noFood,"Results",JOptionPane.PLAIN_MESSAGE);
														break;
													case 17:
														JOptionPane.showMessageDialog(null,"After consuming " +drink+ " drinks over the period of "+timeNum+" hours, your BAC as an average female would be around 0.499 grams per milliliter of blood. \nIt's possible that you might fall into a coma. You might die due to the paralysis of your diaphragm, the collapse of your lungs, or heart attack (any form of respiratory arrest).  \nConsuming this amount of alcohol in a short period of time is dangerous to your health. It is currently a poor idea to drive. You will return to sobriety in more than 20 hours "+noSleep+ drugString+noWater+noFood,"Results",JOptionPane.PLAIN_MESSAGE);
														break;
													default:
														JOptionPane.showMessageDialog(null,"After consuming " +drink+ " drinks over the period of "+timeNum+" hours, your BAC as an average female would be above 0.50 grams per milliliter of blood. \nIt's possible that you might fall into a coma. You might die due to the paralysis of your diaphragm, the collapse of your lungs, or heart attack (any form of respiratory arrest).  \nConsuming this amount of alcohol in a short period of time is dangerous to your health. It is currently a poor idea to drive. You will return to sobriety in more than 20 hours "+noSleep+ drugString+noWater+noFood,"Results",JOptionPane.PLAIN_MESSAGE);							
														break;
													}
												} else { //no food no water no sleep no drug
												switch (drink) { 
												case 1:
													JOptionPane.showMessageDialog(null,"After consuming " +drink+ " drinks over the period of "+timeNum+" hours, your BAC as an average female would be around 0.021 grams per milliliter of blood.\nYou are feeling a little more relaxed while still maintaining your full coordination. \nYou will return to sobriety in about an hour "+noSleep+noWater+noFood,"Results",JOptionPane.PLAIN_MESSAGE);
													break;
												case 2:
													JOptionPane.showMessageDialog(null,"After consuming " +drink+ " drinks over the period of "+timeNum+" hours, your BAC as an average female would be around 0.051 grams per milliliter of blood.\nYou are feeling a bit more relaxed and might have a feeling of well being or euphoria. \nYou will return to sobriety in about 3 hours "+noSleep+noWater+noFood,"Results",JOptionPane.PLAIN_MESSAGE);
													break;
												case 3:
													JOptionPane.showMessageDialog(null,"After consuming " +drink+ " drinks over the period of "+timeNum+" hours, your BAC as an average female would be around 0.081 grams per milliliter of blood.\nYou can definately tell that you are under the influence and your speech, motor skills, balance and judgement are affected. It is currently a poor idea to drive. \nYou will return to sobriety in about 5 hours. "+noSleep+noWater+noFood,"Results",JOptionPane.PLAIN_MESSAGE);
													break;
												case 4:
													JOptionPane.showMessageDialog(null,"After consuming " +drink+ " drinks over the period of "+timeNum+" hours, your BAC as an average female would be around 0.111 grams per milliliter of blood.\nYour speech will be slurred and your balance, vision, reactions time and hearing will be impaired. Your motor coordination will also be significantly impaired and you'll have a loss of good judgment. \nIt is currently a poor idea to drive. You will return to sobriety in about 7 hours "+noSleep+noWater+noFood,"Results",JOptionPane.PLAIN_MESSAGE);
													break;
												case 5:
													JOptionPane.showMessageDialog(null,"After consuming " +drink+ " drinks over the period of "+timeNum+" hours, your BAC as an average female would be around 0.141 grams per milliliter of blood.\nRight now, you'd be feeling gross motor impairment and a lack of physical control. It'd probably be hard for you to type on the keyboard and your monitor or mobile phone screen would appear blurry. \nYour judgment and perception of what’s going on would be severely impaired and any feeling of euphoria you had earlier will have turned to dysphoria. \nIt is currently a poor idea to drive. You will return to sobriety in about 8 hours "+noSleep+noWater+noFood,"Results",JOptionPane.PLAIN_MESSAGE);
													break;
												case 6: 
													JOptionPane.showMessageDialog(null,"After consuming " +drink+ " drinks over the period of "+timeNum+" hours, your BAC as an average female would be around 0.171 grams per milliliter of blood.\nYou'll probably start to feel sick to your stomach. Any euphoria you had earlier will have turned to dysphoria. Right now you might look like a 'sloppy drunk'. \nConsuming this amount of alcohol in a short period of time is dangerous to your health. \nIt is currently a poor idea to drive. You will return to sobriety in about 10 hours "+noSleep+noWater+noFood,"Results",JOptionPane.PLAIN_MESSAGE);
													break;
												case 7: 
													JOptionPane.showMessageDialog(null,"After consuming " +drink+ " drinks over the period of "+timeNum+" hours, your BAC as an average female would be around 0.201 grams per milliliter of blood.\nYou'll probably need help if you want to walk properly. If you fall down you probably won't feel a lot of pain – even if you hurt yourself. At this level of BAC, some people begin to vomit. At the very least, you'll feel dazed, confused and disoriented. \nConsuming this amount of alcohol in a short period of time is dangerous to your health. \nIt is currently a poor idea to drive. You will return to sobriety in about 12 hours "+noSleep+noWater+noFood,"Results",JOptionPane.PLAIN_MESSAGE);
													break;
												case 8: 
													JOptionPane.showMessageDialog(null,"After consuming " +drink+ " drinks over the period of "+timeNum+" hours, your BAC as an average female would be around 0.23 grams per milliliter of blood. \nIf you were awake at this point you'd have very little comprehension as to where you were or what you were doing. You might pass out suddenly and it'd be hard to wake you up. \nConsuming this amount of alcohol in a short period of time is dangerous to your health. It is currently a poor idea to drive. You will return to sobriety in about 14 hours "+noSleep+noWater+noFood,"Results",JOptionPane.PLAIN_MESSAGE);
													break;
												case 9:
													JOptionPane.showMessageDialog(null,"After consuming " +drink+ " drinks over the period of "+timeNum+" hours, your BAC as an average female would be around 0.26 grams per milliliter of blood. \nIf you were awake at this point you'd have very little comprehension as to where you were or what you were doing. You might pass out suddenly and it'd be hard to wake you up. \nConsuming this amount of alcohol in a short period of time is dangerous to your health. It is currently a poor idea to drive. You will return to sobriety in about 16 hours "+noSleep+noWater+noFood,"Results",JOptionPane.PLAIN_MESSAGE);
													break;
												case 10:
													JOptionPane.showMessageDialog(null,"After consuming " +drink+ " drinks over the period of "+timeNum+" hours, your BAC as an average female would be around 0.29 grams per milliliter of blood. \nIf you were awake at this point you'd have very little comprehension as to where you were or what you were doing. You might pass out suddenly and it'd be hard to wake you up. \nConsuming this amount of alcohol in a short period of time is dangerous to your health. It is currently a poor idea to drive. You will return to sobriety in about 17 hours "+noSleep+noWater+noFood,"Results",JOptionPane.PLAIN_MESSAGE);
													break;
												case 11:
													JOptionPane.showMessageDialog(null,"After consuming " +drink+ " drinks over the period of "+timeNum+" hours, your BAC as an average female would be around 0.32 grams per milliliter of blood. \nIt's possible that you might fall into a coma. You might die due to the paralysis of your diaphragm, the collapse of your lungs, or heart attack (any form of respiratory arrest). \nConsuming this amount of alcohol in a short period of time is dangerous to your health. It is currently a poor idea to drive. You will return to sobriety in about 19 hours "+noSleep+noWater+noFood,"Results",JOptionPane.PLAIN_MESSAGE);
													break;
												case 12:
													JOptionPane.showMessageDialog(null,"After consuming " +drink+ " drinks over the period of "+timeNum+" hours, your BAC as an average female would be around 0.35 grams per milliliter of blood. \nIt's possible that you might fall into a coma. You might die due to the paralysis of your diaphragm, the collapse of your lungs, or heart attack (any form of respiratory arrest). \nConsuming this amount of alcohol in a short period of time is dangerous to your health. It is currently a poor idea to drive. You will return to sobriety in more than 20 hours "+noSleep+noWater+noFood,"Results",JOptionPane.PLAIN_MESSAGE);
													break;
												case 13:
													JOptionPane.showMessageDialog(null,"After consuming " +drink+ " drinks over the period of "+timeNum+" hours, your BAC as an average female would be around 0.38 grams per milliliter of blood. \nIt's possible that you might fall into a coma. You might die due to the paralysis of your diaphragm, the collapse of your lungs, or heart attack (any form of respiratory arrest). \nConsuming this amount of alcohol in a short period of time is dangerous to your health. It is currently a poor idea to drive. You will return to sobriety in more than 20 hours "+noSleep+noWater+noFood,"Results",JOptionPane.PLAIN_MESSAGE);
													break;
												case 14:
													JOptionPane.showMessageDialog(null,"After consuming " +drink+ " drinks over the period of "+timeNum+" hours, your BAC as an average female would be around 0.41 grams per milliliter of blood. \nIt's possible that you might fall into a coma. You might die due to the paralysis of your diaphragm, the collapse of your lungs, or heart attack (any form of respiratory arrest). \nConsuming this amount of alcohol in a short period of time is dangerous to your health. It is currently a poor idea to drive. You will return to sobriety in more than 20 hours "+noSleep+noWater+noFood,"Results",JOptionPane.PLAIN_MESSAGE);
													break;
												case 15:
													JOptionPane.showMessageDialog(null,"After consuming " +drink+ " drinks over the period of "+timeNum+" hours, your BAC as an average female would be around 0.44 grams per milliliter of blood. \nIt's possible that you might fall into a coma. You might die due to the paralysis of your diaphragm, the collapse of your lungs, or heart attack (any form of respiratory arrest).  \nConsuming this amount of alcohol in a short period of time is dangerous to your health. It is currently a poor idea to drive. You will return to sobriety in more than 20 hours "+noSleep+noWater+noFood,"Results",JOptionPane.PLAIN_MESSAGE);
													break;
												case 16:
													JOptionPane.showMessageDialog(null,"After consuming " +drink+ " drinks over the period of "+timeNum+" hours, your BAC as an average female would be around 0.469 grams per milliliter of blood. \nIt's possible that you might fall into a coma. You might die due to the paralysis of your diaphragm, the collapse of your lungs, or heart attack (any form of respiratory arrest).  \nConsuming this amount of alcohol in a short period of time is dangerous to your health. It is currently a poor idea to drive. You will return to sobriety in more than 20 hours "+noSleep+noWater+noFood,"Results",JOptionPane.PLAIN_MESSAGE);
													break;
												case 17:
													JOptionPane.showMessageDialog(null,"After consuming " +drink+ " drinks over the period of "+timeNum+" hours, your BAC as an average female would be around 0.499 grams per milliliter of blood. \nIt's possible that you might fall into a coma. You might die due to the paralysis of your diaphragm, the collapse of your lungs, or heart attack (any form of respiratory arrest).  \nConsuming this amount of alcohol in a short period of time is dangerous to your health. It is currently a poor idea to drive. You will return to sobriety in more than 20 hours "+noSleep+noWater+noFood,"Results",JOptionPane.PLAIN_MESSAGE);
													break;
												default:
													JOptionPane.showMessageDialog(null,"After consuming " +drink+ " drinks over the period of "+timeNum+" hours, your BAC as an average female would be above 0.50 grams per milliliter of blood. \nIt's possible that you might fall into a coma. You might die due to the paralysis of your diaphragm, the collapse of your lungs, or heart attack (any form of respiratory arrest).  \nConsuming this amount of alcohol in a short period of time is dangerous to your health. It is currently a poor idea to drive. You will return to sobriety in more than 20 hours "+noSleep+noWater+noFood,"Results",JOptionPane.PLAIN_MESSAGE);							
													break;
											}
											} 
										}
								}									
							}									
							} else { //drink<0
								JOptionPane.showMessageDialog(null,"After consuming " +drink+ " drinks over the period of "+timeNum+" hours, your BAC as an average female should be 0.00 grams per milliliter of blood. \nYou should feel completely normal with no adverse affects","Results",JOptionPane.PLAIN_MESSAGE);							
							}
					} else { //no gender selected
						JOptionPane.showMessageDialog(null,"Please select a gender for the simulator, gender plays an important role in determining how alcohol affects the body.","Uh Oh",JOptionPane.PLAIN_MESSAGE);							
					}
				}
			}
			
		); 	
		
		backJButton = new JButton("Back");
		backJButton.setBounds(50,650,200,50);
		contentPane.add(backJButton);
		backJButton.addActionListener(
			new ActionListener() {
				public void actionPerformed(ActionEvent event) {
					setVisible(false);
					Start app = new Start();
				}
			}
			
		); 

	
	    setSize(500, 750);
	    setTitle("Alcohol Consumption Simulator");
	    contentPane.setBackground(Color.WHITE);
	    setLocationRelativeTo(null);
	    setVisible(true);
	    setResizable(false);
    
	}
	

	
	
			
		public void setDefaultCloseOperation(int exitOnClose) {
			// TODO Auto-generated method stub
			
		}
	
	}
	



