package week09;

import javax.swing.JButton;
import javax.swing.JFrame;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class DGActionEvent extends JFrame{
	//ActionEvent는 JFrame의 내용을 상속 받겠다. +알파 시키겠다 라는 뜻.
	DGActionEvent(){
		setTitle("액션 이벤트");
		//GUI윈도우창 제목
		setLayout(new FlowLayout());
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JButton btn=new JButton("Action");
		MyActionListener listener = new MyActionListener();
		btn.addActionListener(listener);
		add(btn);
		setSize(300,150);
		setVisible(true);
	}
	
	public static void main(String[]args) {
		new DGActionEvent();
	}
	
	class MyActionListener implements ActionListener{
		 //MyActionListener는 ActionListener라는 인터페이스를 구현하겠다.라는 의미
		public void actionPerformed(ActionEvent e) {
			JButton b=(JButton)e.getSource();
			if(b.getText().equals("Action"))
				b.setText("액션");
			else
				b.setText("Action");
		}
	}
	
	
	
	

}
