package com.mavenjenkinsgit.mavenJenkinsGit;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.Test;

public class ClassWxample1 {

	WebDriver driver;

	@Test
	public void test1(){
	
		//System.setProperty(key, value)
		
	System.setProperty("webdriver.chrome.driver",System.getProperty("user.dir")+ "/drivers/chromedriver.exe");	
		driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		
		System.out.println("-------test1 Example3 class-------");
		
	}
	@Test
	public void test2(){
		driver.findElement(By.xpath(".//*[@id='email']")).sendKeys("abc");
	}
		
		@Test
		public void test3(){
			driver.findElement(By.xpath(".//*[@id='pass']")).sendKeys("123");
			
			System.out.println("-------test2 Example3 class-------");
		}
		
		@Test
		public void test4(){
		driver.findElement(By.xpath(".//*[@id='u_0_2']")).click();
		Assert.assertEquals(driver.findElement(By.xpath(".//*[@id='header_block']/span")).getText(), "Log into Facebook");
	
		
		System.out.println("-------test3 Example3 class-------");
	
	
	}
	
	@AfterClass
	public void afterclass(){
		System.out.println("-------afterclass Example3 class-------");
		System.out.println("-------afterclass Example3 class-------and test is close");
		driver.close();
	}

	
	

}
