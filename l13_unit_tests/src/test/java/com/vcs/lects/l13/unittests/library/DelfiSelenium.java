package com.vcs.lects.l13.unittests.library;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.By.ByClassName;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

import com.opera.core.systems.OperaDriver;

public class DelfiSelenium {

	@Test
	public void delfiPage() {

		WebDriver driver = new FirefoxDriver();

		driver.get("http://www.google.com");

		//WebElement element = driver.findElement(By.className("headline-title"));

		//WebElement link = element.findElement(ByClassName.className("CBarticleTitle"));
		//link.click();
	}

}
