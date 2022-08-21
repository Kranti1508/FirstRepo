package com.tests;

import org.testng.Assert;
import org.testng.SkipException;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

import com.base.BaseClass;
import com.page.LoginPage;

public class LoginTest extends BaseClass
{
	LoginPage lp = null;
	@BeforeSuite
	public void setUp() throws Exception
	{
		initialization();
		lp = new LoginPage(driver);
		
	}
	
	@Test
	public void test01()
	{
		lp.loinToApplication("kiran@gmail.com", "123456");
		Assert.assertEquals(driver.getTitle(),"JavaByKiran | Dashboard");
	}
	
	@Test
	public void test02()
	{
		Assert.assertEquals(1, 2);
	}
	
	@Test
	public void test03()
	{
		throw new SkipException("skiiping a test cases");
	}
}
