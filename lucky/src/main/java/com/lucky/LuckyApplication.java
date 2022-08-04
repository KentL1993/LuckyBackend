package com.lucky;

import java.io.IOException;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class LuckyApplication {

	public static void main(String[] args) throws IOException {
		SpringApplication.run(LuckyApplication.class, args);
		new LuckyApplication().openBroswer();
	}

	public void openBroswer() throws IOException {
		ChromeOptions options = new ChromeOptions();
		options.setExperimentalOption("excludeSwitches", new String[]{"enable-automation"});
		WebDriver driver = new ChromeDriver(options);

		driver.get("file:///C:/Git/Lucky/index.html");
		driver.manage().window().fullscreen();
		
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("document.body.style.zoom='67%'");
	}
}
