package week09;

import week09.color.mylistener;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.JButton;

import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

private int number;

public class kiloZero1 extends JFrame{
	JLabel lbl=new JLabel("�Ÿ��� ���� ������ �Է��Ͻÿ�");
	JTextField TF,TFF;
	JButton btn1, btn2;
	mylistener listener;
	
	
	kiloZero1(){
		setTitle("������ ų�ι��ͷ� ��ȯ");
		setLayout(new GridLayout(3,1));
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		JPanel pnl1 =new JPanel();
		JPanel pnl2 =new JPanel();
		JPanel pnl3 =new JPanel();
		
		TF=new JTextField(15);
		TFF=new JTextField(20);
		TFF.setEditable(false);
		pnl3.add(TFF);
		
		pnl1.add(lbl);
		pnl1.add(TF);
		add(pnl1);
		
		listener= new mylistener();
		
		btn1=new JButton("��ȯ");
		btn1.addActionListener(listener);
		pnl2.add(btn1);
		
		btn2=new JButton("����");
		btn2.addActionListener(listener);
		pnl2.add(btn2);
		
		add(pnl2);
		add(pnl3);
		
		setSize(400,200);
		setVisible(true);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new kiloZero1();
	}

	class mylistener implements ActionListener{
		public void actionPerformed(ActionEvent e) {
			JButton btn=(JButton)e.getSource();
			Float sr;
			if(btn.getText().equals("��ȯ")) {
				sr=TF
			}
			
		}
		
	}
}
