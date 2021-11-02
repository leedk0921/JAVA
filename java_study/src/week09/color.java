package week09;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JButton;
import javax.swing.JLabel;

import java.awt.Color;
import java.awt.event.*;

public class color extends JFrame{
	public static final Color PINK = null;
	JButton btn1, btn2;
	JPanel pn,pnl;
	JLabel lbl;
	mylistener listener;
	
	
	
	color(){
		setTitle("Action이벤트");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	
		pnl=new JPanel(); //패널을 생성
		
		btn1=new JButton("분홍"); //버튼을 생성
		listener= new mylistener(); //리스너 생성
		btn1.addActionListener(listener); //버튼1에 리스너 적용
		pnl.add(btn1);//패널에 버튼1 추가
		
		btn2=new JButton("녹색"); //버튼을 생성
		btn2.addActionListener(listener);//버튼2에 리스너 적용
		pnl.add(btn2); //패널에 버튼2 추가
		
		add(pnl); //패널 추가
		
		setSize(400,200);
		setVisible(true);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new color();
	}
	
	class mylistener implements ActionListener{
		public void actionPerformed(ActionEvent e) {
			JButton btn=(JButton)e.getSource();
			
			if(btn.getText().equals("분홍")) {
				pnl.setBackground(Color.PINK);
			}
			if(btn.getText().equals("녹색")) {
				pnl.setBackground(Color.GREEN);
			}
		}

	}
}


