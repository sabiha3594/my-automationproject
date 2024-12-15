package com.interview;

public class PracticeJavaLooping {
	//Reverse MOM
	String beforeReverse="America";
	String afterReverse="";
	public void getvalue() {
		System.out.println("Before reverse="+beforeReverse);
		for(int i=beforeReverse.length()-1;i>=0;i--) {
		System.out.println(beforeReverse.charAt(i));	
			afterReverse=afterReverse+beforeReverse.charAt(i);//store
		//afterReverse +=beforeReverse.charAt(i);//store
		}//loop end
		System.out.println("afterReverse="+afterReverse);
		//Pallindrome=before reverse string(beforeReverse)=after reverse(afterReverse)
		//java condition
		if (beforeReverse.equals(afterReverse)) {
			System.out.println("This is Pallindrome");//condition=true
		}else {
			System.out.println("This is not Pallindrome");//condition=false
		}
		
	}
	
	
	public static void main(String[] args) {
		PracticeJavaLooping obj=new PracticeJavaLooping();
		obj.getvalue();
		
	}
	
}

