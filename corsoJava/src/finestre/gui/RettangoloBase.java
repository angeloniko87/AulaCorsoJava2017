package finestre.gui;

import java.awt.Graphics;//finestre di sistema
import java.awt.Graphics2D;
import java.awt.Rectangle;//classe Rectangle 

import javax.swing.JComponent;

public class RettangoloBase extends JComponent {
	
	public void paintComponent(Graphics g){
		
		Graphics2D g2= (Graphics2D) g ;
				
		Rectangle box= new Rectangle(60	,60,20,30);
		
		g2.draw(box);
		box.translate(10,10);
		g2.draw(box);
		
	}
	

}
