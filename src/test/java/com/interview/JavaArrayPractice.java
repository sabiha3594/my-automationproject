package com.interview;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

//USA,UK=string

public class JavaArrayPractice {
	
	
	public static void main(String[] args) {
		String[]myArray= {"USA","BAN","USA","BAN"};
		Set<String> myset=new LinkedHashSet<>(Arrays.asList(myArray));
		System.out.println("no dup="+myset);
	}
}