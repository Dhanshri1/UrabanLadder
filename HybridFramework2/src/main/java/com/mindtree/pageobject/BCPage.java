package com.mindtree.pageobject;

import org.openqa.selenium.WebDriver;

import com.mindtree.reusablecomponents.WebDriverHelper;
import com.mindtree.uistore.BCUi;

public class BCPage {
	
	WebDriver driver;
	WebDriverHelper helper;
	BCUi ui;
	
	public BCPage(WebDriver driver) {
		this.driver=driver;
		helper=new WebDriverHelper();
		ui=new BCUi() ;
	}
	
	public String getBCTitle() {
		String data=helper.getText(ui.bCTitle,driver);
		return data;
	}

}
