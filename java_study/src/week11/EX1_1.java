package week11;
import javax.swing.*;

import week11.DrawLine.MyPanel;

import java.awt.*;

public class EX1_1 extends JFrame{
	Container contentPane = getContentPane();
	EX1_1(){
		setTitle("삼원색 사용 예제");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		MyPanel panel =new MyPanel(); //패널을 만든다.
		contentPane.add(panel, BorderLayout.CENTER);//컨텐트팬에 패널과 정렬을 적용
		setSize(300,300);
		setVisible(true);
	}
	
	class MyPanel extends JPanel{
		public void paintComponent(Graphics g) {
			super.paintComponent(g);
			g.setColor(Color.red);
			g.drawArc(25,15,230,230, 90,120);
			g.fillArc(25,15,230,230, 90,120); //채울땐 fill 써줌ㅋ
			
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
