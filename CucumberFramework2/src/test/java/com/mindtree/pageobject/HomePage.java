package com.mindtree.pageobject;

import org.openqa.selenium.WebDriver;

import com.mindtree.reusablecomponents.WebDriverHelper;
import com.mindtree.uistore.HomePageUi;

public class HomePage {
	
	WebDriver driver;
	WebDriverHelper helper;
	HomePageUi ui;
	
	public HomePage(WebDriver driver) {
		this.driver=driver;
		helper=new WebDriverHelper();
		ui=new HomePageUi();
	}
	
	public void clkOnAdmin() {
		helper.clickOn(ui.adminUi,driver);
		System.out.println("Successfully click");
	}
	
	public void clkOnLogin() {
		helper.clickOn(ui.LogInxpath,driver);
		System.out.println("Successfully click on login");
	}

}
