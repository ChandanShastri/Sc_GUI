package Sc_GUI_Java;


import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Container;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class GUI_Manager extends JFrame {

	
	
	boolean clrscr=false;
	
	public GUI_Manager(String C)
	{
		super(C);
		
		
		
		
		setLayout(new BorderLayout());
		JTextArea T=new JTextArea("Enter Your Text Here");
		JButton B= new JButton("Press to Start.");
		Container CX=getContentPane();
		
		CX.add(B,BorderLayout.SOUTH);
		CX.add(T,BorderLayout.CENTER); 
		
		B.addActionListener(new ActionListener(){
			
			@SuppressWarnings("deprecation")
			public void actionPerformed(ActionEvent f)
			{   
				if(!clrscr)
				{
					B.setText("Good to go");
					T.setText(null);
					clrscr=true;
					T.setBackground(Color.pink);
				
				}
				else
				T.append("Chandan Shastri\n\n");
				
			}
		});
	}
	
	
}
