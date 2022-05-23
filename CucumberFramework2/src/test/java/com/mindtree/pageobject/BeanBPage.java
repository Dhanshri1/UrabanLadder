package com.mindtree.pageobject;

import org.openqa.selenium.WebDriver;

import com.mindtree.reusablecomponents.WebDriverHelper;
import com.mindtree.uistore.BeanBUi;


public class BeanBPage {

	WebDriver driver;
	WebDriverHelper helper;
	BeanBUi ui;
	
	public BeanBPage(WebDriver driver) {
		this.driver=driver;
		helper=new WebDriverHelper();
		ui=new BeanBUi();
	}
	
	public String getbeanBTitle() {
		String data=helper.getText(ui.beanBagTitleXpath,driver);
		return data;
	}
}
