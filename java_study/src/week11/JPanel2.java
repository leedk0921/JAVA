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
		setTitle("Color,Font 사용 예제");
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
			g.setColor(Color.BLUE); //g에다가 블루삽입
			g.drawString("I Love JAVA.~~", 30,30); //글자입력 (파랑글자출력)
			g.setColor(new Color(255,0,0));//g에 빨강 삽입
			g.setFont(new Font("Arial", Font.ITALIC,30));//글자스타일 삽입
			g.drawString("How much?", 30, 60);//글자 입력 왼쪽 여백30, 세로 여백 60 (빨강에 스타일 적용 출력)
			g.setColor(new Color(0x00ff00ff));//g에 분홍 삽입
			for(int i=1; i<=5; i++) {//총 5번 반복
				g.setFont(new Font("Dialog",Font.ITALIC,i*10));//다이얼로그, 이텔릭, 글자크기 10~50까지
				g.drawString("this much!!", 30, 60+i*60);//가로여백 30, 세로 여백 120~360까지
			}
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new JPanel2();
	}

}
