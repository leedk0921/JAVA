package week09;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

import javax.swing.JButton;
import javax.swing.JPanel;

import java.awt.Color;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;



public class label extends JFrame{
	
	JTextField jf=new JTextField(15);
	JButton btn1=new JButton("copy");
	JButton btn2=new JButton("Clear");
	JLabel ji=new JLabel("�̰��� ��µ�");
	
	label(){
		setTitle("Action �̺�Ʈ");
		setLayout(new GridLayout(3,1));
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		//�ڹ�������(JFrame)�� ����� x�� ���� �ݾƵ� �����δ� JVM�� �����ִ�.
		//�װ� ������ ���� �������� ����ϰ� ���� �� �ִ�.
		JPanel jp1=new JPanel();
		JPanel jp2=new JPanel();
		JPanel jp3=new JPanel();
		
		jp1.add(jf);
		jp2.add(btn1);
		jp2.add(btn2);
		jp3.add(ji);
		
		MyActionListener2 listener =new MyActionListener2();
		btn1.addActionListener(listener);
		btn2.addActionListener(listener);
		add(jp1);
		add(jp2);
		add(jp3);
		setSize(300,400);
		//(����, ����) ���α׷�GUI ũ��
		setVisible(true);
		//â�� ȭ�鿡 ��Ÿ�� ������ ����
		}
	

	public static void main(String[] args) {
		new label();
	}
	
	class MyActionListener2 implements ActionListener{
		public void actionPerformed(ActionEvent sex) {
			JButton btn=(JButton)sex.getSource();
			//sex
			if(btn.getText().equals("copy")){
				String sr=jf.getText();
				//sr�� JText�ʵ� �Ӽ� �̿��Ͽ� �� �޾ƿ�
				Font f=new Font("Serif",Font.BOLD,30);
				//��Ʈ f�� �����ϰ� 30��Ʈ ���� "serif"�۲��̴�.
				ji.setForeground(Color.red);
				//ji�� ���� �������� ����
				ji.setFont(f);
				//��Ʈ�� f�� ��Ÿ���� �����Ѵ�.
				ji.setText(sr);
				//sr�� �Էµ� ���� ji�� �����Ѵ�.
				
			}
			
			if(btn.getText().equals("Clear")) {
				jf.setText("");
				//jfĭ�� ����.
				ji.setText("�̰��� ��µ�");
				//ji�� "�̰��� ��µ�"�� �����Ų��.
			}
		}
	}
}
