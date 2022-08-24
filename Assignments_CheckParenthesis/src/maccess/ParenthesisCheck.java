package maccess;

import java.util.Stack;

public class ParenthesisCheck {
	
	public boolean findMatch(char ch1,char val) {
		System.out.println("ch1::"+ch1);  //}
		System.out.println("val::"+val);  //{
		boolean k=false;
		
		
		if(val=='(') {
			if(ch1=='}')
				k=true;
		}//end of if
		else if(val=='{') {
			if(ch1=='}')
				k=true;
		}//end of else if
		else if(val=='[') {
			if(ch1==']')
				k=true;
		}//end of else if
		return k;
	}
	
	//method to check parenthesis
	public boolean check(String s) {
		Stack<Character> stck=new Stack<Character>();
		boolean k2=false;int countOpen=0,countClose=0;
		XYZ:
		for(int i=0;i<s.length();i++) {
			//if entry bracket keep it in stack
			char ch=s.charAt(i);
			if(ch=='('||ch=='{'||ch=='[') {
				System.out.println("hello");
			 stck.push(ch);countOpen++;
			 System.out.println("stack size::"+stck.size());
			}
			else if(ch==')'||ch=='}'||ch=='}') {
				countClose++;
				//check whether stack has element or not
				if(!(stck.empty())) {
				System.out.println("hii");
				char c=stck.pop();
				boolean res=this.findMatch(ch, c);
				//compare the result
				if(res==false) {
					
					break XYZ;
				}//end of if
				
			}//end of empty if
		}//end of else if	
			
			
		}//end of for loop
		if(countOpen==countClose && stck.empty()==true) {
			k2=true;
		}
		
		return k2;
	}//end of method
	
	


}///end of class
