package week11;
import javax.swing.*;
import java.awt.*;


public class EX1_2 extends JFrame{
	Container contentPane = getContentPane();
	
	EX1_2(){
		setTitle("오륜기");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		Mypanel Panel = new Mypanel();
		contentPane.add(Panel, BorderLayout.CENTER);
		setSize(450,270);
		setVisible(true);
	}

		class Mypanel extends JPanel{
			public void paintComponent(Graphics g) {
				super.paintComponent(g);
				
				Graphics2D g2=(Graphics2D)g;	//그래픽2D를 이용하면 굵기조정가능
				g2.setStroke(new BasicStroke(5));
				
				
				g.setColor(Color.blue);
				g.drawOval(30, 20, 100, 100);
				
				g.setColor(Color.black);
				g.drawOval(140, 20, 100, 100);
				
				g.setColor(Color.red);
				g.drawOval(250, 20, 100, 100);
				
				g.setColor(Color.yellow);
				g.drawOval(85, 70, 100, 100);
				
				g.setColor(Color.green);
				g.drawOval(195, 70, 100, 100);
				
			}
		}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new EX1_2();
	}

}
