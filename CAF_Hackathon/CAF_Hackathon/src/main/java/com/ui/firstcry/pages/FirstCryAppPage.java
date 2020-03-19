package com.ui.firstcry.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class FirstCryAppPage {

	

	@FindBy(css = "div.fc_sh.fc_transform:nth-child(4) div.fc-Menu:nth-child(10) div.mam div.mct.liquid_header_main div.menu-container ul:nth-child(1) li.B14_42.allcat:nth-child(1) > a:nth-child(1)")
	private WebElement allCategories;
	
	
}
