package study;

import java.awt.FlowLayout;
import java.awt.event.*;

import javax.swing.*;

public class HelloEventDemo extends JFrame implements ActionListener{
	//�⺻ ���α׷�
	JLabel label;
	HelloEventDemo() {
		setTitle("�̺�Ʈ ����");
		setLayout(new FlowLayout());

		JButton b = new JButton("Ŭ��");
		b.addActionListener(this);
		add(b);
		
		label = new JLabel();
		add(label);

		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(300, 200);
		setVisible(true);
	}
	
	public void actionPerformed(ActionEvent e) {
	//	System.out.println("��ư�� Ŭ���߽��ϴ�.");
		label.setText("��ư�� �������ϴ�sss.");
	}
	
	public static void main(String[] args) {
		new HelloEventDemo();
	}
}