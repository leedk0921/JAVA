package week11;
import javax.swing.*;
import java.awt.*;

public class DrawLine extends JFrame{
	Container contentPane = getContentPane();//컨텐트 팬을 알아낸다.
	DrawLine(){
		setTitle("drawLine 사용 예제");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		MyPanel panel =new MyPanel(); //패널을 만든다.
		contentPane.add(panel, BorderLayout.CENTER);//컨텐트팬에 패널과 정렬을 적용
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
