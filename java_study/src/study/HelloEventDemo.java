package study;

import java.awt.FlowLayout;
import java.awt.event.*;

import javax.swing.*;

public class HelloEventDemo extends JFrame implements ActionListener{
	//기본 프로그램
	JLabel label;
	HelloEventDemo() {
		setTitle("이벤트 에제");
		setLayout(new FlowLayout());

		JButton b = new JButton("클릭");
		b.addActionListener(this);
		add(b);
		
		label = new JLabel();
		add(label);

		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(300, 200);
		setVisible(true);
	}
	
	public void actionPerformed(ActionEvent e) {
	//	System.out.println("버튼을 클릭했습니다.");
		label.setText("버튼이 눌림");
	}
	
	public static void main(String[] args) {
		new HelloEventDemo();
	}
}