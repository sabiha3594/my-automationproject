package com.testrun;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.asserts.SoftAssert;

public class ParabankPallindrome {
String reverseTitle="";

	public void getpallindrome(){
		//open browser
		WebDriver driver=new ChromeDriver();
		//go to application
		driver.get("https://parabank.parasoft.com/parabank/overview.htm");
		driver.manage().window().maximize();
		// String titleName=driver.findElement(By.xpath("//*[@title='ParaBank']")).getText();
		//System.out.println("My title="+titleName);
		 String mytitle=driver.findElement(By.xpath("//*[@title='ParaBank']")).getAttribute("title");
		 System.out.println("My title="+mytitle);
		 
		//now can check pallindrome=reverse+condition
		 System.out.println("mytitle="+mytitle);
			for(int i=mytitle.length()-1;i>=0;i--) {
			System.out.println(mytitle.charAt(i));	
			reverseTitle=reverseTitle+mytitle.charAt(i);//store
			//reverseTitle +=mytitle.charAt(i);//store
			}//loop end
			
			System.out.println("reverseTitle="+reverseTitle);
			//Pallindrome=before reverse string=after reverse
			//java condition
			if (mytitle.equals(reverseTitle)) {
				System.out.println("This is Pallindrome");//condition=true
			}else {
				System.out.println("This is not Pallindrome");//condition=false
			}
			//validation
			SoftAssert sf=new SoftAssert();
			sf.assertFalse(mytitle.equals(reverseTitle));
			driver.quit();
			
			sf.assertAll();
		}
	
	
	public static void main(String[] args) {
		
		ParabankPallindrome obj=new ParabankPallindrome();
		obj.getpallindrome();
		
	}
}
