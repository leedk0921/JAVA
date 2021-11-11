package week11;
import javax.swing.*;
import java.awt.*;

public class DrawLine extends JFrame{
	Container contentPane = getContentPane();//����Ʈ ���� �˾Ƴ���.
	DrawLine(){
		setTitle("drawLine ��� ����");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		MyPanel panel =new MyPanel(); //�г��� �����.
		contentPane.add(panel, BorderLayout.CENTER);//����Ʈ�ҿ� �гΰ� ������ ����
		setSize(200,150);
		setVisible(true);
	}
	
	class MyPanel extends JPanel{
		public void paintComponent(Graphics g) {
			super.paintComponent(g);
			g.setColor(Color.RED);
			g.drawLine(20,20,100,100);
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new DrawLine();
	}

}
