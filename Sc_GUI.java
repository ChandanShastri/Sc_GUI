package Sc_GUI_Java;

import java.awt.Color;

import javax.swing.*;  
  


public class Sc_GUI {  
	
public static void main(String[] args) {
	
	
	
	
	SwingUtilities.invokeLater(new Runnable()
			
			{

		public void run(){	
			JFrame GUI= new GUI_Manager("ChandanShastri");
			GUI.setSize(400,400);
			GUI.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			
			GUI.setVisible(true);
		}
		
	});

	
	
	
}
	
  

}  
