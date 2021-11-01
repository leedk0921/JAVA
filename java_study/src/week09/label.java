package week09;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

import javax.swing.JButton;
import javax.swing.JPanel;

import java.awt.Color;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;



public class label extends JFrame{
	
	JTextField jf=new JTextField(15);
	JButton btn1=new JButton("copy");
	JButton btn2=new JButton("Clear");
	JLabel ji=new JLabel("이곳에 출력됨");
	
	label(){
		setTitle("Action 이벤트");
		setLayout(new GridLayout(3,1));
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		//자바프레임(JFrame)을 사용후 x를 눌러 닫아도 실제로는 JVM에 남아있다.
		//그걸 완전히 끄기 위함으로 깔끔하게 닫을 수 있다.
		JPanel jp1=new JPanel();
		JPanel jp2=new JPanel();
		JPanel jp3=new JPanel();
		
		jp1.add(jf);
		jp2.add(btn1);
		jp2.add(btn2);
		jp3.add(ji);
		
		MyActionListener2 listener =new MyActionListener2();
		btn1.addActionListener(listener);
		btn2.addActionListener(listener);
		add(jp1);
		add(jp2);
		add(jp3);
		setSize(300,400);
		//(가로, 세로) 프로그램GUI 크기
		setVisible(true);
		//창을 화면에 나타낼 것인지 설정
		}
	

	public static void main(String[] args) {
		new label();
	}
	
	class MyActionListener2 implements ActionListener{
		public void actionPerformed(ActionEvent sex) {
			JButton btn=(JButton)sex.getSource();
			//sex
			if(btn.getText().equals("copy")){
				String sr=jf.getText();
				//sr에 JText필드 속성 이용하여 값 받아옴
				Font f=new Font("Serif",Font.BOLD,30);
				//폰트 f는 적용하고 30폰트 굵은 "serif"글꼴이다.
				ji.setForeground(Color.red);
				//ji의 색을 빨강으로 적용
				ji.setFont(f);
				//폰트에 f값 스타일을 적용한다.
				ji.setText(sr);
				//sr에 입력된 값을 ji에 적용한다.
				
			}
			
			if(btn.getText().equals("Clear")) {
				jf.setText("");
				//jf칸을 비운다.
				ji.setText("이곳에 출력됨");
				//ji에 "이곳에 출력됨"을 적용시킨다.
			}
		}
	}
}
