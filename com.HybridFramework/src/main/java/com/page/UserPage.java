package com.page;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class UserPage 
{
	@FindBy(xpath="//span[text()='Users']")
	private WebElement userlink;
	
	@FindBy(xpath="//button[text()='Add User']")
	private WebElement adduserbtn;
	
	@FindBy(id="username")
	private WebElement username;
	
	@FindBy(id="mobile")
	private WebElement mobile;
	
	@FindBy(id="email")
	private WebElement email;
	
	@FindBy(id="course")
	private WebElement course;
	
	@FindBy(id="Female")
	private WebElement gender;
	
	@FindBy(xpath="//select[@class='form-control']")
	private WebElement state;
	
	@FindBy(id="password")
	private WebElement password;
	
}
