package week11;
import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.Graphics;

import javax.swing.*;


public class JPanel1 extends JFrame{
	Container contentPane;
	JPanel1(){
		setTitle("DrawString ��뿹��");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		contentPane=getContentPane();
		MyPanel panel =new MyPanel();
		contentPane.add(panel, BorderLayout.CENTER);
		setSize(250,200);
		setVisible(true);
	}
	class MyPanel extends JPanel{
		public void paintComponent(Graphics g) {
			super.paintComponent(g);
			g.drawString("�ڹٴ� ��մ�.", 30,30);
			g.drawString("�󸶳�? �ϴø�ŭ ����ŭ",60,60);
		}
	}
	
	public static void main(String[] args) {
		new JPanel1();

	}

}
