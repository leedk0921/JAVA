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
		setTitle("Action�̺�Ʈ");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	
		pnl=new JPanel(); //�г��� ����
		
		btn1=new JButton("��ȫ"); //��ư�� ����
		listener= new mylistener(); //������ ����
		btn1.addActionListener(listener); //��ư1�� ������ ����
		pnl.add(btn1);//�гο� ��ư1 �߰�
		
		btn2=new JButton("���"); //��ư�� ����
		btn2.addActionListener(listener);//��ư2�� ������ ����
		pnl.add(btn2); //�гο� ��ư2 �߰�
		
		add(pnl); //�г� �߰�
		
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
			
			if(btn.getText().equals("��ȫ")) {
				pnl.setBackground(Color.PINK);
			}
			if(btn.getText().equals("���")) {
				pnl.setBackground(Color.GREEN);
			}
		}

	}
}


