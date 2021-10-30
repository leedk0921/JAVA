package week09;

import javax.swing.JButton;
import javax.swing.JFrame;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class DGActionEvent extends JFrame{
	//ActionEvent�� JFrame�� ������ ��� �ްڴ�. +���� ��Ű�ڴ� ��� ��.
	DGActionEvent(){
		setTitle("�׼� �̺�Ʈ");
		//GUI������â ����
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
		 //MyActionListener�� ActionListener��� �������̽��� �����ϰڴ�.��� �ǹ�
		public void actionPerformed(ActionEvent e) {
			JButton b=(JButton)e.getSource();
			if(b.getText().equals("Action"))
				b.setText("�׼�");
			else
				b.setText("Action");
		}
	}
	
	
	
	

}
