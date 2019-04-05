package com.vcs.lects.l13.unittests.library;

import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class DelfiSelenium {

	@Test
	public void delfiPage() throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "/snap/bin/chromium");
        ChromeOptions chromeOptions = new ChromeOptions();
        chromeOptions.addArguments("--headless");
        chromeOptions.addArguments("--no-sandbox");

        WebDriver driver = new ChromeDriver(chromeOptions);

        driver.get("https://google.com");

        Thread.sleep(1000);

        if (driver.getPageSource().contains("I'm Feeling Lucky")) {
                System.out.println("Pass");
        } else {
                System.out.println("Fail");
        }
        driver.quit();

		//WebElement element = driver.findElement(By.className("headline-title"));

		//WebElement link = element.findElement(ByClassName.className("CBarticleTitle"));
		//link.click();
	}

}
