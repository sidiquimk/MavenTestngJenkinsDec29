package com.MavenTestNG;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class BaseClass {
	
	@Test
	public void setup (){
		System.setProperty("webdriver.chrome.driver", "drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.google.com.ar/");
		driver.manage().window().maximize();
		driver.manage().timeouts().equals(asd)
		driver.manage().timeouts().equals(asd)
	}

}
