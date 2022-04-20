package com.qa.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class NewTest {
	WebDriver wd ;
	
	  @Test
	  public void f() {
		  
		  System.out.println("IS it runnig JBB?");
		  System.setProperty("webdriver.gecko.driver", "E:\\geckodriver.exe");
			
		  wd = new FirefoxDriver();
			 wd.get("https://www.google.com");
			 wd.findElement(By.xpath("//*[@name='q']")).sendKeys("Jai Bajrang Bali"+Keys.ENTER);
			
	  }
}
