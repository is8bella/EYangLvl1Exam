import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class CodingExersize implements ActionListener{

	JFrame frame = new JFrame("Color Teacher");
	JPanel panel = new JPanel();
	
	JButton yellow = new JButton();
	JButton red = new JButton();
	JButton blue = new JButton();
	JButton green = new JButton();
	
	public CodingExersize(){
	frame.setVisible(true);
	frame.setSize(500, 100);
	frame.add(panel);
	panel.add(yellow);
	panel.add(red);
	panel.add(blue);
	panel.add(green);
	
	yellow.setOpaque(true);
	yellow.setBackground(Color.yellow);
	red.setOpaque(true);
	red.setBackground(Color.red);
	blue.setOpaque(true);
	blue.setBackground(Color.blue);
	green.setOpaque(true);
	green.setBackground(Color.green);
	
	yellow.addActionListener(this);
	red.addActionListener(this);
	blue.addActionListener(this);
	green.addActionListener(this);
	}
	
	public static void main(String[] args) {
		CodingExersize CodingExersize = new CodingExersize();
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		//System.out.println("pressed");
		e.getSource();
		if(e.getSource().equals(yellow)){
			speak("yellow");
		}
		if(e.getSource().equals(red)){
			speak("red");
		}
		if(e.getSource().equals(blue)){
			speak("blue");
		}
		if(e.getSource().equals(green)){
			speak("green");
		}
		
	}
	void speak(String words){
		try{
			Runtime.getRuntime().exec("say " + words);
		}
		catch(IOException e){
			e.printStackTrace();
		}
	}

}
