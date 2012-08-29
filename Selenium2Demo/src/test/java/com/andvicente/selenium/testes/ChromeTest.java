package com.andvicente.selenium.testes;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.andvicente.selenium.util.SeleniumTest;

public class ChromeTest extends SeleniumTest {

	@Test
	public void testGoogleSearch() throws InterruptedException {
		driver.get("http://www.google.com");
		WebElement searchBox = driver.findElement(By.name("q"));
		searchBox.sendKeys("André Abe Vicente");
		WebElement botaoLupa = driver.findElement(By
				.cssSelector("button#gbqfb"));
		botaoLupa.click();

		WebElement resultadoGoogle = driver.findElement(By
				.cssSelector("li:nth-of-type(1).g a"));
		resultadoGoogle.click();

		assertEquals("André Abe Vicente - Brasil | LinkedIn", driver.getTitle());

		driver.navigate().back();

		resultadoGoogle = driver.findElement(By
				.cssSelector("li:nth-of-type(2).g a"));
		resultadoGoogle.click();
		driver.navigate().back();

		resultadoGoogle = driver.findElement(By
				.cssSelector("li:nth-of-type(3).g a"));
		resultadoGoogle.click();
		driver.navigate().back();

		resultadoGoogle = driver.findElement(By
				.cssSelector("li:nth-of-type(5).g a"));
		driver.navigate().back();

	}
}