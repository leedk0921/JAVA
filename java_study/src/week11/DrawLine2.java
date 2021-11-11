package week11;
import java.awt.*;
import javax.swing.*;

public class DrawLine2 extends JFrame{
	Container contentPane = getContentPane();
	DrawLine2(){
		setTitle("drawLine 사용 예제");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		MyPanel panel=new MyPanel();
		contentPane.add(panel,BorderLayout.CENTER);
		setSize(300,600);
		setVisible(true);
	}
	
	class MyPanel extends JPanel{
		public void paintComponent(Graphics g) {
			super.paintComponent(g);
			Graphics2D g2= (Graphics2D)g;
			g2.setStroke(new BasicStroke(10));
			
			g.setColor(Color.RED);
			g.drawLine(20,20,100,100);
			g.drawOval(20,150,80,80);
			g.drawRect(20,270,80,80);
			g.drawArc(20,400,80,80,90,270);
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new DrawLine2();
	}

}
