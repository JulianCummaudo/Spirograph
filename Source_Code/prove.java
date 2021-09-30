/**
* Questo programma fa aprire un J-frame con al suo interno dei cerchi.
* Il cerchio più grande non uscirà mai dai bordi del j-frame
* @version 11.04.2021
* @author Julian Cummaudo
*/

import javax.swing.JFrame;
import java.awt.Color;
import java.awt.Graphics;

public class Circles extends JFrame{

	/*Uso una costante solo per comodità, purtroppo il programma funziona solo
	con un raggio di 10.*/
	final static int CIRCLEDIAMETER = 10*2;

	public Circles(String title){
		super(title);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setSize(200,200);
	}

	public void paint(Graphics g){
		g.setColor(Color.GREEN);
		g.fillRect(0, 0, this.getWidth(), this.getHeight());
		g.setColor(Color.MAGENTA);

		int min = this.getWidth() < this.getHeight() 
		? this.getWidth()
		: this.getHeight();

        int numberOfCircles = min / CIRCLEDIAMETER-1;

        for(int i = 0; i < numberOfCircles; i++){
			int currentSize = i*10+CIRCLEDIAMETER/2;
			g.drawOval(this.getWidth()/2-currentSize,
				this.getHeight()/2-currentSize, currentSize*2, currentSize*2);
		}	
	}

	public static void main(String[] args) {
		java.awt.EventQueue.invokeLater(new Runnable(){
			public void run(){
				new Circles("Circles").setVisible(true);
			}
		});
	}

}