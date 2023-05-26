package quiz.application;

import java.awt.*;

import javax.swing.*;
import java.awt.event.*;
public class Score extends JFrame implements ActionListener {
	Score(String name , int score){
		setBounds(300,70,750,550);
		getContentPane().setBackground(Color.cyan);
		setLayout(null);
		
		JLabel result= new JLabel("Result");
		result.setBounds(280, 12, 700, 50);
		result.setFont(new Font("Viner Hand ITC",Font.BOLD,50));
		add(result);
		
		JLabel heading = new JLabel("Thank You "+ name + " for playing MindGames" );
		heading.setBounds(95,80,600,30);
		heading.setFont(new Font("Copperplate Gothic Bold", Font.PLAIN,26));
		heading.setForeground(Color.red);
		add(heading);
		
		JLabel lblscore = new JLabel("Your Score is : " + score );
		lblscore.setBounds(250,160,300,30);
		lblscore.setFont(new Font("Copperplate Gothic Bold", Font.PLAIN,26));
		lblscore.setForeground(Color.RED);
		add(lblscore);
		
		JButton submit = new JButton("Play Again ");
			submit.setBounds(220,270,300,80);
			submit.setBackground(Color.BLACK);
			submit.setForeground(Color.cyan);
			submit.setFont(new Font("Copperplate Gothic Bold",Font.ITALIC, 22));
			submit.addActionListener(this);
			add(submit);
		
		
		
		setVisible(true);
	}
	
	public void actionPerformed(ActionEvent ae) {
		setVisible(false);
		new Login();
		
	}

	public static void main(String[] args) {
		
		new Score("User", 0);
	}

}
