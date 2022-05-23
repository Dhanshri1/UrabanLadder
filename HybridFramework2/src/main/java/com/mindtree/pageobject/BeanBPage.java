package com.mindtree.pageobject;

import org.openqa.selenium.WebDriver;

import com.mindtree.reusablecomponents.WebDriverHelper;
import com.mindtree.uistore.BeanBagUi;


public class BeanBPage {

	WebDriver driver;
	WebDriverHelper helper;
	BeanBagUi ui;
	
	public BeanBPage(WebDriver driver) {
		this.driver=driver;
		helper=new WebDriverHelper();
		ui=new BeanBagUi();
	}
	
	public String getBeanBagTitle() {
		String data=helper.getText(ui.Beanbagxpath,driver);
		return data;
	}
}

