package week11;
import javax.swing.*;

import week11.DrawLine.MyPanel;

import java.awt.*;

public class EX1_1 extends JFrame{
	Container contentPane = getContentPane();
	EX1_1(){
		setTitle("����� ��� ����");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		MyPanel panel =new MyPanel(); //�г��� �����.
		contentPane.add(panel, BorderLayout.CENTER);//����Ʈ�ҿ� �гΰ� ������ ����
		setSize(300,300);
		setVisible(true);
	}
	
	class MyPanel extends JPanel{
		public void paintComponent(Graphics g) {
			super.paintComponent(g);
			g.setColor(Color.red);
			g.drawArc(25,15,230,230, 90,120);
			g.fillArc(25,15,230,230, 90,120); //ä�ﶩ fill ���ܤ�
			
			g.setColor(Color.blue);
			g.drawArc(25,15,230,230, 210,120);
			g.fillArc(25,15,230,230, 210,120);
			
			g.setColor(Color.yellow);
			g.drawArc(25,15,230,230, 330,120);
			g.fillArc(25,15,230,230, 330,120);
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new EX1_1();
	}

}
