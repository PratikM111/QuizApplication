package quiz.application;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class Login extends JFrame implements ActionListener{

	JButton rules, Back;
	JTextField TFname;
	Login(){
		getContentPane().setBackground(Color.CYAN);
		
		setLayout(null);

		
		JLabel heading= new JLabel("MINDGAMES");
		heading.setBounds(650, 70, 350, 70);
		heading.setFont(new Font("Viner Hand ITC",Font.BOLD,50));
		heading.setForeground(Color.BLACK);
		add(heading);
		
		
		JLabel name= new JLabel("Enter Your Name :");
		name.setBounds(735, 170, 300, 30);
		name.setFont(new Font("Comic Sans MS",Font.BOLD,20));
		name.setForeground(Color.ORANGE);
		add(name);

		JLabel Quiz= new JLabel("QUIZ TIME");
		Quiz.setBounds(50, 60, 300, 45);
		Quiz.setFont(new Font("Viner Hand ITC",Font.BOLD,50));
		add(Quiz);
		
		 TFname= new  JTextField();
		TFname.setBounds(735, 200, 300, 35);
		TFname.setFont(new Font("Times New Roman",Font.BOLD,20));
		add(TFname);
		
		 rules= new JButton("Rules");       
		rules.setBounds(735, 250, 90, 25);
		rules.setBackground(Color.darkGray);
		rules.setForeground(Color.ORANGE);
		rules.addActionListener(this);
		add(rules);
		

		 Back= new JButton("Back");       
		Back.setBounds(943, 250, 90, 25);
		Back.setBackground(Color.darkGray);
		Back.setForeground(Color.ORANGE);
		Back.addActionListener(this);

		add(Back);
		
		
		setSize(1200,500);
		setLocation(70,50);
		setVisible(true);
		
	}
	public void actionPerformed(ActionEvent ae) {
		if (ae.getSource()== rules) {
		    String name= TFname.getText();
		    new Rules(name);
		    setVisible(false);
            
		}else if(ae.getSource()==Back){
			setVisible(false);
		}
		
	}
	
	public static void main(String[] args) {
       new Login();
		
	}

}
