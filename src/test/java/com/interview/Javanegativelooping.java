package com.interview;

public class Javanegativelooping {
	
	//USA reverse
	//check USA is pallindrome or not
	String country="MOM";
	String afterReverse="";
	
	public void getvalue(){
		for (int i=country.length()-1;i>=0;i--) {
			System.out.print(country.charAt(i));
			//afterReverse=afterReverse+country.charAt(i);
			afterReverse+=country.charAt(i);
				
			
		} //loop end
		System.out.println("afterReverse="+afterReverse);
		
		//CONDITION
		if(country.equals(afterReverse)) {
			////pallindrome
			
		}else {
			System.out.println("not pallindrome");
		}
	  }
	
	
	public static void main(String[] args) {
		Javanegativelooping obj=new Javanegativelooping();
		obj.getvalue();
	}

}
