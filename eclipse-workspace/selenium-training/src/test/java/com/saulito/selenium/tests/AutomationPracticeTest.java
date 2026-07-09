package com.saulito.selenium.tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class AutomationPracticeTest {
	//comentario
	WebDriver driver;
	@BeforeMethod
	public void setUp() {
		driver = new ChromeDriver();
		//maximizar la ventana
		driver.manage().window().maximize();
	}
	
	@Test
	public void TC01_VerificarTitulo () {
		// TODO Auto-generated method stub

		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		
		String tituloEsperado = "Practice Page";
		String tituloActual = driver.getTitle();
		
		if(tituloActual.equals(tituloEsperado))
		{
			System.out.println("TEST PASSED");
		}
		else 
		{
			System.out.println("TEST FAILED");
		}
		
				
	}
	
	@Test
	public void TC02_VerificarFailed() {
		// TODO Auto-generated method stub

		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		
		String tituloEsperado = "Practice Page";
		String tituloActual = driver.getTitle();
		
		Assert.assertEquals(tituloActual, tituloEsperado);				
		
	}
	
	@Test
	public void TC03_radioButtons() {
		
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		driver.findElement(By.cssSelector("input[value='radio3']")).click();
	}
	
	@Test
	public void TC04_checkBox() {
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		driver.findElement(By.id("checkBoxOption1")).click();
		
	}
	
	@AfterMethod
	public void tearDown() {
		driver.quit();
	}

}
