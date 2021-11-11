package week11;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Container;
import java.awt.Font;
import java.awt.Graphics;

import javax.swing.*;

public class JPanel2 extends JFrame{
	Container contentPane;
	JPanel2(){
		setTitle("Color,Font ��� ����");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		contentPane=getContentPane();
		MyPanel panel=new MyPanel();
		contentPane.add(panel, BorderLayout.CENTER);
		setSize(350,450);
		setVisible(true);
		}
	
	class MyPanel extends JPanel{
		public void paintComponent(Graphics g) {
			super.paintComponent(g);
			g.setColor(Color.BLUE); //g���ٰ� ������
			g.drawString("I Love JAVA.~~", 30,30); //�����Է� (�Ķ��������)
			g.setColor(new Color(255,0,0));//g�� ���� ����
			g.setFont(new Font("Arial", Font.ITALIC,30));//���ڽ�Ÿ�� ����
			g.drawString("How much?", 30, 60);//���� �Է� ���� ����30, ���� ���� 60 (������ ��Ÿ�� ���� ���)
			g.setColor(new Color(0x00ff00ff));//g�� ��ȫ ����
			for(int i=1; i<=5; i++) {//�� 5�� �ݺ�
				g.setFont(new Font("Dialog",Font.ITALIC,i*10));//���̾�α�, ���ڸ�, ����ũ�� 10~50����
				g.drawString("this much!!", 30, 60+i*60);//���ο��� 30, ���� ���� 120~360����
			}
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new JPanel2();
	}

}
