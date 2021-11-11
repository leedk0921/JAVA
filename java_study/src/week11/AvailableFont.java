package week11;

import java.awt.GraphicsEnvironment;
//getAvailableFontFamilyNames() : 사용가능한 폰트 알아보기

public class AvailableFont {

	public static void main(String[] args) {
		String fonts[]=
				GraphicsEnvironment.getLocalGraphicsEnvironment().getAvailableFontFamilyNames();
			for(int i=0; i<fonts.length; i++)
			{
				System.out.println(fonts[i]);
			}
	}

}
