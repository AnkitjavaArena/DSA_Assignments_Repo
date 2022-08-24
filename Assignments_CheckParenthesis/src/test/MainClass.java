package test;

import maccess.ParenthesisCheck;

public class MainClass {
	public static void main(String[] args) {
		boolean b2=new ParenthesisCheck().check("{{{{}}}}");
		if(b2==true)
			System.out.println("balanced....");
		else
			System.out.println("unbaLAnced...");
	}//end of main method
}//end of main
