package org.hexa.tester;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SeleniumTask {
public static void main(String[] args) {
	
	System.setProperty("webdriver.chrome.driver", "E:\\Selenium\\Driver\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.get("https://en-gb.facebook.com");
	WebElement findElement = driver.findElement(By.cssSelector("#email"));
	JavascriptExecutor js=(JavascriptExecutor)driver;
	js.executeScript("arguments[0].setAttribute('value','greens')", findElement);
	WebElement findElement2 = driver.findElement(By.cssSelector("#pass"));
	js.executeScript("arguments[0].setAttribute('value','mail')", findElement2);
	
}
}
