package week11;
import java.awt.*;
import javax.swing.*;

public class EX1_3 extends JFrame{
	Container contentpane = getContentPane();
	
	EX1_3(){
		setTitle("���� �׸���");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		Mypanel Panel= new Mypanel();
		contentpane.add(Panel,BorderLayout.CENTER);
		setSize(315,300);
		setVisible(true);
	}
	
	class Mypanel extends JPanel{
		public void paintComponent(Graphics g) {
			super.paintComponent(g);
			g.setColor(Color.BLACK);
	
			for(int i=1; i<=10; i++) {
				g.drawLine(i*30, 0, i*30, 300); //���ν�����ġ, ���ν�����ġ, ���γ�������ġ, ���γ�������ġ
				g.drawLine(0, i*30, 300, i*30);
			}
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new EX1_3();
	}

}
