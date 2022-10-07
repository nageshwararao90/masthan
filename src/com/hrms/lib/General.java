package com.hrms.lib;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class General extends Global {
	WebDriver driver;
	//@BeforeClass
	public void startup() {
		System.setProperty("webdriver.chrome.driver","C:\\Automation\\Driver//chromedriver.exe");
		driver=new ChromeDriver();
		driver.get(url);
		System.out.println("Appliction is opened");
	}
	//@AfterClass
	public void tearDown() {
		driver.close();
		System.out.println("Appliction is closed");
	}
	public void login() {
		driver.findElement(By.name(txt_loginname)).sendKeys(un);
		driver.findElement(By.name(txt_password)).sendKeys(pw);
		driver.findElement(By.name(btn_login)).click();
		System.out.println("Login completed");
	}
	public void logout() {
		driver.findElement(By.linkText(link_logout)).click();
		System.out.println("Logout completed");
		}
	public void enterframe() {
		driver.switchTo().frame(0);
	}
	public void exitframe() {
		driver.switchTo().defaultContent();
	}
	//@Test
	public void tc001()throws Exception {
		driver.navigate().to(url);
		System.out.println("Appliction is opened");
		driver.findElement(By.name(txt_loginname)).sendKeys(un);
		driver.findElement(By.name(txt_password)).sendKeys(pw);
		driver.findElement(By.name(btn_login)).click();
		Thread.sleep(3000);
		System.out.println("Login completed");
		//mouseover
		Actions ac=new Actions(driver);
		ac.moveToElement(driver.findElement(By.linkText("ADMIN"))).perform();
		Thread.sleep(4000);
		System.out.println("Enter into Admin");
		ac.moveToElement(driver.findElement(By.linkText("JOB"))).perform();
		System.out.println("Enter into job");
		Thread.sleep(4000);
		ac.moveToElement(driver.findElement(By.linkText("Job Title"))).perform();
		System.out.println("Enter into job title");
		Thread.sleep(4000);
		System.out.println("mouseover completed");
		Thread.sleep(4000);
		//enter frame
		driver.switchTo().frame(0);
		Thread.sleep(4000);
		driver.findElement(By.name(btn_add)).click();
		driver.findElement(By.name(txt_jobtitlename)).sendKeys("softwere tester");
		driver.findElement(By.name(txt_jobtitledescription)).sendKeys("manual tesitng");
		Select st=new Select(driver.findElement(By.name("cmbJobSpecId")));
		//st.selectByvisableText("Orange");
		//st.selectByindex(2);
		st.selectByIndex(0);
		Thread.sleep(4000);
		Select st1=new Select(driver.findElement(By.name("cmbPayGrade")));
		//st1.selectByvisableText("BRM");
		//st1.selectByindex(3);
		st1.selectByIndex(0);
		Thread.sleep(4000);
		driver.findElement(By.xpath(btn_save)).click();
		System.out.println("job Title details completed");
		Thread.sleep(3000);
		driver.switchTo().defaultContent();
		driver.findElement(By.linkText(link_logout)).click();
		System.out.println("Logout completed");
		}	
	 

}
