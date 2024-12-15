package com.interview;

import java.util.Arrays;

public class Javalooping {
	
	public void getvalue(String []user,String[]password){//local
		//System.out.println("credential="+Arrays.toString(myArray));
		System.out.println("only 1st user="+user[0]);
		System.out.println("only 2nd user="+user[1]);
		System.out.println("only 1st pass="+password[0]);
		System.out.println("only 2nd pass="+password[1]);
		
	}
	
	
	
	public static void main(String[] args) {
		String[]user= {"sabiha","Student"};
		String[]password={"sa1234","st1234"};
		Javalooping obj=new Javalooping();
		obj.getvalue(user,password);

		
	}
	
}
